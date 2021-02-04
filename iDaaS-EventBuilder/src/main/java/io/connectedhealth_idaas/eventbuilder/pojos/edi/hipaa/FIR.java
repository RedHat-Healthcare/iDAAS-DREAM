package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FIR {
private String FIR_01_CodeListQualifierCode;
private String FIR_02_IndustryCode;
private String FIR_03_MonetaryAmount;
private String FIR_04_Date;
private String FIR_05_Time;
private String FIR_06_TimeCode;
private String FIR_07_Quantity;
private String FIR_08_Quantity;
private String FIR_09_CreditDebitFlagCode;
private String FIR_10_FinancialTransactionStatusCode;
private String FIR_11_CurrencyCode;
private String FIR_12_MonetaryAmount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

