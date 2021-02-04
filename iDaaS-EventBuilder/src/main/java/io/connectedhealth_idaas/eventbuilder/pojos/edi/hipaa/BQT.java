package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BQT {
private String BQT_01_TransactionSetPurposeCode;
private String BQT_02_RequestforQuoteReferenceNumber;
private String BQT_03_Date;
private String BQT_04_DateTimeQualifier;
private String BQT_05_Date;
private String BQT_06_PurchaseOrderTypeCode;
private String BQT_07_RequestforQuoteTypeCode;
private String BQT_08_ContractTypeCode;
private String BQT_09_SecurityLevelCode;
private String BQT_10_PurchaseCategory;
private String BQT_11_ChangeOrderSequenceNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

