package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BSS {
private String BSS_01_TransactionSetPurposeCode;
private String BSS_02_ReferenceIdentification;
private String BSS_03_Date;
private String BSS_04_ScheduleTypeQualifier;
private String BSS_05_Date;
private String BSS_06_Date;
private String BSS_07_ReleaseNumber;
private String BSS_08_ReferenceIdentification;
private String BSS_09_ContractNumber;
private String BSS_10_PurchaseOrderNumber;
private String BSS_11_ScheduleQuantityQualifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

