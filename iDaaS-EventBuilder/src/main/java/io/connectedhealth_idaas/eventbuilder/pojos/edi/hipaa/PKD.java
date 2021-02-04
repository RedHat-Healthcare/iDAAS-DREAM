package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PKD {
private String PKD_01_PackagingCode;
private String PKD_02_SourceSubqualifier;
private String PKD_03_AgencyQualifierCode;
private String PKD_04_PackagingDescriptionCode;
private String PKD_05_OwnershipCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

