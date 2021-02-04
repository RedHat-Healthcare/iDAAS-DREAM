package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PAM {
private String PAM_01_QuantityQualifier;
private String PAM_02_Quantity;
private String PAM_04_AmountQualifierCode;
private String PAM_05_MonetaryAmount;
private String PAM_06_UnitofTimePeriodorInterval;
private String PAM_07_DateTimeQualifier;
private String PAM_08_Date;
private String PAM_09_Time;
private String PAM_10_DateTimeQualifier;
private String PAM_11_Date;
private String PAM_12_Time;
private String PAM_13_PercentQualifier;
private String PAM_14_PercentageasDecimal;
private String PAM_15_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

