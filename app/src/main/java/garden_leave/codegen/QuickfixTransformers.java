package garden_leave.codegen;

import garden_leave.codegen.quickfix.CodeGenerator;

public class QuickfixTransformers {
  private static final String FIXT11DataDictionary = "FIXT11.xml";
  private static final String FIXT11ProtoFileName = "fixt11.proto";
  private static final String FIX50SP2ProtoFileName = "fix50sp2.proto";
  private static final String FIX50SP2DataDictionary = "FIX50SP2.modified.xml";
  private static final String FIX44ProtoFileName = "fix44.proto";
  private static final String FIX44DataDictionary = "FIX44.modified.xml";
  private static final String FIX42ProtoFileName = "fix42.proto";
  private static final String FIX42DataDictionary = "FIX42.xml";

  public void writeFIXExample() throws Exception {
    CodeGenerator.Builder builder =
        CodeGenerator.newBuilder()
            .syntax("syntax = \"proto3\";")
            .packageName("package fixexample.proto;")
            .optimizeFor("option optimize_for = LITE_RUNTIME;")
            .javaMultipleFiles("option java_multiple_files = false;")
            .javaPackage("option java_package = \"garden_leave.fixexample.proto\";")
            .javaOuterClassname("option java_outer_classname = \"FIXExampleProtos\";")
            .addImport("import \"google/protobuf/timestamp.proto\";")
            .addDataDictionaryResource("fix_example.xml")
            .protoFileName("fix_example.proto")
            .protoPathName("/workspaces/garden_leave/proto/src/main/proto/fix")
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/example")
            .javaPackageName("garden_leave.gateway.transform.example")
            .headerName("REQUIRED_ONLY")
            .fixBeginString("FIX.4.4")
            .protoPackageName("garden_leave.fixexample.proto.FIXExampleProtos")
            .generateJavaMessageFactory(false)
            .generateJavaMessageHandlers(false)
            .generateJavaMessageEvents(false)
            .generateJavaOpenTelementry(false)
            .generateJavaMessages(false)
            .generateProtobuf(false);

    builder.build().writeToFile();
  }

  public void writeFixT11() throws Exception {
    CodeGenerator.Builder builder =
        CodeGenerator.newBuilder()
            .syntax("syntax = \"proto3\";")
            .packageName("package fixt11.proto;")
            .optimizeFor("option optimize_for = LITE_RUNTIME;")
            .javaMultipleFiles("option java_multiple_files = false;")
            .javaPackage("option java_package = \"garden_leave.fixt11.proto\";")
            .javaOuterClassname("option java_outer_classname = \"FIXT11Protos\";")
            .addImport("import \"google/protobuf/timestamp.proto\";")
            .addDataDictionaryResource(FIXT11DataDictionary)
            .protoFileName(FIXT11ProtoFileName)
            .protoPathName("/workspaces/garden_leave/proto/src/main/proto/fix")
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fixt11")
            .javaPackageName("garden_leave.gateway.transform.fixt11")
            .quickfixPackageName("quickfix.fixt11")
            .headerName("FIXT11")
            .fixBeginString("FIXT.1.1")
            .protoPackageName("garden_leave.fixt11.proto.FIXT11Protos")
            .generateJavaMessageFactory(true)
            .generateJavaMessageHandlers(true)
            .generateJavaMessageEvents(true)
            .generateJavaOpenTelementry(true)
            .generateJavaMessages(true)
            .generateProtobuf(false);

    builder.build().writeToFile();
  }

  public void writeFix50SP2() throws Exception {
    CodeGenerator.Builder builder =
        CodeGenerator.newBuilder()
            .syntax("syntax = \"proto3\";")
            .packageName("package fix50sp2.proto;")
            .optimizeFor("option optimize_for = LITE_RUNTIME;")
            .javaMultipleFiles("option java_multiple_files = false;")
            .javaPackage("option java_package = \"garden_leave.fix50sp2.proto\";")
            .javaOuterClassname("option java_outer_classname = \"FIX50SP2Protos\";")
            .addImport("import \"google/protobuf/timestamp.proto\";")
            .addDataDictionaryResource(FIX50SP2DataDictionary)
            .protoFileName(FIX50SP2ProtoFileName)
            .protoPathName("/workspaces/garden_leave/proto/src/main/proto/fix")
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fix50sp2")
            .javaPackageName("garden_leave.gateway.transform.fix50sp2")
            .quickfixPackageName("quickfix.fix50sp2")
            .headerName("FIXT11")
            .fixBeginString("FIX.5.0")
            .protoPackageName("garden_leave.fix50sp2.proto.FIX50SP2Protos")
            .generateJavaMessageFactory(true)
            .generateJavaMessageHandlers(true)
            .generateJavaMessageEvents(true)
            .generateJavaOpenTelementry(true)
            .generateJavaMessages(true)
            .generateProtobuf(false);

    builder.addMessage("Quote")
        .addMessage("QuoteCancel")
        .addMessage("QuoteRequest")
        .addMessage("QuoteRequestReject")
        .addMessage("QuoteResponse")
        .addMessage("NewOrderSingle")
        .addMessage("IOI")
        .addMessage("ExecutionReport")
        .addMessage("OrderCancelReject")
        .addMessage("OrderCancelRequest")
        .addMessage("OrderCancelReplaceRequest")
        .addMessage("MarketDataIncrementalRefresh")
        .addMessage("MarketDataSnapshotFullRefresh");

    builder.build().writeToFile();
  }

