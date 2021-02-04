package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class QRI {
    private String QRI_1_CandidateConfidence;
    private String QRI_2_MatchReasonCode;
    private String QRI_3_AlgorithmDescriptor;

    public String getQRI_1_CandidateConfidence() {
        return this.QRI_1_CandidateConfidence;
    }

    public void setQRI_1_CandidateConfidence(final String QRI_1_CandidateConfidence) {
        this.QRI_1_CandidateConfidence = QRI_1_CandidateConfidence;
    }

    public String getQRI_2_MatchReasonCode() {
        return this.QRI_2_MatchReasonCode;
    }

    public void setQRI_2_MatchReasonCode(final String QRI_2_MatchReasonCode) {
        this.QRI_2_MatchReasonCode = QRI_2_MatchReasonCode;
    }

    public String getQRI_3_AlgorithmDescriptor() {
        return this.QRI_3_AlgorithmDescriptor;
    }

    public void setQRI_3_AlgorithmDescriptor(final String QRI_3_AlgorithmDescriptor) {
        this.QRI_3_AlgorithmDescriptor = QRI_3_AlgorithmDescriptor;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

