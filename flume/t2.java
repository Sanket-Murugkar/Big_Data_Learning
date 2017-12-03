// ORM class for table 't2'
// WARNING: This class is AUTO-GENERATED. Modify at your own risk.
//
// Debug information:
// Generated date: Sat Jul 08 03:08:27 PDT 2017
// For connector: org.apache.sqoop.manager.MySQLManager
import org.apache.hadoop.io.BytesWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import org.apache.hadoop.mapred.lib.db.DBWritable;
import com.cloudera.sqoop.lib.JdbcWritableBridge;
import com.cloudera.sqoop.lib.DelimiterSet;
import com.cloudera.sqoop.lib.FieldFormatter;
import com.cloudera.sqoop.lib.RecordParser;
import com.cloudera.sqoop.lib.BooleanParser;
import com.cloudera.sqoop.lib.BlobRef;
import com.cloudera.sqoop.lib.ClobRef;
import com.cloudera.sqoop.lib.LargeObjectLoader;
import com.cloudera.sqoop.lib.SqoopRecord;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class t2 extends SqoopRecord  implements DBWritable, Writable {
  private final int PROTOCOL_VERSION = 3;
  public int getClassFormatVersion() { return PROTOCOL_VERSION; }
  protected ResultSet __cur_result_set;
  private Integer EMPLOYEE_ID;
  public Integer get_EMPLOYEE_ID() {
    return EMPLOYEE_ID;
  }
  public void set_EMPLOYEE_ID(Integer EMPLOYEE_ID) {
    this.EMPLOYEE_ID = EMPLOYEE_ID;
  }
  public t2 with_EMPLOYEE_ID(Integer EMPLOYEE_ID) {
    this.EMPLOYEE_ID = EMPLOYEE_ID;
    return this;
  }
  private String FIRST_NAME;
  public String get_FIRST_NAME() {
    return FIRST_NAME;
  }
  public void set_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
  }
  public t2 with_FIRST_NAME(String FIRST_NAME) {
    this.FIRST_NAME = FIRST_NAME;
    return this;
  }
  private String LAST_NAME;
  public String get_LAST_NAME() {
    return LAST_NAME;
  }
  public void set_LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
  }
  public t2 with_LAST_NAME(String LAST_NAME) {
    this.LAST_NAME = LAST_NAME;
    return this;
  }
  private String EMAIL;
  public String get_EMAIL() {
    return EMAIL;
  }
  public void set_EMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
  }
  public t2 with_EMAIL(String EMAIL) {
    this.EMAIL = EMAIL;
    return this;
  }
  private String PHONE_NUMBER;
  public String get_PHONE_NUMBER() {
    return PHONE_NUMBER;
  }
  public void set_PHONE_NUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
  }
  public t2 with_PHONE_NUMBER(String PHONE_NUMBER) {
    this.PHONE_NUMBER = PHONE_NUMBER;
    return this;
  }
  private String HIRE_DATE;
  public String get_HIRE_DATE() {
    return HIRE_DATE;
  }
  public void set_HIRE_DATE(String HIRE_DATE) {
    this.HIRE_DATE = HIRE_DATE;
  }
  public t2 with_HIRE_DATE(String HIRE_DATE) {
    this.HIRE_DATE = HIRE_DATE;
    return this;
  }
  private Integer JOB_ID;
  public Integer get_JOB_ID() {
    return JOB_ID;
  }
  public void set_JOB_ID(Integer JOB_ID) {
    this.JOB_ID = JOB_ID;
  }
  public t2 with_JOB_ID(Integer JOB_ID) {
    this.JOB_ID = JOB_ID;
    return this;
  }
  private Integer SALARY;
  public Integer get_SALARY() {
    return SALARY;
  }
  public void set_SALARY(Integer SALARY) {
    this.SALARY = SALARY;
  }
  public t2 with_SALARY(Integer SALARY) {
    this.SALARY = SALARY;
    return this;
  }
  private Integer MANAGER_ID;
  public Integer get_MANAGER_ID() {
    return MANAGER_ID;
  }
  public void set_MANAGER_ID(Integer MANAGER_ID) {
    this.MANAGER_ID = MANAGER_ID;
  }
  public t2 with_MANAGER_ID(Integer MANAGER_ID) {
    this.MANAGER_ID = MANAGER_ID;
    return this;
  }
  private Integer DEPARTMENT_ID;
  public Integer get_DEPARTMENT_ID() {
    return DEPARTMENT_ID;
  }
  public void set_DEPARTMENT_ID(Integer DEPARTMENT_ID) {
    this.DEPARTMENT_ID = DEPARTMENT_ID;
  }
  public t2 with_DEPARTMENT_ID(Integer DEPARTMENT_ID) {
    this.DEPARTMENT_ID = DEPARTMENT_ID;
    return this;
  }
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof t2)) {
      return false;
    }
    t2 that = (t2) o;
    boolean equal = true;
    equal = equal && (this.EMPLOYEE_ID == null ? that.EMPLOYEE_ID == null : this.EMPLOYEE_ID.equals(that.EMPLOYEE_ID));
    equal = equal && (this.FIRST_NAME == null ? that.FIRST_NAME == null : this.FIRST_NAME.equals(that.FIRST_NAME));
    equal = equal && (this.LAST_NAME == null ? that.LAST_NAME == null : this.LAST_NAME.equals(that.LAST_NAME));
    equal = equal && (this.EMAIL == null ? that.EMAIL == null : this.EMAIL.equals(that.EMAIL));
    equal = equal && (this.PHONE_NUMBER == null ? that.PHONE_NUMBER == null : this.PHONE_NUMBER.equals(that.PHONE_NUMBER));
    equal = equal && (this.HIRE_DATE == null ? that.HIRE_DATE == null : this.HIRE_DATE.equals(that.HIRE_DATE));
    equal = equal && (this.JOB_ID == null ? that.JOB_ID == null : this.JOB_ID.equals(that.JOB_ID));
    equal = equal && (this.SALARY == null ? that.SALARY == null : this.SALARY.equals(that.SALARY));
    equal = equal && (this.MANAGER_ID == null ? that.MANAGER_ID == null : this.MANAGER_ID.equals(that.MANAGER_ID));
    equal = equal && (this.DEPARTMENT_ID == null ? that.DEPARTMENT_ID == null : this.DEPARTMENT_ID.equals(that.DEPARTMENT_ID));
    return equal;
  }
  public void readFields(ResultSet __dbResults) throws SQLException {
    this.__cur_result_set = __dbResults;
    this.EMPLOYEE_ID = JdbcWritableBridge.readInteger(1, __dbResults);
    this.FIRST_NAME = JdbcWritableBridge.readString(2, __dbResults);
    this.LAST_NAME = JdbcWritableBridge.readString(3, __dbResults);
    this.EMAIL = JdbcWritableBridge.readString(4, __dbResults);
    this.PHONE_NUMBER = JdbcWritableBridge.readString(5, __dbResults);
    this.HIRE_DATE = JdbcWritableBridge.readString(6, __dbResults);
    this.JOB_ID = JdbcWritableBridge.readInteger(7, __dbResults);
    this.SALARY = JdbcWritableBridge.readInteger(8, __dbResults);
    this.MANAGER_ID = JdbcWritableBridge.readInteger(9, __dbResults);
    this.DEPARTMENT_ID = JdbcWritableBridge.readInteger(10, __dbResults);
  }
  public void loadLargeObjects(LargeObjectLoader __loader)
      throws SQLException, IOException, InterruptedException {
  }
  public void write(PreparedStatement __dbStmt) throws SQLException {
    write(__dbStmt, 0);
  }

  public int write(PreparedStatement __dbStmt, int __off) throws SQLException {
    JdbcWritableBridge.writeInteger(EMPLOYEE_ID, 1 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeString(FIRST_NAME, 2 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(LAST_NAME, 3 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(EMAIL, 4 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(PHONE_NUMBER, 5 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeString(HIRE_DATE, 6 + __off, 12, __dbStmt);
    JdbcWritableBridge.writeInteger(JOB_ID, 7 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(SALARY, 8 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(MANAGER_ID, 9 + __off, 4, __dbStmt);
    JdbcWritableBridge.writeInteger(DEPARTMENT_ID, 10 + __off, 4, __dbStmt);
    return 10;
  }
  public void readFields(DataInput __dataIn) throws IOException {
    if (__dataIn.readBoolean()) { 
        this.EMPLOYEE_ID = null;
    } else {
    this.EMPLOYEE_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.FIRST_NAME = null;
    } else {
    this.FIRST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.LAST_NAME = null;
    } else {
    this.LAST_NAME = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.EMAIL = null;
    } else {
    this.EMAIL = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.PHONE_NUMBER = null;
    } else {
    this.PHONE_NUMBER = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.HIRE_DATE = null;
    } else {
    this.HIRE_DATE = Text.readString(__dataIn);
    }
    if (__dataIn.readBoolean()) { 
        this.JOB_ID = null;
    } else {
    this.JOB_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.SALARY = null;
    } else {
    this.SALARY = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.MANAGER_ID = null;
    } else {
    this.MANAGER_ID = Integer.valueOf(__dataIn.readInt());
    }
    if (__dataIn.readBoolean()) { 
        this.DEPARTMENT_ID = null;
    } else {
    this.DEPARTMENT_ID = Integer.valueOf(__dataIn.readInt());
    }
  }
  public void write(DataOutput __dataOut) throws IOException {
    if (null == this.EMPLOYEE_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.EMPLOYEE_ID);
    }
    if (null == this.FIRST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, FIRST_NAME);
    }
    if (null == this.LAST_NAME) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, LAST_NAME);
    }
    if (null == this.EMAIL) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, EMAIL);
    }
    if (null == this.PHONE_NUMBER) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, PHONE_NUMBER);
    }
    if (null == this.HIRE_DATE) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    Text.writeString(__dataOut, HIRE_DATE);
    }
    if (null == this.JOB_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.JOB_ID);
    }
    if (null == this.SALARY) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.SALARY);
    }
    if (null == this.MANAGER_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.MANAGER_ID);
    }
    if (null == this.DEPARTMENT_ID) { 
        __dataOut.writeBoolean(true);
    } else {
        __dataOut.writeBoolean(false);
    __dataOut.writeInt(this.DEPARTMENT_ID);
    }
  }
  private final DelimiterSet __outputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  public String toString() {
    return toString(__outputDelimiters, true);
  }
  public String toString(DelimiterSet delimiters) {
    return toString(delimiters, true);
  }
  public String toString(boolean useRecordDelim) {
    return toString(__outputDelimiters, useRecordDelim);
  }
  public String toString(DelimiterSet delimiters, boolean useRecordDelim) {
    StringBuilder __sb = new StringBuilder();
    char fieldDelim = delimiters.getFieldsTerminatedBy();
    __sb.append(FieldFormatter.escapeAndEnclose(EMPLOYEE_ID==null?"null":"" + EMPLOYEE_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(FIRST_NAME==null?"null":FIRST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(LAST_NAME==null?"null":LAST_NAME, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(EMAIL==null?"null":EMAIL, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(PHONE_NUMBER==null?"null":PHONE_NUMBER, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(HIRE_DATE==null?"null":HIRE_DATE, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(JOB_ID==null?"null":"" + JOB_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(SALARY==null?"null":"" + SALARY, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(MANAGER_ID==null?"null":"" + MANAGER_ID, delimiters));
    __sb.append(fieldDelim);
    __sb.append(FieldFormatter.escapeAndEnclose(DEPARTMENT_ID==null?"null":"" + DEPARTMENT_ID, delimiters));
    if (useRecordDelim) {
      __sb.append(delimiters.getLinesTerminatedBy());
    }
    return __sb.toString();
  }
  private final DelimiterSet __inputDelimiters = new DelimiterSet((char) 44, (char) 10, (char) 0, (char) 0, false);
  private RecordParser __parser;
  public void parse(Text __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharSequence __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(byte [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(char [] __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(ByteBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  public void parse(CharBuffer __record) throws RecordParser.ParseError {
    if (null == this.__parser) {
      this.__parser = new RecordParser(__inputDelimiters);
    }
    List<String> __fields = this.__parser.parseRecord(__record);
    __loadFromFields(__fields);
  }

  private void __loadFromFields(List<String> fields) {
    Iterator<String> __it = fields.listIterator();
    String __cur_str;
    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.EMPLOYEE_ID = null; } else {
      this.EMPLOYEE_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.FIRST_NAME = null; } else {
      this.FIRST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.LAST_NAME = null; } else {
      this.LAST_NAME = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.EMAIL = null; } else {
      this.EMAIL = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.PHONE_NUMBER = null; } else {
      this.PHONE_NUMBER = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null")) { this.HIRE_DATE = null; } else {
      this.HIRE_DATE = __cur_str;
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.JOB_ID = null; } else {
      this.JOB_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.SALARY = null; } else {
      this.SALARY = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.MANAGER_ID = null; } else {
      this.MANAGER_ID = Integer.valueOf(__cur_str);
    }

    __cur_str = __it.next();
    if (__cur_str.equals("null") || __cur_str.length() == 0) { this.DEPARTMENT_ID = null; } else {
      this.DEPARTMENT_ID = Integer.valueOf(__cur_str);
    }

  }

  public Object clone() throws CloneNotSupportedException {
    t2 o = (t2) super.clone();
    return o;
  }

  public Map<String, Object> getFieldMap() {
    Map<String, Object> __sqoop$field_map = new TreeMap<String, Object>();
    __sqoop$field_map.put("EMPLOYEE_ID", this.EMPLOYEE_ID);
    __sqoop$field_map.put("FIRST_NAME", this.FIRST_NAME);
    __sqoop$field_map.put("LAST_NAME", this.LAST_NAME);
    __sqoop$field_map.put("EMAIL", this.EMAIL);
    __sqoop$field_map.put("PHONE_NUMBER", this.PHONE_NUMBER);
    __sqoop$field_map.put("HIRE_DATE", this.HIRE_DATE);
    __sqoop$field_map.put("JOB_ID", this.JOB_ID);
    __sqoop$field_map.put("SALARY", this.SALARY);
    __sqoop$field_map.put("MANAGER_ID", this.MANAGER_ID);
    __sqoop$field_map.put("DEPARTMENT_ID", this.DEPARTMENT_ID);
    return __sqoop$field_map;
  }

  public void setField(String __fieldName, Object __fieldVal) {
    if ("EMPLOYEE_ID".equals(__fieldName)) {
      this.EMPLOYEE_ID = (Integer) __fieldVal;
    }
    else    if ("FIRST_NAME".equals(__fieldName)) {
      this.FIRST_NAME = (String) __fieldVal;
    }
    else    if ("LAST_NAME".equals(__fieldName)) {
      this.LAST_NAME = (String) __fieldVal;
    }
    else    if ("EMAIL".equals(__fieldName)) {
      this.EMAIL = (String) __fieldVal;
    }
    else    if ("PHONE_NUMBER".equals(__fieldName)) {
      this.PHONE_NUMBER = (String) __fieldVal;
    }
    else    if ("HIRE_DATE".equals(__fieldName)) {
      this.HIRE_DATE = (String) __fieldVal;
    }
    else    if ("JOB_ID".equals(__fieldName)) {
      this.JOB_ID = (Integer) __fieldVal;
    }
    else    if ("SALARY".equals(__fieldName)) {
      this.SALARY = (Integer) __fieldVal;
    }
    else    if ("MANAGER_ID".equals(__fieldName)) {
      this.MANAGER_ID = (Integer) __fieldVal;
    }
    else    if ("DEPARTMENT_ID".equals(__fieldName)) {
      this.DEPARTMENT_ID = (Integer) __fieldVal;
    }
    else {
      throw new RuntimeException("No such field: " + __fieldName);
    }
  }
}
