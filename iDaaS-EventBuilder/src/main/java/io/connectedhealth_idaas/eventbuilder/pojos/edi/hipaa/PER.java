package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PER {
private String PER_01_ContactFunctionCode;
private String PER_02_Name;
private String PER_03_CommunicationNumberQualifier;
private String PER_04_CommunicationNumber;
private String PER_05_CommunicationNumberQualifier;
private String PER_06_CommunicationNumber;
private String PER_07_CommunicationNumberQualifier;
private String PER_08_CommunicationNumber;
private String PER_09_ContactInquiryReference;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

