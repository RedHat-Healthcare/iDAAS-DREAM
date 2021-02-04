package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ENM {
private String ENM_01_StatusReasonCode;
private String ENM_02_LevelofIndividual,Test,orCourseCode;
private String ENM_03_SessionCode;
private String ENM_05_GenderCode;
private String ENM_06_DateTimePeriodFormatQualifier;
private String ENM_07_DateTimePeriod;
private String ENM_08_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

