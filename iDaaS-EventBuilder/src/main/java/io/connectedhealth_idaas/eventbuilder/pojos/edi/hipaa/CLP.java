package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CLP {
private String CLP_01_ClaimSubmittersIdentifier;
private String CLP_02_ClaimStatusCode;
private String CLP_03_MonetaryAmount;
private String CLP_04_MonetaryAmount;
private String CLP_05_MonetaryAmount;
private String CLP_06_ClaimFilingIndicatorCode;
private String CLP_07_ReferenceIdentification;
private String CLP_08_FacilityCodeValue;
private String CLP_09_ClaimFrequencyTypeCode;
private String CLP_10_PatientStatusCode;
private String CLP_11_DiagnosisRelatedGroupDRGCode;
private String CLP_12_Quantity;
private String CLP_13_PercentageasDecimal;
private String CLP_14_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

