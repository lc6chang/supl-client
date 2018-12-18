package com.google.location.lbs.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1Object;
import com.google.location.lbs.asn1.base.Asn1OctetString;
import com.google.location.lbs.asn1.base.Asn1Sequence;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* @author Torbjorn Gannholm (tobe@google.com)
*/
public  class WLAN_AP_Identifier_r13 extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_WLAN_AP_Identifier_r13
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public WLAN_AP_Identifier_r13() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_WLAN_AP_Identifier_r13;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_WLAN_AP_Identifier_r13 != null) {
      return ImmutableList.of(TAG_WLAN_AP_Identifier_r13);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new WLAN_AP_Identifier_r13 from encoded stream.
   */
  public static WLAN_AP_Identifier_r13 fromPerUnaligned(byte[] encodedBytes) {
    WLAN_AP_Identifier_r13 result = new WLAN_AP_Identifier_r13();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new WLAN_AP_Identifier_r13 from encoded stream.
   */
  public static WLAN_AP_Identifier_r13 fromPerAligned(byte[] encodedBytes) {
    WLAN_AP_Identifier_r13 result = new WLAN_AP_Identifier_r13();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }



  @Override protected boolean isExtensible() {
    return true;
  }

  @Override public boolean containsExtensionValues() {
    for (SequenceComponent extensionComponent : getExtensionComponents()) {
      if (extensionComponent.isExplicitlySet()) return true;
    }
    return false;
  }

  
  private WLAN_AP_Identifier_r13.bssid_r13Type bssid_r13_;
  public WLAN_AP_Identifier_r13.bssid_r13Type getBssid_r13() {
    return bssid_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_AP_Identifier_r13.bssid_r13Type
   */
  public void setBssid_r13(Asn1Object value) {
    this.bssid_r13_ = (WLAN_AP_Identifier_r13.bssid_r13Type) value;
  }
  public WLAN_AP_Identifier_r13.bssid_r13Type setBssid_r13ToNewInstance() {
    bssid_r13_ = new WLAN_AP_Identifier_r13.bssid_r13Type();
    return bssid_r13_;
  }
  
  private WLAN_AP_Identifier_r13.ssid_r13Type ssid_r13_;
  public WLAN_AP_Identifier_r13.ssid_r13Type getSsid_r13() {
    return ssid_r13_;
  }
  /**
   * @throws ClassCastException if value is not a WLAN_AP_Identifier_r13.ssid_r13Type
   */
  public void setSsid_r13(Asn1Object value) {
    this.ssid_r13_ = (WLAN_AP_Identifier_r13.ssid_r13Type) value;
  }
  public WLAN_AP_Identifier_r13.ssid_r13Type setSsid_r13ToNewInstance() {
    ssid_r13_ = new WLAN_AP_Identifier_r13.ssid_r13Type();
    return ssid_r13_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getBssid_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getBssid_r13();
          }

          @Override public void setToNewInstance() {
            setBssid_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_AP_Identifier_r13.bssid_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "bssid_r13 : "
                    + getBssid_r13().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getSsid_r13() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return true;
          }

          @Override public Asn1Object getComponentValue() {
            return getSsid_r13();
          }

          @Override public void setToNewInstance() {
            setSsid_r13ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? WLAN_AP_Identifier_r13.ssid_r13Type.getPossibleFirstTags() : ImmutableList.of(tag);
          }

          @Override
          public Asn1Tag getTag() {
            return tag;
          }

          @Override
          public boolean isImplicitTagging() {
            return true;
          }

          @Override public String toIndentedString(String indent) {
                return "ssid_r13 : "
                    + getSsid_r13().toIndentedString(indent);
              }
        });
    
    return builder.build();
  }

  @Override public Iterable<? extends SequenceComponent>
                                                    getExtensionComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
      
      return builder.build();
    }

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public static class bssid_r13Type extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_bssid_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public bssid_r13Type() {
    super();
    setMinSize(6);
setMaxSize(6);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_bssid_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_bssid_r13Type != null) {
      return ImmutableList.of(TAG_bssid_r13Type);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new bssid_r13Type from encoded stream.
   */
  public static bssid_r13Type fromPerUnaligned(byte[] encodedBytes) {
    bssid_r13Type result = new bssid_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new bssid_r13Type from encoded stream.
   */
  public static bssid_r13Type fromPerAligned(byte[] encodedBytes) {
    bssid_r13Type result = new bssid_r13Type();
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

  @Override protected String getTypeName() {
    return "bssid_r13Type";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public static class ssid_r13Type extends Asn1OctetString {
  //

  private static final Asn1Tag TAG_ssid_r13Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public ssid_r13Type() {
    super();
    setMinSize(1);
setMaxSize(32);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_ssid_r13Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_ssid_r13Type != null) {
      return ImmutableList.of(TAG_ssid_r13Type);
    } else {
      return Asn1OctetString.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new ssid_r13Type from encoded stream.
   */
  public static ssid_r13Type fromPerUnaligned(byte[] encodedBytes) {
    ssid_r13Type result = new ssid_r13Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new ssid_r13Type from encoded stream.
   */
  public static ssid_r13Type fromPerAligned(byte[] encodedBytes) {
    ssid_r13Type result = new ssid_r13Type();
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

  @Override protected String getTypeName() {
    return "ssid_r13Type";
  }
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
    StringBuilder builder = new StringBuilder();
    builder.append("WLAN_AP_Identifier_r13 = {\n");
    final String internalIndent = indent + "  ";
    for (SequenceComponent component : getComponents()) {
      if (component.isExplicitlySet()) {
        builder.append(internalIndent)
            .append(component.toIndentedString(internalIndent));
      }
    }
    if (isExtensible()) {
      builder.append(internalIndent).append("...\n");
      for (SequenceComponent component : getExtensionComponents()) {
        if (component.isExplicitlySet()) {
          builder.append(internalIndent)
              .append(component.toIndentedString(internalIndent));
        }
      }
    }
    builder.append(indent).append("};\n");
    return builder.toString();
  }
}