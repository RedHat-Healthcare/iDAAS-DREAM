package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IGI {
private String IGI_01_InsurerGuarantorTypeCode;
private String IGI_02_CodeListQualifierCode;
private String IGI_03_IndustryCode;
private String IGI_04_MortgageInsuranceCoverageTypeCode;
private String IGI_05_InsurerCoverageIndicatorCode;
private String IGI_06_PayerResponsibilitySequenceNumberCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

