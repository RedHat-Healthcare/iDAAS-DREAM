package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CMA {
private String CMA_01_TransactionTypeCode;
private String CMA_02_ReferenceIdentificationQualifier;
private String CMA_03_ReferenceIdentification;
private String CMA_04_Date;
private String CMA_05_Week;
private String CMA_06_MarketAreaCodeQualifier;
private String CMA_07_MarketAreaCodeIdentifier;
private String CMA_08_CurrencyCode;
private String CMA_09_MarketProfile;
private String CMA_10_ContractNumber;
private String CMA_11_TransactionSetPurposeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

