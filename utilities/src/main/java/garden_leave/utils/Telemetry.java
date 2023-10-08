package garden_leave.utils;

import io.opentelemetry.api.OpenTelemetry;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.api.trace.propagation.W3CTraceContextPropagator;
import io.opentelemetry.context.propagation.ContextPropagators;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporter;
import io.opentelemetry.exporter.otlp.metrics.OtlpGrpcMetricExporterBuilder;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporterBuilder;
import io.opentelemetry.sdk.OpenTelemetrySdk;
import io.opentelemetry.sdk.metrics.SdkMeterProvider;
import io.opentelemetry.sdk.metrics.export.PeriodicMetricReader;
import io.opentelemetry.sdk.resources.Resource;
import io.opentelemetry.sdk.trace.SdkTracerProvider;
import io.opentelemetry.sdk.trace.export.BatchSpanProcessor;
import io.opentelemetry.semconv.resource.attributes.ResourceAttributes;

// https://www.javadoc.io/doc/io.opentelemetry
// https://github.com/open-telemetry/opentelemetry-demo/blob/main/docker-compose.yml

/**
 *  public class TracerExample {
 *    private static final Tracer tracer = Telemetry.getInstance().getTracer(TracerExample.class);
 *
 *    protected void doSomething() throws Exception {
 *      final Span span = Telemetry.startSpan(tracer, "TracerExample.doSomething");
 *      try (Scope ignored = span.makeCurrent()) {
 *        // do, something...
 *        span.addEvent("doing another thing...");
 *        doAnotherThing();
 *      } finally {
 *        span.end();
 *      }
 *    }
 *  }
 */

public class Telemetry {
  private final OpenTelemetry openTelemetry;
  private final boolean disabled;

  private static final EmptyStackFrame emptyStackFrame = new EmptyStackFrame();

  private static class TelemetryHolder { static final Telemetry INSTANCE = new Telemetry(); }
  public static final Telemetry getInstance() {
    return TelemetryHolder.INSTANCE;
  }

  private Telemetry() {
    final String serviceName = System.getProperty("SERVICE_KEY");
    final String traceEndpoint = System.getProperty("TRACE_ENDPOINT");
    final String meterEndpoint = System.getProperty("METER_ENDPOINT");
    final String disableTelemetryFlag = System.getProperty("DISABLE_TELEMETRY");

    if (Boolean.parseBoolean(disableTelemetryFlag)) {
      openTelemetry = OpenTelemetry.noop();
      disabled = true;
      return;
    }

    disabled = false;

    final OtlpGrpcSpanExporterBuilder traceBuilder = OtlpGrpcSpanExporter.builder();
    final OtlpGrpcMetricExporterBuilder meterBuilder = OtlpGrpcMetricExporter.builder();

    if (traceEndpoint != null) {
      traceBuilder.setEndpoint(traceEndpoint);
    }

    if (meterEndpoint != null) {
      meterBuilder.setEndpoint(meterEndpoint);
    }

    final Resource resource = Resource.getDefault().merge(
        Resource.create(Attributes.of(ResourceAttributes.SERVICE_NAME, serviceName)));

    final SdkTracerProvider sdkTracerProvider =
        SdkTracerProvider.builder()
            .addSpanProcessor(BatchSpanProcessor.builder(traceBuilder.build()).build())
            .setResource(resource)
            .build();

    final SdkMeterProvider sdkMeterProvider =
        SdkMeterProvider.builder()
            .registerMetricReader(PeriodicMetricReader.builder(meterBuilder.build()).build())
            .setResource(resource)
            .build();

    openTelemetry =
        OpenTelemetrySdk.builder()
            .setTracerProvider(sdkTracerProvider)
            .setMeterProvider(sdkMeterProvider)
            .setPropagators(ContextPropagators.create(W3CTraceContextPropagator.getInstance()))
            .buildAndRegisterGlobal();
  }

  public boolean isDisabled() {
    return disabled;
  }

  public Tracer getTracer(final String name) {
    return openTelemetry.getTracer(name);
  }

  public Tracer getTracer(final Class<?> clazz) {
    return getTracer(clazz.getName());
  }

  public static String getSpanName() {
    return getSpanName(2);
  }

  public static String getSpanName(final int framesToSkip) {
    // StackWalker.getInstance(RETAIN_CLASS_REFERENCE)
    return StackWalker.getInstance()
        .walk(frames -> frames.skip(framesToSkip).findAny())
        .orElseGet(() -> emptyStackFrame)
        .toString();
  }

  public static Span startSpan(final Tracer tracer) {
    final String spanName = getSpanName(2);
    return startSpan(tracer, spanName);
  }

  public static Span startSpan(final Tracer tracer, final String methodName) {
    return tracer.spanBuilder(methodName).startSpan();
  }
}
