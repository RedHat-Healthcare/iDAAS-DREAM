package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MBL {
private String MBL_01_StandardCarrierAlphaCode;
private String MBL_02_BillofLadingWaybillNumber;
private String MBL_03_ActionCode;
private String MBL_04_YesNoConditionorResponseCode;
private String MBL_05_TypeofServiceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

