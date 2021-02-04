package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TXI {
private String TXI_01_TaxTypeCode;
private String TXI_02_MonetaryAmount;
private String TXI_03_PercentageasDecimal;
private String TXI_04_TaxJurisdictionCodeQualifier;
private String TXI_05_TaxJurisdictionCode;
private String TXI_06_TaxExemptCode;
private String TXI_07_RelationshipCode;
private String TXI_08_DollarBasisForPercent;
private String TXI_09_TaxIdentificationNumber;
private String TXI_10_AssignedIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

