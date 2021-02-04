package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ENE {
private String ENE_01_CommunicationsEnvironmentCode;
private String ENE_02_CommunicationNumberQualifier;
private String ENE_03_CommunicationNumber;
private String ENE_04_IdentificationCodeQualifier;
private String ENE_05_IdentificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

