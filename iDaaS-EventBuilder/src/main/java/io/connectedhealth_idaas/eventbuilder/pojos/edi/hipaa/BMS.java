package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BMS {
private String BMS_01_TransactionSetPurposeCode;
private String BMS_02_Date;
private String BMS_03_LanguageCode;
private String BMS_04_ReferenceIdentification;
private String BMS_05_RevisionValue;
private String BMS_06_ReferenceIdentification;
private String BMS_07_RevisionValue;
private String BMS_08_StateorProvinceCode;
private String BMS_09_CountryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

