package garden_leave.utils;

import io.opentelemetry.api.trace.Span;
import io.opentelemetry.api.trace.Tracer;
import io.opentelemetry.context.Scope;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

// https://patorjk.com/software/taag/#p=display&f=Swamp%20Land

public class Banner {
  private static final Tracer tracer = Telemetry.getInstance().getTracer(Banner.class);

  public static void printBanner(final String filename) {
    final Span span = tracer.spanBuilder("printBanner").startSpan();

    try (Scope ignored = span.makeCurrent()) {
      final String banner = getBanner(filename);
      System.out.println(banner);
    }

    finally {
      span.end();
    }
  }

  public static String getBanner(final String filename) {
    final StringBuilder out = new StringBuilder();
    try {
      String line;
      final InputStream in = Banner.class.getClassLoader().getResourceAsStream(filename);
      final BufferedReader reader = new BufferedReader(new InputStreamReader(in));

      out.append(System.lineSeparator());

      while ((line = reader.readLine()) != null) {
        out.append(line).append(System.lineSeparator());
      }

      out.append(System.lineSeparator()).append(System.lineSeparator());

      reader.close();
    } catch (final Throwable t) {
    }
    return out.toString();
  }
}
