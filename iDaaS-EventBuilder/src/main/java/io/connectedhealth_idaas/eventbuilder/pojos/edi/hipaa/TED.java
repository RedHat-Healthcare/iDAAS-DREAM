package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TED {
private String TED_01_ApplicationErrorConditionCode;
private String TED_02_FreeformMessage;
private String TED_03_SegmentIDCode;
private String TED_04_SegmentPositioninTransactionSet;
private String TED_07_CopyofBadDataElement;
private String TED_08_DataElementNewContent;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

