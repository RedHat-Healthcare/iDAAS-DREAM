package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PBI {
private String PBI_01_ReferenceIdentification;
private String PBI_02_ActionCode;
private String PBI_03_FreeformMessageText;
private String PBI_04_TaxInformationIdentificationNumber;
private String PBI_05_Quantity;
private String PBI_06_FixedFormatInformation;
private String PBI_07_Quantity;
private String PBI_08_FixedFormatInformation;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

