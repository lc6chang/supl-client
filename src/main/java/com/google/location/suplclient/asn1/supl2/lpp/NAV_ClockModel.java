// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.location.suplclient.asn1.supl2.lpp;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.suplclient.asn1.base.Asn1Integer;
import com.google.location.suplclient.asn1.base.Asn1Object;
import com.google.location.suplclient.asn1.base.Asn1Sequence;
import com.google.location.suplclient.asn1.base.Asn1Tag;
import com.google.location.suplclient.asn1.base.BitStream;
import com.google.location.suplclient.asn1.base.BitStreamReader;
import com.google.location.suplclient.asn1.base.SequenceComponent;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
* 
*/
public  class NAV_ClockModel extends Asn1Sequence {
  //

  private static final Asn1Tag TAG_NAV_ClockModel
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public NAV_ClockModel() {
    super();
  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_NAV_ClockModel;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_NAV_ClockModel != null) {
      return ImmutableList.of(TAG_NAV_ClockModel);
    } else {
      return Asn1Sequence.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new NAV_ClockModel from encoded stream.
   */
  public static NAV_ClockModel fromPerUnaligned(byte[] encodedBytes) {
    NAV_ClockModel result = new NAV_ClockModel();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new NAV_ClockModel from encoded stream.
   */
  public static NAV_ClockModel fromPerAligned(byte[] encodedBytes) {
    NAV_ClockModel result = new NAV_ClockModel();
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

  
  private NAV_ClockModel.navTocType navToc_;
  public NAV_ClockModel.navTocType getNavToc() {
    return navToc_;
  }
  /**
   * @throws ClassCastException if value is not a NAV_ClockModel.navTocType
   */
  public void setNavToc(Asn1Object value) {
    this.navToc_ = (NAV_ClockModel.navTocType) value;
  }
  public NAV_ClockModel.navTocType setNavTocToNewInstance() {
    navToc_ = new NAV_ClockModel.navTocType();
    return navToc_;
  }
  
  private NAV_ClockModel.navaf2Type navaf2_;
  public NAV_ClockModel.navaf2Type getNavaf2() {
    return navaf2_;
  }
  /**
   * @throws ClassCastException if value is not a NAV_ClockModel.navaf2Type
   */
  public void setNavaf2(Asn1Object value) {
    this.navaf2_ = (NAV_ClockModel.navaf2Type) value;
  }
  public NAV_ClockModel.navaf2Type setNavaf2ToNewInstance() {
    navaf2_ = new NAV_ClockModel.navaf2Type();
    return navaf2_;
  }
  
  private NAV_ClockModel.navaf1Type navaf1_;
  public NAV_ClockModel.navaf1Type getNavaf1() {
    return navaf1_;
  }
  /**
   * @throws ClassCastException if value is not a NAV_ClockModel.navaf1Type
   */
  public void setNavaf1(Asn1Object value) {
    this.navaf1_ = (NAV_ClockModel.navaf1Type) value;
  }
  public NAV_ClockModel.navaf1Type setNavaf1ToNewInstance() {
    navaf1_ = new NAV_ClockModel.navaf1Type();
    return navaf1_;
  }
  
  private NAV_ClockModel.navaf0Type navaf0_;
  public NAV_ClockModel.navaf0Type getNavaf0() {
    return navaf0_;
  }
  /**
   * @throws ClassCastException if value is not a NAV_ClockModel.navaf0Type
   */
  public void setNavaf0(Asn1Object value) {
    this.navaf0_ = (NAV_ClockModel.navaf0Type) value;
  }
  public NAV_ClockModel.navaf0Type setNavaf0ToNewInstance() {
    navaf0_ = new NAV_ClockModel.navaf0Type();
    return navaf0_;
  }
  
  private NAV_ClockModel.navTgdType navTgd_;
  public NAV_ClockModel.navTgdType getNavTgd() {
    return navTgd_;
  }
  /**
   * @throws ClassCastException if value is not a NAV_ClockModel.navTgdType
   */
  public void setNavTgd(Asn1Object value) {
    this.navTgd_ = (NAV_ClockModel.navTgdType) value;
  }
  public NAV_ClockModel.navTgdType setNavTgdToNewInstance() {
    navTgd_ = new NAV_ClockModel.navTgdType();
    return navTgd_;
  }
  

  

  

  @Override public Iterable<? extends SequenceComponent> getComponents() {
    ImmutableList.Builder<SequenceComponent> builder = ImmutableList.builder();
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 0);

          @Override public boolean isExplicitlySet() {
            return getNavToc() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavToc();
          }

          @Override public void setToNewInstance() {
            setNavTocToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NAV_ClockModel.navTocType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navToc : "
                    + getNavToc().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 1);

          @Override public boolean isExplicitlySet() {
            return getNavaf2() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavaf2();
          }

          @Override public void setToNewInstance() {
            setNavaf2ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NAV_ClockModel.navaf2Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navaf2 : "
                    + getNavaf2().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 2);

          @Override public boolean isExplicitlySet() {
            return getNavaf1() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavaf1();
          }

          @Override public void setToNewInstance() {
            setNavaf1ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NAV_ClockModel.navaf1Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navaf1 : "
                    + getNavaf1().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 3);

          @Override public boolean isExplicitlySet() {
            return getNavaf0() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavaf0();
          }

          @Override public void setToNewInstance() {
            setNavaf0ToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NAV_ClockModel.navaf0Type.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navaf0 : "
                    + getNavaf0().toIndentedString(indent);
              }
        });
    
    builder.add(new SequenceComponent() {
          Asn1Tag tag = Asn1Tag.fromClassAndNumber(2, 4);

          @Override public boolean isExplicitlySet() {
            return getNavTgd() != null;
          }

          @Override public boolean hasDefaultValue() {
            return false;
          }

          @Override public boolean isOptional() {
            return false;
          }

          @Override public Asn1Object getComponentValue() {
            return getNavTgd();
          }

          @Override public void setToNewInstance() {
            setNavTgdToNewInstance();
          }

          @Override public Collection<Asn1Tag> getPossibleFirstTags() {
            return tag == null ? NAV_ClockModel.navTgdType.getPossibleFirstTags() : ImmutableList.of(tag);
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
                return "navTgd : "
                    + getNavTgd().toIndentedString(indent);
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
 * 
 */
public static class navTocType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navTocType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navTocType() {
    super();
    setValueRange(new java.math.BigInteger("0"), new java.math.BigInteger("37799"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navTocType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navTocType != null) {
      return ImmutableList.of(TAG_navTocType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navTocType from encoded stream.
   */
  public static navTocType fromPerUnaligned(byte[] encodedBytes) {
    navTocType result = new navTocType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navTocType from encoded stream.
   */
  public static navTocType fromPerAligned(byte[] encodedBytes) {
    navTocType result = new navTocType();
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
    return "navTocType = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class navaf2Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navaf2Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navaf2Type() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navaf2Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navaf2Type != null) {
      return ImmutableList.of(TAG_navaf2Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navaf2Type from encoded stream.
   */
  public static navaf2Type fromPerUnaligned(byte[] encodedBytes) {
    navaf2Type result = new navaf2Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navaf2Type from encoded stream.
   */
  public static navaf2Type fromPerAligned(byte[] encodedBytes) {
    navaf2Type result = new navaf2Type();
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
    return "navaf2Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class navaf1Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navaf1Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navaf1Type() {
    super();
    setValueRange(new java.math.BigInteger("-32768"), new java.math.BigInteger("32767"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navaf1Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navaf1Type != null) {
      return ImmutableList.of(TAG_navaf1Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navaf1Type from encoded stream.
   */
  public static navaf1Type fromPerUnaligned(byte[] encodedBytes) {
    navaf1Type result = new navaf1Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navaf1Type from encoded stream.
   */
  public static navaf1Type fromPerAligned(byte[] encodedBytes) {
    navaf1Type result = new navaf1Type();
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
    return "navaf1Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class navaf0Type extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navaf0Type
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navaf0Type() {
    super();
    setValueRange(new java.math.BigInteger("-2097152"), new java.math.BigInteger("2097151"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navaf0Type;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navaf0Type != null) {
      return ImmutableList.of(TAG_navaf0Type);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navaf0Type from encoded stream.
   */
  public static navaf0Type fromPerUnaligned(byte[] encodedBytes) {
    navaf0Type result = new navaf0Type();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navaf0Type from encoded stream.
   */
  public static navaf0Type fromPerAligned(byte[] encodedBytes) {
    navaf0Type result = new navaf0Type();
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
    return "navaf0Type = " + getInteger() + ";\n";
  }
}

  
  // Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//

/**
 * 
 */
public static class navTgdType extends Asn1Integer {
  //

  private static final Asn1Tag TAG_navTgdType
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public navTgdType() {
    super();
    setValueRange(new java.math.BigInteger("-128"), new java.math.BigInteger("127"));

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_navTgdType;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_navTgdType != null) {
      return ImmutableList.of(TAG_navTgdType);
    } else {
      return Asn1Integer.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new navTgdType from encoded stream.
   */
  public static navTgdType fromPerUnaligned(byte[] encodedBytes) {
    navTgdType result = new navTgdType();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new navTgdType from encoded stream.
   */
  public static navTgdType fromPerAligned(byte[] encodedBytes) {
    navTgdType result = new navTgdType();
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
    return "navTgdType = " + getInteger() + ";\n";
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
    builder.append("NAV_ClockModel = {\n");
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
