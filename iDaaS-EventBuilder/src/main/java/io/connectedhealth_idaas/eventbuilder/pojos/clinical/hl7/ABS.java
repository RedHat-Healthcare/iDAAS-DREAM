package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ABS {
    private String ABS_1_DischargeCareProvider;
    private String ABS_2_TransferMedicalServiceCode;
    private String ABS_3_SeverityofIllnessCode;
    private String ABS_4_DateTimeofAttestation;
    private String ABS_5_AttestedBy;
    private String ABS_6_TriageCode;
    private String ABS_7_AbstractCompletionDateTime;
    private String ABS_8_AbstractedBy;

    public String getABS_1_DischargeCareProvider() {
        return this.ABS_1_DischargeCareProvider;
    }

    public void setABS_1_DischargeCareProvider(final String ABS_1_DischargeCareProvider) {
        this.ABS_1_DischargeCareProvider = ABS_1_DischargeCareProvider;
    }

    public String getABS_2_TransferMedicalServiceCode() {
        return this.ABS_2_TransferMedicalServiceCode;
    }

    public void setABS_2_TransferMedicalServiceCode(final String ABS_2_TransferMedicalServiceCode) {
        this.ABS_2_TransferMedicalServiceCode = ABS_2_TransferMedicalServiceCode;
    }

    public String getABS_3_SeverityofIllnessCode() {
        return this.ABS_3_SeverityofIllnessCode;
    }

    public void setABS_3_SeverityofIllnessCode(final String ABS_3_SeverityofIllnessCode) {
        this.ABS_3_SeverityofIllnessCode = ABS_3_SeverityofIllnessCode;
    }

    public String getABS_4_DateTimeofAttestation() {
        return this.ABS_4_DateTimeofAttestation;
    }

    public void setABS_4_DateTimeofAttestation(final String ABS_4_DateTimeofAttestation) {
        this.ABS_4_DateTimeofAttestation = ABS_4_DateTimeofAttestation;
    }

    public String getABS_5_AttestedBy() {
        return this.ABS_5_AttestedBy;
    }

    public void setABS_5_AttestedBy(final String ABS_5_AttestedBy) {
        this.ABS_5_AttestedBy = ABS_5_AttestedBy;
    }

    public String getABS_6_TriageCode() {
        return this.ABS_6_TriageCode;
    }

    public void setABS_6_TriageCode(final String ABS_6_TriageCode) {
        this.ABS_6_TriageCode = ABS_6_TriageCode;
    }

    public String getABS_7_AbstractCompletionDateTime() {
        return this.ABS_7_AbstractCompletionDateTime;
    }

    public void setABS_7_AbstractCompletionDateTime(final String ABS_7_AbstractCompletionDateTime) {
        this.ABS_7_AbstractCompletionDateTime = ABS_7_AbstractCompletionDateTime;
    }

    public String getABS_8_AbstractedBy() {
        return this.ABS_8_AbstractedBy;
    }

    public void setABS_8_AbstractedBy(final String ABS_8_AbstractedBy) {
        this.ABS_8_AbstractedBy = ABS_8_AbstractedBy;
    }

    public String getABS_9_CaseCategoryCode() {
        return this.ABS_9_CaseCategoryCode;
    }

    public void setABS_9_CaseCategoryCode(final String ABS_9_CaseCategoryCode) {
        this.ABS_9_CaseCategoryCode = ABS_9_CaseCategoryCode;
    }

    public String getABS_10_CaesarianSectionIndicator() {
        return this.ABS_10_CaesarianSectionIndicator;
    }

    public void setABS_10_CaesarianSectionIndicator(final String ABS_10_CaesarianSectionIndicator) {
        this.ABS_10_CaesarianSectionIndicator = ABS_10_CaesarianSectionIndicator;
    }

    public String getABS_11_GestationCategoryCode() {
        return this.ABS_11_GestationCategoryCode;
    }

    public void setABS_11_GestationCategoryCode(final String ABS_11_GestationCategoryCode) {
        this.ABS_11_GestationCategoryCode = ABS_11_GestationCategoryCode;
    }

    public String getABS_12_GestationPeriodWeeks() {
        return this.ABS_12_GestationPeriodWeeks;
    }

    public void setABS_12_GestationPeriodWeeks(final String ABS_12_GestationPeriodWeeks) {
        this.ABS_12_GestationPeriodWeeks = ABS_12_GestationPeriodWeeks;
    }

    public String getABS_13_NewbornCode() {
        return this.ABS_13_NewbornCode;
    }

    public void setABS_13_NewbornCode(final String ABS_13_NewbornCode) {
        this.ABS_13_NewbornCode = ABS_13_NewbornCode;
    }

    public String getABS_14_StillbornIndicator() {
        return this.ABS_14_StillbornIndicator;
    }

    public void setABS_14_StillbornIndicator(final String ABS_14_StillbornIndicator) {
        this.ABS_14_StillbornIndicator = ABS_14_StillbornIndicator;
    }

    private String ABS_9_CaseCategoryCode;
    private String ABS_10_CaesarianSectionIndicator;
    private String ABS_11_GestationCategoryCode;
    private String ABS_12_GestationPeriodWeeks;
    private String ABS_13_NewbornCode;
    private String ABS_14_StillbornIndicator;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

