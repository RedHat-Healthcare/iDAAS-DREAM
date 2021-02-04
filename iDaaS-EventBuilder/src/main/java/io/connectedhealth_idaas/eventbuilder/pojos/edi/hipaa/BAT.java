package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BAT {
private String BAT_01_Date;
private String BAT_02_Time;
private String BAT_03_ReferenceIdentification;
private String BAT_04_BatchTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

