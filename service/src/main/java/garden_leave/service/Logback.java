package garden_leave.service;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.LoggerFactory;

public class Logback {
  public static final String STDOUT_LOGGER = "logging/stdout.xml";
  public static final String ROLLING_FILE_LOGGER = "logging/rolling-file.xml";

  public static void configureLogback(final LogType logType, final Level logLevel,
      final String logDir, final String logFile) throws Exception {
    final JoranConfigurator configurator = new JoranConfigurator();
    final LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();

    //
    // Call context.reset() to clear any previous configuration.
    //

    configurator.setContext(context);
    StatusPrinter.printInCaseOfErrorsOrWarnings(context);

    if (logType == LogType.STDOUT) {
      context.reset();
      Logback.loadStandardOut(configurator);
    } else if (logType == LogType.ROLLING_FILE) {
      context.reset();
      Logback.loadRollingFile(configurator, logDir, logFile);
    } else if (logType == LogType.ENVIRONMENT_VARIABLE) {
      // Hopefully logback has found the specified log configuration file...
    }

    //
    // Update the rootLogger log-level (if necessary)
    //

    final Logger rootLogger =
        (ch.qos.logback.classic.Logger) LoggerFactory.getLogger(org.slf4j.Logger.ROOT_LOGGER_NAME);

    if (rootLogger.getLevel() != logLevel) {
      rootLogger.setLevel(logLevel);
    }
  }

  private static void loadStandardOut(final JoranConfigurator configurator) throws Exception {
    System.out.println("JoranConfigurator doConfigure from class loader: " + STDOUT_LOGGER);
    configurator.doConfigure(BaseService.class.getClassLoader().getResourceAsStream(STDOUT_LOGGER));
  }

  private static void loadRollingFile(final JoranConfigurator configurator, final String logDir,
      final String logFile) throws Exception {
    configurator.doConfigure(
        BaseService.class.getClassLoader().getResourceAsStream(ROLLING_FILE_LOGGER));
  }
}
