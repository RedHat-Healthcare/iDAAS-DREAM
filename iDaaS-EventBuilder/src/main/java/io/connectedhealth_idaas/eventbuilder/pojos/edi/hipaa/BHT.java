package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BHT {
private String BHT_01_HierarchicalStructureCode;
private String BHT_02_TransactionSetPurposeCode;
private String BHT_03_ReferenceIdentification;
private String BHT_04_Date;
private String BHT_05_Time;
private String BHT_06_TransactionTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

