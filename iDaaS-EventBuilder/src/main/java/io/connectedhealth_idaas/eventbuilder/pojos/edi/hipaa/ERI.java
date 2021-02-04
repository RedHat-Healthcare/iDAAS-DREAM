package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ERI {
private String ERI_01_IdentificationCodeQualifier;
private String ERI_02_IdentificationCode;
private String ERI_03_EntityRelationshipCode;
private String ERI_04_IdentificationCodeQualifier;
private String ERI_05_IdentificationCode;
private String ERI_06_EntityRelationshipCode;
private String ERI_07_EntityRelationshipCode;
private String ERI_08_EntityRelationshipCode;
private String ERI_09_HierarchyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

