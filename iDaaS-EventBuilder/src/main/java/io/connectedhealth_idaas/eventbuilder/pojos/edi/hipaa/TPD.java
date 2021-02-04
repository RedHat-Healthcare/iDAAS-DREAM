package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TPD {
private String TPD_01_ItemDescriptionType;
private String TPD_02_CommodityCodeQualifier;
private String TPD_03_CommodityCode;
private String TPD_04_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

