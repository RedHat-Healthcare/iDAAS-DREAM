package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ISD {
    private String ISD_1_ReferenceInteractionNumber;
    private String ISD_2_InteractionTypeIdentifier;
    private String ISD_3_InteractionActiveState;

    public String getISD_1_ReferenceInteractionNumber() {
        return this.ISD_1_ReferenceInteractionNumber;
    }

    public void setISD_1_ReferenceInteractionNumber(final String ISD_1_ReferenceInteractionNumber) {
        this.ISD_1_ReferenceInteractionNumber = ISD_1_ReferenceInteractionNumber;
    }

    public String getISD_2_InteractionTypeIdentifier() {
        return this.ISD_2_InteractionTypeIdentifier;
    }

    public void setISD_2_InteractionTypeIdentifier(final String ISD_2_InteractionTypeIdentifier) {
        this.ISD_2_InteractionTypeIdentifier = ISD_2_InteractionTypeIdentifier;
    }

    public String getISD_3_InteractionActiveState() {
        return this.ISD_3_InteractionActiveState;
    }

    public void setISD_3_InteractionActiveState(final String ISD_3_InteractionActiveState) {
        this.ISD_3_InteractionActiveState = ISD_3_InteractionActiveState;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

