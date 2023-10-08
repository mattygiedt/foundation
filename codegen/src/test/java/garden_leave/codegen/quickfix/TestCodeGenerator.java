package garden_leave.codegen.quickfix;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCodeGenerator {
  private static final String FIXT11DataDictionary = "FIXT11.xml";
  private static final String FIXT11ProtoFileName = "/tmp/FIXT11.proto";
  private static final String FIX50SP2ProtoFileName = "/tmp/FIX50SP2.proto";
  private static final String FIX50SP2DataDictionary = "FIX50SP2.modified.xml";
  private static final String FIX44ProtoFileName = "/tmp/FIX44.proto";
  private static final String FIX44DataDictionary = "FIX44.modified.xml";
  private static final String FIX42ProtoFileName = "/tmp/FIX42.proto";
  private static final String FIX42DataDictionary = "FIX42.xml";

  @Test
  public void testFixT11() throws Exception {
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
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fixt11")
            .javaPackageName("garden_leave.gateway.transform.fixt11")
            .quickfixPackageName("quickfix.fixt11")
            .fixBeginString("FIXT.1.1")
            .protoPackageName("garden_leave.fixt11.proto.FIXT11Protos");

    final CodeGenerator generator = builder.build();

    assertTrue(generator.fields().size() > 0);
  }

  @Test
  public void testFix50SP2() throws Exception {
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
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fix50sp2")
            .javaPackageName("garden_leave.gateway.transform.fix50sp2")
            .quickfixPackageName("quickfix.fix50sp2")
            .fixBeginString("FIXT.1.1")
            .protoPackageName("garden_leave.fix50sp2.proto.FIX50SP2Protos");

    builder.addMessage("Quote");

    final CodeGenerator generator = builder.build();

    assertTrue(generator.fields().size() > 0);
  }

  @Test
  public void testFix44() throws Exception {
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
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fix44")
            .javaPackageName("garden_leave.gateway.transform.fix44")
            .quickfixPackageName("quickfix.fix44")
            .fixBeginString("FIX.4.4")
            .protoPackageName("garden_leave.fix44.proto.FIX44Protos");

    builder.addMessage("Heartbeat")
        .addMessage("Logon")
        .addMessage("Logout")
        .addMessage("Reject")
        .addMessage("Quote")
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

    final CodeGenerator generator = builder.build();

    assertTrue(generator.fields().size() > 0);
  }

  @Test
  public void testFix42() throws Exception {
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
            .javaPathName(
                "/workspaces/garden_leave/gateway/src/main/java/garden_leave/gateway/transform/fix42")
            .javaPackageName("garden_leave.gateway.transform.fix42")
            .quickfixPackageName("quickfix.fix42")
            .fixBeginString("FIX.4.2")
            .protoPackageName("garden_leave.fix42.proto.FIX42Protos");

    builder.addMessage("Heartbeat")
        .addMessage("Logon")
        .addMessage("Logout")
        .addMessage("Reject")
        .addMessage("Quote")
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

    final CodeGenerator generator = builder.build();

    assertTrue(generator.fields().size() > 0);
  }
}
