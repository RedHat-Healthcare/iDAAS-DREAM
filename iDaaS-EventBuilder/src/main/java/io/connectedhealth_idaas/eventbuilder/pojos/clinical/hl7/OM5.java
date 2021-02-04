package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OM5 {
    private String OM5_1_SequenceNumberTestObservationMasterFile;
    private String OM5_2_TestObservationsIncludedWithinanOrderedTestBattery;
    private String OM5_3_ObservationIDSuffixes;

    public String getOM5_1_SequenceNumberTestObservationMasterFile() {
        return this.OM5_1_SequenceNumberTestObservationMasterFile;
    }

    public void setOM5_1_SequenceNumberTestObservationMasterFile(final String OM5_1_SequenceNumberTestObservationMasterFile) {
        this.OM5_1_SequenceNumberTestObservationMasterFile = OM5_1_SequenceNumberTestObservationMasterFile;
    }

    public String getOM5_2_TestObservationsIncludedWithinanOrderedTestBattery() {
        return this.OM5_2_TestObservationsIncludedWithinanOrderedTestBattery;
    }

    public void setOM5_2_TestObservationsIncludedWithinanOrderedTestBattery(final String OM5_2_TestObservationsIncludedWithinanOrderedTestBattery) {
        this.OM5_2_TestObservationsIncludedWithinanOrderedTestBattery = OM5_2_TestObservationsIncludedWithinanOrderedTestBattery;
    }

    public String getOM5_3_ObservationIDSuffixes() {
        return this.OM5_3_ObservationIDSuffixes;
    }

    public void setOM5_3_ObservationIDSuffixes(final String OM5_3_ObservationIDSuffixes) {
        this.OM5_3_ObservationIDSuffixes = OM5_3_ObservationIDSuffixes;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

