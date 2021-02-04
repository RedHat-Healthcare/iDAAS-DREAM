package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRC {
private String PRC_01_DateTimeQualifier;
private String PRC_02_DateTimePeriodFormatQualifier;
private String PRC_03_DateTimePeriod;
private String PRC_04_InterestRate;
private String PRC_05_InterestRate;
private String PRC_06_InterestRate;
private String PRC_07_AmountQualifierCode;
private String PRC_08_MonetaryAmount;
private String PRC_09_YesNoConditionorResponseCode;
private String PRC_10_QuantityQualifier;
private String PRC_11_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

