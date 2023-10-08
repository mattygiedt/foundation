package garden_leave.codegen.quickfix;

public class MessageHandlers {
  public String generate(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();
    final String javaPackageName = generator.builder().javaPackageName;

    stringBuilder.append("package ")
        .append(javaPackageName)
        .append(";\n\n")
        .append("import com.lmax.disruptor.RingBuffer;\n")
        .append("import org.slf4j.Logger;\n")
        .append("import org.slf4j.LoggerFactory;\n")
        .append("import quickfix.ApplicationFunctionalAdapter;\n\n")
        .append("//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n//    ")
        .append(java.time.LocalDateTime.now())
        .append("\n//\n\n");

    stringBuilder.append("public final class MessageHandlers {\n");

    stringBuilder.append("  private static final Logger logger = ")
        .append("LoggerFactory.getLogger(MessageHandlers.class);\n\n");

    stringBuilder.append("  private MessageHandlers() {}\n\n");

    stringBuilder.append("  public static void addFromAdminListeners(\n")
        .append("      final ApplicationFunctionalAdapter application, ")
        .append("final RingBuffer<MessageEvent> ringBuffer) {\n");

    generator.messages().forEach((message) -> {
      if (message.isAdmin()) {
        writeMessage(generator, message, stringBuilder);
      }
    });

    stringBuilder.append("  }\n\n  public static void addFromAppListeners(\n")
        .append("      final ApplicationFunctionalAdapter application, ")
        .append("final RingBuffer<MessageEvent> ringBuffer) {\n");

    generator.messages().forEach((message) -> {
      if (!message.isAdmin() && message.isUsed()) {
        writeMessage(generator, message, stringBuilder);
      }
    });

    return stringBuilder.append("  }\n}\n").toString();
  }

  private void writeMessage(
      final CodeGenerator generator, final Message message, final StringBuilder stringBuilder) {
    final String javaPackageName = generator.builder().javaPackageName;
    final String protoPackageName = generator.builder().protoPackageName;

    if (message.isAdmin()) {
      stringBuilder.append("    application.addFromAdminListener(")
          .append(message.getJavaClassName(javaPackageName))
          .append(".class,\n        new quickfix.FromAdminListener<")
          .append(message.getJavaClassName(javaPackageName))
          .append(">() {\n          @Override\n")
          .append("          public void accept(final ")
          .append(message.getJavaClassName(javaPackageName))
          .append(" message,\n              final quickfix.SessionID sessionId) {\n");
    } else {
      stringBuilder.append("    application.addFromAppListener(")
          .append(message.getJavaClassName(javaPackageName))
          .append(".class,\n        new quickfix.FromAppListener<")
          .append(message.getJavaClassName(javaPackageName))
          .append(">() {\n          @Override\n")
          .append("          public void accept(final ")
          .append(message.getJavaClassName(javaPackageName))
          .append(" message,\n              final quickfix.SessionID sessionId) {\n");
    }

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("            final io.opentelemetry.api.trace.Span ")
          .append("span = message.getSpan();\n")
          .append("            try (final io.opentelemetry.context.Scope")
          .append(" scope = span.makeCurrent()) {\n")
          .append("            span.addEvent(\"")
          .append(message.getCamelName())
          .append(".fixToProto:\" + message.UUID);\n");
    }

    stringBuilder.append("            final ")
        .append(message.getProtoClassName(protoPackageName))
        .append(" proto =\n                ")
        .append(message.getJavaClassName(javaPackageName))
        .append(".fixToProto.apply(message);\n");

    stringBuilder.append("            final long seq = ringBuffer.next();\n");

    stringBuilder.append("            if (logger.isDebugEnabled()) {\n")
        .append("              logger.debug(\"seq: {}, proto: {}\", seq, proto.toString());\n")
        .append("            }\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("            span.addEvent(\"")
          .append(message.getCamelName())
          .append(".ringBuffer.publish:\" + seq);\n");
    }

    stringBuilder.append("            ringBuffer.get(seq).setSequence(seq).set")
        .append(message.getCamelName())
        .append("(proto)");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append(".setSpan(span);\n");
    } else {
      stringBuilder.append(";\n");
    }

    stringBuilder.append("            ringBuffer.publish(seq);\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("          }\n");
    }

    stringBuilder.append("          }\n        });\n\n");
  }
}
