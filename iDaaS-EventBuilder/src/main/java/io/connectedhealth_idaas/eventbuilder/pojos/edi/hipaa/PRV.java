package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRV {
private String PRV_01_ProviderCode;
private String PRV_02_ReferenceIdentificationQualifier;
private String PRV_03_ReferenceIdentification;
private String PRV_04_StateorProvinceCode;
private String PRV_06_ProviderOrganizationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

