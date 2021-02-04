package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RDT {
    private String RDT_1_ColumnValue;

    public String getRDT_1_ColumnValue() {
        return this.RDT_1_ColumnValue;
    }

    public void setRDT_1_ColumnValue(final String RDT_1_ColumnValue) {
        this.RDT_1_ColumnValue = RDT_1_ColumnValue;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

