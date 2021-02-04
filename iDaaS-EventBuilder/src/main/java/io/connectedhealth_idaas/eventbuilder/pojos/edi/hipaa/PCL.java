package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PCL {
private String PCL_01_IdentificationCodeQualifier;
private String PCL_02_IdentificationCode;
private String PCL_03_DateTimePeriodFormatQualifier;
private String PCL_04_DateTimePeriod;
private String PCL_05_AcademicDegreeCode;
private String PCL_06_DateTimePeriod;
private String PCL_07_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

