package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MLS {
private String MLS_01_MilestoneNumberIdentification;
private String MLS_02_Description;
private String MLS_03_WorkStatusCode;
private String MLS_04_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

