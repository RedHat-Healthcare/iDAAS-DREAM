package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TID {
private String TID_01_TaskIDQualifier;
private String TID_02_TaskIdentifier;
private String TID_03_RelationshipTaskIdentifier;
private String TID_04_Description;
private String TID_05_WorkStatusCode;
private String TID_06_ActionCode;
private String TID_07_ReferenceIdentification;
private String TID_08_ReferenceIdentification;
private String TID_09_ReportingStructureIdentifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

