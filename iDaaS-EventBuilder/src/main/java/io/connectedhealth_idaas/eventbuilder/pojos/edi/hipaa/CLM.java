package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CLM {
private String CLM_01_ClaimSubmittersIdentifier;
private String CLM_02_MonetaryAmount;
private String CLM_03_ClaimFilingIndicatorCode;
private String CLM_04_NonInstitutionalClaimTypeCode;
private String CLM_06_YesNoConditionorResponseCode;
private String CLM_07_ProviderAcceptAssignmentCode;
private String CLM_08_YesNoConditionorResponseCode;
private String CLM_09_ReleaseofInformationCode;
private String CLM_10_PatientSignatureSourceCode;
private String CLM_12_SpecialProgramCode;
private String CLM_13_YesNoConditionorResponseCode;
private String CLM_14_LevelofServiceCode;
private String CLM_15_YesNoConditionorResponseCode;
private String CLM_16_ProviderAgreementCode;
private String CLM_17_ClaimStatusCode;
private String CLM_18_YesNoConditionorResponseCode;
private String CLM_19_ClaimSubmissionReasonCode;
private String CLM_20_DelayReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

