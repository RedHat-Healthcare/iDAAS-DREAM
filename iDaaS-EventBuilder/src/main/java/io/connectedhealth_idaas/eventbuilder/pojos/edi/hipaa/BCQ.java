package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCQ {
private String BCQ_01_TransactionSetPurposeCode;
private String BCQ_02_Date;
private String BCQ_03_Time;
private String BCQ_04_ReferenceIdentification;
private String BCQ_05_StandardCarrierAlphaCode;
private String BCQ_06_TransactionTypeCode;
private String BCQ_07_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

