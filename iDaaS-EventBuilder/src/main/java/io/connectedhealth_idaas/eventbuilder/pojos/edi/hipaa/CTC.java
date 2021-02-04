package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CTC {
private String CTC_01_StandardCarrierAlphaCode;
private String CTC_02_StandardCarrierAlphaCode;
private String CTC_03_CarHireDetailSummaryCode;
private String CTC_04_AccountTypeCode;
private String CTC_05_TransactionSetPurposeCode;
private String CTC_06_Year;
private String CTC_07_MonthoftheYearCode;
private String CTC_08_Year;
private String CTC_09_MonthoftheYearCode;
private String CTC_10_AccountDescriptionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

