package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HAD {
private String HAD_01_StatusCode;
private String HAD_02_YesNoConditionorResponseCode;
private String HAD_03_YesNoConditionorResponseCode;
private String HAD_04_YesNoConditionorResponseCode;
private String HAD_05_CodeListQualifierCode;
private String HAD_06_IndustryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

