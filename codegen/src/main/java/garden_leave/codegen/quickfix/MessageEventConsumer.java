package garden_leave.codegen.quickfix;

public class MessageEventConsumer {
  public String generate(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();
    final String javaPackageName = generator.builder().javaPackageName;
    final String protoPackageName = generator.builder().protoPackageName;

    stringBuilder.append("package ")
        .append(javaPackageName)
        .append(";\n\n")
        .append("//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n//    ")
        .append(java.time.LocalDateTime.now())
        .append("\n//\n\n");

    stringBuilder.append("public abstract class MessageEventConsumer ")
        .append("implements java.util.function.Consumer<MessageEvent> {\n");

    stringBuilder.append("  @Override\n")
        .append("  public void accept(final MessageEvent event) {\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("    final io.opentelemetry.api.trace.Span ")
          .append("span = event.getSpan();\n")
          .append("    try (final io.opentelemetry.context.Scope ")
          .append("scope = span.makeCurrent()) {\n")
          .append("      switch(event.getEventType()) {\n");
    } else {
      stringBuilder.append("    try {\n").append("      switch(event.getEventType()) {\n");
    }

    generator.messages().forEach((message) -> {
      if (message.isAdmin() || message.isUsed()) {
        stringBuilder.append("        case ").append(message.name.toUpperCase()).append(":\n");

        if (generator.builder().generateJavaOpenTelementry) {
          stringBuilder.append("          span.addEvent(\"")
              .append(message.getCamelName())
              .append(".handleEvent:\" + event.getSequence());\n");
        }

        stringBuilder.append("          handle")
            .append(message.getCamelName())
            .append("(event);\n          break;\n");
      }
    });

    stringBuilder.append("        default:\n")
        .append("          throw new UnsupportedOperationException(\"Unhandled event ")
        .append("type: \" + event.getEventType());\n")
        .append("      }\n    } catch (final Throwable t) {\n")
        .append("      throw new RuntimeException(t);\n")
        .append("    }\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("    finally { span.end(); }\n");
    }

    stringBuilder.append("  }\n\n");

    generator.messages().forEach((message) -> {
      if (message.isAdmin() || message.isUsed()) {
        stringBuilder.append("  public abstract void handle")
            .append(message.getCamelName())
            .append("(final MessageEvent event) throws Exception;\n");
      }
    });

    stringBuilder.append("\n  /** -- Copy into your event handler class...\n");
    generator.messages().forEach((message) -> {
      if (message.isAdmin() || message.isUsed()) {
        stringBuilder.append("  @Override\n  public void handle")
            .append(message.getCamelName())
            .append("(final MessageEvent event) throws Exception {\n")
            .append("    final ")
            .append(message.getProtoClassName(protoPackageName))
            .append(" ")
            .append(message.getNameAsVariable())
            .append(" = event.get")
            .append(message.getCamelName())
            .append("();\n    logger.info(\"handle")
            .append(message.getCamelName())
            .append(": seq {}, msg {}\", event.getSequence(), ")
            .append(message.getNameAsVariable())
            .append(".toString());\n  }\n\n");
      }
    });
    stringBuilder.append("  **/\n");

    return stringBuilder.append("}\n").toString();
  }
}
