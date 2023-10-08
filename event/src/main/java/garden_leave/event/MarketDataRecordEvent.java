package garden_leave.event;

import com.google.protobuf.InvalidProtocolBufferException;
import com.lmax.disruptor.EventFactory;
import garden_leave.marketdata.proto.MarketDataRecord;

public final class MarketDataRecordEvent {
  public final static EventFactory<MarketDataRecordEvent> EVENT_FACTORY =
      () -> new MarketDataRecordEvent();

  private final MarketDataRecord.Builder builder = MarketDataRecord.newBuilder();

  private MarketDataRecord record = null;

  public MarketDataRecord getRecord() {
    return record;
  }

  public void setRecord(final byte[] data) throws InvalidProtocolBufferException {
    record = builder.mergeFrom(data).build();
  }

  public void setRecord(final byte[] data, final int off, final int length)
      throws InvalidProtocolBufferException {
    record = builder.mergeFrom(data, off, length).build();
  }

  public void setRecord(final MarketDataRecord other) throws InvalidProtocolBufferException {
    record = builder.mergeFrom(other).build();
  }
}
