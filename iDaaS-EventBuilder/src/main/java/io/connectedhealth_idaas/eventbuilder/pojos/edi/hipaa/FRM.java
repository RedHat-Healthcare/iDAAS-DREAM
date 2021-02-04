package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FRM {
private String FRM_01_AssignedIdentification;
private String FRM_02_YesNoConditionorResponseCode;
private String FRM_03_ReferenceIdentification;
private String FRM_04_Date;
private String FRM_05_Percent,DecimalFormat;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

