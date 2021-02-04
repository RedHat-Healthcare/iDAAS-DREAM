package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DN {
private String DN_01_DateQualifier;
private String DN_02_Date;
private String DN_03_DemandArea;
private String DN_04_FinancialStatus;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

