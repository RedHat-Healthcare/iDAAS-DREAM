package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FC {
private String FC_01_ContributionCode;
private String FC_02_PercentageasDecimal;
private String FC_03_MonetaryAmount;
private String FC_04_Number;
private String FC_05_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

