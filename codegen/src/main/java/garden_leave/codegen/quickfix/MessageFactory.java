package garden_leave.codegen.quickfix;

public class MessageFactory {
  public String generate(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();
    final String javaPackageName = generator.builder().javaPackageName;

    stringBuilder.append("package ")
        .append(javaPackageName)
        .append(";\n\n")
        .append("import garden_leave.gateway.transform.TransformMessageFactory;\n\n")
        .append("//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n//    ")
        .append(java.time.LocalDateTime.now())
        .append("\n//\n\n");

    stringBuilder
        .append("public final class MessageFactoryProvider extends TransformMessageFactory {\n")
        .append("  private static class SingletonHolder {\n")
        .append("    public static final MessageFactoryProvider PROVIDER ")
        .append("= new MessageFactoryProvider();\n  }\n\n")
        .append("  public static quickfix.MessageFactory newMessageFactory() {\n")
        .append("    return SingletonHolder.PROVIDER.createMessageFactory();\n")
        .append("  }\n\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("  private static final io.opentelemetry.api.trace.Tracer tracer =\n")
          .append("    garden_leave.utils.Telemetry.getInstance().")
          .append("getTracer(MessageFactoryProvider.class);\n\n");
    }

    stringBuilder.append("  private MessageFactoryProvider() {\n");

    generator.messages().forEach((message) -> {
      if (message.isUsed() || message.isAdmin()) {
        stringBuilder.append("\n    // ")
            .append(message.getBuilderFieldName())
            .append("\n    addMessageSupplier(\n      ")
            .append(message.getJavaClassName(javaPackageName))
            .append(".MSGTYPE,\n      ")
            .append("() -> new ")
            .append(message.getJavaClassName(javaPackageName));

        if (generator.builder().generateJavaOpenTelementry) {
          stringBuilder.append("(\n        garden_leave.utils.Telemetry.startSpan(tracer,\n")
              .append("    \"")
              .append(message.getCamelName())
              .append(".constructor\")));\n");
        } else {
          stringBuilder.append("());\n");
        }

        message.groupList.forEach((group) -> {
          stringBuilder.append("    addMessageGroupSupplier(\n      ")
              .append(message.getJavaClassName(javaPackageName))
              .append(".MSGTYPE, Integer.valueOf(")
              .append(group.tag)
              .append("),\n      () -> new ")
              .append(message.getJavaClassName(javaPackageName))
              .append(".")
              .append(group.getCamelName())
              .append("());\n");
        });
      }
    });

    return stringBuilder.append("  }\n}\n").toString();
  }
}
