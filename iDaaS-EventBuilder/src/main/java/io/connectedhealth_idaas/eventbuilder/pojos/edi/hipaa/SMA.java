package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SMA {
private String SMA_01_AddressTypeCode;
private String SMA_02_AddressInformation;
private String SMA_03_CityName;
private String SMA_04_StateorProvinceCode;
private String SMA_05_PostalCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

