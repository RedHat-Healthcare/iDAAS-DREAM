package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDD {
private String PDD_01_AssignedIdentification;
private String PDD_02_Quantity;
private String PDD_03_MonetaryAmount;
private String PDD_04_PercentageasDecimal;
private String PDD_05_ProposalDataDetailIdentifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

