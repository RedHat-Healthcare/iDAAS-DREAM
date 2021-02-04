package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IM {
private String IM_01_WaterMovementCode;
private String IM_02_SpecialHandlingCode;
private String IM_03_InlandTransportationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

