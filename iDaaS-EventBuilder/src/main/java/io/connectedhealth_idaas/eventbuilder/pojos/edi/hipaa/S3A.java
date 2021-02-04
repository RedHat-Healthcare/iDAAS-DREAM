package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class S3A {
private String S3A_01_SecurityVersionReleaseIdentifierCode;
private String S3A_02_BusinessPurposeofAssurance;
private String S3A_04_DomainofComputationofAssurance;
private String S3A_05_AssuranceOriginator;
private String S3A_06_AssuranceRecipient;
private String S3A_07_AssuranceReferenceNumber;
private String S3A_08_DateTimeStamp;
private String S3A_09_AssuranceText;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

