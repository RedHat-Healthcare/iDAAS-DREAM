package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ENT {
private String ENT_01_AssignedNumber;
private String ENT_02_EntityIdentifierCode;
private String ENT_03_IdentificationCodeQualifier;
private String ENT_04_IdentificationCode;
private String ENT_05_EntityIdentifierCode;
private String ENT_06_IdentificationCodeQualifier;
private String ENT_07_IdentificationCode;
private String ENT_08_ReferenceIdentificationQualifier;
private String ENT_09_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

