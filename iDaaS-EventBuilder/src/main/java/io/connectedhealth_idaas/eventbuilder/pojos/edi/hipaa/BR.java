package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BR {
private String BR_01_TransactionSetPurposeCode;
private String BR_02_TransactionTypeCode;
private String BR_03_Date;
private String BR_04_IdentificationCode;
private String BR_05_IdentificationCodeQualifier;
private String BR_06_ActionCode;
private String BR_07_ReferenceIdentificationQualifier;
private String BR_08_ReferenceIdentification;
private String BR_09_Time;
private String BR_10_ReferenceIdentificationQualifier;
private String BR_11_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

