package garden_leave.codegen.quickfix;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Message {
  public final List<Field> fieldList = new ArrayList<>();
  public final List<Group> groupList = new ArrayList<>();
  public final List<String> componentList = new ArrayList<>();
  public final List<String> tagOrder = new ArrayList<>();

  public final String name;
  public final String msgType;

  private boolean isUsed = false;
  private boolean isAdmin = false;

  public Message(final String name) {
    this(name, null);
  }

  public Message(final String name, final String msgType) {
    this.name = name;
    this.msgType = msgType;
  }

  public void addFieldToMessage(final Field field) {
    fieldList.add(field);
    tagOrder.add(field.tag);
  }

  public void addGroupToMessage(final Group group) {
    groupList.add(group);
    tagOrder.addAll(group.tagOrder);
  }

  public void addComponentToMessage(final Component component) {
    fieldList.addAll(component.fieldList);
    groupList.addAll(component.groupList);
    componentList.add(component.name);
    tagOrder.addAll(component.tagOrder);
  }

  public boolean isUsed() {
    return isUsed == true;
  }

  public boolean isAdmin() {
    return isAdmin == true;
  }

  public void setIsAdmin(final boolean flag) {
    isAdmin = flag;
  }

  public void setIsUsed() {
    if (isUsed == true) {
      return;
    }

    isUsed = true;
    fieldList.forEach((field) -> field.setIsUsed());
    groupList.forEach((group) -> group.setIsUsed());
  }

  public String fieldOrder() {
    final StringBuilder stringBuilder = new StringBuilder("new int[] {");

    fieldList.forEach((field) -> stringBuilder.append(field.tag).append(","));

    return stringBuilder.append("0}").toString();
  }

  public String getBuilderFieldName() {
    return ProtobufGenerator.builderFieldName(this.name);
  }

  public String getNameAsVariable() {
    final String camelName = getCamelName();
    return Character.toLowerCase(camelName.charAt(0)) + camelName.substring(1);
  }

  public String getCamelName() {
    return ProtobufGenerator.toCamel(name);
  }

  public String getJavaClassName(final String packageName) {
    return packageName + "." + getCamelName();
  }

  public String getProtoClassName(final String packageName) {
    return packageName + "." + ProtobufGenerator.toCamel(name);
  }

  public String getProtoBuilderClassName(final String packageName) {
    return getProtoClassName(packageName) + ".Builder";
  }

  public String getPresenceClassName(final String packageName) {
    return getProtoClassName(packageName) + ".FieldPresence";
  }

  public String getPresenceBuilderClassName(final String packageName) {
    return getPresenceClassName(packageName) + ".Builder";
  }

  public boolean hasFields() {
    return fieldList.size() > 0;
  }

  public boolean hasGroups() {
    return groupList.size() > 0;
  }

  public boolean hasComponents() {
    return componentList.size() > 0;
  }

  public String toFinalClassDeclaration(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();
    final String protoPackageName = generator.builder().protoPackageName;
    final String protoClassName = getJavaClassName(protoPackageName);

    stringBuilder.append("package ")
        .append(generator.builder().javaPackageName)
        .append(";\n\n")
        .append("import java.util.function.Function;\n")
        .append("import garden_leave.gateway.transform.FieldFactory;\n")
        .append("import garden_leave.gateway.transform.FieldValue;\n\n")
        .append("//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n//    ")
        .append(LocalDateTime.now())
        .append("\n//\n\n");

    stringBuilder.append("public final class ")
        .append(getCamelName())
        .append(" extends quickfix.Message {\n");

    stringBuilder.append("  private static final org.slf4j.Logger logger =\n")
        .append("    org.slf4j.LoggerFactory.getLogger(")
        .append(getCamelName())
        .append(".class);\n\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("  private static final io.opentelemetry.api.trace.Tracer tracer =\n")
          .append("    garden_leave.utils.Telemetry.getInstance().getTracer(")
          .append(getCamelName())
          .append(".class);\n");

      stringBuilder.append("  private io.opentelemetry.api.trace.Span span = null;\n")
          .append("  public io.opentelemetry.api.trace.Span getSpan() { return span; }\n")
          .append("  public ")
          .append(getCamelName())
          .append(" setSpan(final io.opentelemetry.api.trace.Span span) {\n")
          .append("    this.span = span;\n    return this;\n  }\n\n");
    }

    stringBuilder.append("  public static final String BEGINSTR = \"")
        .append(generator.builder().fixBeginString)
        .append("\";\n");
    stringBuilder.append("  public static final String MSGTYPE = \"")
        .append(this.msgType)
        .append("\";\n\n");

    stringBuilder.append("  public final String UUID = ")
        .append("java.util.UUID.randomUUID().toString();\n\n");

    groupList.forEach(
        (group) -> stringBuilder.append(group.toStaticFinalInnerClassDeclaration(protoClassName)));
    fieldList.forEach(
        (field) -> stringBuilder.append(field.toMessageGetterSetter("  ", getCamelName())));

    stringBuilder.append("\n  public ")
        .append(getCamelName())
        .append("() {\n    super(")
        .append(fieldOrder())
        .append(");\n  }\n\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("\n  public ")
          .append(getCamelName())
          .append("(final io.opentelemetry.api.trace.Span span) {\n    super(")
          .append(fieldOrder())
          .append(");\n    this.span = span;\n  }\n\n");
    }

    stringBuilder.append("  @Override\n")
        .append("  protected quickfix.Message.Header newHeader() {\n")
        .append("    return new ")
        .append(generator.builder().javaPackageName)
        .append(".Header(this, BEGINSTR, MSGTYPE);\n")
        .append("  }\n\n");

    stringBuilder.append("  @Override\n")
        .append("  public void addGroup(final quickfix.Group group) {\n")
        .append("    addGroupRef(group);\n")
        .append("  }\n\n");

    stringBuilder.append(writeFixToProto(generator));
    stringBuilder.append(writeProtoToFix(generator));

    return stringBuilder.append("}\n").toString();
  }

  public String writeProtoToFix(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();

    final String javaPackageName = generator.builder().javaPackageName;
    final String protoPackageName = generator.builder().protoPackageName;

    final String fixClassName = getJavaClassName(javaPackageName);
    final String protoClassName = getProtoClassName(protoPackageName);
    final String presenceClassName = getPresenceClassName(protoPackageName);

    stringBuilder.append("  public static Function<\n")
        .append("      ")
        .append(protoClassName)
        .append(",\n      ")
        .append(fixClassName)
        .append(">\n    ")
        .append("protoToFix = (proto) -> {\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("  final io.opentelemetry.api.trace.Span span =")
          .append(" garden_leave.utils.Telemetry.startSpan(tracer,\n      \"")
          .append(fixClassName)
          .append(".protoToFix\");\n")
          .append("    try (io.opentelemetry.context.Scope ignored = span.makeCurrent()) {\n\n");
    }

    stringBuilder.append("    final ")
        .append(fixClassName)
        .append(" fix = new ")
        .append(fixClassName)
        .append("();\n")
        .append("    if (proto == null) {\n      return fix;\n    }\n\n");

    stringBuilder.append("    final ")
        .append(javaPackageName)
        .append(".Header header = (")
        .append(javaPackageName)
        .append(".Header) fix.getHeader();\n")
        .append("    header.fromProto(proto.getHeader());\n\n");

    stringBuilder.append("    final ")
        .append(presenceClassName)
        .append(" fieldPresence = proto.getFieldPresence();\n\n");

    fieldList.forEach((field) -> field.writeProtoToFix(stringBuilder));

    groupList.forEach((group) -> group.writeProtoToFix(stringBuilder));

    stringBuilder.append("    return fix;\n");

    if (generator.builder().generateJavaOpenTelementry) {
      stringBuilder.append("  } finally { span.end(); }\n");
    }

    return stringBuilder.append("  };\n\n").toString();
  }

  public String writeFixToProto(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();

    final String javaPackageName = generator.builder().javaPackageName;
    final String protoPackageName = generator.builder().protoPackageName;

    final String fixClassName = getJavaClassName(javaPackageName);
    final String protoClassName = getProtoClassName(protoPackageName);
    final String builderClassName = getProtoBuilderClassName(protoPackageName);
    final String presenceBuilderClassName = getPresenceBuilderClassName(protoPackageName);

    stringBuilder.append("  public static Function<\n")
        .append("      ")
        .append(fixClassName)
        .append(",\n      ")
        .append(protoClassName)
        .append(">\n    ")
        .append("fixToProto = (fix) -> {\n");

    stringBuilder.append("    if (fix == null) {\n      return ")
        .append(protoClassName)
        .append(".getDefaultInstance();\n    }\n\n");

    stringBuilder.append("    final ")
        .append(builderClassName)
        .append(" builder =\n        ")
        .append(protoClassName)
        .append(".newBuilder();\n");

    stringBuilder.append("    final ")
        .append(presenceBuilderClassName)
        .append(" presenceBuilder =\n      ")
        .append(protoClassName)
        .append(".FieldPresence.newBuilder();\n\n");

    stringBuilder.append("    final ")
        .append(javaPackageName)
        .append(".Header header = (")
        .append(javaPackageName)
        .append(".Header) fix.getHeader();\n");

    stringBuilder.append("    try {\n")
        .append("      builder.setMessageId(fix.UUID)\n")
        .append("       .setTimestamp(garden_leave.utils.Protobuf.getTimestamp())\n")
        .append("       .setHeader(header.toBuilder().build());\n\n");

    fieldList.forEach((field) -> field.writeFixToProto(stringBuilder));

    groupList.forEach((group) -> group.writeFixToProto(stringBuilder));

    stringBuilder.append("    } catch (final Throwable t) {\n")
        .append("      logger.error(\"")
        .append(getNameAsVariable())
        .append(" error:\", t);\n    }\n")
        .append("    builder.setFieldPresence(presenceBuilder.build());\n")
        .append("    return builder.build();\n");

    return stringBuilder.append("  };\n\n").toString();
  }
}
