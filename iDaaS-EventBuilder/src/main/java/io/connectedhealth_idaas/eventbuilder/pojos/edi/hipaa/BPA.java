package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BPA {
private String BPA_01_TransactionSetPurposeCode;
private String BPA_02_Date;
private String BPA_03_ReferenceIdentificationQualifier;
private String BPA_04_ReferenceIdentification;
private String BPA_05_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

