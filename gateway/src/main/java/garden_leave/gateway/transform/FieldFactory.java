package garden_leave.gateway.transform;

public final class FieldFactory {
  private final static java.time.ZoneId UTC = java.time.ZoneId.of("UTC");

  public static class DateField extends quickfix.UtcDateOnlyField {
    public DateField(final int tag) {
      super(tag);
    }

    public DateField(final int tag, final java.time.LocalDate date) {
      super(tag, date);
    }
  }

  public static class TimeField extends quickfix.UtcTimeOnlyField {
    public TimeField(final int tag) {
      super(tag);
    }

    public TimeField(final int tag, final long value) {
      super(tag, java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalTime());
    }
  }

  public static class TimeStampField extends quickfix.UtcTimeStampField {
    public TimeStampField(final int tag) {
      super(tag, true);
    }

    public TimeStampField(final int tag, final long value) {
      super(tag, java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalDateTime(),
          quickfix.UtcTimestampPrecision.MILLIS);
    }
  }

  public static DateField newDateField(final int tag) {
    return new DateField(tag);
  }

  public static DateField newDateField(final int tag, final long value) {
    return new DateField(tag, java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalDate());
  }

  public static TimeField newTimeField(final int tag) {
    return new TimeField(tag);
  }

  public static TimeField newTimeField(final int tag, final long value) {
    return new TimeField(tag, value);
  }

  public static TimeStampField newTimeStampField(final int tag) {
    return new TimeStampField(tag);
  }

  public static TimeStampField newTimeStampField(final int tag, final long value) {
    return new TimeStampField(tag, value);
  }

  public static quickfix.StringField newStringField(final int tag) {
    return new quickfix.StringField(tag);
  }

  public static quickfix.StringField newStringField(final int tag, final String value) {
    return new quickfix.StringField(tag, value);
  }

  public static quickfix.IntField newIntField(final int tag) {
    return new quickfix.IntField(tag);
  }

  public static quickfix.IntField newIntField(final int tag, final int value) {
    return new quickfix.IntField(tag, value);
  }

  public static quickfix.DoubleField newDoubleField(final int tag) {
    return new quickfix.DoubleField(tag);
  }

  public static quickfix.DoubleField newDoubleField(final int tag, final double value) {
    return new quickfix.DoubleField(tag, value);
  }

  public static quickfix.DecimalField newDecimalField(final int tag) {
    return new quickfix.DecimalField(tag);
  }

  public static quickfix.DecimalField newDecimalField(final int tag, final double value) {
    return new quickfix.DecimalField(tag, value);
  }

  public static quickfix.CharField newCharField(final int tag) {
    return new quickfix.CharField(tag);
  }

  public static quickfix.CharField newCharField(final int tag, final char value) {
    return new quickfix.CharField(tag, value);
  }

  public static quickfix.CharField newCharField(final int tag, final String value) {
    return new quickfix.CharField(tag, value.charAt(0));
  }

  public static quickfix.BooleanField newBooleanField(final int tag) {
    return new quickfix.BooleanField(tag);
  }

  public static quickfix.BooleanField newBooleanField(final int tag, final boolean value) {
    return new quickfix.BooleanField(tag, value);
  }

  public static quickfix.BytesField newBytesField(final int tag) {
    return new quickfix.BytesField(tag);
  }

  public static quickfix.BytesField newBytesField(final int tag, final byte[] value) {
    return new quickfix.BytesField(tag, value);
  }
}
