package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ID {
private String ID_01_DamageAreaCode;
private String ID_02_DamageTypeCode;
private String ID_03_DamageSeverityCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

