package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSI {
private String CSI_01_ClaimSubmissionReasonCode;
private String CSI_02_DateTimeQualifier;
private String CSI_03_DateTimePeriodFormatQualifier;
private String CSI_04_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

