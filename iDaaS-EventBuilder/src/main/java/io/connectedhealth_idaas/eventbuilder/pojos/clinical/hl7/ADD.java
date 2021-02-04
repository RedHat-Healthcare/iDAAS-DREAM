package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADD {
    private String ADD_1_AddendumContinuationPointer;

    public String getADD_1_AddendumContinuationPointer() {
        return this.ADD_1_AddendumContinuationPointer;
    }

    public void setADD_1_AddendumContinuationPointer(final String ADD_1_AddendumContinuationPointer) {
        this.ADD_1_AddendumContinuationPointer = ADD_1_AddendumContinuationPointer;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

