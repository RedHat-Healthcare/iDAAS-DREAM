package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LOD {
private String LOD_01_GeneralTerritoryCode;
private String LOD_02_ConditionIndicator;
private String LOD_03_FreeformInformation;
private String LOD_04_ThoroughfareTypeQualifier;
private String LOD_05_ThoroughfareTypeCode;
private String LOD_06_FreeformInformation;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

