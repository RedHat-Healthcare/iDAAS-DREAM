package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RGS {
    private String RGS_1_SetIDRGS;
    private String RGS_2_SegmentActionCode;
    private String RGS_3_ResourceGroupID;

    public String getRGS_1_SetIDRGS() {
        return this.RGS_1_SetIDRGS;
    }

    public void setRGS_1_SetIDRGS(final String RGS_1_SetIDRGS) {
        this.RGS_1_SetIDRGS = RGS_1_SetIDRGS;
    }

    public String getRGS_2_SegmentActionCode() {
        return this.RGS_2_SegmentActionCode;
    }

    public void setRGS_2_SegmentActionCode(final String RGS_2_SegmentActionCode) {
        this.RGS_2_SegmentActionCode = RGS_2_SegmentActionCode;
    }

    public String getRGS_3_ResourceGroupID() {
        return this.RGS_3_ResourceGroupID;
    }

    public void setRGS_3_ResourceGroupID(final String RGS_3_ResourceGroupID) {
        this.RGS_3_ResourceGroupID = RGS_3_ResourceGroupID;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

