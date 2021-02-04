package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AIL {
    private String AIL_1_SetIDAIL;
    private String AIL_2_SegmentActionCode;
    private String AIL_3_LocationResourceID;
    private String AIL_4_LocationTypeAIL;
    private String AIL_5_LocationGroup;
    private String AIL_6_StartDateTime;
    private String AIL_7_StartDateTimeOffset;
    private String AIL_8_StartDateTimeOffsetUnits;
    private String AIL_9_Duration;
    private String AIL_10_DurationUnits;
    private String AIL_11_AllowSubstitutionCode;
    private String AIL_12_FillerStatusCode;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAIL_1_SetIDAIL() {
        return this.AIL_1_SetIDAIL;
    }

    public void setAIL_1_SetIDAIL(final String AIL_1_SetIDAIL) {
        this.AIL_1_SetIDAIL = AIL_1_SetIDAIL;
    }

    public String getAIL_2_SegmentActionCode() {
        return this.AIL_2_SegmentActionCode;
    }

    public void setAIL_2_SegmentActionCode(final String AIL_2_SegmentActionCode) {
        this.AIL_2_SegmentActionCode = AIL_2_SegmentActionCode;
    }

    public String getAIL_3_LocationResourceID() {
        return this.AIL_3_LocationResourceID;
    }

    public void setAIL_3_LocationResourceID(final String AIL_3_LocationResourceID) {
        this.AIL_3_LocationResourceID = AIL_3_LocationResourceID;
    }

    public String getAIL_4_LocationTypeAIL() {
        return this.AIL_4_LocationTypeAIL;
    }

    public void setAIL_4_LocationTypeAIL(final String AIL_4_LocationTypeAIL) {
        this.AIL_4_LocationTypeAIL = AIL_4_LocationTypeAIL;
    }

    public String getAIL_5_LocationGroup() {
        return this.AIL_5_LocationGroup;
    }

    public void setAIL_5_LocationGroup(final String AIL_5_LocationGroup) {
        this.AIL_5_LocationGroup = AIL_5_LocationGroup;
    }

    public String getAIL_6_StartDateTime() {
        return this.AIL_6_StartDateTime;
    }

    public void setAIL_6_StartDateTime(final String AIL_6_StartDateTime) {
        this.AIL_6_StartDateTime = AIL_6_StartDateTime;
    }

    public String getAIL_7_StartDateTimeOffset() {
        return this.AIL_7_StartDateTimeOffset;
    }

    public void setAIL_7_StartDateTimeOffset(final String AIL_7_StartDateTimeOffset) {
        this.AIL_7_StartDateTimeOffset = AIL_7_StartDateTimeOffset;
    }

    public String getAIL_8_StartDateTimeOffsetUnits() {
        return this.AIL_8_StartDateTimeOffsetUnits;
    }

    public void setAIL_8_StartDateTimeOffsetUnits(final String AIL_8_StartDateTimeOffsetUnits) {
        this.AIL_8_StartDateTimeOffsetUnits = AIL_8_StartDateTimeOffsetUnits;
    }

    public String getAIL_9_Duration() {
        return this.AIL_9_Duration;
    }

    public void setAIL_9_Duration(final String AIL_9_Duration) {
        this.AIL_9_Duration = AIL_9_Duration;
    }

    public String getAIL_10_DurationUnits() {
        return this.AIL_10_DurationUnits;
    }

    public void setAIL_10_DurationUnits(final String AIL_10_DurationUnits) {
        this.AIL_10_DurationUnits = AIL_10_DurationUnits;
    }

    public String getAIL_11_AllowSubstitutionCode() {
        return this.AIL_11_AllowSubstitutionCode;
    }

    public void setAIL_11_AllowSubstitutionCode(final String AIL_11_AllowSubstitutionCode) {
        this.AIL_11_AllowSubstitutionCode = AIL_11_AllowSubstitutionCode;
    }

    public String getAIL_12_FillerStatusCode() {
        return this.AIL_12_FillerStatusCode;
    }

    public void setAIL_12_FillerStatusCode(final String AIL_12_FillerStatusCode) {
        this.AIL_12_FillerStatusCode = AIL_12_FillerStatusCode;
    }
}

