package garden_leave.codegen.quickfix;

import quickfix.FieldType;

public class Field {
  public final String name;
  public final String tag;
  public final String type;
  final FieldType fieldType;
  private boolean isUsed = false;

  public Field(final String name, final String tag, final String type) {
    this.name = name;
    this.tag = tag;
    this.type = type;
    this.fieldType = FieldType.fromName("", this.type);
  }

  public boolean isUsed() {
    return isUsed == true;
  }

  public void setIsUsed() {
    isUsed = true;
  }

  public String builderFieldName() {
    return ProtobufGenerator.builderFieldName(this.name);
  }

  public String nameAsVariable() {
    final String camelName = builderFieldName();
    return Character.toLowerCase(camelName.charAt(0)) + camelName.substring(1) + "Field";
  }

  public String quickfixClassName() {
    return "quickfix.field." + name;
  }

  public String toMessageGetterSetter(final String enclosingClassName) {
    return toMessageGetterSetter("", enclosingClassName);
  }

  public String toMessageGetterSetter(final String indent, final String enclosingClassName) {
    return new StringBuilder(indent)
        .append(toFinalVariableDeclaration())
        .append(indent)
        .append(toHasField())
        .append(indent)
        .append(toGetter())
        .append(indent)
        .append(toSetter(indent, enclosingClassName))
        .append("\n")
        .toString();
  }

  public String toFinalVariableDeclaration() {
    return toFieldDeclaration("private", "");
  }

  public String toStaticFinalVariableDeclaration() {
    return toFieldDeclaration("private", "static ");
  }

  private String toGetter() {
    return new StringBuilder()
        .append("  public ")
        .append(getProtoValueType())
        .append(" get")
        .append(builderFieldName())
        .append("() throws quickfix.FieldNotFound { return FieldValue.of(getField(")
        .append(nameAsVariable())
        .append(")); }\n")
        .toString();
  }

  private String toSetter(final String indent, final String enclosingClassName) {
    final StringBuilder stringBuilder = new StringBuilder()
                                            .append("  public ")
                                            .append(enclosingClassName)
                                            .append(" set")
                                            .append(builderFieldName())
                                            .append("(final ")
                                            .append(getProtoValueType())
                                            .append(" value) { setField(FieldValue.to(")
                                            .append(nameAsVariable())
                                            .append(", value)); return this; }\n");

    if ("CHAR".equals(this.type)) {
      stringBuilder.append("    public ")
          .append(enclosingClassName)
          .append(" set")
          .append(builderFieldName())
          .append("(final char value) { setField(FieldValue.to(")
          .append(nameAsVariable())
          .append(", value)); return this; }\n");

      stringBuilder.append("    public ")
          .append(enclosingClassName)
          .append(" set")
          .append(builderFieldName())
          .append("(final String value) { setField(FieldValue.to(")
          .append(nameAsVariable())
          .append(", value)); return this; }\n");
    }

    try {
      Class.forName(quickfixClassName());
      stringBuilder.append(indent)
          .append("  public ")
          .append(enclosingClassName)
          .append(" set")
          .append(builderFieldName())
          .append("(final ")
          .append(quickfixClassName())
          .append(" value) { setField(FieldValue.to(")
          .append(nameAsVariable())
          .append(", FieldValue.of(value))); return this; }\n");
    } catch (final Throwable ignore) {
    }
    return stringBuilder.toString();
  }

  private String toHasField() {
    return new StringBuilder()
        .append("  public boolean has")
        .append(builderFieldName())
        .append("() throws quickfix.FieldNotFound { return isSetField(")
        .append(this.tag)
        .append("); }\n")
        .toString();
  }

  private String getProtoValueType() {
    if (fieldType.getJavaType() == Boolean.class) {
      return "boolean";
    }

    if (fieldType.getJavaType() == byte[].class) {
      return "byte[]";
    }

    if (fieldType.getJavaType() == Integer.class) {
      return "int";
    }

    if (fieldType.getJavaType() == java.math.BigDecimal.class
        || fieldType.getJavaType() == Double.class) {
      return "double";
    }

    if (fieldType.getJavaType() == java.util.Date.class) {
      return "long";
    }

    if (fieldType.getJavaType() == java.time.LocalDate.class) {
      return "long";
    }

    if (fieldType.getJavaType() == java.time.LocalTime.class) {
      return "long";
    }

    if (fieldType.getJavaType() == java.time.LocalDateTime.class) {
      return "long";
    }

    if (fieldType.getJavaType() == Character.class || "CHAR".equals(this.type)) {
      return "int";
    }

    return "String";
  }

