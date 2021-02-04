package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class F01 {
private String F01_01_Date;
private String F01_02_ReferenceIdentification;
private String F01_03_Amount;
private String F01_04_StandardCarrierAlphaCode;
private String F01_05_SupportingEvidenceCode;
private String F01_06_CurrencyCode;
private String F01_07_ExchangeRate;
private String F01_08_IdentificationCodeQualifier;
private String F01_09_IdentificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

