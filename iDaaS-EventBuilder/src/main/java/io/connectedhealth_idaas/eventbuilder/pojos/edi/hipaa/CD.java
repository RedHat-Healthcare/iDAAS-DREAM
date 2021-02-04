package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CD {
private String CD_01_ConditionSegmentLogicalConnector;
private String CD_02_ConditionCode;
private String CD_03_ConditionValue;
private String CD_04_ConditionValue;
private String CD_05_ConditionValue;
private String CD_06_AssignedNumber;
private String CD_07_ChangeTypeCode;
private String CD_08_StandardCarrierAlphaCode;
private String CD_09_DocketControlNumber;
private String CD_10_DocketIdentification;
private String CD_11_GroupTitle;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

