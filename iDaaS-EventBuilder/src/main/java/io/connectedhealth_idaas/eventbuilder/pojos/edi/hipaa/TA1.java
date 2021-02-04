package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TA1 {
private String TA1_01_InterchangeControlNumber;
private String TA1_02_InterchangeDate;
private String TA1_03_InterchangeTime;
private String TA1_04_InterchangeAcknowledgmentCode;
private String TA1_05_InterchangeNoteCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

