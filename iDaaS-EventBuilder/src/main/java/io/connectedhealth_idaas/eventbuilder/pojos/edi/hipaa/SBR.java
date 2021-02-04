package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SBR {
private String SBR_01_PayerResponsibilitySequenceNumberCode;
private String SBR_02_IndividualRelationshipCode;
private String SBR_03_ReferenceIdentification;
private String SBR_04_Name;
private String SBR_05_InsuranceTypeCode;
private String SBR_06_CoordinationofBenefitsCode;
private String SBR_07_YesNoConditionorResponseCode;
private String SBR_08_EmploymentStatusCode;
private String SBR_09_ClaimFilingIndicatorCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

