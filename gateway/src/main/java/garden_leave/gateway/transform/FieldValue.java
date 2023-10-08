package garden_leave.gateway.transform;

import java.time.LocalDate;
import java.time.ZoneId;
import quickfix.BooleanField;
import quickfix.BytesField;
import quickfix.CharField;
import quickfix.DateField;
import quickfix.DecimalField;
import quickfix.DoubleField;
import quickfix.IntField;
import quickfix.StringField;
import quickfix.UtcDateField;
import quickfix.UtcDateOnlyField;
import quickfix.UtcTimeField;
import quickfix.UtcTimeOnlyField;
import quickfix.UtcTimeStampField;

public final class FieldValue {
  private final static ZoneId UTC = ZoneId.of("UTC");

  public static boolean of(final BooleanField field) {
    return field.getValue();
  }

  public static BooleanField to(final BooleanField field, final boolean value) {
    field.setValue(value);
    return field;
  }

  public static BooleanField to(final BooleanField field, final String value) {
    return FieldValue.to(field, Boolean.parseBoolean(value));
  }

  public static byte[] of(final BytesField field) {
    return field.getValue();
  }

  public static BytesField to(final BytesField field, final byte[] value) {
    field.setValue(value);
    return field;
  }

  public static int of(final CharField field) {
    return (int) field.getValue();
  }

  public static CharField to(final CharField field, final char value) {
    field.setValue(value);
    return field;
  }

  public static CharField to(final CharField field, final int value) {
    return FieldValue.to(field, (char) value);
  }

  public static CharField to(final CharField field, final String value) {
    if (value == null || value.isBlank()) {
      return field;
    }

    return FieldValue.to(field, value.charAt(0));
  }

  public static double of(final DecimalField field) {
    return field.getValue().doubleValue();
  }

  public static DecimalField to(final DecimalField field, final double value) {
    field.setValue(value);
    return field;
  }

  public static DecimalField to(final DecimalField field, final String value) {
    return FieldValue.to(field, Double.parseDouble(value));
  }

  public static double of(final DoubleField field) {
    return field.getValue();
  }

  public static DoubleField to(final DoubleField field, final double value) {
    field.setValue(value);
    return field;
  }

  public static DoubleField to(final DoubleField field, final String value) {
    return FieldValue.to(field, Double.parseDouble(value));
  }

  public static int of(final IntField field) {
    return field.getValue();
  }

  public static IntField to(final IntField field, final int value) {
    field.setValue(value);
    return field;
  }

  public static IntField to(final IntField field, final String value) {
    return FieldValue.to(field, Integer.parseInt(value));
  }

  public static String of(final StringField field) {
    return field.getValue();
  }

  public static StringField to(final StringField field, final String value) {
    field.setValue(value);
    return field;
  }

  public static long of(final DateField field) {
    return field.getValue().getTime();
  }

  public static DateField to(final DateField field, final long value) {
    field.setValue(java.util.Date.from(java.time.Instant.ofEpochMilli(value)));
    return field;
  }

  public static long of(final UtcDateField field) {
    return field.getValue().atStartOfDay(UTC).toInstant().toEpochMilli();
  }

  public static UtcDateField to(final UtcDateField field, final long value) {
    field.setValue(java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalDate());
    return field;
  }

  public static long of(final UtcDateOnlyField field) {
    return field.getValue().atStartOfDay(UTC).toInstant().toEpochMilli();
  }

  public static UtcDateOnlyField to(final UtcDateOnlyField field, final long value) {
    field.setValue(java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalDate());
    return field;
  }

  public static long of(final UtcTimeField field) {
    return field.getValue().atDate(LocalDate.now()).atZone(UTC).toInstant().toEpochMilli();
  }

  public static UtcTimeField to(final UtcTimeField field, final long value) {
    field.setValue(java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalTime());
    return field;
  }

  public static long of(final UtcTimeOnlyField field) {
    return field.getValue().atDate(LocalDate.now()).atZone(UTC).toInstant().toEpochMilli();
  }

  public static UtcTimeOnlyField to(final UtcTimeOnlyField field, final long value) {
    field.setValue(java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalTime());
    return field;
  }

  public static long of(final UtcTimeStampField field) {
    return field.getValue().atZone(UTC).toInstant().toEpochMilli();
  }

  public static UtcTimeStampField to(final UtcTimeStampField field, final long value) {
    field.setValue(java.time.Instant.ofEpochMilli(value).atZone(UTC).toLocalDateTime());
    return field;
  }
}
