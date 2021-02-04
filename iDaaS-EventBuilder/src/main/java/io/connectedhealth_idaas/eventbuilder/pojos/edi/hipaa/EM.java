package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EM {
private String EM_01_WeightUnitCode;
private String EM_02_Weight;
private String EM_03_VolumeUnitQualifier;
private String EM_04_Volume;
private String EM_05_CountryCode;
private String EM_06_ConstructionType;
private String EM_07_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

