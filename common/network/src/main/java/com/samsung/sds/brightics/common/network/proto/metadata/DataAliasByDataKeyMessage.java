// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.samsung.sds.brightics.common.network.proto.metadata;

/**
 * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage}
 */
public  final class DataAliasByDataKeyMessage extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage)
    DataAliasByDataKeyMessageOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DataAliasByDataKeyMessage.newBuilder() to construct.
  private DataAliasByDataKeyMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DataAliasByDataKeyMessage() {
    user_ = "";
    sourceDataKey_ = "";
    aliasDataKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DataAliasByDataKeyMessage(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            user_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            sourceDataKey_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            aliasDataKey_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.samsung.sds.brightics.common.network.proto.metadata.MetaDataProto.internal_static_com_samsung_sds_brightics_common_network_proto_metadata_DataAliasByDataKeyMessage_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.samsung.sds.brightics.common.network.proto.metadata.MetaDataProto.internal_static_com_samsung_sds_brightics_common_network_proto_metadata_DataAliasByDataKeyMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.class, com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private volatile java.lang.Object user_;
  /**
   * <code>string user = 1;</code>
   */
  public java.lang.String getUser() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      user_ = s;
      return s;
    }
  }
  /**
   * <code>string user = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserBytes() {
    java.lang.Object ref = user_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      user_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCEDATAKEY_FIELD_NUMBER = 2;
  private volatile java.lang.Object sourceDataKey_;
  /**
   * <code>string sourceDataKey = 2;</code>
   */
  public java.lang.String getSourceDataKey() {
    java.lang.Object ref = sourceDataKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceDataKey_ = s;
      return s;
    }
  }
  /**
   * <code>string sourceDataKey = 2;</code>
   */
  public com.google.protobuf.ByteString
      getSourceDataKeyBytes() {
    java.lang.Object ref = sourceDataKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sourceDataKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ALIASDATAKEY_FIELD_NUMBER = 3;
  private volatile java.lang.Object aliasDataKey_;
  /**
   * <code>string aliasDataKey = 3;</code>
   */
  public java.lang.String getAliasDataKey() {
    java.lang.Object ref = aliasDataKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aliasDataKey_ = s;
      return s;
    }
  }
  /**
   * <code>string aliasDataKey = 3;</code>
   */
  public com.google.protobuf.ByteString
      getAliasDataKeyBytes() {
    java.lang.Object ref = aliasDataKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aliasDataKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, user_);
    }
    if (!getSourceDataKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sourceDataKey_);
    }
    if (!getAliasDataKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, aliasDataKey_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, user_);
    }
    if (!getSourceDataKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sourceDataKey_);
    }
    if (!getAliasDataKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, aliasDataKey_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage)) {
      return super.equals(obj);
    }
    com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage other = (com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage) obj;

    boolean result = true;
    result = result && getUser()
        .equals(other.getUser());
    result = result && getSourceDataKey()
        .equals(other.getSourceDataKey());
    result = result && getAliasDataKey()
        .equals(other.getAliasDataKey());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_FIELD_NUMBER;
    hash = (53 * hash) + getUser().hashCode();
    hash = (37 * hash) + SOURCEDATAKEY_FIELD_NUMBER;
    hash = (53 * hash) + getSourceDataKey().hashCode();
    hash = (37 * hash) + ALIASDATAKEY_FIELD_NUMBER;
    hash = (53 * hash) + getAliasDataKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage)
      com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.samsung.sds.brightics.common.network.proto.metadata.MetaDataProto.internal_static_com_samsung_sds_brightics_common_network_proto_metadata_DataAliasByDataKeyMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.samsung.sds.brightics.common.network.proto.metadata.MetaDataProto.internal_static_com_samsung_sds_brightics_common_network_proto_metadata_DataAliasByDataKeyMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.class, com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.Builder.class);
    }

    // Construct using com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      user_ = "";

      sourceDataKey_ = "";

      aliasDataKey_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.samsung.sds.brightics.common.network.proto.metadata.MetaDataProto.internal_static_com_samsung_sds_brightics_common_network_proto_metadata_DataAliasByDataKeyMessage_descriptor;
    }

    public com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage getDefaultInstanceForType() {
      return com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.getDefaultInstance();
    }

    public com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage build() {
      com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage buildPartial() {
      com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage result = new com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage(this);
      result.user_ = user_;
      result.sourceDataKey_ = sourceDataKey_;
      result.aliasDataKey_ = aliasDataKey_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage) {
        return mergeFrom((com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage other) {
      if (other == com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage.getDefaultInstance()) return this;
      if (!other.getUser().isEmpty()) {
        user_ = other.user_;
        onChanged();
      }
      if (!other.getSourceDataKey().isEmpty()) {
        sourceDataKey_ = other.sourceDataKey_;
        onChanged();
      }
      if (!other.getAliasDataKey().isEmpty()) {
        aliasDataKey_ = other.aliasDataKey_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object user_ = "";
    /**
     * <code>string user = 1;</code>
     */
    public java.lang.String getUser() {
      java.lang.Object ref = user_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        user_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserBytes() {
      java.lang.Object ref = user_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        user_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      user_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder clearUser() {
      
      user_ = getDefaultInstance().getUser();
      onChanged();
      return this;
    }
    /**
     * <code>string user = 1;</code>
     */
    public Builder setUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      user_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object sourceDataKey_ = "";
    /**
     * <code>string sourceDataKey = 2;</code>
     */
    public java.lang.String getSourceDataKey() {
      java.lang.Object ref = sourceDataKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceDataKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sourceDataKey = 2;</code>
     */
    public com.google.protobuf.ByteString
        getSourceDataKeyBytes() {
      java.lang.Object ref = sourceDataKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sourceDataKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sourceDataKey = 2;</code>
     */
    public Builder setSourceDataKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sourceDataKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sourceDataKey = 2;</code>
     */
    public Builder clearSourceDataKey() {
      
      sourceDataKey_ = getDefaultInstance().getSourceDataKey();
      onChanged();
      return this;
    }
    /**
     * <code>string sourceDataKey = 2;</code>
     */
    public Builder setSourceDataKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sourceDataKey_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object aliasDataKey_ = "";
    /**
     * <code>string aliasDataKey = 3;</code>
     */
    public java.lang.String getAliasDataKey() {
      java.lang.Object ref = aliasDataKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aliasDataKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string aliasDataKey = 3;</code>
     */
    public com.google.protobuf.ByteString
        getAliasDataKeyBytes() {
      java.lang.Object ref = aliasDataKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aliasDataKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string aliasDataKey = 3;</code>
     */
    public Builder setAliasDataKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aliasDataKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string aliasDataKey = 3;</code>
     */
    public Builder clearAliasDataKey() {
      
      aliasDataKey_ = getDefaultInstance().getAliasDataKey();
      onChanged();
      return this;
    }
    /**
     * <code>string aliasDataKey = 3;</code>
     */
    public Builder setAliasDataKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aliasDataKey_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage)
  }

  // @@protoc_insertion_point(class_scope:com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage)
  private static final com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage();
  }

  public static com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DataAliasByDataKeyMessage>
      PARSER = new com.google.protobuf.AbstractParser<DataAliasByDataKeyMessage>() {
    public DataAliasByDataKeyMessage parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DataAliasByDataKeyMessage(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DataAliasByDataKeyMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DataAliasByDataKeyMessage> getParserForType() {
    return PARSER;
  }

  public com.samsung.sds.brightics.common.network.proto.metadata.DataAliasByDataKeyMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
