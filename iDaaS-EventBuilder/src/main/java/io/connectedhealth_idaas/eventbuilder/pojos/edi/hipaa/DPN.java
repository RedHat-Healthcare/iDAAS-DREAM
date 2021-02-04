package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DPN {
private String DPN_01_Number;
private String DPN_02_MaritalStatusCode;
private String DPN_03_EmploymentStatusCode;
private String DPN_04_Number;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

