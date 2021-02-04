package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class API {
private String API_01_CodeCategory;
private String API_02_ActionCode;
private String API_03_MaintenanceTypeCode;
private String API_04_StatusReasonCode;
private String API_05_AffectedAreaorSectionCode;
private String API_06_InsuranceTypeCode;
private String API_07_LoanTypeCode;
private String API_08_InformationStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

