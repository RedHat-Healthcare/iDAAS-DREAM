package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OI {
private String OI_01_ClaimFilingIndicatorCode;
private String OI_02_ClaimSubmissionReasonCode;
private String OI_03_YesNoConditionorResponseCode;
private String OI_04_PatientSignatureSourceCode;
private String OI_05_ProviderAgreementCode;
private String OI_06_ReleaseofInformationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

