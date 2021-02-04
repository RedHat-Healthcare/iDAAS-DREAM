package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PPA {
private String PPA_01_LocationQualifier;
private String PPA_02_LocationIdentifier;
private String PPA_03_LongitudeCode;
private String PPA_04_DirectionIdentifierCode;
private String PPA_05_LatitudeCode;
private String PPA_06_DirectionIdentifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

