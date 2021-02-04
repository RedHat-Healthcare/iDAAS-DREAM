package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class STS {
private String STS_01_InterchangeActionCode;
private String STS_02_InterchangeActionDate;
private String STS_03_InterchangeActionTime;
private String STS_04_TimeCode;
private String STS_05_ErrorReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

