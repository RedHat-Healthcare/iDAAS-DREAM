package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HD {
private String HD_01_MaintenanceTypeCode;
private String HD_02_MaintenanceReasonCode;
private String HD_03_InsuranceLineCode;
private String HD_04_PlanCoverageDescription;
private String HD_05_CoverageLevelCode;
private String HD_06_Count;
private String HD_07_Count;
private String HD_08_UnderwritingDecisionCode;
private String HD_09_YesNoConditionorResponseCode;
private String HD_10_DrugHouseCode;
private String HD_11_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