  private String toFieldDeclaration(final String accessModifier, final String staticModifier) {
    String field = "quickfix.StringField";
    String newField = "FieldFactory.newStringField";

    if (fieldType.getJavaType() == Boolean.class) {
      field = "quickfix.BooleanField";
      newField = "FieldFactory.newBooleanField";
    }

    if (fieldType.getJavaType() == byte[].class) {
      field = "quickfix.BytesField";
      newField = "FieldFactory.newBytesField";
    }

    if (fieldType.getJavaType() == java.util.Date.class) {
      field = "quickfix.DateField";
      newField = "FieldFactory.newDateField";
    }

    if (fieldType.getJavaType() == java.math.BigDecimal.class) {
      field = "quickfix.DecimalField";
      newField = "FieldFactory.newDecimalField";
    }

    if (fieldType.getJavaType() == Double.class) {
      field = "quickfix.DoubleField";
      newField = "FieldFactory.newDoubleField";
    }

    if (fieldType.getJavaType() == Integer.class) {
      field = "quickfix.IntField";
      newField = "FieldFactory.newIntField";
    }

    if (fieldType.getJavaType() == java.time.LocalDate.class) {
      field = "FieldFactory.DateField";
      newField = "FieldFactory.newDateField";
    }

    if (fieldType.getJavaType() == java.time.LocalTime.class) {
      field = "FieldFactory.TimeField";
      newField = "FieldFactory.newTimeField";
    }

    if (fieldType.getJavaType() == java.time.LocalDateTime.class) {
      field = "FieldFactory.TimeStampField";
      newField = "FieldFactory.newTimeStampField";
    }

    if ("CHAR".equals(this.type) || fieldType.getJavaType() == Character.class) {
      field = "quickfix.CharField";
      newField = "FieldFactory.newCharField";
    }

    return new StringBuilder("  ")
        .append(accessModifier)
        .append(" ")
        .append(staticModifier)
        .append("final ")
        .append(field)
        .append(" ")
        .append(nameAsVariable())
        .append(" = ")
        .append(newField)
        .append("(")
        .append(this.tag)
        .append(");\n")
        .toString();
  }

  public String getFieldFactory() {
    if (fieldType.getJavaType() == Boolean.class) {
      return "FieldFactory.newBooleanField(" + this.tag;
    }

    if (fieldType.getJavaType() == byte[].class) {
      return "FieldFactory.newBytesField(" + this.tag;
    }

    if (fieldType.getJavaType() == Character.class) {
      return "FieldFactory.newCharField(" + this.tag;
    }

    if (fieldType.getJavaType() == java.util.Date.class) {
      return "FieldFactory.newDateField(" + this.tag;
    }

    if (fieldType.getJavaType() == java.math.BigDecimal.class) {
      return "FieldFactory.newDecimalField(" + this.tag;
    }

    if (fieldType.getJavaType() == Double.class) {
      return "FieldFactory.newDoubleField(" + this.tag;
    }

    if (fieldType.getJavaType() == Integer.class) {
      return "FieldFactory.newIntField(" + this.tag;
    }

    if (fieldType.getJavaType() == String.class) {
      return "FieldFactory.newStringField(" + this.tag;
    }

    if (fieldType.getJavaType() == java.time.LocalDate.class) {
      return "FieldFactory.newDateField(" + this.tag;
    }

    if (fieldType.getJavaType() == java.time.LocalTime.class) {
      return "FieldFactory.newTimeField(" + this.tag;
    }

    if (fieldType.getJavaType() == java.time.LocalDateTime.class) {
      return "FieldFactory.newTimeStampField(" + this.tag;
    }

    // Default to string
    return "FieldFactory.newStringField(" + this.tag;
  }

  public void writeFixToProto(final StringBuilder stringBuilder) {
    writeFixToProto("fix", stringBuilder);
  }

  public void writeFixToProto(final String name, final StringBuilder stringBuilder) {
    stringBuilder.append("      if (")
        .append(name)
        .append(".has")
        .append(builderFieldName())
        .append("()) {\n")

        .append("          builder.set")
        .append(builderFieldName())
        .append("(")
        .append(name)
        .append(".get")
        .append(builderFieldName())
        .append("());\n")

        .append("          presenceBuilder.set")
        .append(builderFieldName())
        .append("(true);\n")

        .append("      }\n");
  }

  public void writeProtoToFix(final StringBuilder stringBuilder) {
    writeProtoToFix("fix", stringBuilder);
  }

  public void writeProtoToFix(final String name, final StringBuilder stringBuilder) {
    stringBuilder.append("      if (fieldPresence.get")
        .append(builderFieldName())
        .append("()) {\n")

        .append("          ")
        .append(name)
        .append(".set")
        .append(builderFieldName())
        .append("(proto.get")
        .append(builderFieldName())
        .append("());\n")

        .append("      }\n");
  }
}
