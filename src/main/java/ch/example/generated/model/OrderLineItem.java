/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package ch.example.generated.model;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OrderLineItem extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -8945923713229010365L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OrderLineItem\",\"namespace\":\"ch.example.generated.model\",\"fields\":[{\"name\":\"name\",\"type\":\"string\"},{\"name\":\"size\",\"type\":{\"type\":\"enum\",\"name\":\"Size\",\"symbols\":[\"SMALL\",\"MEDIUM\",\"LARGE\"]}},{\"name\":\"quantity\",\"type\":\"int\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OrderLineItem> ENCODER =
      new BinaryMessageEncoder<>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OrderLineItem> DECODER =
      new BinaryMessageDecoder<>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OrderLineItem> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OrderLineItem> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OrderLineItem> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OrderLineItem to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OrderLineItem from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OrderLineItem instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OrderLineItem fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private ch.example.generated.model.Size size;
  private int quantity;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OrderLineItem() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param size The new value for size
   * @param quantity The new value for quantity
   */
  public OrderLineItem(java.lang.CharSequence name, ch.example.generated.model.Size size, java.lang.Integer quantity) {
    this.name = name;
    this.size = size;
    this.quantity = quantity;
  }

  @Override
  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }

  @Override
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }

  // Used by DatumWriter.  Applications should not call.
  @Override
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return size;
    case 2: return quantity;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @Override
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: size = (ch.example.generated.model.Size)value$; break;
    case 2: quantity = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'size' field.
   * @return The value of the 'size' field.
   */
  public ch.example.generated.model.Size getSize() {
    return size;
  }


  /**
   * Sets the value of the 'size' field.
   * @param value the value to set.
   */
  public void setSize(ch.example.generated.model.Size value) {
    this.size = value;
  }

  /**
   * Gets the value of the 'quantity' field.
   * @return The value of the 'quantity' field.
   */
  public int getQuantity() {
    return quantity;
  }


  /**
   * Sets the value of the 'quantity' field.
   * @param value the value to set.
   */
  public void setQuantity(int value) {
    this.quantity = value;
  }

  /**
   * Creates a new OrderLineItem RecordBuilder.
   * @return A new OrderLineItem RecordBuilder
   */
  public static ch.example.generated.model.OrderLineItem.Builder newBuilder() {
    return new ch.example.generated.model.OrderLineItem.Builder();
  }

  /**
   * Creates a new OrderLineItem RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OrderLineItem RecordBuilder
   */
  public static ch.example.generated.model.OrderLineItem.Builder newBuilder(ch.example.generated.model.OrderLineItem.Builder other) {
    if (other == null) {
      return new ch.example.generated.model.OrderLineItem.Builder();
    } else {
      return new ch.example.generated.model.OrderLineItem.Builder(other);
    }
  }

  /**
   * Creates a new OrderLineItem RecordBuilder by copying an existing OrderLineItem instance.
   * @param other The existing instance to copy.
   * @return A new OrderLineItem RecordBuilder
   */
  public static ch.example.generated.model.OrderLineItem.Builder newBuilder(ch.example.generated.model.OrderLineItem other) {
    if (other == null) {
      return new ch.example.generated.model.OrderLineItem.Builder();
    } else {
      return new ch.example.generated.model.OrderLineItem.Builder(other);
    }
  }

  /**
   * RecordBuilder for OrderLineItem instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OrderLineItem>
    implements org.apache.avro.data.RecordBuilder<OrderLineItem> {

    private java.lang.CharSequence name;
    private ch.example.generated.model.Size size;
    private int quantity;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(ch.example.generated.model.OrderLineItem.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = other.fieldSetFlags()[2];
      }
    }

    /**
     * Creates a Builder by copying an existing OrderLineItem instance
     * @param other The existing instance to copy.
     */
    private Builder(ch.example.generated.model.OrderLineItem other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.size)) {
        this.size = data().deepCopy(fields()[1].schema(), other.size);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.quantity)) {
        this.quantity = data().deepCopy(fields()[2].schema(), other.quantity);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public ch.example.generated.model.OrderLineItem.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public ch.example.generated.model.OrderLineItem.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'size' field.
      * @return The value.
      */
    public ch.example.generated.model.Size getSize() {
      return size;
    }


    /**
      * Sets the value of the 'size' field.
      * @param value The value of 'size'.
      * @return This builder.
      */
    public ch.example.generated.model.OrderLineItem.Builder setSize(ch.example.generated.model.Size value) {
      validate(fields()[1], value);
      this.size = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'size' field has been set.
      * @return True if the 'size' field has been set, false otherwise.
      */
    public boolean hasSize() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'size' field.
      * @return This builder.
      */
    public ch.example.generated.model.OrderLineItem.Builder clearSize() {
      size = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'quantity' field.
      * @return The value.
      */
    public int getQuantity() {
      return quantity;
    }


    /**
      * Sets the value of the 'quantity' field.
      * @param value The value of 'quantity'.
      * @return This builder.
      */
    public ch.example.generated.model.OrderLineItem.Builder setQuantity(int value) {
      validate(fields()[2], value);
      this.quantity = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'quantity' field has been set.
      * @return True if the 'quantity' field has been set, false otherwise.
      */
    public boolean hasQuantity() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'quantity' field.
      * @return This builder.
      */
    public ch.example.generated.model.OrderLineItem.Builder clearQuantity() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OrderLineItem build() {
      try {
        OrderLineItem record = new OrderLineItem();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.size = fieldSetFlags()[1] ? this.size : (ch.example.generated.model.Size) defaultValue(fields()[1]);
        record.quantity = fieldSetFlags()[2] ? this.quantity : (java.lang.Integer) defaultValue(fields()[2]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OrderLineItem>
    WRITER$ = (org.apache.avro.io.DatumWriter<OrderLineItem>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OrderLineItem>
    READER$ = (org.apache.avro.io.DatumReader<OrderLineItem>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeEnum(this.size.ordinal());

    out.writeInt(this.quantity);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.size = ch.example.generated.model.Size.values()[in.readEnum()];

      this.quantity = in.readInt();

    } else {
      for (int i = 0; i < 3; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.size = ch.example.generated.model.Size.values()[in.readEnum()];
          break;

        case 2:
          this.quantity = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










