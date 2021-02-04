package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISD {
private String ISD_01_StandardCarrierAlphaCode;
private String ISD_02_StandardPointLocationCode;
private String ISD_03_EventCode;
private String ISD_04_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

