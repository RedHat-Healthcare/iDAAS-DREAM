package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDI {
private String PDI_01_GenderCode;
private String PDI_02_RangeMinimum;
private String PDI_03_RangeMaximum;
private String PDI_04_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

