package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISC {
private String ISC_01_StandardCarrierAlphaCode;
private String ISC_02_StandardPointLocationCode;
private String ISC_03_EventCode;
private String ISC_04_DateTimePeriodFormatQualifier;
private String ISC_05_DateTimePeriod;
private String ISC_06_Time;
private String ISC_07_NumberofDays;
private String ISC_08_StandardCarrierAlphaCode;
private String ISC_09_InterchangeTrainIdentification;
private String ISC_10_BlockIdentifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

