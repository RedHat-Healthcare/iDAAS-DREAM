package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AIS {
    private String AIS_1_SetIDAIS;
    private String AIS_2_SegmentActionCode;
    private String AIS_3_UniversalServiceIdentifier;
    private String AIS_4_StartDateTime;
    private String AIS_5_StartDateTimeOffset;
    private String AIS_6_StartDateTimeOffsetUnits;
    private String AIS_7_Duration;
    private String AIS_8_DurationUnits;
    private String AIS_9_AllowSubstitutionCode;
    private String AIS_10_FillerStatusCode;
    private String AIS_11_PlacerSupplementalServiceInformation;
    private String AIS_12_FillerSupplementalServiceInformation;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAIS_1_SetIDAIS() {
        return this.AIS_1_SetIDAIS;
    }

    public void setAIS_1_SetIDAIS(final String AIS_1_SetIDAIS) {
        this.AIS_1_SetIDAIS = AIS_1_SetIDAIS;
    }

    public String getAIS_2_SegmentActionCode() {
        return this.AIS_2_SegmentActionCode;
    }

    public void setAIS_2_SegmentActionCode(final String AIS_2_SegmentActionCode) {
        this.AIS_2_SegmentActionCode = AIS_2_SegmentActionCode;
    }

    public String getAIS_3_UniversalServiceIdentifier() {
        return this.AIS_3_UniversalServiceIdentifier;
    }

    public void setAIS_3_UniversalServiceIdentifier(final String AIS_3_UniversalServiceIdentifier) {
        this.AIS_3_UniversalServiceIdentifier = AIS_3_UniversalServiceIdentifier;
    }

    public String getAIS_4_StartDateTime() {
        return this.AIS_4_StartDateTime;
    }

    public void setAIS_4_StartDateTime(final String AIS_4_StartDateTime) {
        this.AIS_4_StartDateTime = AIS_4_StartDateTime;
    }

    public String getAIS_5_StartDateTimeOffset() {
        return this.AIS_5_StartDateTimeOffset;
    }

    public void setAIS_5_StartDateTimeOffset(final String AIS_5_StartDateTimeOffset) {
        this.AIS_5_StartDateTimeOffset = AIS_5_StartDateTimeOffset;
    }

    public String getAIS_6_StartDateTimeOffsetUnits() {
        return this.AIS_6_StartDateTimeOffsetUnits;
    }

    public void setAIS_6_StartDateTimeOffsetUnits(final String AIS_6_StartDateTimeOffsetUnits) {
        this.AIS_6_StartDateTimeOffsetUnits = AIS_6_StartDateTimeOffsetUnits;
    }

    public String getAIS_7_Duration() {
        return this.AIS_7_Duration;
    }

    public void setAIS_7_Duration(final String AIS_7_Duration) {
        this.AIS_7_Duration = AIS_7_Duration;
    }

    public String getAIS_8_DurationUnits() {
        return this.AIS_8_DurationUnits;
    }

    public void setAIS_8_DurationUnits(final String AIS_8_DurationUnits) {
        this.AIS_8_DurationUnits = AIS_8_DurationUnits;
    }

    public String getAIS_9_AllowSubstitutionCode() {
        return this.AIS_9_AllowSubstitutionCode;
    }

    public void setAIS_9_AllowSubstitutionCode(final String AIS_9_AllowSubstitutionCode) {
        this.AIS_9_AllowSubstitutionCode = AIS_9_AllowSubstitutionCode;
    }

    public String getAIS_10_FillerStatusCode() {
        return this.AIS_10_FillerStatusCode;
    }

    public void setAIS_10_FillerStatusCode(final String AIS_10_FillerStatusCode) {
        this.AIS_10_FillerStatusCode = AIS_10_FillerStatusCode;
    }

    public String getAIS_11_PlacerSupplementalServiceInformation() {
        return this.AIS_11_PlacerSupplementalServiceInformation;
    }

    public void setAIS_11_PlacerSupplementalServiceInformation(final String AIS_11_PlacerSupplementalServiceInformation) {
        this.AIS_11_PlacerSupplementalServiceInformation = AIS_11_PlacerSupplementalServiceInformation;
    }

    public String getAIS_12_FillerSupplementalServiceInformation() {
        return this.AIS_12_FillerSupplementalServiceInformation;
    }

    public void setAIS_12_FillerSupplementalServiceInformation(final String AIS_12_FillerSupplementalServiceInformation) {
        this.AIS_12_FillerSupplementalServiceInformation = AIS_12_FillerSupplementalServiceInformation;
    }
}

