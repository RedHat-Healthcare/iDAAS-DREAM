package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CTI {
    private String CTI_1_SponsorStudyID;
    private String CTI_2_StudyPhaseIdentifier;
    private String CTI_3_StudyScheduledTimePoint;

    public String getCTI_1_SponsorStudyID() {
        return this.CTI_1_SponsorStudyID;
    }

    public void setCTI_1_SponsorStudyID(final String CTI_1_SponsorStudyID) {
        this.CTI_1_SponsorStudyID = CTI_1_SponsorStudyID;
    }

    public String getCTI_2_StudyPhaseIdentifier() {
        return this.CTI_2_StudyPhaseIdentifier;
    }

    public void setCTI_2_StudyPhaseIdentifier(final String CTI_2_StudyPhaseIdentifier) {
        this.CTI_2_StudyPhaseIdentifier = CTI_2_StudyPhaseIdentifier;
    }

    public String getCTI_3_StudyScheduledTimePoint() {
        return this.CTI_3_StudyScheduledTimePoint;
    }

    public void setCTI_3_StudyScheduledTimePoint(final String CTI_3_StudyScheduledTimePoint) {
        this.CTI_3_StudyScheduledTimePoint = CTI_3_StudyScheduledTimePoint;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

