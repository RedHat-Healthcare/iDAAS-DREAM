package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSP {
    private String CSP_1_StudyPhaseIdentifier;
    private String CSP_2_DatetimeStudyPhaseBegan;
    private String CSP_3_DatetimeStudyPhaseEnded;
    private String CSP_4_StudyPhaseEvaluability;

    public String getCSP_1_StudyPhaseIdentifier() {
        return this.CSP_1_StudyPhaseIdentifier;
    }

    public void setCSP_1_StudyPhaseIdentifier(final String CSP_1_StudyPhaseIdentifier) {
        this.CSP_1_StudyPhaseIdentifier = CSP_1_StudyPhaseIdentifier;
    }

    public String getCSP_2_DatetimeStudyPhaseBegan() {
        return this.CSP_2_DatetimeStudyPhaseBegan;
    }

    public void setCSP_2_DatetimeStudyPhaseBegan(final String CSP_2_DatetimeStudyPhaseBegan) {
        this.CSP_2_DatetimeStudyPhaseBegan = CSP_2_DatetimeStudyPhaseBegan;
    }

    public String getCSP_3_DatetimeStudyPhaseEnded() {
        return this.CSP_3_DatetimeStudyPhaseEnded;
    }

    public void setCSP_3_DatetimeStudyPhaseEnded(final String CSP_3_DatetimeStudyPhaseEnded) {
        this.CSP_3_DatetimeStudyPhaseEnded = CSP_3_DatetimeStudyPhaseEnded;
    }

    public String getCSP_4_StudyPhaseEvaluability() {
        return this.CSP_4_StudyPhaseEvaluability;
    }

    public void setCSP_4_StudyPhaseEvaluability(final String CSP_4_StudyPhaseEvaluability) {
        this.CSP_4_StudyPhaseEvaluability = CSP_4_StudyPhaseEvaluability;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

