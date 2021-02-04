package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BLG {
    private String BLG_1_WhentoCharge;
    private String BLG_2_ChargeType;
    private String BLG_3_AccountID;
    private String BLG_4_ChargeTypeReason;

    public String getBLG_1_WhentoCharge() {
        return this.BLG_1_WhentoCharge;
    }

    public void setBLG_1_WhentoCharge(final String BLG_1_WhentoCharge) {
        this.BLG_1_WhentoCharge = BLG_1_WhentoCharge;
    }

    public String getBLG_2_ChargeType() {
        return this.BLG_2_ChargeType;
    }

    public void setBLG_2_ChargeType(final String BLG_2_ChargeType) {
        this.BLG_2_ChargeType = BLG_2_ChargeType;
    }

    public String getBLG_3_AccountID() {
        return this.BLG_3_AccountID;
    }

    public void setBLG_3_AccountID(final String BLG_3_AccountID) {
        this.BLG_3_AccountID = BLG_3_AccountID;
    }

    public String getBLG_4_ChargeTypeReason() {
        return this.BLG_4_ChargeTypeReason;
    }

    public void setBLG_4_ChargeTypeReason(final String BLG_4_ChargeTypeReason) {
        this.BLG_4_ChargeTypeReason = BLG_4_ChargeTypeReason;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

