package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFE {
    private String MFE_1_RecordLevelEventCode;
    private String MFE_2_MFNControlID;
    private String MFE_3_EffectiveDateTime;
    private String MFE_4_PrimaryKeyValueMFE;
    private String MFE_5_PrimaryKeyValueType;
    private String MFE_6_EnteredDateTime;
    private String MFE_7_EnteredBy;

    public String getMFE_1_RecordLevelEventCode() {
        return this.MFE_1_RecordLevelEventCode;
    }

    public void setMFE_1_RecordLevelEventCode(final String MFE_1_RecordLevelEventCode) {
        this.MFE_1_RecordLevelEventCode = MFE_1_RecordLevelEventCode;
    }

    public String getMFE_2_MFNControlID() {
        return this.MFE_2_MFNControlID;
    }

    public void setMFE_2_MFNControlID(final String MFE_2_MFNControlID) {
        this.MFE_2_MFNControlID = MFE_2_MFNControlID;
    }

    public String getMFE_3_EffectiveDateTime() {
        return this.MFE_3_EffectiveDateTime;
    }

    public void setMFE_3_EffectiveDateTime(final String MFE_3_EffectiveDateTime) {
        this.MFE_3_EffectiveDateTime = MFE_3_EffectiveDateTime;
    }

    public String getMFE_4_PrimaryKeyValueMFE() {
        return this.MFE_4_PrimaryKeyValueMFE;
    }

    public void setMFE_4_PrimaryKeyValueMFE(final String MFE_4_PrimaryKeyValueMFE) {
        this.MFE_4_PrimaryKeyValueMFE = MFE_4_PrimaryKeyValueMFE;
    }

    public String getMFE_5_PrimaryKeyValueType() {
        return this.MFE_5_PrimaryKeyValueType;
    }

    public void setMFE_5_PrimaryKeyValueType(final String MFE_5_PrimaryKeyValueType) {
        this.MFE_5_PrimaryKeyValueType = MFE_5_PrimaryKeyValueType;
    }

    public String getMFE_6_EnteredDateTime() {
        return this.MFE_6_EnteredDateTime;
    }

    public void setMFE_6_EnteredDateTime(final String MFE_6_EnteredDateTime) {
        this.MFE_6_EnteredDateTime = MFE_6_EnteredDateTime;
    }

    public String getMFE_7_EnteredBy() {
        return this.MFE_7_EnteredBy;
    }

    public void setMFE_7_EnteredBy(final String MFE_7_EnteredBy) {
        this.MFE_7_EnteredBy = MFE_7_EnteredBy;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

