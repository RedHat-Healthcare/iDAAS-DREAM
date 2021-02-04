package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AIP {
    private String AIP_1_SetIDAIP;
    private String AIP_2_SegmentActionCode;
    private String AIP_3_PersonnelResourceID;
    private String AIP_4_ResourceType;
    private String AIP_5_ResourceGroup;
    private String AIP_6_StartDateTime;
    private String AIP_7_StartDateTimeOffset;
    private String AIP_8_StartDateTimeOffsetUnits;
    private String AIP_9_Duration;
    private String AIP_10_DurationUnits;
    private String AIP_11_AllowSubstitutionCode;
    private String AIP_12_FillerStatusCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAIP_1_SetIDAIP() {
        return this.AIP_1_SetIDAIP;
    }

    public void setAIP_1_SetIDAIP(final String AIP_1_SetIDAIP) {
        this.AIP_1_SetIDAIP = AIP_1_SetIDAIP;
    }

    public String getAIP_2_SegmentActionCode() {
        return this.AIP_2_SegmentActionCode;
    }

    public void setAIP_2_SegmentActionCode(final String AIP_2_SegmentActionCode) {
        this.AIP_2_SegmentActionCode = AIP_2_SegmentActionCode;
    }

    public String getAIP_3_PersonnelResourceID() {
        return this.AIP_3_PersonnelResourceID;
    }

    public void setAIP_3_PersonnelResourceID(final String AIP_3_PersonnelResourceID) {
        this.AIP_3_PersonnelResourceID = AIP_3_PersonnelResourceID;
    }

    public String getAIP_4_ResourceType() {
        return this.AIP_4_ResourceType;
    }

    public void setAIP_4_ResourceType(final String AIP_4_ResourceType) {
        this.AIP_4_ResourceType = AIP_4_ResourceType;
    }

    public String getAIP_5_ResourceGroup() {
        return this.AIP_5_ResourceGroup;
    }

    public void setAIP_5_ResourceGroup(final String AIP_5_ResourceGroup) {
        this.AIP_5_ResourceGroup = AIP_5_ResourceGroup;
    }

    public String getAIP_6_StartDateTime() {
        return this.AIP_6_StartDateTime;
    }

    public void setAIP_6_StartDateTime(final String AIP_6_StartDateTime) {
        this.AIP_6_StartDateTime = AIP_6_StartDateTime;
    }

    public String getAIP_7_StartDateTimeOffset() {
        return this.AIP_7_StartDateTimeOffset;
    }

    public void setAIP_7_StartDateTimeOffset(final String AIP_7_StartDateTimeOffset) {
        this.AIP_7_StartDateTimeOffset = AIP_7_StartDateTimeOffset;
    }

    public String getAIP_8_StartDateTimeOffsetUnits() {
        return this.AIP_8_StartDateTimeOffsetUnits;
    }

    public void setAIP_8_StartDateTimeOffsetUnits(final String AIP_8_StartDateTimeOffsetUnits) {
        this.AIP_8_StartDateTimeOffsetUnits = AIP_8_StartDateTimeOffsetUnits;
    }

    public String getAIP_9_Duration() {
        return this.AIP_9_Duration;
    }

    public void setAIP_9_Duration(final String AIP_9_Duration) {
        this.AIP_9_Duration = AIP_9_Duration;
    }

    public String getAIP_10_DurationUnits() {
        return this.AIP_10_DurationUnits;
    }

    public void setAIP_10_DurationUnits(final String AIP_10_DurationUnits) {
        this.AIP_10_DurationUnits = AIP_10_DurationUnits;
    }

    public String getAIP_11_AllowSubstitutionCode() {
        return this.AIP_11_AllowSubstitutionCode;
    }

    public void setAIP_11_AllowSubstitutionCode(final String AIP_11_AllowSubstitutionCode) {
        this.AIP_11_AllowSubstitutionCode = AIP_11_AllowSubstitutionCode;
    }

    public String getAIP_12_FillerStatusCode() {
        return this.AIP_12_FillerStatusCode;
    }

    public void setAIP_12_FillerStatusCode(final String AIP_12_FillerStatusCode) {
        this.AIP_12_FillerStatusCode = AIP_12_FillerStatusCode;
    }
}

