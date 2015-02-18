/**
 * Copyright (c) 2014 MapR, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jackhammer;

import java.math.BigDecimal;
import java.nio.ByteBuffer;
import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Map;

import org.joda.time.DateTime;
import org.joda.time.Interval;

public abstract class BaseRecord implements Record {

  @Override
  public Record set(String fieldPath, String value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, boolean value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, byte value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, short value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, int value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, long value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, float value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, double value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Time value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Date value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, DateTime value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, BigDecimal value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, byte[] value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, byte[] value, int off, int len) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, ByteBuffer value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Interval value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Map<String, Object> value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Record value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Value value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, Object... value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record set(String fieldPath, List<Object> value) {
    return set(FieldPath.parseFrom(fieldPath), value);
  }

  @Override
  public Record delete(String fieldPath) {
    return delete(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public String getString(String fieldPath) {
    return getString(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public boolean getBoolean(String fieldPath) {
    return getBoolean(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public byte getByte(String fieldPath) {
    return getByte(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public short getShort(String fieldPath) {
    return getShort(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public int getInt(String fieldPath) {
    return getInt(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public long getLong(String fieldPath) {
    return getLong(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public float getFloat(String fieldPath) {
    return getFloat(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public double getDouble(String fieldPath) {
    return getDouble(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public Time getTime(String fieldPath) {
    return getTime(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public Date getDate(String fieldPath) {
    return getDate(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public DateTime getDateTime(String fieldPath) {
    return getDateTime(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public BigDecimal getDecimal(String fieldPath) {
    return getDecimal(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public ByteBuffer getBinary(String fieldPath) {
    return getBinary(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public Interval getInterval(String fieldPath) {
    return getInterval(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public Value getValue(String fieldPath) {
    return getValue(FieldPath.parseFrom(fieldPath));
  }

  @Override
  public RecordReader asReader(String fieldPath) {
    return asReader(FieldPath.parseFrom(fieldPath));
  }

}
