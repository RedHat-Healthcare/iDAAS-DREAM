package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SID {
    private String SID_1_ApplicationMethodIdentifier;
    private String SID_2_SubstanceLotNumber;
    private String SID_3_SubstanceContainerIdentifier;
    private String SID_4_SubstanceManufacturerIdentifier;

    public String getSID_1_ApplicationMethodIdentifier() {
        return this.SID_1_ApplicationMethodIdentifier;
    }

    public void setSID_1_ApplicationMethodIdentifier(final String SID_1_ApplicationMethodIdentifier) {
        this.SID_1_ApplicationMethodIdentifier = SID_1_ApplicationMethodIdentifier;
    }

    public String getSID_2_SubstanceLotNumber() {
        return this.SID_2_SubstanceLotNumber;
    }

    public void setSID_2_SubstanceLotNumber(final String SID_2_SubstanceLotNumber) {
        this.SID_2_SubstanceLotNumber = SID_2_SubstanceLotNumber;
    }

    public String getSID_3_SubstanceContainerIdentifier() {
        return this.SID_3_SubstanceContainerIdentifier;
    }

    public void setSID_3_SubstanceContainerIdentifier(final String SID_3_SubstanceContainerIdentifier) {
        this.SID_3_SubstanceContainerIdentifier = SID_3_SubstanceContainerIdentifier;
    }

    public String getSID_4_SubstanceManufacturerIdentifier() {
        return this.SID_4_SubstanceManufacturerIdentifier;
    }

    public void setSID_4_SubstanceManufacturerIdentifier(final String SID_4_SubstanceManufacturerIdentifier) {
        this.SID_4_SubstanceManufacturerIdentifier = SID_4_SubstanceManufacturerIdentifier;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

