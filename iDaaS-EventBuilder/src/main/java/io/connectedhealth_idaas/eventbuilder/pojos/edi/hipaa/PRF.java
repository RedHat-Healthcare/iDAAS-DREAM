package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRF {
private String PRF_01_PurchaseOrderNumber;
private String PRF_02_ReleaseNumber;
private String PRF_03_ChangeOrderSequenceNumber;
private String PRF_04_Date;
private String PRF_05_AssignedIdentification;
private String PRF_06_ContractNumber;
private String PRF_07_PurchaseOrderTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

