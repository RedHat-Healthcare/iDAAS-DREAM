package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BTR {
private String BTR_01_TransactionSetPurposeCode;
private String BTR_02_Date;
private String BTR_03_Time;
private String BTR_04_ReportTypeCode;
private String BTR_05_ReferenceIdentification;
private String BTR_06_ReferenceIdentification;
private String BTR_07_SecurityLevelCode;
private String BTR_08_HierarchicalStructureCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

