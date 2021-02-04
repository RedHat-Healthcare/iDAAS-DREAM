package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISI {
private String ISI_01_CodeListQualifierCode;
private String ISI_02_IndustryCode;
private String ISI_03_LevelofIndividual,Test,orCourseCode;
private String ISI_05_Quantity;
private String ISI_06_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

