package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PCS {
private String PCS_01_ClaimStatusCode;
private String PCS_02_AgencyQualifierCode;
private String PCS_03_SourceSubqualifier;
private String PCS_04_ClaimResponseReasonCode;
private String PCS_05_MonetaryAmount;
private String PCS_06_FollowupActionCode;
private String PCS_07_AgencyQualifierCode;
private String PCS_08_SourceSubqualifier;
private String PCS_09_DispositionCode;
private String PCS_10_Description;
private String PCS_11_AuthorizationIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