  public void writeFix44() throws Exception {
    CodeGenerator.Builder builder =
        CodeGenerator.newBuilder()
            .syntax("syntax = \"proto3\";")
            .packageName("package fix44.proto;")
            .optimizeFor("option optimize_for = LITE_RUNTIME;")
            .javaMultipleFiles("option java_multiple_files = false;")
            .javaPackage("option java_package = \"garden_leave.fix44.proto\";")
            .javaOuterClassname("option java_outer_classname = \"FIX44Protos\";")
            .addImport("import \"google/protobuf/timestamp.proto\";")
            .addDataDictionaryResource(FIX44DataDictionary)
            .protoFileName(FIX44ProtoFileName)
            .protoPathName("/workspaces/garden_leave/proto/src/main/proto/fix")
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fix44")
            .javaPackageName("garden_leave.gateway.transform.fix44")
            .quickfixPackageName("quickfix.fix44")
            .headerName("FIX44")
            .fixBeginString("FIX.4.4")
            .protoPackageName("garden_leave.fix44.proto.FIX44Protos")
            .generateJavaMessageFactory(true)
            .generateJavaMessageHandlers(true)
            .generateJavaMessageEvents(true)
            .generateJavaOpenTelementry(true)
            .generateJavaMessages(true)
            .generateProtobuf(false);

    builder.addMessage("Quote")
        .addMessage("QuoteCancel")
        .addMessage("QuoteRequest")
        .addMessage("QuoteRequestReject")
        .addMessage("QuoteResponse")
        .addMessage("NewOrderSingle")
        .addMessage("IndicationOfInterest")
        .addMessage("ExecutionReport")
        .addMessage("OrderCancelReject")
        .addMessage("OrderCancelRequest")
        .addMessage("OrderCancelReplaceRequest")
        .addMessage("MarketDataIncrementalRefresh")
        .addMessage("MarketDataSnapshotFullRefresh");

    builder.build().writeToFile();
  }

  public void writeFix42() throws Exception {
    CodeGenerator.Builder builder =
        CodeGenerator.newBuilder()
            .syntax("syntax = \"proto3\";")
            .packageName("package fix42.proto;")
            .optimizeFor("option optimize_for = LITE_RUNTIME;")
            .javaMultipleFiles("option java_multiple_files = false;")
            .javaPackage("option java_package = \"garden_leave.fix42.proto\";")
            .javaOuterClassname("option java_outer_classname = \"FIX42Protos\";")
            .addImport("import \"google/protobuf/timestamp.proto\";")
            .addDataDictionaryResource(FIX42DataDictionary)
            .protoFileName(FIX42ProtoFileName)
            .protoPathName("/workspaces/garden_leave/proto/src/main/proto/fix")
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fix42")
            .javaPackageName("garden_leave.gateway.transform.fix42")
            .quickfixPackageName("quickfix.fix42")
            .headerName("FIX42")
            .fixBeginString("FIX.4.2")
            .protoPackageName("garden_leave.fix42.proto.FIX42Protos")
            .generateJavaMessageFactory(true)
            .generateJavaMessageHandlers(true)
            .generateJavaMessageEvents(true)
            .generateJavaOpenTelementry(true)
            .generateJavaMessages(true)
            .generateProtobuf(false);

    builder.addMessage("Quote")
        .addMessage("QuoteCancel")
        .addMessage("QuoteRequest")
        .addMessage("NewOrderSingle")
        .addMessage("IndicationofInterest")
        .addMessage("ExecutionReport")
        .addMessage("OrderCancelReject")
        .addMessage("OrderCancelRequest")
        .addMessage("OrderCancelReplaceRequest")
        .addMessage("MarketDataIncrementalRefresh")
        .addMessage("MarketDataSnapshotFullRefresh");

    builder.build().writeToFile();
  }

  public static void main(final String[] args) throws Exception {
    final QuickfixTransformers generator = new QuickfixTransformers();
    generator.writeFix42();
    generator.writeFix44();
    generator.writeFix50SP2();
    generator.writeFixT11();
    // generator.writeFIXExample();
  }
}
