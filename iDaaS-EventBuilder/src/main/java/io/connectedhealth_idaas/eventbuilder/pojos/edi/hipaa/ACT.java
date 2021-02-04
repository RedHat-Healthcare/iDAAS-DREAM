package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ACT {
private String ACT_01_AccountNumber;
private String ACT_02_Name;
private String ACT_03_IdentificationCodeQualifier;
private String ACT_04_IdentificationCode;
private String ACT_05_AccountNumberQualifier;
private String ACT_06_AccountNumber;
private String ACT_07_Description;
private String ACT_08_PaymentMethodTypeCode;
private String ACT_09_BenefitStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

