package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BEG {
private String BEG_01_TransactionSetPurposeCode;
private String BEG_02_PurchaseOrderTypeCode;
private String BEG_03_PurchaseOrderNumber;
private String BEG_04_ReleaseNumber;
private String BEG_05_Date;
private String BEG_06_ContractNumber;
private String BEG_07_AcknowledgmentType;
private String BEG_08_InvoiceTypeCode;
private String BEG_09_ContractTypeCode;
private String BEG_10_PurchaseCategory;
private String BEG_11_SecurityLevelCode;
private String BEG_12_TransactionTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

