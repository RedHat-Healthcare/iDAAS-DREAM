package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RED {
private String RED_01_Description;
private String RED_02_RelatedDataIdentificationCode;
private String RED_03_AgencyQualifierCode;
private String RED_04_SourceSubqualifier;
private String RED_05_CodeListQualifierCode;
private String RED_06_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

