package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SHP {
private String SHP_01_QuantityQualifier;
private String SHP_02_Quantity;
private String SHP_03_DateTimeQualifier;
private String SHP_04_Date;
private String SHP_05_Time;
private String SHP_06_Date;
private String SHP_07_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

