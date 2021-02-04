package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LC {
private String LC_01_MaintenanceTypeCode;
private String LC_02_MaintenanceReasonCode;
private String LC_03_InsuranceLineCode;
private String LC_04_PlanCoverageDescription;
private String LC_05_Quantity;
private String LC_06_ProductOptionCode;
private String LC_07_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

