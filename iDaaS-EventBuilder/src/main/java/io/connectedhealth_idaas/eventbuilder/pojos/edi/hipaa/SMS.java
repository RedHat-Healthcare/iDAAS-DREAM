package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SMS {
private String SMS_01_StandardCarrierAlphaCode;
private String SMS_02_FreightStationAccountingCode;
private String SMS_03_Rule260JunctionCode;
private String SMS_04_PostalCode;
private String SMS_05_ReciprocalSwitchCode;
private String SMS_06_TimeCode;
private String SMS_07_LocationIdentifier;
private String SMS_08_LocationIdentifier;
private String SMS_09_YesNoConditionorResponseCode;
private String SMS_10_IdentificationCode;
private String SMS_11_YesNoConditionorResponseCode;
private String SMS_12_StandardCarrierAlphaCode;
private String SMS_13_FreightStationAccountingCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

