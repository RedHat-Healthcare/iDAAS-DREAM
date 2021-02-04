package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDT {
private String RDT_01_RevisionLevelCode;
private String RDT_02_RevisionValue;
private String RDT_03_DateTimeQualifier;
private String RDT_04_Date;
private String RDT_05_Time;
private String RDT_06_TimeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

