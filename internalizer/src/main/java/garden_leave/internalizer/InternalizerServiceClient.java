package garden_leave.internalizer;

import garden_leave.internalizer.proto.AddRequest;
import garden_leave.internalizer.proto.AddResponse;
import garden_leave.internalizer.proto.CancelRequest;
import garden_leave.internalizer.proto.CancelResponse;
import garden_leave.internalizer.proto.InternalizerServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InternalizerServiceClient {
  private static final Logger logger = LoggerFactory.getLogger(InternalizerServiceClient.class);

  class ResponseCallback<T> implements StreamObserver<T> {
    private final CountDownLatch latch = new CountDownLatch(1);
    private T response = null;

    public T getResponse() {
      try {
        if (!latch.await(5, TimeUnit.SECONDS)) {
          logger.warn("ResponseCallback::getResponse timeout");
        }
      } catch (final InterruptedException ignore) {
      }

      return response;
    }

    @Override
    public void onNext(final T response) {
      this.response = response;
    }

    @Override
    public void onCompleted() {
      latch.countDown();
    }

    @Override
    public void onError(final Throwable t) {
      logger.error("ResponseCallback error: {}", Status.fromThrowable(t));
      latch.countDown();
    }
  }

  private final ManagedChannel channel;
  public InternalizerServiceClient(final String target) {
    channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
  }

  public AddResponse sendAddRequest(final AddRequest request) {
    final InternalizerServiceGrpc.InternalizerServiceStub stub =
        InternalizerServiceGrpc.newStub(channel);
    final ResponseCallback<AddResponse> callback = new ResponseCallback<>();

    stub.addOrder(request, callback);

    return callback.getResponse();
  }

  public CancelResponse sendCancelRequest(final CancelRequest request) {
    final InternalizerServiceGrpc.InternalizerServiceStub stub =
        InternalizerServiceGrpc.newStub(channel);
    final ResponseCallback<CancelResponse> callback = new ResponseCallback<>();

    stub.cancelOrder(request, callback);

    return callback.getResponse();
  }
}
