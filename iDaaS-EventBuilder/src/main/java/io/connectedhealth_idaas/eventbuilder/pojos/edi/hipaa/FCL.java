package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FCL {
private String FCL_01_DeficiencyJudgmentCode;
private String FCL_02_YesNoConditionorResponseCode;
private String FCL_03_AmountQualifierCode;
private String FCL_04_MonetaryAmount;
private String FCL_05_AdjustmentReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

