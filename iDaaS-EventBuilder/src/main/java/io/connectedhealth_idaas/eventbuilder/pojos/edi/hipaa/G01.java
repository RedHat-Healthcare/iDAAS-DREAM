package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class G01 {
private String G01_01_Date;
private String G01_02_InvoiceNumber;
private String G01_03_Date;
private String G01_04_PurchaseOrderNumber;
private String G01_05_VendorOrderNumber;
private String G01_06_MasterReferenceLinkNumber;
private String G01_07_LinkSequenceNumber;
private String G01_08_TransactionTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

