package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BQR {
private String BQR_01_TransactionSetPurposeCode;
private String BQR_02_RequestforQuoteReferenceNumber;
private String BQR_03_Date;
private String BQR_04_DateTimeQualifier;
private String BQR_05_Date;
private String BQR_06_BidTypeResponseCode;
private String BQR_07_SecurityLevelCode;
private String BQR_08_ChangeOrderSequenceNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

