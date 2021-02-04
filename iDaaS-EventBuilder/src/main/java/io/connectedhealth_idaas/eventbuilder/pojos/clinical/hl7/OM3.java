package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OM3 {
    private String OM3_1_SequenceNumberTestObservationMasterFile;
    private String OM3_2_PreferredCodingSystem;
    private String OM3_3_ValidCodedAnswers;
    private String OM3_4_NormalTextCodesforCategoricalObservations;
    private String OM3_5_AbnormalTextCodesforCategoricalObservations;
    private String OM3_6_CriticalTextCodesforCategoricalObservations;
    private String OM3_7_ValueType;

    public String getOM3_1_SequenceNumberTestObservationMasterFile() {
        return this.OM3_1_SequenceNumberTestObservationMasterFile;
    }

    public void setOM3_1_SequenceNumberTestObservationMasterFile(final String OM3_1_SequenceNumberTestObservationMasterFile) {
        this.OM3_1_SequenceNumberTestObservationMasterFile = OM3_1_SequenceNumberTestObservationMasterFile;
    }

    public String getOM3_2_PreferredCodingSystem() {
        return this.OM3_2_PreferredCodingSystem;
    }

    public void setOM3_2_PreferredCodingSystem(final String OM3_2_PreferredCodingSystem) {
        this.OM3_2_PreferredCodingSystem = OM3_2_PreferredCodingSystem;
    }

    public String getOM3_3_ValidCodedAnswers() {
        return this.OM3_3_ValidCodedAnswers;
    }

    public void setOM3_3_ValidCodedAnswers(final String OM3_3_ValidCodedAnswers) {
        this.OM3_3_ValidCodedAnswers = OM3_3_ValidCodedAnswers;
    }

    public String getOM3_4_NormalTextCodesforCategoricalObservations() {
        return this.OM3_4_NormalTextCodesforCategoricalObservations;
    }

    public void setOM3_4_NormalTextCodesforCategoricalObservations(final String OM3_4_NormalTextCodesforCategoricalObservations) {
        this.OM3_4_NormalTextCodesforCategoricalObservations = OM3_4_NormalTextCodesforCategoricalObservations;
    }

    public String getOM3_5_AbnormalTextCodesforCategoricalObservations() {
        return this.OM3_5_AbnormalTextCodesforCategoricalObservations;
    }

    public void setOM3_5_AbnormalTextCodesforCategoricalObservations(final String OM3_5_AbnormalTextCodesforCategoricalObservations) {
        this.OM3_5_AbnormalTextCodesforCategoricalObservations = OM3_5_AbnormalTextCodesforCategoricalObservations;
    }

    public String getOM3_6_CriticalTextCodesforCategoricalObservations() {
        return this.OM3_6_CriticalTextCodesforCategoricalObservations;
    }

    public void setOM3_6_CriticalTextCodesforCategoricalObservations(final String OM3_6_CriticalTextCodesforCategoricalObservations) {
        this.OM3_6_CriticalTextCodesforCategoricalObservations = OM3_6_CriticalTextCodesforCategoricalObservations;
    }

    public String getOM3_7_ValueType() {
        return this.OM3_7_ValueType;
    }

    public void setOM3_7_ValueType(final String OM3_7_ValueType) {
        this.OM3_7_ValueType = OM3_7_ValueType;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

