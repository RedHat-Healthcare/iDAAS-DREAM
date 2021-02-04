package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LUI {
private String LUI_01_IdentificationCodeQualifier;
private String LUI_02_IdentificationCode;
private String LUI_03_Description;
private String LUI_04_UseofLanguageIndicator;
private String LUI_05_LanguageProficiencyIndicator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

