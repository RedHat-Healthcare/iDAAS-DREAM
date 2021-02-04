package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PUN {
private String PUN_01_StandardCarrierAlphaCode;
private String PUN_02_Date;
private String PUN_03_Time;
private String PUN_04_ReferenceIdentification;
private String PUN_05_Time;
private String PUN_06_TransactionSetPurposeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

