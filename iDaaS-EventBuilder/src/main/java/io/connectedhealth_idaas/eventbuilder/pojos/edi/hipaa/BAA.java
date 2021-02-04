package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BAA {
private String BAA_01_TransactionSetPurposeCode;
private String BAA_02_TransactionTypeCode;
private String BAA_03_Date;
private String BAA_04_ReferenceIdentificationQualifier;
private String BAA_05_ReferenceIdentification;
private String BAA_06_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

