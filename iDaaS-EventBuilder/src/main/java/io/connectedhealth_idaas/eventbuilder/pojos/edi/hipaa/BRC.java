package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BRC {
private String BRC_01_TransactionSetPurposeCode;
private String BRC_02_Date;
private String BRC_03_ReferenceIdentificationQualifier;
private String BRC_04_ReferenceIdentification;
private String BRC_05_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

