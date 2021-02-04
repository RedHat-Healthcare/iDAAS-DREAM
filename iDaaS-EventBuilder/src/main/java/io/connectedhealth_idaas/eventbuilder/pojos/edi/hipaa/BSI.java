package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BSI {
private String BSI_01_ReferenceIdentification;
private String BSI_02_Date;
private String BSI_03_OrderItemCode;
private String BSI_04_ProductDateCode;
private String BSI_05_LocationCode;
private String BSI_06_Time;
private String BSI_07_TransactionSetPurposeCode;
private String BSI_08_TransactionTypeCode;
private String BSI_09_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

