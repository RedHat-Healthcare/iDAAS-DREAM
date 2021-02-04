package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DSC {
    private String DSC_1_ContinuationPointer;
    private String DSC_2_ContinuationStyle;

    public String getDSC_1_ContinuationPointer() {
        return this.DSC_1_ContinuationPointer;
    }

    public void setDSC_1_ContinuationPointer(final String DSC_1_ContinuationPointer) {
        this.DSC_1_ContinuationPointer = DSC_1_ContinuationPointer;
    }

    public String getDSC_2_ContinuationStyle() {
        return this.DSC_2_ContinuationStyle;
    }

    public void setDSC_2_ContinuationStyle(final String DSC_2_ContinuationStyle) {
        this.DSC_2_ContinuationStyle = DSC_2_ContinuationStyle;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

