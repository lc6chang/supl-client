package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Enumerated;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class LocErrorReason extends Asn1Enumerated {
  public enum Value implements Asn1Enumerated.Value {
    unDefined(0),
    notEnoughBTSs(1),
    notEnoughSats(2),
    eotdLocCalAssDataMissing(3),
    eotdAssDataMissing(4),
    gpsLocCalAssDataMissing(5),
    gpsAssDataMissing(6),
    methodNotSupported(7),
    notProcessed(8),
    refBTSForGPSNotServingBTS(9),
    refBTSForEOTDNotServingBTS(10),
    ;

    Value(int i) {
      value = i;
    }

    private int value;
    public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return false;
    }
  }

  @Override
  protected Value getDefaultValue() {
    return null
;
  }

  @SuppressWarnings("unchecked")
  public Value enumValue() {
    return (Value) getValue();
  }


  
  public void setTo_unDefined() {
    setValue(Value.unDefined);
  }
  
  public void setTo_notEnoughBTSs() {
    setValue(Value.notEnoughBTSs);
  }
  
  public void setTo_notEnoughSats() {
    setValue(Value.notEnoughSats);
  }
  
  public void setTo_eotdLocCalAssDataMissing() {
    setValue(Value.eotdLocCalAssDataMissing);
  }
  
  public void setTo_eotdAssDataMissing() {
    setValue(Value.eotdAssDataMissing);
  }
  
  public void setTo_gpsLocCalAssDataMissing() {
    setValue(Value.gpsLocCalAssDataMissing);
  }
  
  public void setTo_gpsAssDataMissing() {
    setValue(Value.gpsAssDataMissing);
  }
  
  public void setTo_methodNotSupported() {
    setValue(Value.methodNotSupported);
  }
  
  public void setTo_notProcessed() {
    setValue(Value.notProcessed);
  }
  
  public void setTo_refBTSForGPSNotServingBTS() {
    setValue(Value.refBTSForGPSNotServingBTS);
  }
  
  public void setTo_refBTSForEOTDNotServingBTS() {
    setValue(Value.refBTSForEOTDNotServingBTS);
  }
  


  public enum ExtensionValue implements Asn1Enumerated.Value {
    notEnoughGANSSSats(11),
    ganssAssDataMissing(12),
    refBTSForGANSSNotServingBTS(13),
    ;

    ExtensionValue(int i) {
      value = i;
    }

    private int value;
    @Override public int getAssignedValue() {
      return value;
    }

    @Override public boolean isExtensionValue() {
      return true;
    }
  }

  @SuppressWarnings("unchecked")
  public ExtensionValue extEnumValue() {
    return (ExtensionValue) getValue();
  }

  
  public void setExtTo_notEnoughGANSSSats() {
    setValue(ExtensionValue.notEnoughGANSSSats);
  }
  
  public void setExtTo_ganssAssDataMissing() {
    setValue(ExtensionValue.ganssAssDataMissing);
  }
  
  public void setExtTo_refBTSForGANSSNotServingBTS() {
    setValue(ExtensionValue.refBTSForGANSSNotServingBTS);
  }
  

  

  private static final Asn1Tag TAG_LocErrorReason
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public LocErrorReason() {
    super();
    // use template substitution instead of calling getDefaultValue(), since
    // calling virtual methods from a ctor is frowned upon here.
    setValue(null
);
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_LocErrorReason;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_LocErrorReason != null) {
      return ImmutableList.of(TAG_LocErrorReason);
    } else {
      return Asn1Enumerated.getPossibleFirstTags();
    }
  }

  @Override protected boolean isExtensible() {
    return true;
  }

  @Override protected Asn1Enumerated.Value lookupValue(int ordinal) {
    return Value.values()[ordinal];
  }

  @Override protected Asn1Enumerated.Value lookupExtensionValue(int ordinal) {
    return ExtensionValue.values()[ordinal];
  }

  @Override protected int getValueCount() {
    return Value.values().length;
  }

  /**
   * Creates a new LocErrorReason from encoded stream.
   */
  public static LocErrorReason fromPerUnaligned(byte[] encodedBytes) {
    LocErrorReason result = new LocErrorReason();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new LocErrorReason from encoded stream.
   */
  public static LocErrorReason fromPerAligned(byte[] encodedBytes) {
    LocErrorReason result = new LocErrorReason();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  @Override public Iterable<BitStream> encodePerUnaligned() {
    return super.encodePerUnaligned();
  }

  @Override public Iterable<BitStream> encodePerAligned() {
    return super.encodePerAligned();
  }

  @Override public void decodePerUnaligned(BitStreamReader reader) {
    super.decodePerUnaligned(reader);
  }

  @Override public void decodePerAligned(BitStreamReader reader) {
    super.decodePerAligned(reader);
  }

  @Override public String toString() {
    return toIndentedString("");
  }

  public String toIndentedString(String indent) {
    return "LocErrorReason = " + getValue() + ";\n";
  }
}