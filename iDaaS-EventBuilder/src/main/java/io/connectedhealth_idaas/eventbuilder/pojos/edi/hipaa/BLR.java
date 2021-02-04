package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BLR {
private String BLR_01_StandardCarrierAlphaCode;
private String BLR_02_Date;
private String BLR_03_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

