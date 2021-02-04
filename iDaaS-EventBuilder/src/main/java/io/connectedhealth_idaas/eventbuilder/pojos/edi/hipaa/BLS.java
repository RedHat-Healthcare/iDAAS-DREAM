package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BLS {
private String BLS_01_TransactionSetPurposeCode;
private String BLS_02_TransactionTypeCode;
private String BLS_03_ReferenceIdentification;
private String BLS_04_Date;
private String BLS_05_Time;
private String BLS_06_AcknowledgmentType;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

