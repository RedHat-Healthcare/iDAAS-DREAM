package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PRT {
private String PRT_01_DispositionCode;
private String PRT_02_AgencyQualifierCode;
private String PRT_03_SourceSubqualifier;
private String PRT_04_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

