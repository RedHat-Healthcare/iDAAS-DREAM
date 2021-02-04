package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BLC {
    private String BLC_1_BloodProductCode;
    private String BLC_2_BloodAmount;

    public String getBLC_1_BloodProductCode() {
        return this.BLC_1_BloodProductCode;
    }

    public void setBLC_1_BloodProductCode(final String BLC_1_BloodProductCode) {
        this.BLC_1_BloodProductCode = BLC_1_BloodProductCode;
    }

    public String getBLC_2_BloodAmount() {
        return this.BLC_2_BloodAmount;
    }

    public void setBLC_2_BloodAmount(final String BLC_2_BloodAmount) {
        this.BLC_2_BloodAmount = BLC_2_BloodAmount;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

