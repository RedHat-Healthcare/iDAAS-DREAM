package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EB {
private String EB_01_EligibilityorBenefitInformationCode;
private String EB_02_CoverageLevelCode;
private String EB_03_ServiceTypeCode;
private String EB_04_InsuranceTypeCode;
private String EB_05_PlanCoverageDescription;
private String EB_06_TimePeriodQualifier;
private String EB_07_MonetaryAmount;
private String EB_08_PercentageasDecimal;
private String EB_09_QuantityQualifier;
private String EB_10_Quantity;
private String EB_11_YesNoConditionorResponseCode;
private String EB_12_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

