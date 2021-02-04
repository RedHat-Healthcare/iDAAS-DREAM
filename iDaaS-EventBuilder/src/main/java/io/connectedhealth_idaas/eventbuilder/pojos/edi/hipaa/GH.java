package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GH {
private String GH_01_TransactionSetPurposeCode;
private String GH_02_Date;
private String GH_03_NumberofLineItems;
private String GH_04_RevisionNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

