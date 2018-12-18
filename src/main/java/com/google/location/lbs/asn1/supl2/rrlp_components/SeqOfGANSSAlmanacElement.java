package com.google.location.lbs.asn1.supl2.rrlp_components;

// Copyright 2008 Google Inc. All Rights Reserved.
/*
 * This class is AUTOMATICALLY GENERATED. Do NOT EDIT.
 */


//
//
import com.google.location.lbs.asn1.base.Asn1Null;
import com.google.location.lbs.asn1.base.Asn1SequenceOf;
import com.google.location.lbs.asn1.base.Asn1Tag;
import com.google.location.lbs.asn1.base.BitStream;
import com.google.location.lbs.asn1.base.BitStreamReader;
import com.google.location.lbs.asn1.supl2.rrlp_components.GANSSAlmanacElement;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import javax.annotation.Nullable;


/**
 * @author Torbjorn Gannholm (tobe@google.com)
 */
public  class SeqOfGANSSAlmanacElement
    extends Asn1SequenceOf<GANSSAlmanacElement> {
  //

  private static final Asn1Tag TAG_SeqOfGANSSAlmanacElement
      = Asn1Tag.fromClassAndNumber(-1, -1);

  public SeqOfGANSSAlmanacElement() {
    super();
    setMinSize(1);
setMaxSize(36);

  }

  @Override
  @Nullable
  protected Asn1Tag getTag() {
    return TAG_SeqOfGANSSAlmanacElement;
  }

  @Override
  protected boolean isTagImplicit() {
    return true;
  }

  public static Collection<Asn1Tag> getPossibleFirstTags() {
    if (TAG_SeqOfGANSSAlmanacElement != null) {
      return ImmutableList.of(TAG_SeqOfGANSSAlmanacElement);
    } else {
      return Asn1SequenceOf.getPossibleFirstTags();
    }
  }

  /**
   * Creates a new SeqOfGANSSAlmanacElement from encoded stream.
   */
  public static SeqOfGANSSAlmanacElement fromPerUnaligned(byte[] encodedBytes) {
    SeqOfGANSSAlmanacElement result = new SeqOfGANSSAlmanacElement();
    result.decodePerUnaligned(new BitStreamReader(encodedBytes));
    return result;
  }

  /**
   * Creates a new SeqOfGANSSAlmanacElement from encoded stream.
   */
  public static SeqOfGANSSAlmanacElement fromPerAligned(byte[] encodedBytes) {
    SeqOfGANSSAlmanacElement result = new SeqOfGANSSAlmanacElement();
    result.decodePerAligned(new BitStreamReader(encodedBytes));
    return result;
  }

  
  @Override public GANSSAlmanacElement createAndAddValue() {
    GANSSAlmanacElement value = new GANSSAlmanacElement();
    add(value);
    return value;
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
    builder.append("SeqOfGANSSAlmanacElement = [\n");
    final String internalIndent = indent + "  ";
    for (GANSSAlmanacElement value : getValues()) {
      builder.append(internalIndent)
          .append(value.toIndentedString(internalIndent));
    }
    builder.append(indent).append("];\n");
    return builder.toString();
  }
}