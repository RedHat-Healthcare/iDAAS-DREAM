package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DTP {
private String DTP_01_DateTimeQualifier;
private String DTP_02_DateTimePeriodFormatQualifier;
private String DTP_03_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

