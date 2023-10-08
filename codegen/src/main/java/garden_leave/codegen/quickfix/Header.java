package garden_leave.codegen.quickfix;

import java.time.LocalDateTime;

public class Header extends Message {
  public Header(final String name) {
    super(name);
  }

  @Override
  public String toFinalClassDeclaration(final CodeGenerator generator) {
    final StringBuilder stringBuilder = new StringBuilder();

    final String protoPackageName = generator.builder().protoPackageName;
    final String javaPackageName = generator.builder().javaPackageName;
    final String protoClassName = getJavaClassName(protoPackageName);
    final String builderClassName = getProtoBuilderClassName(protoPackageName);
    final String presenceClassName = getPresenceClassName(protoPackageName);
    final String presenceBuilderClassName = getPresenceBuilderClassName(protoPackageName);

    stringBuilder.append("package ")
        .append(javaPackageName)
        .append(";\n\n")
        .append("import garden_leave.gateway.transform.FieldFactory;\n")
        .append("import garden_leave.gateway.transform.FieldValue;\n\n")
        .append("//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n//    ")
        .append(LocalDateTime.now())
        .append("\n//\n\n");

    stringBuilder.append("public final class Header extends quickfix.Message.Header {\n");

    // stringBuilder.append("  private static final org.slf4j.Logger logger =\n")
    //    .append("    org.slf4j.LoggerFactory.getLogger(Header.class);\n\n");

    fieldList.forEach((field) -> stringBuilder.append(field.toMessageGetterSetter("Header")));
    groupList.forEach(
        (group) -> stringBuilder.append(group.toStaticFinalInnerClassDeclaration(protoClassName)));

    stringBuilder.append("\n  public Header(final quickfix.Message msg, ")
        .append("final String beginString, final String msgType) {\n    super(")
        .append(fieldOrder())
        .append(");\n    setMsgType(msgType);\n    setBeginString(beginString);\n  }\n\n");

    //
    //  Until we have time and / or need, only parse out fields and ignore groups
    //

    stringBuilder.append("  public void fromProto(final ")
        .append(protoClassName)
        .append(" proto) {\n    final ")
        .append(presenceClassName)
        .append(" fieldPresence = proto.getFieldPresence();\n\n");

    fieldList.forEach((field) -> field.writeProtoToFix("this", stringBuilder));

    stringBuilder.append("  }\n\n");

    //
    //  Until we have time and / or need, only parse out fields and ignore groups
    //

    stringBuilder.append("  public ")
        .append(builderClassName)
        .append(" toBuilder() throws quickfix.FieldNotFound {\n");

    stringBuilder.append("    final ")
        .append(builderClassName)
        .append(" builder =\n      ")
        .append(protoClassName)
        .append(".newBuilder();\n");

    stringBuilder.append("    final ")
        .append(presenceBuilderClassName)
        .append(" presenceBuilder =\n      ")
        .append(protoClassName)
        .append(".FieldPresence.newBuilder();\n\n");

    fieldList.forEach((field) -> field.writeFixToProto("this", stringBuilder));

    stringBuilder.append("\n    builder.setFieldPresence(presenceBuilder.build());\n")
        .append("    return builder;\n  }\n");

    return stringBuilder.append("}\n").toString();
  }
}
