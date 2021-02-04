package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SW {
private String SW_01_TariffApplicationCode;
private String SW_02_ConditionSegmentLogicalConnector;
private String SW_03_ConditionCode;
private String SW_04_ConditionValue;
private String SW_05_StandardCarrierAlphaCode;
private String SW_06_RateValueQualifier;
private String SW_07_Rate;
private String SW_08_Rule260JunctionCode;
private String SW_09_AssignedNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

