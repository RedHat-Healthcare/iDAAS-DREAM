package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCH {
private String BCH_01_TransactionSetPurposeCode;
private String BCH_02_PurchaseOrderTypeCode;
private String BCH_03_PurchaseOrderNumber;
private String BCH_04_ReleaseNumber;
private String BCH_05_ChangeOrderSequenceNumber;
private String BCH_06_Date;
private String BCH_07_RequestReferenceNumber;
private String BCH_08_ContractNumber;
private String BCH_09_ReferenceIdentification;
private String BCH_10_Date;
private String BCH_11_Date;
private String BCH_12_ContractTypeCode;
private String BCH_13_SecurityLevelCode;
private String BCH_14_AcknowledgmentType;
private String BCH_15_TransactionTypeCode;
private String BCH_16_PurchaseCategory;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

