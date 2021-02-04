package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CRV {
private String CRV_01_NetCostCode;
private String CRV_02_Amount;
private String CRV_03_CountryCode;
private String CRV_04_ProductProcessCharacteristicCode;
private String CRV_05_Percent,IntegerFormat;
private String CRV_06_CertificationClauseCode;
private String CRV_07_PreferentialDutyCriteriaCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

