package garden_leave.gateway;

import quickfix.Acceptor;
import quickfix.Application;
import quickfix.ApplicationFunctionalAdapter;
import quickfix.ConfigError;
import quickfix.DefaultMessageFactory;
import quickfix.MemoryStoreFactory;
import quickfix.SLF4JLogFactory;
import quickfix.SessionSettings;
import quickfix.SocketAcceptor;

public abstract class GatewayAcceptor {
  protected Acceptor acceptor;
  protected ApplicationFunctionalAdapter application;

  protected Acceptor defaultAcceptor(
      final SessionSettings sessionSettings, final Application application) throws ConfigError {
    return new SocketAcceptor(application, new MemoryStoreFactory(), sessionSettings,
        new SLF4JLogFactory(sessionSettings), new DefaultMessageFactory());
  }

  protected ApplicationFunctionalAdapter application() {
    return new ApplicationFunctionalAdapter();
  }

  protected SessionSettings sessionSettings(final String configFile) throws ConfigError {
    return new SessionSettings(configFile);
  }

  public abstract void createFixAcceptor(final SessionSettings sessionSettings) throws ConfigError;
  public abstract void registerMessageHandlers();
  public abstract void start() throws Exception;
  public abstract void shutdown();
}
