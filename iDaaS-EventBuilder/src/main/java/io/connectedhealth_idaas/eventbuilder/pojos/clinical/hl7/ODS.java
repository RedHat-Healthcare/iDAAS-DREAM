package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ODS {
    private String ODS_1_Type;
    private String ODS_2_ServicePeriod;
    private String ODS_3_Diet;
    private String ODS_4_TextInstruction;

    public String getODS_1_Type() {
        return this.ODS_1_Type;
    }

    public void setODS_1_Type(final String ODS_1_Type) {
        this.ODS_1_Type = ODS_1_Type;
    }

    public String getODS_2_ServicePeriod() {
        return this.ODS_2_ServicePeriod;
    }

    public void setODS_2_ServicePeriod(final String ODS_2_ServicePeriod) {
        this.ODS_2_ServicePeriod = ODS_2_ServicePeriod;
    }

    public String getODS_3_Diet() {
        return this.ODS_3_Diet;
    }

    public void setODS_3_Diet(final String ODS_3_Diet) {
        this.ODS_3_Diet = ODS_3_Diet;
    }

    public String getODS_4_TextInstruction() {
        return this.ODS_4_TextInstruction;
    }

    public void setODS_4_TextInstruction(final String ODS_4_TextInstruction) {
        this.ODS_4_TextInstruction = ODS_4_TextInstruction;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

