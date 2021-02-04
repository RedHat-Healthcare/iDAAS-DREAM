package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDL {
private String PDL_01_PaymentMethodCode;
private String PDL_02_AmountQualifierCode;
private String PDL_03_MonetaryAmount;
private String PDL_04_PercentageasDecimal;
private String PDL_05_CreditDebitFlagCode;
private String PDL_06_FrequencyCode;
private String PDL_07_DFIIDNumberQualifier;
private String PDL_08_DFIIdentificationNumber;
private String PDL_09_AccountNumberQualifier;
private String PDL_10_AccountNumber;
private String PDL_11_DateTimePeriodFormatQualifier;
private String PDL_12_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

