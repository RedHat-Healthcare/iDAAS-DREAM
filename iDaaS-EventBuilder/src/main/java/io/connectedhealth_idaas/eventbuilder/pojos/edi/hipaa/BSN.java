package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BSN {
private String BSN_01_TransactionSetPurposeCode;
private String BSN_02_ShipmentIdentification;
private String BSN_03_Date;
private String BSN_04_Time;
private String BSN_05_HierarchicalStructureCode;
private String BSN_06_TransactionTypeCode;
private String BSN_07_StatusReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

