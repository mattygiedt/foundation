package garden_leave.codegen.quickfix;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JavaWriter {
  private static final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);
  private final CodeGenerator generator;
  private final CodeGenerator.Builder builder;
  private final MessageFactory messageFactory;
  private final MessageEvent messageEvent;
  private final MessageEventConsumer messageEventConsumer;
  private final MessageHandlers messageHandlers;
  private final Map<String, String> messageClasses = new HashMap<>();

  public JavaWriter(final CodeGenerator generator) {
    this.generator = generator;
    this.builder = generator.builder();
    this.messageEvent = new MessageEvent();
    this.messageFactory = new MessageFactory();
    this.messageHandlers = new MessageHandlers();
    this.messageEventConsumer = new MessageEventConsumer();
  }

  public void writeToFile() throws Exception {
    final String pathName = this.builder.javaPathName;

    if (null == pathName) {
      throw new Exception("writeToFile config error: builder.javaPathName is null");
    }

    generate();

    Files.createDirectories(Paths.get(pathName));

    for (final Map.Entry<String, String> entry : messageClasses.entrySet()) {
      final Path path = Paths.get(pathName, entry.getKey() + ".java");
      final BufferedWriter writer = new BufferedWriter(new FileWriter(path.toFile()));
      writer.write(entry.getValue());
      writer.close();
    }
  }

  private void generate() {
    messageClasses.clear();

    if (this.builder.generateJavaMessages) {
      logger.info("writing JavaMessages...");
      messageClasses.put(this.generator.header.getCamelName(),
          this.generator.header.toFinalClassDeclaration(this.generator));

      this.generator.messages().forEach((message) -> {
        if (message.isUsed()) {
          messageClasses.put(
              message.getCamelName(), message.toFinalClassDeclaration(this.generator));
        }
      });
    }

    if (this.builder.generateJavaMessageFactory) {
      logger.info("writing MessageFactoryProvider...");
      messageClasses.put("MessageFactoryProvider", messageFactory.generate(this.generator));
    }

    if (this.builder.generateJavaMessageHandlers) {
      logger.info("writing MessageHandlers...");
      messageClasses.put("MessageHandlers", messageHandlers.generate(this.generator));
    }

    if (this.builder.generateJavaMessageEvents) {
      logger.info("writing MessageEvents...");
      messageClasses.put("MessageEvent", messageEvent.generate(this.generator));
      messageClasses.put("MessageEventConsumer", messageEventConsumer.generate(this.generator));
    }
  }
}
