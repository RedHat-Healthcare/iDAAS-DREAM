package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LAN {
    private String LAN_1_SetIDLAN;
    private String LAN_2_LanguageCode;
    private String LAN_3_LanguageAbilityCode;
    private String LAN_4_LanguageProficiencyCode;

    public String getLAN_1_SetIDLAN() {
        return this.LAN_1_SetIDLAN;
    }

    public void setLAN_1_SetIDLAN(final String LAN_1_SetIDLAN) {
        this.LAN_1_SetIDLAN = LAN_1_SetIDLAN;
    }

    public String getLAN_2_LanguageCode() {
        return this.LAN_2_LanguageCode;
    }

    public void setLAN_2_LanguageCode(final String LAN_2_LanguageCode) {
        this.LAN_2_LanguageCode = LAN_2_LanguageCode;
    }

    public String getLAN_3_LanguageAbilityCode() {
        return this.LAN_3_LanguageAbilityCode;
    }

    public void setLAN_3_LanguageAbilityCode(final String LAN_3_LanguageAbilityCode) {
        this.LAN_3_LanguageAbilityCode = LAN_3_LanguageAbilityCode;
    }

    public String getLAN_4_LanguageProficiencyCode() {
        return this.LAN_4_LanguageProficiencyCode;
    }

    public void setLAN_4_LanguageProficiencyCode(final String LAN_4_LanguageProficiencyCode) {
        this.LAN_4_LanguageProficiencyCode = LAN_4_LanguageProficiencyCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

