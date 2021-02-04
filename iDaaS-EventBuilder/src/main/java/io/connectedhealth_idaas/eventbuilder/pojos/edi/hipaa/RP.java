package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RP {
private String RP_01_MaintenanceTypeCode;
private String RP_02_InsuranceLineCode;
private String RP_03_MaintenanceReasonCode;
private String RP_04_Description;
private String RP_05_ParticipantStatusCode;
private String RP_06_YesNoConditionorResponseCode;
private String RP_07_SpecialProcessingType;
private String RP_08_Authority;
private String RP_09_PlanCoverageDescription;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

