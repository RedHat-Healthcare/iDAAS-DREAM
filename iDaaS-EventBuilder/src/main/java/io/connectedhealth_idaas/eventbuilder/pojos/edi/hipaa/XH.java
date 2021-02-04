package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class XH {
private String XH_01_CurrencyCode;
private String XH_02_RelatedCompanyIndicationCode;
private String XH_03_SpecialChargeorAllowanceCode;
private String XH_04_Amount;
private String XH_05_Block20Code;
private String XH_06_ChemicalAnalysisPercentage;
private String XH_07_UnitPrice;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

