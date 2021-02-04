package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OM6 {
    private String OM6_1_SequenceNumberTestObservationMasterFile;
    private String OM6_2_DerivationRule;

    public String getOM6_1_SequenceNumberTestObservationMasterFile() {
        return this.OM6_1_SequenceNumberTestObservationMasterFile;
    }

    public void setOM6_1_SequenceNumberTestObservationMasterFile(final String OM6_1_SequenceNumberTestObservationMasterFile) {
        this.OM6_1_SequenceNumberTestObservationMasterFile = OM6_1_SequenceNumberTestObservationMasterFile;
    }

    public String getOM6_2_DerivationRule() {
        return this.OM6_2_DerivationRule;
    }

    public void setOM6_2_DerivationRule(final String OM6_2_DerivationRule) {
        this.OM6_2_DerivationRule = OM6_2_DerivationRule;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

