package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BFR {
private String BFR_01_TransactionSetPurposeCode;
private String BFR_02_ReferenceIdentification;
private String BFR_03_ReleaseNumber;
private String BFR_04_ScheduleTypeQualifier;
private String BFR_05_ScheduleQuantityQualifier;
private String BFR_06_Date;
private String BFR_07_Date;
private String BFR_08_Date;
private String BFR_09_Date;
private String BFR_10_ContractNumber;
private String BFR_11_PurchaseOrderNumber;
private String BFR_12_PlanningScheduleTypeCode;
private String BFR_13_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

