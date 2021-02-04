package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BSR {
private String BSR_01_StatusReportCode;
private String BSR_02_OrderItemCode;
private String BSR_03_ReferenceIdentification;
private String BSR_04_Date;
private String BSR_05_ProductDateCode;
private String BSR_06_LocationCode;
private String BSR_07_Time;
private String BSR_08_ReferenceIdentification;
private String BSR_09_Date;
private String BSR_10_Time;
private String BSR_11_TransactionSetPurposeCode;
private String BSR_12_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

