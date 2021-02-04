package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SV3 {
private String SV3_02_MonetaryAmount;
private String SV3_03_FacilityCodeValue;
private String SV3_05_Prosthesis,CrownorInlayCode;
private String SV3_06_Quantity;
private String SV3_07_Description;
private String SV3_08_CopayStatusCode;
private String SV3_09_ProviderAgreementCode;
private String SV3_10_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

