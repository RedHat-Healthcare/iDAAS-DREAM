package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class COB {
private String COB_01_PayerResponsibilitySequenceNumberCode;
private String COB_02_ReferenceIdentification;
private String COB_03_CoordinationofBenefitsCode;
private String COB_04_ServiceTypeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

