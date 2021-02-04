package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ITD {
private String ITD_01_TermsTypeCode;
private String ITD_02_TermsBasisDateCode;
private String ITD_03_TermsDiscountPercent;
private String ITD_04_TermsDiscountDueDate;
private String ITD_05_TermsDiscountDaysDue;
private String ITD_06_TermsNetDueDate;
private String ITD_07_TermsNetDays;
private String ITD_08_TermsDiscountAmount;
private String ITD_09_TermsDeferredDueDate;
private String ITD_10_DeferredAmountDue;
private String ITD_11_PercentofInvoicePayable;
private String ITD_12_Description;
private String ITD_13_DayofMonth;
private String ITD_14_PaymentMethodTypeCode;
private String ITD_15_PercentageasDecimal;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

