package garden_leave.codegen.quickfix;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import quickfix.field.ApplVerID;

public class CodeGenerator {
  private static final Logger logger = LoggerFactory.getLogger(CodeGenerator.class);
  private static final String JDK_DOCUMENT_BUILDER_FACTORY_NAME =
      "com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl";
  private static Supplier<DocumentBuilderFactory> documentBuilderFactorySupplier() {
    return () -> {
      DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

      if (JDK_DOCUMENT_BUILDER_FACTORY_NAME.equals(documentBuilderFactory.getClass().getName())) {
        // disallow access to external DTD and schema when using JDK Xerces implementation
        documentBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_DTD, "");
        documentBuilderFactory.setAttribute(XMLConstants.ACCESS_EXTERNAL_SCHEMA, "");
      }

      return documentBuilderFactory;
    };
  }

  public static class Builder {
    private Builder() {}

    public CodeGenerator build() throws Exception {
      return new CodeGenerator(this);
    }

    boolean generateProtobuf = true;
    public Builder generateProtobuf(boolean value) {
      this.generateProtobuf = value;
      return this;
    }

    boolean generateJavaMessages = true;
    public Builder generateJavaMessages(boolean value) {
      this.generateJavaMessages = value;
      return this;
    }

    boolean generateJavaOpenTelementry = true;
    public Builder generateJavaOpenTelementry(boolean value) {
      this.generateJavaOpenTelementry = value;
      return this;
    }

    boolean generateJavaMessageFactory = true;
    public Builder generateJavaMessageFactory(boolean value) {
      this.generateJavaMessageFactory = value;
      return this;
    }

    boolean generateJavaMessageHandlers = true;
    public Builder generateJavaMessageHandlers(boolean value) {
      this.generateJavaMessageHandlers = value;
      return this;
    }

    boolean generateJavaMessageEvents = true;
    public Builder generateJavaMessageEvents(boolean value) {
      this.generateJavaMessageEvents = value;
      return this;
    }

    Set<String> messageList = new HashSet<>();
    public Builder addMessage(String value) {
      messageList.add(value);
      return this;
    }

    Set<String> importList = new HashSet<>();
    public Builder addImport(String value) {
      importList.add(value);
      return this;
    }

    List<String> dataDictionaryResourceList = new ArrayList<>();
    public Builder addDataDictionaryResource(String value) {
      this.dataDictionaryResourceList.add(value);
      return this;
    }

    String syntax = "syntax = \"proto3\";";
    public Builder syntax(String value) {
      this.syntax = value;
      return this;
    }

    String packageName = "package ;";
    public Builder packageName(String value) {
      this.packageName = value;
      return this;
    }

    String optimizeFor = "option optimize_for = LITE_RUNTIME;";
    public Builder optimizeFor(String value) {
      this.optimizeFor = value;
      return this;
    }

    String javaMultipleFiles = "option java_multiple_files = true;";
    public Builder javaMultipleFiles(String value) {
      this.javaMultipleFiles = value;
      return this;
    }

    String javaPackage = "option java_package = \"\";";
    public Builder javaPackage(String value) {
      this.javaPackage = value;
      return this;
    }

    String javaOuterClassname = "option java_outer_classname = \"\";";
    public Builder javaOuterClassname(String value) {
      this.javaOuterClassname = value;
      return this;
    }

    String quickfixPackageName = "";
    public Builder quickfixPackageName(String value) {
      this.quickfixPackageName = value;
      return this;
    }

    String protoPackageName = "";
    public Builder protoPackageName(String value) {
      this.protoPackageName = value;
      return this;
    }

    String javaPathName = null;
    public Builder javaPathName(String value) {
      this.javaPathName = value;
      return this;
    }

    String javaPackageName = null;
    public Builder javaPackageName(String value) {
      this.javaPackageName = value;
      return this;
    }

    String protoFileName = null;
    public Builder protoFileName(String value) {
      this.protoFileName = value;
      return this;
    }

    String protoPathName = null;
    public Builder protoPathName(String value) {
      this.protoPathName = value;
      return this;
    }

    boolean throwOnDuplicate = true;
    public Builder throwOnDuplicate(boolean value) {
      this.throwOnDuplicate = value;
      return this;
    }

    String fixBeginString = quickfix.FixVersions.BEGINSTRING_FIX42;
    public Builder fixBeginString(String value) {
      this.fixBeginString = value;
      return this;
    }

    String fixApplVerId = ApplVerID.FIX50SP2;
    public Builder fixApplVerId(String value) {
      this.fixApplVerId = value;
      return this;
    }

    String headerDictionary = "headers.xml";
    public Builder headerDictionary(String value) {
      this.headerDictionary = value;
      return this;
    }

    String headerName = "REQUIRED_ONLY";
    public Builder headerName(String value) {
      this.headerName = value;
      return this;
    }
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public void writeToFile() throws Exception {
    new ProtobufGenerator(this).writeToFile();
    new JavaWriter(this).writeToFile();
  }

  //
  // package private getters used by concrete code generators
  //

  Builder builder() {
    return this.builder;
  }

  Map<String, Field> fieldMap() {
    return this.fieldMap;
  }

  Map<String, Group> groupMap() {
    return this.groupMap;
  }

  Map<String, Component> componentMap() {
    return this.componentMap;
  }

  Component component(final String name) {
    return this.componentMap.get(name);
  }

  Map<String, Message> messageMap() {
    return this.messageMap;
  }

  List<Field> fields() {
    return new ArrayList<>(this.fieldMap.values());
  }

  List<Group> groups() {
    return new ArrayList<>(this.groupMap.values());
  }

  List<Component> components() {
    return new ArrayList<>(this.componentMap.values());
  }

  List<Message> messages() {
    return new ArrayList<>(this.messageMap.values());
  }

  Header header = new Header("Header");

  private final Builder builder;
  private final Map<String, Node> componentNodeMap = new HashMap<>();
  private final Map<String, Field> fieldMap = new HashMap<>();
  private final Map<String, Group> groupMap = new HashMap<>();
  private final Map<String, Component> componentMap = new HashMap<>();
  private final Map<String, Message> messageMap = new HashMap<>();
  private final List<Message> messageList = new ArrayList<>();

  protected CodeGenerator(final Builder builder) throws Exception {
    this.builder = builder;

    for (final String resourceFile : builder.dataDictionaryResourceList) {
      loadDataDictionary(resourceFile);
    }

    loadHeader(this.builder.headerDictionary);

    logger.info("loaded: {} fields, {} groups, {} messages", fieldMap.size(), groupMap.size(),
        messageMap.size());

    header.setIsUsed();
    for (final Message message : messageMap().values()) {
      if (this.builder.messageList.size() == 0 || message.isAdmin()
          || this.builder.messageList.contains(message.name)) {
        message.setIsUsed();
        messageList.add(message);
      }
    }
  }

  protected void loadHeader(final String resourceFile) throws Exception {
    logger.info("loading XML headers dictionary from resource {}, name {}, session: {}",
        resourceFile, this.builder.headerName, this.builder.fixBeginString);

    final String name = this.builder.headerName;
    final String session = this.builder.fixBeginString;

    final InputStream inputStream =
        ProtobufGenerator.class.getClassLoader().getResourceAsStream(resourceFile);

    final DocumentBuilder documentBuilder =
        documentBuilderFactorySupplier().get().newDocumentBuilder();
    final Document document = documentBuilder.parse(inputStream);
    final Element documentElement = document.getDocumentElement();

    if (!documentElement.getNodeName().equals("fix")) {
      throw new Exception("Could not parse data dictionary file, or no <fix> node found at root");
    }

    final NodeList headerNodes = documentElement.getElementsByTagName("header");

    for (int i = 0; i < headerNodes.getLength(); i++) {
      final Node headerNode = headerNodes.item(i);

      if (name.equals(getAttribute(headerNode, "name"))
          && session.equals(getAttribute(headerNode, "session"))) {
        final NodeList childNodes = headerNode.getChildNodes();

        logger.info("found header: name '{}', session: {}", name, session);

        if (countElementNodes(childNodes) == 0) {
          throw new Exception(" no fields for header name '" + name + "', session " + session);
        }

        for (int j = 0; j < childNodes.getLength(); j++) {
          final Node childNode = childNodes.item(j);
          final String nodeName = childNode.getNodeName();

          if (nodeName.equals("field")) {
            addFieldToMessage(header, childNode);
          }

          if (nodeName.equals("group")) {
            addGroupToMessage(header, childNode);
          }

          if (nodeName.equals("component")) {
            addComponentToMessage(header, childNode);
          }
        }

        return;
      }
    }

    throw new Exception(
        "could not find header definition for name '" + name + "', session " + session);
  }

  protected void loadDataDictionary(final String resourceFile) throws Exception {
    logger.info("loading XML data dictionary from resource: {}", resourceFile);

    final InputStream inputStream =
        ProtobufGenerator.class.getClassLoader().getResourceAsStream(resourceFile);

    final DocumentBuilder documentBuilder =
        documentBuilderFactorySupplier().get().newDocumentBuilder();
    final Document document = documentBuilder.parse(inputStream);
    final Element documentElement = document.getDocumentElement();

    if (!documentElement.getNodeName().equals("fix")) {
      throw new Exception("Could not parse data dictionary file, or no <fix> node found at root");
    }

    if (!documentElement.hasAttribute("major")) {
      throw new Exception("major attribute not found on <fix>");
    }

    loadFields(documentElement);
    loadComponents(documentElement);
    loadMessages(documentElement);

    for (Message message : messageMap.values()) {
      logger.info("message: {} groups:", message.name);

      for (Group group : message.groupList) {
        logger.info("  {}", group.name);
      }
    }
  }

  protected void loadFields(final Element documentElement) throws Exception {
    logger.info("loadFields...");
    final NodeList fieldsNode = documentElement.getElementsByTagName("fields");
    if (fieldsNode.getLength() == 0) {
      throw new Exception("<fields> section not found in data dictionary");
    }

    final NodeList fieldNodes = fieldsNode.item(0).getChildNodes();
    if (countElementNodes(fieldNodes) == 0) {
      throw new Exception("No fields defined");
    }

    for (int i = 0; i < fieldNodes.getLength(); i++) {
      final Node fieldNode = fieldNodes.item(i);
      if (fieldNode.getNodeName().equals("field")) {
        final String name = getAttribute(fieldNode, "name");
        if (name == null) {
          throw new Exception("<field> does not have a name attribute");
        }

        final String number = getAttribute(fieldNode, "number");
        if (number == null) {
          throw new Exception("<field> " + name + " does not have a number attribute");
        }

        final String type = getAttribute(fieldNode, "type");
        if (type == null) {
          throw new Exception("<field> " + name + " does not have a type attribute");
        }

        if (fieldMap.containsKey(name)) {
          if (this.builder.throwOnDuplicate) {
            throw new Exception("duplicate <field> " + name);
          } else {
            logger.warn("overwriting existing field {}[{}] with type {}", name, number, type);
          }
        }

        fieldMap.put(name, new Field(name, number, type));
      }
    }
  }

  private void loadComponents(final Element documentElement) throws Exception {
    logger.info("loadComponents...");
    final NodeList componentsNode = documentElement.getElementsByTagName("components");
    if (componentsNode.getLength() > 0) {
      final NodeList componentNodes = componentsNode.item(0).getChildNodes();
      if (countElementNodes(componentNodes) == 0) {
        throw new Exception("No components defined");
      }

      for (int i = 0; i < componentNodes.getLength(); i++) {
        final Node componentNode = componentNodes.item(i);
        if (componentNode.getNodeName().equals("component")) {
          final String name = getAttribute(componentNode, "name");
          componentNodeMap.put(name, componentNode);
        }
      }
    }
  }

  private Component loadComponent(final String name, final String messageName, final Node node) {
    if (componentMap.containsKey(name)) {
      return componentMap.get(name);
    }

    logger.info("loadComponent: {} for message {}", name, messageName);
    final Component component = new Component(messageName);
    componentMap.put(name, component);

    final NodeList childNodes = node.getChildNodes();
    if (countElementNodes(childNodes) == 0) {
      throw new RuntimeException(" no fields for component: " + component.name);
    }

    for (int j = 0; j < childNodes.getLength(); j++) {
      final Node childNode = childNodes.item(j);
      final String nodeName = childNode.getNodeName();

      if (nodeName.equals("field")) {
        addFieldToMessage(component, childNode);
      }

      if (nodeName.equals("group")) {
        addGroupToMessage(component, childNode);
      }

      if (nodeName.equals("component")) {
        addComponentToMessage(component, childNode);
      }
    }

    return component;
  }

  private void loadMessages(final Element documentElement) throws Exception {
    logger.info("loadMessages...");
    final NodeList messagesNode = documentElement.getElementsByTagName("messages");
    final NodeList messageNodes = messagesNode.item(0).getChildNodes();
    if (countElementNodes(messageNodes) == 0) {
      throw new Exception("No messages defined");
    }

    for (int i = 0; i < messageNodes.getLength(); i++) {
      final Node messageNode = messageNodes.item(i);
      if (messageNode.getNodeName().equals("message")) {
        final String name = getAttribute(messageNode, "name");
        final String msgType = getAttribute(messageNode, "msgtype");
        componentMap.clear();
        loadMessage(name, msgType, messageNode);
      }
    }
  }

  private void loadMessage(final String name, final String msgType, final Node node)
      throws Exception {
    logger.info("loadMessage: {} ({})", name, msgType);

    final Message message = new Message(name, msgType);
    final NodeList fieldNodes = node.getChildNodes();
    if (countElementNodes(fieldNodes) == 0) {
      throw new Exception("no fields found: msgType=" + name);
    }

    final String msgcat = getAttribute(node, "msgcat");
    message.setIsAdmin("admin".equals(msgcat));

    for (int j = 0; j < fieldNodes.getLength(); j++) {
      final Node fieldNode = fieldNodes.item(j);
      final String nodeName = fieldNode.getNodeName();

      if (nodeName.equals("field")) {
        addFieldToMessage(message, fieldNode);
      }

      if (nodeName.equals("group")) {
        addGroupToMessage(message, fieldNode);
      }

      if (nodeName.equals("component")) {
        addComponentToMessage(message, fieldNode);
      }
    }

    if (messageMap.containsKey(message.name)) {
      throw new Exception("duplicate <message> name: " + message.name);
    }
    messageMap.put(message.name, message);
  }

  private void addFieldToMessage(final Message message, final Node node) {
    final String name = getAttribute(node, "name");
    if (name == null) {
      throw new RuntimeException("<field> does not have a name attribute");
    }

    final Field field = fieldMap.get(name);
    if (field == null) {
      throw new RuntimeException("unknown field name: " + name);
    }

    message.addFieldToMessage(field);
  }

  private void addGroupToMessage(final Message message, final Node node) {
    final String name = getAttribute(node, "name");
    final Group group = new Group(name, message.name, fieldMap.get(name).tag);

    final NodeList childNodes = node.getChildNodes();
    if (countElementNodes(childNodes) == 0) {
      throw new RuntimeException(" no child nodes for " + message.name + " group: " + group.name);
    }

    for (int j = 0; j < childNodes.getLength(); j++) {
      final Node childNode = childNodes.item(j);
      final String nodeName = childNode.getNodeName();

      if (nodeName.equals("field")) {
        addFieldToMessage(group, childNode);
      }

      if (nodeName.equals("group")) {
        addGroupToMessage(group, childNode);
      }

      if (nodeName.equals("component")) {
        addComponentToMessage(group, childNode);
      }
    }

    groupMap.put(group.getGroupName(), group);
    message.addGroupToMessage(group);
  }

  private void addComponentToMessage(final Message message, final Node node) {
    final String name = getAttribute(node, "name");
    if (name == null) {
      throw new RuntimeException("<component> does not have a name attribute");
    }

    if (!componentMap.containsKey(name)) {
      if (!componentNodeMap.containsKey(name)) {
        throw new RuntimeException("unknown component: " + name);
      }

      // loadComponent adds the component to the componentMap
      loadComponent(name, message.name, componentNodeMap.get(name));
    }

    message.addComponentToMessage(componentMap.get(name));
  }

  private String getAttribute(final Node node, final String name) {
    return getAttribute(node, name, null);
  }

  private String getAttribute(final Node node, final String name, final String defaultValue) {
    final NamedNodeMap attributes = node.getAttributes();
    if (attributes != null) {
      final Node namedItem = attributes.getNamedItem(name);
      return namedItem != null ? namedItem.getNodeValue() : null;
    }
    return defaultValue;
  }

  private int countElementNodes(final NodeList nodes) {
    int elementNodesCount = 0;

    for (int i = 0; i < nodes.getLength(); i++) {
      if (nodes.item(i).getNodeType() == Node.ELEMENT_NODE) {
        elementNodesCount++;
      }
    }

    return elementNodesCount;
  }
}
