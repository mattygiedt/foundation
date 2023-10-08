package garden_leave.codegen.quickfix;

public class Group extends MessageParser {
  public final String tag;
  public final String parent;

  public Group(final String name, final String parent, final String tag) {
    super(name);
    this.parent = parent;
    this.tag = tag;
  }

  public String delim() {
    if (fieldList.size() == 0) {
      throw new RuntimeException("Group " + name + " has no fields!");
    }
    return fieldList.get(0).tag;
  }

  public String toStaticFinalDeclaration() {
    return new StringBuilder("  public static final quickfix.Group ")
        .append(getGroupNameAsVariable())
        .append(" = new quickfix.Group(")
        .append(this.tag)
        .append(", ")
        .append(delim())
        .append(", ")
        .append(fieldOrder())
        .append(");\n")
        .toString();
  }

  public String toStaticFinalInnerClassDeclaration(final String parentProtoClassName) {
    final StringBuilder stringBuilder = new StringBuilder();

    final String groupClassName = parentProtoClassName + "." + getCamelName();

    stringBuilder.append("  public static class ")
        .append(getCamelName())
        .append(" extends quickfix.Group {\n\n");

    groupList.forEach(
        (group) -> stringBuilder.append(group.toStaticFinalInnerClassDeclaration(groupClassName)));

    fieldList.forEach(
        (field) -> stringBuilder.append(field.toMessageGetterSetter("    ", getCamelName())));

    stringBuilder.append("\n    public ")
        .append(getCamelName())
        .append("() {\n      super(")
        .append(this.tag)
        .append(", ")
        .append(delim())
        .append(", ")
        .append(fieldOrder())
        .append(");\n    }\n\n");

    stringBuilder.append("  @Override\n")
        .append("  public void addGroup(final quickfix.Group group) {\n")
        .append("    addGroupRef(group);\n")
        .append("  }\n\n");

    writeProtoToFixParser(parentProtoClassName, stringBuilder);
    writeFixToProtoParser(parentProtoClassName, stringBuilder);

    return stringBuilder.append("  }\n\n").toString();
  }

  public String getGroupName() {
    return ProtobufGenerator.toCamel(parent + "." + name);
  }

  public String getGroupNameAsVariable() {
    final String groupName = getGroupName();
    return Character.toLowerCase(groupName.charAt(0)) + groupName.substring(1) + "Group";
  }

  public String getGroupClassAsVariable(final String name) {
    return new StringBuilder("final ")
        .append(getGroupName())
        .append(" ")
        .append(name)
        .append(" = new ")
        .append(getGroupName())
        .append("();\n")
        .toString();
  }

  @Override
  public String getCamelName() {
    return ProtobufGenerator.toCamel(name);
  }

  @Override
  public String getNameAsVariable() {
    final String camelName = getCamelName();
    return Character.toLowerCase(camelName.charAt(0)) + camelName.substring(1) + "Group";
  }

  private void writeProtoToFixParser(
      final String protoClassName, final StringBuilder stringBuilder) {
    if (isProtoParserWritten()) {
      return;
    }

    setProtoParserWritten();

    final String groupProtoClassName = getProtoClassName(protoClassName);
    final String groupPresenceClassName = getPresenceClassName(protoClassName);

    for (final Group group : this.groupList) {
      group.writeProtoToFixParser(groupProtoClassName, stringBuilder);
    }

    stringBuilder.append("  public void fromProto(final ")
        .append(groupProtoClassName)
        .append(" proto) {\n");

    stringBuilder.append("    final ")
        .append(groupPresenceClassName)
        .append(" fieldPresence = proto.getFieldPresence();\n\n");

    groupList.forEach((group) -> group.writeProtoToFix("this", stringBuilder));

    fieldList.forEach((field) -> field.writeProtoToFix("this", stringBuilder));

    stringBuilder.append("  }\n\n");
  }

  private void writeFixToProtoParser(
      final String protoClassName, final StringBuilder stringBuilder) {
    if (isFixParserWritten()) {
      return;
    }

    setFixParserWritten();

    final String groupProtoClassName = getProtoClassName(protoClassName);
    final String groupBuilderClassName = getProtoBuilderClassName(protoClassName);
    final String groupPresenceBuilderClassName = getPresenceBuilderClassName(protoClassName);

    for (final Group group : this.groupList) {
      group.writeFixToProtoParser(groupProtoClassName, stringBuilder);
    }

    stringBuilder.append("  public ")
        .append(groupBuilderClassName)
        .append(" toBuilder() throws quickfix.FieldNotFound {\n")
        .append("    final ")
        .append(groupBuilderClassName)
        .append(" builder =\n      ")
        .append(groupProtoClassName)
        .append(".newBuilder();\n")
        .append("    final ")
        .append(groupPresenceBuilderClassName)
        .append(" presenceBuilder =\n      ")
        .append(groupProtoClassName)
        .append(".FieldPresence.newBuilder();\n\n");

    groupList.forEach((group) -> group.writeFixToProto("this", stringBuilder));

    fieldList.forEach((field) -> field.writeFixToProto("this", stringBuilder));

    stringBuilder.append("    builder.setFieldPresence(presenceBuilder.build());\n")
        .append("    return builder;\n")
        .append("  }\n\n");
  }

  public void writeProtoToFix(final StringBuilder stringBuilder) {
    writeProtoToFix("fix", stringBuilder);
  }

  public void writeProtoToFix(final String name, final StringBuilder stringBuilder) {
    final String protoCountName = getBuilderFieldName() + "Count";

    stringBuilder.append("    for(int i=0; i<proto.get")
        .append(protoCountName)
        .append("(); i++) {\n      ")
        .append(getGroupClassAsVariable("group"))
        .append("      group.fromProto(proto.get")
        .append(getBuilderFieldName())
        .append("(i));\n")
        .append("      ")
        .append(name)
        .append(".addGroupRef(group);\n    }\n");
  }

  public void writeFixToProto(final StringBuilder stringBuilder) {
    writeFixToProto("fix", stringBuilder);
  }

  public void writeFixToProto(final String name, final StringBuilder stringBuilder) {
    final String groupCountVariableName = getNameAsVariable() + "Count";

    stringBuilder.append("      final int ")
        .append(groupCountVariableName)
        .append(" = ")
        .append(name)
        .append(".getGroupCount(")
        .append(tag)
        .append(");\n");

    stringBuilder.append("      for(int i = 1; i <= ")
        .append(groupCountVariableName)
        .append("; i++) {\n        ")
        .append(getGroupClassAsVariable("group"))
        .append("        ")
        .append(name)
        .append(".getGroup(i, group);\n")
        .append("        builder.add")
        .append(getBuilderFieldName())
        .append("(group.toBuilder().build());\n")
        .append("      }\n\n");
  }
}
