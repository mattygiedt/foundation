package garden_leave.internalizer.data;

public enum OrderStatusCode {
  UNKNOWN,
  PENDING_NEW,
  PENDING_MODIFY,
  PENDING_CANCEL,
  REJECTED,
  REPLACED,
  NEW,
  PARTIALLY_FILLED,
  FILLED,
  CANCELLED,
  COMPLETED,
  CANCEL_REJECTED;

  public int toFixValue() {
    switch (this) {
      case NEW:
        return '0';
      case PARTIALLY_FILLED:
        return '1';
      case FILLED:
        return '2';
      case COMPLETED:
        return '3';
      case CANCELLED:
        return '4';
      case REPLACED:
        return '5';
      case PENDING_CANCEL:
        return '6';
      case REJECTED:
        return '8';
      case PENDING_NEW:
        return 'A';
      case PENDING_MODIFY:
        return 'E';
      default:
        return 0;
    }
  }
}
