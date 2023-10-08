package garden_leave.gateway;

public final class GatewayUtils {
  public static quickfix.SessionID createSessionIdForSendToTarget(
      final String beginString, final String senderCompId, final String targetCompId) {
    return new quickfix.SessionID(beginString, targetCompId, senderCompId);
  }
}
