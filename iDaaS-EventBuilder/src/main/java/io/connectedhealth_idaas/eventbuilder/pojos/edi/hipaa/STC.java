package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class STC {
private String STC_02_Date;
private String STC_03_ActionCode;
private String STC_04_MonetaryAmount;
private String STC_05_MonetaryAmount;
private String STC_06_Date;
private String STC_07_PaymentMethodCode;
private String STC_08_Date;
private String STC_09_CheckNumber;
private String STC_12_FreeformMessageText;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

