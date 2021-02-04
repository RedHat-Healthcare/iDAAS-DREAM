package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DOS {
private String DOS_01_ContractTypeCode;
private String DOS_02_MonetaryAmount;
private String DOS_03_PercentageasDecimal;
private String DOS_04_MonetaryAmount;
private String DOS_05_PercentageasDecimal;
private String DOS_06_EntityIdentifierCode;
private String DOS_07_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

