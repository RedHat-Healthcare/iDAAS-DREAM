package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LCH {
    private String LCH_1_PrimaryKeyValueLCH;
    private String LCH_2_SegmentActionCode;
    private String LCH_3_SegmentUniqueKey;
    private String LCH_4_LocationCharacteristicID;
    private String LCH_5_LocationCharacteristicValueLCH;

    public String getLCH_1_PrimaryKeyValueLCH() {
        return this.LCH_1_PrimaryKeyValueLCH;
    }

    public void setLCH_1_PrimaryKeyValueLCH(final String LCH_1_PrimaryKeyValueLCH) {
        this.LCH_1_PrimaryKeyValueLCH = LCH_1_PrimaryKeyValueLCH;
    }

    public String getLCH_2_SegmentActionCode() {
        return this.LCH_2_SegmentActionCode;
    }

    public void setLCH_2_SegmentActionCode(final String LCH_2_SegmentActionCode) {
        this.LCH_2_SegmentActionCode = LCH_2_SegmentActionCode;
    }

    public String getLCH_3_SegmentUniqueKey() {
        return this.LCH_3_SegmentUniqueKey;
    }

    public void setLCH_3_SegmentUniqueKey(final String LCH_3_SegmentUniqueKey) {
        this.LCH_3_SegmentUniqueKey = LCH_3_SegmentUniqueKey;
    }

    public String getLCH_4_LocationCharacteristicID() {
        return this.LCH_4_LocationCharacteristicID;
    }

    public void setLCH_4_LocationCharacteristicID(final String LCH_4_LocationCharacteristicID) {
        this.LCH_4_LocationCharacteristicID = LCH_4_LocationCharacteristicID;
    }

    public String getLCH_5_LocationCharacteristicValueLCH() {
        return this.LCH_5_LocationCharacteristicValueLCH;
    }

    public void setLCH_5_LocationCharacteristicValueLCH(final String LCH_5_LocationCharacteristicValueLCH) {
        this.LCH_5_LocationCharacteristicValueLCH = LCH_5_LocationCharacteristicValueLCH;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

