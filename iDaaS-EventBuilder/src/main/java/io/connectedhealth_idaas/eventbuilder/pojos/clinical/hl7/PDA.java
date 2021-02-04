package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDA {
    private String PDA_1_DeathCauseCode;
    private String PDA_2_DeathLocation;
    private String PDA_3_DeathCertifiedIndicator;
    private String PDA_4_DeathCertificateSignedDateTime;
    private String PDA_5_DeathCertifiedBy;
    private String PDA_6_AutopsyIndicator;
    private String PDA_7_AutopsyStartandEndDateTime;
    private String PDA_8_AutopsyPerformedBy;
    private String PDA_9_CoronerIndicator;

    public String getPDA_1_DeathCauseCode() {
        return this.PDA_1_DeathCauseCode;
    }

    public void setPDA_1_DeathCauseCode(final String PDA_1_DeathCauseCode) {
        this.PDA_1_DeathCauseCode = PDA_1_DeathCauseCode;
    }

    public String getPDA_2_DeathLocation() {
        return this.PDA_2_DeathLocation;
    }

    public void setPDA_2_DeathLocation(final String PDA_2_DeathLocation) {
        this.PDA_2_DeathLocation = PDA_2_DeathLocation;
    }

    public String getPDA_3_DeathCertifiedIndicator() {
        return this.PDA_3_DeathCertifiedIndicator;
    }

    public void setPDA_3_DeathCertifiedIndicator(final String PDA_3_DeathCertifiedIndicator) {
        this.PDA_3_DeathCertifiedIndicator = PDA_3_DeathCertifiedIndicator;
    }

    public String getPDA_4_DeathCertificateSignedDateTime() {
        return this.PDA_4_DeathCertificateSignedDateTime;
    }

    public void setPDA_4_DeathCertificateSignedDateTime(final String PDA_4_DeathCertificateSignedDateTime) {
        this.PDA_4_DeathCertificateSignedDateTime = PDA_4_DeathCertificateSignedDateTime;
    }

    public String getPDA_5_DeathCertifiedBy() {
        return this.PDA_5_DeathCertifiedBy;
    }

    public void setPDA_5_DeathCertifiedBy(final String PDA_5_DeathCertifiedBy) {
        this.PDA_5_DeathCertifiedBy = PDA_5_DeathCertifiedBy;
    }

    public String getPDA_6_AutopsyIndicator() {
        return this.PDA_6_AutopsyIndicator;
    }

    public void setPDA_6_AutopsyIndicator(final String PDA_6_AutopsyIndicator) {
        this.PDA_6_AutopsyIndicator = PDA_6_AutopsyIndicator;
    }

    public String getPDA_7_AutopsyStartandEndDateTime() {
        return this.PDA_7_AutopsyStartandEndDateTime;
    }

    public void setPDA_7_AutopsyStartandEndDateTime(final String PDA_7_AutopsyStartandEndDateTime) {
        this.PDA_7_AutopsyStartandEndDateTime = PDA_7_AutopsyStartandEndDateTime;
    }

    public String getPDA_8_AutopsyPerformedBy() {
        return this.PDA_8_AutopsyPerformedBy;
    }

    public void setPDA_8_AutopsyPerformedBy(final String PDA_8_AutopsyPerformedBy) {
        this.PDA_8_AutopsyPerformedBy = PDA_8_AutopsyPerformedBy;
    }

    public String getPDA_9_CoronerIndicator() {
        return this.PDA_9_CoronerIndicator;
    }

    public void setPDA_9_CoronerIndicator(final String PDA_9_CoronerIndicator) {
        this.PDA_9_CoronerIndicator = PDA_9_CoronerIndicator;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

