package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ODT {
    private String ODT_1_TrayType;
    private String ODT_2_ServicePeriod;
    private String ODT_3_TextInstruction;

    public String getODT_1_TrayType() {
        return this.ODT_1_TrayType;
    }

    public void setODT_1_TrayType(final String ODT_1_TrayType) {
        this.ODT_1_TrayType = ODT_1_TrayType;
    }

    public String getODT_2_ServicePeriod() {
        return this.ODT_2_ServicePeriod;
    }

    public void setODT_2_ServicePeriod(final String ODT_2_ServicePeriod) {
        this.ODT_2_ServicePeriod = ODT_2_ServicePeriod;
    }

    public String getODT_3_TextInstruction() {
        return this.ODT_3_TextInstruction;
    }

    public void setODT_3_TextInstruction(final String ODT_3_TextInstruction) {
        this.ODT_3_TextInstruction = ODT_3_TextInstruction;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

