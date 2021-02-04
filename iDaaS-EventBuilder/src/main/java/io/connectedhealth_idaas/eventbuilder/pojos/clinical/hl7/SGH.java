package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SGH {
    private String SGH_1_SetIDSGH;
    private String SGH_2_SegmentGroupName;

    public String getSGH_1_SetIDSGH() {
        return this.SGH_1_SetIDSGH;
    }

    public void setSGH_1_SetIDSGH(final String SGH_1_SetIDSGH) {
        this.SGH_1_SetIDSGH = SGH_1_SetIDSGH;
    }

    public String getSGH_2_SegmentGroupName() {
        return this.SGH_2_SegmentGroupName;
    }

    public void setSGH_2_SegmentGroupName(final String SGH_2_SegmentGroupName) {
        this.SGH_2_SegmentGroupName = SGH_2_SegmentGroupName;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

