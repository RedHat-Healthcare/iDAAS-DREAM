package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BAK {
private String BAK_01_TransactionSetPurposeCode;
private String BAK_02_AcknowledgmentType;
private String BAK_03_PurchaseOrderNumber;
private String BAK_04_Date;
private String BAK_05_ReleaseNumber;
private String BAK_06_RequestReferenceNumber;
private String BAK_07_ContractNumber;
private String BAK_08_ReferenceIdentification;
private String BAK_09_Date;
private String BAK_10_TransactionTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

