package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IDC {
private String IDC_01_PlanCoverageDescription;
private String IDC_02_IdentificationCardTypeCode;
private String IDC_03_Quantity;
private String IDC_04_ActionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

