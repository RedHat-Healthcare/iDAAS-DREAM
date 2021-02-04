package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HLH {
private String HLH_01_HealthRelatedCode;
private String HLH_02_Height;
private String HLH_03_Weight;
private String HLH_04_Weight;
private String HLH_05_Description;
private String HLH_06_CurrentHealthConditionCode;
private String HLH_07_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

