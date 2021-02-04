package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HPL {
private String HPL_01_ReferenceIdentificationQualifier;
private String HPL_02_ReferenceIdentification;
private String HPL_03_StatusCode;
private String HPL_04_StateorProvinceCode;
private String HPL_05_Description;
private String HPL_06_CodeForLicensing,Certification,Registration,orAccreditationAgency;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

