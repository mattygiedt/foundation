package garden_leave.codegen.quickfix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.FieldType;

public class ProtobufGenerator {
  private static final Logger logger = LoggerFactory.getLogger(ProtobufGenerator.class);

  private final CodeGenerator generator;
  private final CodeGenerator.Builder builder;
  private final StringBuilder stringBuilder = new StringBuilder();

  public ProtobufGenerator(final CodeGenerator generator) {
    this.generator = generator;
    this.builder = generator.builder();
  }

  public String generate() throws Exception {
    this.stringBuilder.setLength(0);
    writeHeader(this.stringBuilder);
    writeMessages(this.stringBuilder);
    return this.stringBuilder.toString();
  }

  public void writeToFile() throws Exception {
    if (!this.builder.generateProtobuf) {
      return;
    }

    final String pathName = this.builder.protoPathName;
    final String fileName = this.builder.protoFileName;

    logger.info("writeToFile: path {}, file {}", pathName, fileName);

    if (null != pathName && null != fileName) {
      Files.createDirectories(Paths.get(pathName));
      final Path path = Paths.get(pathName, fileName);
      final BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
      writer.write(generate());
      writer.close();
    } else {
      throw new Exception("writeToFile error: builder.protoPathName " + pathName
          + ", builder.protoFileName " + fileName);
    }
  }

  protected void writeHeader(final StringBuilder stringBuilder) throws Exception {
    stringBuilder.append(builder.syntax)
        .append("\n\n//\n// THIS FILE WAS AUTOMATICALLY GENERATED -- DO NOT EDIT!!!\n//\n// ")
        .append(LocalDate.now())
        .append(" - ")
        .append(LocalTime.now())
        .append("\n//\n\n")
        .append(this.builder.packageName)
        .append("\n")
        .append(this.builder.javaMultipleFiles)
        .append("\n")
        .append(this.builder.javaPackage)
        .append("\n")
        .append(this.builder.javaOuterClassname)
        .append("\n")
        .append(this.builder.optimizeFor)
        .append("\n\n");

    this.builder.importList.forEach((str) -> stringBuilder.append(str).append("\n"));

    stringBuilder.append("\n");

    writeMessage(this.generator.header, true, "", stringBuilder);
  }

  protected void writeMessages(final StringBuilder stringBuilder) throws Exception {
    stringBuilder.append("// MESSAGES\n//\n");
    this.generator.messages().forEach((message) -> {
      if (message.isUsed()) {
        writeMessage(message, false, "", stringBuilder);
      }
    });
  }

  private void writeFieldPresence(
      final Message message, final String indent, final StringBuilder stringBuilder) {
    stringBuilder.append(indent).append("message FieldPresence {\n");

    int protoFieldId = 0;
    for (final Field field : message.fieldList) {
      stringBuilder.append(indent)
          .append("  bool ")
          .append(toSnake(field.name))
          .append(" = ")
          .append(++protoFieldId)
          .append(";\n");
    }

    stringBuilder.append(indent).append("}\n\n");
  }

  private void writeMessage(final Message message, final boolean isGroup, final String indent,
      final StringBuilder stringBuilder) {
    // Write the top level message block
    stringBuilder.append(indent).append("message ").append(toCamel(message.name)).append(" {\n");

    // Recurse on any group messages
    for (final Message groupMessage : message.groupList) {
      writeMessage(groupMessage, true, indent + "  ", stringBuilder);
    }

    if (message.fieldList.size() > 0) {
      writeFieldPresence(message, indent + "  ", stringBuilder);
    }

    // Generate the message, message_id and timestamp fields
    int protoFieldId = 0;
    if (!isGroup) {
      stringBuilder.append(indent)
          .append("  // HEADER\n")
          .append("  string message_id = ")
          .append(++protoFieldId)
          .append(";\n")
          .append(indent)
          .append("  google.protobuf.Timestamp timestamp = ")
          .append(++protoFieldId)
          .append(";\n")
          .append(indent)
          .append("  Header header = ")
          .append(++protoFieldId)
          .append(";\n\n");
    }

    if (message.fieldList.size() > 0) {
      stringBuilder.append(indent)
          .append("  // FIELDS\n")
          .append(indent)
          .append("  FieldPresence field_presence = ")
          .append(++protoFieldId)
          .append(";\n");

      for (final Field field : message.fieldList) {
        stringBuilder.append(indent)
            .append("  ")
            .append(ProtobufGenerator.getProtoFieldType(field.fieldType))
            .append(" ")
            .append(toSnake(field.name))
            .append(" = ")
            .append(++protoFieldId)
            .append(";  // tag ")
            .append(field.tag)
            .append(", name ")
            .append(field.name)
            .append(", type ")
            .append(field.type)
            .append("\n");
      }
    }

    if (message.groupList.size() > 0) {
      stringBuilder.append(indent).append("\n").append("  // GROUPS\n");
      for (final Group group : message.groupList) {
        stringBuilder.append(indent)
            .append("  repeated ")
            .append(toCamel(group.name))
            .append(" ")
            .append(toSnake(group.name))
            .append(" = ")
            .append(++protoFieldId)
            .append(";\n");
      }
    }

    stringBuilder.append(indent).append("}\n\n");
  }

  public static String getProtoFieldType(final FieldType fieldType) {
    switch (fieldType) {
      case UTCTIMESTAMP:
      case UTCDATEONLY:
      case UTCDATE:
      case UTCTIMEONLY:
        return "uint64";
      case PRICE:
      case AMT:
      case QTY:
      case FLOAT:
      case PRICEOFFSET:
      case PERCENTAGE:
        return "double";
      case CHAR:
      case INT:
      case NUMINGROUP:
      case SEQNUM:
      case LENGTH:
      case DAYOFMONTH:
        return "int32";
      case BOOLEAN:
        return "bool";
      default:
        return "string";
    }
  }

  public static final Map<String, String> camelMap;
  public static final Set<Map.Entry<String, String>> camelMapEntries;

  static {
    camelMap = new HashMap<>();
    camelMap.putAll(Map.of("ID", "Id", "CP", "Cp", "GT", "Gt", "FX", "Fx", "NT", "Nt", "MD", "Md"));
    camelMap.putAll(Map.of("IOI", "Ioi", "URL", "Url", "CFI", "Cfi", "RFQ", "Rfq", "XML", "Xml"));
    camelMapEntries = camelMap.entrySet();
  }

  public static String toCamel(final String str) {
    String camelStr = new String(str);

    for (final Map.Entry<String, String> entry : camelMapEntries) {
      if (camelStr.contains(entry.getKey())) {
        camelStr = camelStr.replaceAll(entry.getKey(), entry.getValue());
      }
    }

    return camelStr;
  }

  public static String toSnake(final String str) {
    // Regular Expression
    final String regex = "([a-z])([A-Z]+)";

    // Replacement string
    final String replacement = "$1_$2";

    // Replace the given regex with replacement string and convert it to lower case.
    return ProtobufGenerator.toCamel(str).replaceAll(regex, replacement).toLowerCase();
  }

  public static String builderFieldName(final String str) {
    return ProtobufGenerator.toCamel(str);
  }
}
