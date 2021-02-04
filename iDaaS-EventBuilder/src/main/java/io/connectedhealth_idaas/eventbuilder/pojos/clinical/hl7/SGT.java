package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SGT {
    private String SGT_1_SetIDSGT;
    private String SGT_2_SegmentGroupName;

    public String getSGT_1_SetIDSGT() {
        return this.SGT_1_SetIDSGT;
    }

    public void setSGT_1_SetIDSGT(final String SGT_1_SetIDSGT) {
        this.SGT_1_SetIDSGT = SGT_1_SetIDSGT;
    }

    public String getSGT_2_SegmentGroupName() {
        return this.SGT_2_SegmentGroupName;
    }

    public void setSGT_2_SegmentGroupName(final String SGT_2_SegmentGroupName) {
        this.SGT_2_SegmentGroupName = SGT_2_SegmentGroupName;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

