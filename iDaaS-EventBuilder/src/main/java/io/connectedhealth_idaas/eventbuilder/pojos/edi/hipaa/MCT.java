package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MCT {
private String MCT_01_SpecialChargeorAllowanceCode;
private String MCT_02_TariffValueCode;
private String MCT_03_RangeMinimum;
private String MCT_04_RangeMaximum;
private String MCT_05_RateValueQualifier;
private String MCT_06_Rate;
private String MCT_07_TariffReferenceFlag;
private String MCT_08_SpecialChargeDescription;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

