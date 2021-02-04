package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class POD {
private String POD_01_Date;
private String POD_02_Time;
private String POD_03_Name;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

