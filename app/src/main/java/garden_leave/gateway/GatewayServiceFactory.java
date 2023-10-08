package garden_leave.gateway;

import garden_leave.service.BaseService;

public final class GatewayServiceFactory {
  public static void main(final String[] args) throws Exception {
    if (args.length == 0) {
      throw new Exception("GatewayServiceFactory invalid configuration.");
    }

    final String service = args[0];

    if ("FIX42.ExampleVenue".equals(service)) {
      BaseService.runService(new GatewayAcceptorService(
          new garden_leave.gateway.example.acceptor.fix42.ExampleVenue()));
    } else if ("FIX42.ExampleClient".equals(service)) {
      BaseService.runService(new GatewayInitiatorService(
          new garden_leave.gateway.example.initiator.fix42.ExampleClient()));
    } else if ("FIX44.ExampleVenue".equals(service)) {
      BaseService.runService(new GatewayAcceptorService(
          new garden_leave.gateway.example.acceptor.fix44.ExampleVenue()));
    } else if ("FIX44.ExampleClient".equals(service)) {
      BaseService.runService(new GatewayInitiatorService(
          new garden_leave.gateway.example.initiator.fix44.ExampleClient()));
    } else if ("FIX42.InternalizerVenue".equals(service)) {
      BaseService.runService(new GatewayAcceptorService(
          new garden_leave.gateway.internalizer.acceptor.fix42.InternalizerVenue()));
    } else if ("FIX42.InternalizerClient".equals(service)) {
      BaseService.runService(new GatewayInitiatorService(
          new garden_leave.gateway.internalizer.initiator.fix42.InternalizerClient()));
    } else {
      throw new Exception("GatewayServiceFactory unknown service name: '" + service + "'");
    }
  }
}
