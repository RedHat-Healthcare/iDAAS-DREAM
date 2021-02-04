package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AIG {
    private String AIG_1_SetIDAIG;
    private String AIG_2_SegmentActionCode;
    private String AIG_3_ResourceID;
    private String AIG_4_ResourceType;
    private String AIG_5_ResourceGroup;
    private String AIG_6_ResourceQuantity;
    private String AIG_7_ResourceQuantityUnits;
    private String AIG_8_StartDateTime;
    private String AIG_9_StartDateTimeOffset;
    private String AIG_10_StartDateTimeOffsetUnits;
    private String AIG_11_Duration;
    private String AIG_12_DurationUnits;
    private String AIG_13_AllowSubstitutionCode;
    private String AIG_14_FillerStatusCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAIG_1_SetIDAIG() {
        return this.AIG_1_SetIDAIG;
    }

    public void setAIG_1_SetIDAIG(final String AIG_1_SetIDAIG) {
        this.AIG_1_SetIDAIG = AIG_1_SetIDAIG;
    }

    public String getAIG_2_SegmentActionCode() {
        return this.AIG_2_SegmentActionCode;
    }

    public void setAIG_2_SegmentActionCode(final String AIG_2_SegmentActionCode) {
        this.AIG_2_SegmentActionCode = AIG_2_SegmentActionCode;
    }

    public String getAIG_3_ResourceID() {
        return this.AIG_3_ResourceID;
    }

    public void setAIG_3_ResourceID(final String AIG_3_ResourceID) {
        this.AIG_3_ResourceID = AIG_3_ResourceID;
    }

    public String getAIG_4_ResourceType() {
        return this.AIG_4_ResourceType;
    }

    public void setAIG_4_ResourceType(final String AIG_4_ResourceType) {
        this.AIG_4_ResourceType = AIG_4_ResourceType;
    }

    public String getAIG_5_ResourceGroup() {
        return this.AIG_5_ResourceGroup;
    }

    public void setAIG_5_ResourceGroup(final String AIG_5_ResourceGroup) {
        this.AIG_5_ResourceGroup = AIG_5_ResourceGroup;
    }

    public String getAIG_6_ResourceQuantity() {
        return this.AIG_6_ResourceQuantity;
    }

    public void setAIG_6_ResourceQuantity(final String AIG_6_ResourceQuantity) {
        this.AIG_6_ResourceQuantity = AIG_6_ResourceQuantity;
    }

    public String getAIG_7_ResourceQuantityUnits() {
        return this.AIG_7_ResourceQuantityUnits;
    }

    public void setAIG_7_ResourceQuantityUnits(final String AIG_7_ResourceQuantityUnits) {
        this.AIG_7_ResourceQuantityUnits = AIG_7_ResourceQuantityUnits;
    }

    public String getAIG_8_StartDateTime() {
        return this.AIG_8_StartDateTime;
    }

    public void setAIG_8_StartDateTime(final String AIG_8_StartDateTime) {
        this.AIG_8_StartDateTime = AIG_8_StartDateTime;
    }

    public String getAIG_9_StartDateTimeOffset() {
        return this.AIG_9_StartDateTimeOffset;
    }

    public void setAIG_9_StartDateTimeOffset(final String AIG_9_StartDateTimeOffset) {
        this.AIG_9_StartDateTimeOffset = AIG_9_StartDateTimeOffset;
    }

    public String getAIG_10_StartDateTimeOffsetUnits() {
        return this.AIG_10_StartDateTimeOffsetUnits;
    }

    public void setAIG_10_StartDateTimeOffsetUnits(final String AIG_10_StartDateTimeOffsetUnits) {
        this.AIG_10_StartDateTimeOffsetUnits = AIG_10_StartDateTimeOffsetUnits;
    }

    public String getAIG_11_Duration() {
        return this.AIG_11_Duration;
    }

    public void setAIG_11_Duration(final String AIG_11_Duration) {
        this.AIG_11_Duration = AIG_11_Duration;
    }

    public String getAIG_12_DurationUnits() {
        return this.AIG_12_DurationUnits;
    }

    public void setAIG_12_DurationUnits(final String AIG_12_DurationUnits) {
        this.AIG_12_DurationUnits = AIG_12_DurationUnits;
    }

    public String getAIG_13_AllowSubstitutionCode() {
        return this.AIG_13_AllowSubstitutionCode;
    }

    public void setAIG_13_AllowSubstitutionCode(final String AIG_13_AllowSubstitutionCode) {
        this.AIG_13_AllowSubstitutionCode = AIG_13_AllowSubstitutionCode;
    }

    public String getAIG_14_FillerStatusCode() {
        return this.AIG_14_FillerStatusCode;
    }

    public void setAIG_14_FillerStatusCode(final String AIG_14_FillerStatusCode) {
        this.AIG_14_FillerStatusCode = AIG_14_FillerStatusCode;
    }
}

