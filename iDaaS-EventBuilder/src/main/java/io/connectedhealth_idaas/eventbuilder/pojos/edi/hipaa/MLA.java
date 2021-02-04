package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MLA {
private String MLA_01_ReferenceIdentification;
private String MLA_02_ContractNumber;
private String MLA_03_MonetaryAmount;
private String MLA_04_Quantity;
private String MLA_05_ServiceTypeCode;
private String MLA_06_StatusCode;
private String MLA_08_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

