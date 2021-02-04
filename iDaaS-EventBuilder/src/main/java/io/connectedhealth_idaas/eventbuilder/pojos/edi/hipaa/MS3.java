package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MS3 {
private String MS3_01_StandardCarrierAlphaCode;
private String MS3_02_RoutingSequenceCode;
private String MS3_03_CityName;
private String MS3_04_TransportationMethodTypeCode;
private String MS3_05_StateorProvinceCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

