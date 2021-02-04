package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFI {
    private String MFI_1_MasterFileIdentifier;
    private String MFI_2_MasterFileApplicationIdentifier;
    private String MFI_3_FileLevelEventCode;
    private String MFI_4_EnteredDateTime;
    private String MFI_5_EffectiveDateTime;
    private String MFI_6_ResponseLevelCode;

    public String getMFI_1_MasterFileIdentifier() {
        return this.MFI_1_MasterFileIdentifier;
    }

    public void setMFI_1_MasterFileIdentifier(final String MFI_1_MasterFileIdentifier) {
        this.MFI_1_MasterFileIdentifier = MFI_1_MasterFileIdentifier;
    }

    public String getMFI_2_MasterFileApplicationIdentifier() {
        return this.MFI_2_MasterFileApplicationIdentifier;
    }

    public void setMFI_2_MasterFileApplicationIdentifier(final String MFI_2_MasterFileApplicationIdentifier) {
        this.MFI_2_MasterFileApplicationIdentifier = MFI_2_MasterFileApplicationIdentifier;
    }

    public String getMFI_3_FileLevelEventCode() {
        return this.MFI_3_FileLevelEventCode;
    }

    public void setMFI_3_FileLevelEventCode(final String MFI_3_FileLevelEventCode) {
        this.MFI_3_FileLevelEventCode = MFI_3_FileLevelEventCode;
    }

    public String getMFI_4_EnteredDateTime() {
        return this.MFI_4_EnteredDateTime;
    }

    public void setMFI_4_EnteredDateTime(final String MFI_4_EnteredDateTime) {
        this.MFI_4_EnteredDateTime = MFI_4_EnteredDateTime;
    }

    public String getMFI_5_EffectiveDateTime() {
        return this.MFI_5_EffectiveDateTime;
    }

    public void setMFI_5_EffectiveDateTime(final String MFI_5_EffectiveDateTime) {
        this.MFI_5_EffectiveDateTime = MFI_5_EffectiveDateTime;
    }

    public String getMFI_6_ResponseLevelCode() {
        return this.MFI_6_ResponseLevelCode;
    }

    public void setMFI_6_ResponseLevelCode(final String MFI_6_ResponseLevelCode) {
        this.MFI_6_ResponseLevelCode = MFI_6_ResponseLevelCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

