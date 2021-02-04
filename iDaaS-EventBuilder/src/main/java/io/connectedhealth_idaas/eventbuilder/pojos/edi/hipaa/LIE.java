package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LIE {
private String LIE_01_LocationTypeCode;
private String LIE_02_ProximityCode;
private String LIE_03_Description;
private String LIE_04_EntityIdentifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

