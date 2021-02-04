package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSS {
    private String CSS_1_StudyScheduledTimePoint;
    private String CSS_2_StudyScheduledPatientTimePoint;
    private String CSS_3_StudyQualityControlCodes;

    public String getCSS_1_StudyScheduledTimePoint() {
        return this.CSS_1_StudyScheduledTimePoint;
    }

    public void setCSS_1_StudyScheduledTimePoint(final String CSS_1_StudyScheduledTimePoint) {
        this.CSS_1_StudyScheduledTimePoint = CSS_1_StudyScheduledTimePoint;
    }

    public String getCSS_2_StudyScheduledPatientTimePoint() {
        return this.CSS_2_StudyScheduledPatientTimePoint;
    }

    public void setCSS_2_StudyScheduledPatientTimePoint(final String CSS_2_StudyScheduledPatientTimePoint) {
        this.CSS_2_StudyScheduledPatientTimePoint = CSS_2_StudyScheduledPatientTimePoint;
    }

    public String getCSS_3_StudyQualityControlCodes() {
        return this.CSS_3_StudyQualityControlCodes;
    }

    public void setCSS_3_StudyQualityControlCodes(final String CSS_3_StudyQualityControlCodes) {
        this.CSS_3_StudyQualityControlCodes = CSS_3_StudyQualityControlCodes;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

