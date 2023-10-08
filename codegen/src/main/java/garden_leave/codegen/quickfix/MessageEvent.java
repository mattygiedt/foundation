package garden_leave.codegen.quickfix;

import java.util.HashSet;
import java.util.Set;

public class MessageEvent {
  public String generate(final CodeGenerator generator) {
    final Set<Message> messageSet = new HashSet<>();
    final StringBuilder stringBuilder = new StringBuilder();
    final String javaPackageName = generator.builder().javaPackageName;
    final String protoPackageName = generator.builder().protoPackageName;

    stringBuilder.append("package ")
        .append(javaPackageName)
        .append(";\n\n")
        .append("//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n//    ")
        .append(java.time.LocalDateTime.now())
        .append("\n//\n\n");

    stringBuilder.append("public final class MessageEvent {\n")
        .append("  private MessageEvent() {}\n\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("  private io.opentelemetry.api.trace.Span span = null;\n")
          .append("  public io.opentelemetry.api.trace.Span getSpan() { return span; }\n")
          .append("  public MessageEvent setSpan(final io.opentelemetry.api.trace.Span span) {\n")
          .append("    this.span = span;\n    return this;\n  }\n\n");
    }

    stringBuilder.append("  public final static com.lmax.disruptor.EventFactory")
        .append("<MessageEvent> EVENT_FACTORY =\n")
        .append("      () -> new MessageEvent();\n\n");

    stringBuilder.append("  private long sequence = 0L;\n")
        .append("  public MessageEvent setSequence(final long sequence) {\n")
        .append("    this.sequence = sequence;\n")
        .append("    return this;\n")
        .append("  }\n")
        .append("  public long getSequence() {\n")
        .append("    return this.sequence;\n")
        .append("  }\n\n");

    generator.messages().forEach((message) -> {
      if (message.isAdmin()) {
        messageSet.add(message);
        writeGetterSetter(message, javaPackageName, protoPackageName, stringBuilder);
      }
    });

    generator.messages().forEach((message) -> {
      if (!message.isAdmin() && message.isUsed()) {
        messageSet.add(message);
        writeGetterSetter(message, javaPackageName, protoPackageName, stringBuilder);
      }
    });

    writeEventTypeEnum(messageSet, stringBuilder);

    return stringBuilder.append("}\n").toString();
  }

  private void writeGetterSetter(final Message message, final String javaPackageName,
      final String protoPackageName, final StringBuilder stringBuilder) {
    final String protoClassName = message.getProtoClassName(protoPackageName);
    final String builderClassName = message.getProtoBuilderClassName(protoPackageName);

    stringBuilder.append("  // ").append(message.getCamelName()).append("\n");

    stringBuilder.append("  private ")
        .append(protoClassName)
        .append(" ")
        .append(message.getNameAsVariable())
        .append(" = null;\n");

    stringBuilder.append("  private final ")
        .append(builderClassName)
        .append(" ")
        .append(message.getNameAsVariable())
        .append("Builder =\n        ")
        .append(protoClassName)
        .append(".newBuilder();\n");

    stringBuilder.append("  public ")
        .append(protoClassName)
        .append(" get")
        .append(message.getCamelName())
        .append("() {\n")
        .append("    return ")
        .append(message.getNameAsVariable())
        .append(";\n  }\n");

    stringBuilder.append("  public MessageEvent set")
        .append(message.getCamelName())
        .append("(final ")
        .append(protoClassName)
        .append(" other) {\n")
        .append("    setMessageEventType(MessageEventType.")
        .append(message.name.toUpperCase())
        .append(");\n    ")
        .append(message.getNameAsVariable())
        .append(" = ")
        .append(message.getNameAsVariable())
        .append("Builder.clear().mergeFrom(other).build();\n    return this;\n  }\n\n");
  }

  private void writeEventTypeEnum(
      final Set<Message> messageSet, final StringBuilder stringBuilder) {
    stringBuilder.append("  public enum MessageEventType {\n    UNKNOWN,\n");

    for (final Message message : messageSet) {
      stringBuilder.append("    ").append(message.name.toUpperCase()).append(",\n");
    }

    int lastComma = stringBuilder.length() - 2;
    stringBuilder.replace(lastComma, lastComma + 1, ";");

    stringBuilder.append("  }\n\n")
        .append("  private MessageEventType eventType = MessageEventType.UNKNOWN;\n")
        .append("  public MessageEventType getEventType() {\n")
        .append("    return eventType;\n  }\n")
        .append("  private MessageEvent setMessageEventType(final MessageEventType eventType) {\n")
        .append("    this.eventType = eventType;\n")
        .append("    return this;\n  }\n\n");
  }
}
