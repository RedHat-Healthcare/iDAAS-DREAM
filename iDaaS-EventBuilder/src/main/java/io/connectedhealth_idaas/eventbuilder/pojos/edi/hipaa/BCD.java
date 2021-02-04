package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCD {
private String BCD_01_Date;
private String BCD_02_CreditDebitAdjustmentNumber;
private String BCD_03_TransactionHandlingCode;
private String BCD_04_Amount;
private String BCD_05_CreditDebitFlagCode;
private String BCD_06_Date;
private String BCD_07_InvoiceNumber;
private String BCD_08_VendorOrderNumber;
private String BCD_09_Date;
private String BCD_10_PurchaseOrderNumber;
private String BCD_11_TransactionSetPurposeCode;
private String BCD_12_TransactionTypeCode;
private String BCD_13_ReferenceIdentificationQualifier;
private String BCD_14_ReferenceIdentification;
private String BCD_15_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

