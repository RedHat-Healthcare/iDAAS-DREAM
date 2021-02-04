package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VRC {
private String VRC_01_DateTimePeriodFormatQualifier;
private String VRC_02_DateTimePeriod;
private String VRC_03_Quantity;
private String VRC_04_RecoveryConditionCode;
private String VRC_05_RecoveryClassificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

