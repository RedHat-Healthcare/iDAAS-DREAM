package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VR {
private String VR_01_TransactionSetPurposeCode;
private String VR_02_TariffNumber;
private String VR_03_StandardCarrierAlphaCode;
private String VR_04_IdentificationCodeQualifier;
private String VR_05_IdentificationCode;
private String VR_06_CurrencyCode;
private String VR_07_TariffAgencyCode;
private String VR_08_TariffSupplementIdentifier;
private String VR_09_ExParte;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

