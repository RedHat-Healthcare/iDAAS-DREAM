package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CN1 {
private String CN1_01_ContractTypeCode;
private String CN1_02_MonetaryAmount;
private String CN1_03_Percent,DecimalFormat;
private String CN1_04_ReferenceIdentification;
private String CN1_05_TermsDiscountPercent;
private String CN1_06_VersionIdentifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

