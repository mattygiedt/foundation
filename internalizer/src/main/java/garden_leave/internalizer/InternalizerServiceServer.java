package garden_leave.internalizer;

import garden_leave.config.proto.InternalizerService;
import garden_leave.fix42.proto.FIX42Protos;
import garden_leave.fix44.proto.FIX44Protos;
import garden_leave.fix50sp2.proto.FIX50SP2Protos;
import garden_leave.internalizer.book.LimitOrder;
import garden_leave.internalizer.book.LimitOrder.LimitOrderBuilder;
import garden_leave.internalizer.book.LimitOrderBook;
import garden_leave.internalizer.book.OrderExecution;
import garden_leave.internalizer.container.MapListContainer;
import garden_leave.internalizer.data.FixTypeCode;
import garden_leave.internalizer.data.Price;
import garden_leave.internalizer.data.SideCode;
import garden_leave.internalizer.proto.AddRequest;
import garden_leave.internalizer.proto.AddResponse;
import garden_leave.internalizer.proto.CancelRequest;
import garden_leave.internalizer.proto.CancelResponse;
import garden_leave.internalizer.proto.ExecutionReportWrapper;
import garden_leave.internalizer.proto.InternalizerServiceGrpc;
import garden_leave.internalizer.proto.ModifyRequest;
import garden_leave.internalizer.proto.ModifyResponse;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternalizerServiceServer extends InternalizerServiceGrpc.InternalizerServiceImplBase {
  private static final Logger logger = LoggerFactory.getLogger(InternalizerServiceServer.class);

  private int port;
  private Server server;

  private final List<OrderExecution> executions = new ArrayList<>(64);
  private final LimitOrderBuilder limitOrderBuilder = new LimitOrderBuilder();
  private final Map<Integer, LimitOrderBook> bookMap = new HashMap<>(512);

  public void configure(final InternalizerService.Instance instance) throws Exception {
    port = instance.getPort();
  }

  public void start() throws IOException {
    logger.info("InternalizerServiceServer starting on grpc_port: {}", port);
    server = ServerBuilder.forPort(port)
                 .addService(this)
                 .executor(Executors.newFixedThreadPool(1))
                 .build();
    server.start();
  }

  public void shutdown() {
    logger.warn("InternalizerServiceServer::shutdown ...");
    try {
      server.shutdown().awaitTermination(1, TimeUnit.SECONDS);
    } catch (final InterruptedException ex) {
      logger.error("ConfigServiceServer::shutdown", ex);
    }
  }

  @Override
  public void addOrder(
      final AddRequest request, final StreamObserver<AddResponse> responseObserver) {
    executions.clear();
    final LimitOrder order = newLimitOrder(request);
    final LimitOrderBook book = getOrCreateBook(order);
    final AddResponse.Builder builder = AddResponse.newBuilder();

    book.addOrder(order, executions);

    executions.forEach((execution) -> createAddResponse(execution, builder));

    responseObserver.onNext(builder.build());
    responseObserver.onCompleted();
  }

  @Override
  public void modifyOrder(
      final ModifyRequest request, final StreamObserver<ModifyResponse> responseObserver) {
    logger.info("modifyOrder: {}", request.toString());

    responseObserver.onCompleted();
  }

  @Override
  public void cancelOrder(
      final CancelRequest request, final StreamObserver<CancelResponse> responseObserver) {
    final LimitOrder order = newLimitOrder(request);
    final LimitOrderBook book = getOrCreateBook(order);
    final OrderExecution execution =
        book.cancelOrder(order.getSide(), order.getOrigClientOrderId());
    final CancelResponse.Builder builder = CancelResponse.newBuilder();

    if (execution != null) {
      createCancelResponse(execution, builder);
    } else {
      createCancelRejectResponse(order, builder);
    }

    responseObserver.onNext(builder.build());
    responseObserver.onCompleted();
  }

  @Override
  public void cancelAll(
      final CancelRequest request, final StreamObserver<CancelResponse> responseObserver) {
    logger.info("cancelAll: {}", request.toString());

    responseObserver.onCompleted();
  }

  private LimitOrderBook getOrCreateBook(final LimitOrder order) {
    return bookMap.computeIfAbsent(Integer.valueOf(order.getSecurityId()),
        k -> new LimitOrderBook(order.getSecurityId(), MapListContainer.provider));
  }

  private LimitOrder newLimitOrder(final CancelRequest request) {
    limitOrderBuilder.clear();
    switch (request.getOrderCase()) {
      case ORDER42:
        final FIX42Protos.OrderCancelRequest order42 = request.getOrder42();
        limitOrderBuilder.setFixType(FixTypeCode.FIX42)
            .setSecurityId(order42.getSecurityId())
            .setSymbol(order42.getSymbol())
            .setOrigClientOrderId(order42.getOrigClOrdId())
            .setClientOrderId(order42.getClOrdId())
            .setSenderId(order42.getHeader().getSenderCompId())
            .setSide(SideCode.of(order42.getSide()))
            .setOriginalQuantity(order42.getOrderQty())
            .setLimitPrice(Price.ZERO);
        break;

      case ORDER44:
        final FIX44Protos.OrderCancelRequest order44 = request.getOrder44();
        limitOrderBuilder.setFixType(FixTypeCode.FIX44)
            .setSecurityId(order44.getSecurityId())
            .setSymbol(order44.getSymbol())
            .setOrigClientOrderId(order44.getOrigClOrdId())
            .setClientOrderId(order44.getClOrdId())
            .setSenderId(order44.getHeader().getSenderCompId())
            .setSide(SideCode.of(order44.getSide()))
            .setOriginalQuantity(order44.getOrderQty())
            .setLimitPrice(Price.ZERO);
        break;

      case ORDER50SP2:
        final FIX50SP2Protos.OrderCancelRequest order50 = request.getOrder50Sp2();
        limitOrderBuilder.setFixType(FixTypeCode.FIX50SP2)
            .setSecurityId(order50.getSecurityId())
            .setSymbol(order50.getSymbol())
            .setOrigClientOrderId(order50.getOrigClOrdId())
            .setClientOrderId(order50.getClOrdId())
            .setSenderId(order50.getHeader().getSenderCompId())
            .setSide(SideCode.of(order50.getSide()))
            .setOriginalQuantity(order50.getOrderQty())
            .setLimitPrice(Price.ZERO);
        break;

      default:
    }

    return limitOrderBuilder.build();
  }

  private LimitOrder newLimitOrder(final AddRequest request) {
    limitOrderBuilder.clear();
    switch (request.getOrderCase()) {
      case ORDER42:
        final FIX42Protos.NewOrderSingle order42 = request.getOrder42();
        limitOrderBuilder.setFixType(FixTypeCode.FIX42)
            .setSecurityId(order42.getSecurityId())
            .setSymbol(order42.getSymbol())
            .setClientOrderId(order42.getClOrdId())
            .setSenderId(order42.getHeader().getSenderCompId())
            .setSide(SideCode.of(order42.getSide()))
            .setOriginalQuantity(order42.getOrderQty())
            .setLimitPrice(new Price(order42.getPrice()));
        break;

      case ORDER44:
        final FIX44Protos.NewOrderSingle order44 = request.getOrder44();
        limitOrderBuilder.setFixType(FixTypeCode.FIX44)
            .setSecurityId(order44.getSecurityId())
            .setSymbol(order44.getSymbol())
            .setClientOrderId(order44.getClOrdId())
            .setSenderId(order44.getHeader().getSenderCompId())
            .setSide(SideCode.of(order44.getSide()))
            .setOriginalQuantity(order44.getOrderQty())
            .setLimitPrice(new Price(order44.getPrice()));
        break;

      case ORDER50SP2:
        final FIX50SP2Protos.NewOrderSingle order50 = request.getOrder50Sp2();
        limitOrderBuilder.setFixType(FixTypeCode.FIX50SP2)
            .setSecurityId(order50.getSecurityId())
            .setSymbol(order50.getSymbol())
            .setClientOrderId(order50.getClOrdId())
            .setSenderId(order50.getHeader().getSenderCompId())
            .setSide(SideCode.of(order50.getSide()))
            .setOriginalQuantity(order50.getOrderQty())
            .setLimitPrice(new Price(order50.getPrice()));
        break;

      default:
    }

    return limitOrderBuilder.build();
  }

  private void createAddResponse(
      final OrderExecution execution, final AddResponse.Builder builder) {
    builder.addExecution(execution.build(ExecutionReportWrapper.newBuilder()));
  }

  private void createCancelResponse(
      final OrderExecution execution, final CancelResponse.Builder builder) {
    builder.addExecution(execution.build(ExecutionReportWrapper.newBuilder()));
  }

  private void createCancelRejectResponse(
      final LimitOrder order, final CancelResponse.Builder builder) {
    switch (order.getFixType()) {
      case FIX42:
        orderCancelReject42(order, builder);
        break;
      case FIX44:
        orderCancelReject44(order, builder);
        break;
      case FIX50SP2:
        orderCancelReject50(order, builder);
        break;
      case UNKNOWN:
      default:
    }
  }

  private void orderCancelReject42(final LimitOrder order, final CancelResponse.Builder builder) {
    final String beginString = "FIX.4.2";

    builder.setReject42(
        FIX42Protos.OrderCancelReject.newBuilder()
            .setHeader(FIX42Protos.Header.newBuilder()
                           .setBeginString(beginString)
                           .setSenderCompId(order.getSenderId())
                           .setFieldPresence(FIX42Protos.Header.FieldPresence.newBuilder()
                                                 .setBeginString(true)
                                                 .setSenderCompId(true)
                                                 .build())
                           .build())
            .setClOrdId(order.getClientOrderId())
            .setOrigClOrdId(order.getOrigClientOrderId())
            .setOrderId("NONE")
            .setOrdStatus(order.getOrderStatus().toFixValue())
            .setCxlRejResponseTo(quickfix.field.CxlRejResponseTo.ORDER_CANCEL_REQUEST)
            .setFieldPresence(FIX42Protos.OrderCancelReject.FieldPresence.newBuilder()
                                  .setClOrdId(true)
                                  .setOrigClOrdId(true)
                                  .setOrderId(true)
                                  .setOrdStatus(true)
                                  .setCxlRejResponseTo(true)
                                  .build())
            .build());
  }

  private void orderCancelReject44(final LimitOrder order, final CancelResponse.Builder builder) {
    final String beginString = "FIX.4.4";

    builder.setReject44(
        FIX44Protos.OrderCancelReject.newBuilder()
            .setHeader(FIX44Protos.Header.newBuilder()
                           .setBeginString(beginString)
                           .setSenderCompId(order.getSenderId())
                           .setFieldPresence(FIX44Protos.Header.FieldPresence.newBuilder()
                                                 .setBeginString(true)
                                                 .setSenderCompId(true)
                                                 .build())
                           .build())
            .setClOrdId(order.getClientOrderId())
            .setOrigClOrdId(order.getOrigClientOrderId())
            .setOrderId(order.getOrderId().toString())
            .setOrdStatus(order.getOrderStatus().toFixValue())
            .setCxlRejResponseTo(quickfix.field.CxlRejResponseTo.ORDER_CANCEL_REQUEST)
            .setFieldPresence(FIX44Protos.OrderCancelReject.FieldPresence.newBuilder()
                                  .setClOrdId(true)
                                  .setOrigClOrdId(true)
                                  .setOrderId(true)
                                  .setOrdStatus(true)
                                  .setCxlRejResponseTo(true)
                                  .build())
            .build());
  }

  private void orderCancelReject50(final LimitOrder order, final CancelResponse.Builder builder) {
    final String beginString = "FIX.5.0";

    builder.setReject50Sp2(
        FIX50SP2Protos.OrderCancelReject.newBuilder()
            .setHeader(FIX50SP2Protos.Header.newBuilder()
                           .setBeginString(beginString)
                           .setSenderCompId(order.getSenderId())
                           .setFieldPresence(FIX50SP2Protos.Header.FieldPresence.newBuilder()
                                                 .setBeginString(true)
                                                 .setSenderCompId(true)
                                                 .build())
                           .build())
            .setClOrdId(order.getClientOrderId())
            .setOrigClOrdId(order.getOrigClientOrderId())
            .setOrderId(order.getOrderId().toString())
            .setOrdStatus(order.getOrderStatus().toFixValue())
            .setCxlRejResponseTo(quickfix.field.CxlRejResponseTo.ORDER_CANCEL_REQUEST)
            .setFieldPresence(FIX50SP2Protos.OrderCancelReject.FieldPresence.newBuilder()
                                  .setClOrdId(true)
                                  .setOrigClOrdId(true)
                                  .setOrderId(true)
                                  .setOrdStatus(true)
                                  .setCxlRejResponseTo(true)
                                  .build())
            .build());
  }
}
