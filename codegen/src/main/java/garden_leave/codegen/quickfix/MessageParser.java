package garden_leave.codegen.quickfix;

public class MessageParser extends Message {
  private boolean fixParserWritten = false;
  private boolean protoParserWritten = false;

  public MessageParser(final String name) {
    super(name);
  }

  public boolean isFixParserWritten() {
    return fixParserWritten == true;
  }

  public void setFixParserWritten() {
    fixParserWritten = true;
  }

  public boolean isProtoParserWritten() {
    return protoParserWritten == true;
  }

  public void setProtoParserWritten() {
    protoParserWritten = true;
  }
}
