package garden_leave.utils;

import io.opentelemetry.api.trace.Tracer;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class ClassHelper {
  private final Supplier<Logger> logSupplier;
  private final Supplier<Tracer> traceSupplier;

  public Logger logger() {
    return logSupplier.get();
  }

  public Tracer tracer() {
    return traceSupplier.get();
  }

  private ClassHelper(final Class<?> clazz) {
    this.logSupplier = () -> LoggerFactory.getLogger(clazz);
    this.traceSupplier = () -> Telemetry.getInstance().getTracer(clazz);
  }

  public static final ClassHelper newInstance(final Class<?> clazz) {
    return new ClassHelper(clazz);
  }
}
