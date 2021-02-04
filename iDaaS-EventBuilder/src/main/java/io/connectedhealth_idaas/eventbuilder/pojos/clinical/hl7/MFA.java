package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MFA {
    private String MFA_1_RecordLevelEventCode;
    private String MFA_2_MFNControlID;
    private String MFA_3_EventCompletionDateTime;
    private String MFA_4_MFNRecordLevelErrorReturn;
    private String MFA_5_PrimaryKeyValueMFA;
    private String MFA_6_PrimaryKeyValueTypeMFA;

    public String getMFA_1_RecordLevelEventCode() {
        return this.MFA_1_RecordLevelEventCode;
    }

    public void setMFA_1_RecordLevelEventCode(final String MFA_1_RecordLevelEventCode) {
        this.MFA_1_RecordLevelEventCode = MFA_1_RecordLevelEventCode;
    }

    public String getMFA_2_MFNControlID() {
        return this.MFA_2_MFNControlID;
    }

    public void setMFA_2_MFNControlID(final String MFA_2_MFNControlID) {
        this.MFA_2_MFNControlID = MFA_2_MFNControlID;
    }

    public String getMFA_3_EventCompletionDateTime() {
        return this.MFA_3_EventCompletionDateTime;
    }

    public void setMFA_3_EventCompletionDateTime(final String MFA_3_EventCompletionDateTime) {
        this.MFA_3_EventCompletionDateTime = MFA_3_EventCompletionDateTime;
    }

    public String getMFA_4_MFNRecordLevelErrorReturn() {
        return this.MFA_4_MFNRecordLevelErrorReturn;
    }

    public void setMFA_4_MFNRecordLevelErrorReturn(final String MFA_4_MFNRecordLevelErrorReturn) {
        this.MFA_4_MFNRecordLevelErrorReturn = MFA_4_MFNRecordLevelErrorReturn;
    }

    public String getMFA_5_PrimaryKeyValueMFA() {
        return this.MFA_5_PrimaryKeyValueMFA;
    }

    public void setMFA_5_PrimaryKeyValueMFA(final String MFA_5_PrimaryKeyValueMFA) {
        this.MFA_5_PrimaryKeyValueMFA = MFA_5_PrimaryKeyValueMFA;
    }

    public String getMFA_6_PrimaryKeyValueTypeMFA() {
        return this.MFA_6_PrimaryKeyValueTypeMFA;
    }

    public void setMFA_6_PrimaryKeyValueTypeMFA(final String MFA_6_PrimaryKeyValueTypeMFA) {
        this.MFA_6_PrimaryKeyValueTypeMFA = MFA_6_PrimaryKeyValueTypeMFA;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

