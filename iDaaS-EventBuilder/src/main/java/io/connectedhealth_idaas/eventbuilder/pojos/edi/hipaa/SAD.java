package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SAD {
private String SAD_01_StatusReasonCode;
private String SAD_02_InterestRate;
private String SAD_03_LoanRateTypeCode;
private String SAD_04_PaymentMethodTypeCode;
private String SAD_05_Quantity;
private String SAD_06_CodeListQualifierCode;
private String SAD_07_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

