package org.jackhammer.json;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.sql.Time;

import org.jackhammer.RecordWriter;
import org.jackhammer.Record;
import org.jackhammer.Value;
import org.joda.time.DateTime;
import org.joda.time.Interval;


public class JsonRecordBuilder implements RecordWriter {

  public JsonRecordBuilder() {
  }

  @Override
  public RecordWriter addNewMap() {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, boolean value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, String value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, byte value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, short value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, int value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, long value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, float value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, double value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, Date value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, BigDecimal value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, byte[] value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, byte[] value, int off, int len) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, ByteBuffer value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, Interval value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putNewMap(String field) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putNewArray(String field) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putNull(String field) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, Value value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter put(String field, Record value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDecimal(String field, int unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDecimal(String field, long unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDecimal(String field, double unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDecimal(String field, float unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDecimal(String field, byte[] unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDate(String field, int days) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putTime(String field, int millis) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putDateTime(String field, long timeMillis) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter putInterval(int months, int days, int milliseconds) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addNewArray() {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(boolean value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(String value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(byte value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(short value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(int value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(long value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(float value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(double value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(Time value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(Date value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(DateTime value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(BigDecimal value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(byte[] value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(byte[] value, int off, int len) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(ByteBuffer value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(Interval value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addNull() {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(Value value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter add(Record value) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDecimal(int unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDecimal(long unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDecimal(double unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDecimal(float unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDecimal(byte[] unscaledValue, int scale) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDate(int days) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addTime(int millis) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addDateTime(long timeMillis) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter addInterval(int months, int days, int milliseconds) {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter endArray() {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public RecordWriter endMap() {
    // TODO Auto-generated method stub
    return this;
  }

  @Override
  public Record build() {
    // TODO Auto-generated method stub
    return new JsonRecord();
  }

}