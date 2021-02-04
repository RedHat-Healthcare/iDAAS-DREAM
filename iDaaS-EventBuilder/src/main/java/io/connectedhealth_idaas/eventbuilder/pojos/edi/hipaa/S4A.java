package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class S4A {
private String S4A_01_SecurityVersionReleaseIdentifierCode;
private String S4A_02_BusinessPurposeofAssurance;
private String S4A_04_DomainofComputationofAssurance;
private String S4A_05_AssuranceOriginator;
private String S4A_06_AssuranceRecipient;
private String S4A_07_AssuranceReferenceNumber;
private String S4A_08_DateTimeStamp;
private String S4A_09_AssuranceText;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

