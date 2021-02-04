package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ER {
private String ER_01_ActionCode;
private String ER_02_StandardCarrierAlphaCode;
private String ER_03_EventCode;
private String ER_04_StandardPointLocationCode;
private String ER_05_DateTimeQualifier;
private String ER_06_DateTimePeriodFormatQualifier;
private String ER_07_DateTimePeriod;
private String ER_08_StandardCarrierAlphaCode;
private String ER_09_InterchangeTrainIdentification;
private String ER_10_Date;
private String ER_11_LoadEmptyStatusCode;
private String ER_12_StandardPointLocationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

