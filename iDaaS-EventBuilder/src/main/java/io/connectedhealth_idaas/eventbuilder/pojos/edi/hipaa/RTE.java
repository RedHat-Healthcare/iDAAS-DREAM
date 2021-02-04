package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RTE {
private String RTE_01_RateQualifier;
private String RTE_02_InterestRate;
private String RTE_03_MonetaryAmount;
private String RTE_04_Number;
private String RTE_05_Number;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

