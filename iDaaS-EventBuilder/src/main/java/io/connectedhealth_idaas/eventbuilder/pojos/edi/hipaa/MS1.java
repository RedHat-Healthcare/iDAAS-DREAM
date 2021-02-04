package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MS1 {
private String MS1_01_CityName;
private String MS1_02_StateorProvinceCode;
private String MS1_03_CountryCode;
private String MS1_04_LongitudeCode;
private String MS1_05_LatitudeCode;
private String MS1_06_DirectionIdentifierCode;
private String MS1_07_DirectionIdentifierCode;
private String MS1_08_PostalCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

