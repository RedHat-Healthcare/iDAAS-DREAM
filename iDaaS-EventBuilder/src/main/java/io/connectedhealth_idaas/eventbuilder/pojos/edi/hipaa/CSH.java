package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSH {
private String CSH_01_SalesRequirementCode;
private String CSH_02_ActionCode;
private String CSH_03_Amount;
private String CSH_04_AccountNumber;
private String CSH_05_Date;
private String CSH_06_AgencyQualifierCode;
private String CSH_07_SpecialServicesCode;
private String CSH_08_ProductServiceSubstitutionCode;
private String CSH_09_PercentageasDecimal;
private String CSH_10_PercentQualifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

