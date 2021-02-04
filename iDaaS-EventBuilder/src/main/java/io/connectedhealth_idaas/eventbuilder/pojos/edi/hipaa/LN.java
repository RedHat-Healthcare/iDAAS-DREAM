package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LN {
private String LN_01_ReferenceIdentification;
private String LN_02_MonetaryAmount;
private String LN_03_DateTimePeriodFormatQualifier;
private String LN_04_DateTimePeriod;
private String LN_05_FrequencyCode;
private String LN_06_MonetaryAmount;
private String LN_07_PercentageasDecimal;
private String LN_08_YesNoConditionorResponseCode;
private String LN_09_LoanPurposeCode;
private String LN_10_LoanPaymentTypeCode;
private String LN_11_LoanRateTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

