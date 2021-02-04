package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class APE {
private String APE_01_BusinessPurposeofAssurance;
private String APE_02_DomainofComputationofAssurance;
private String APE_03_SecurityorAssuranceProtocolErrorCode;
private String APE_04_AssuranceOriginator;
private String APE_05_AssuranceRecipient;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

