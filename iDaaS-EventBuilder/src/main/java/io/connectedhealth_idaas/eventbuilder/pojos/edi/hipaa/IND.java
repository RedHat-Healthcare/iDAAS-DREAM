package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IND {
private String IND_01_CountryCode;
private String IND_02_StateorProvinceCode;
private String IND_03_CountyDesignator;
private String IND_04_CityName;
private String IND_05_LanguageCode;
private String IND_06_LanguageProficiencyIndicator;
private String IND_07_LanguageCode;
private String IND_08_LanguageCode;
private String IND_09_IdentificationCodeQualifier;
private String IND_10_IdentificationCode;
private String IND_11_IdentificationCodeQualifier;
private String IND_12_IdentificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

