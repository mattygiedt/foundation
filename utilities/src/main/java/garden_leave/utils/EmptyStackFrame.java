package garden_leave.utils;

public final class EmptyStackFrame implements StackWalker.StackFrame {
  @Override
  public int getByteCodeIndex() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getByteCodeIndex'");
  }

  @Override
  public String getClassName() {
    return this.getClassName();
  }

  @Override
  public Class<?> getDeclaringClass() {
    return this.getClass();
  }

  @Override
  public String getMethodName() {
    return "getMethodName";
  }

  @Override
  public String getFileName() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getFileName'");
  }

  @Override
  public int getLineNumber() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'getLineNumber'");
  }

  @Override
  public boolean isNativeMethod() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'isNativeMethod'");
  }

  @Override
  public StackTraceElement toStackTraceElement() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'toStackTraceElement'");
  }
}
