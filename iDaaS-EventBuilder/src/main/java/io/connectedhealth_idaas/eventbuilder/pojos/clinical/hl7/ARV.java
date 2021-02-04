package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ARV {
    private String ARV_1_SetID;
    private String ARV_2_AccessRestrictionActionCode;
    private String ARV_3_AccessRestrictionValue;
    private String ARV_4_AccessRestrictionReason;
    private String ARV_5_SpecialAccessRestrictionInstructions;
    private String ARV_6_AccessRestrictionDateRange;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getARV_1_SetID() {
        return this.ARV_1_SetID;
    }

    public void setARV_1_SetID(final String ARV_1_SetID) {
        this.ARV_1_SetID = ARV_1_SetID;
    }

    public String getARV_2_AccessRestrictionActionCode() {
        return this.ARV_2_AccessRestrictionActionCode;
    }

    public void setARV_2_AccessRestrictionActionCode(final String ARV_2_AccessRestrictionActionCode) {
        this.ARV_2_AccessRestrictionActionCode = ARV_2_AccessRestrictionActionCode;
    }

    public String getARV_3_AccessRestrictionValue() {
        return this.ARV_3_AccessRestrictionValue;
    }

    public void setARV_3_AccessRestrictionValue(final String ARV_3_AccessRestrictionValue) {
        this.ARV_3_AccessRestrictionValue = ARV_3_AccessRestrictionValue;
    }

    public String getARV_4_AccessRestrictionReason() {
        return this.ARV_4_AccessRestrictionReason;
    }

    public void setARV_4_AccessRestrictionReason(final String ARV_4_AccessRestrictionReason) {
        this.ARV_4_AccessRestrictionReason = ARV_4_AccessRestrictionReason;
    }

    public String getARV_5_SpecialAccessRestrictionInstructions() {
        return this.ARV_5_SpecialAccessRestrictionInstructions;
    }

    public void setARV_5_SpecialAccessRestrictionInstructions(final String ARV_5_SpecialAccessRestrictionInstructions) {
        this.ARV_5_SpecialAccessRestrictionInstructions = ARV_5_SpecialAccessRestrictionInstructions;
    }

    public String getARV_6_AccessRestrictionDateRange() {
        return this.ARV_6_AccessRestrictionDateRange;
    }

    public void setARV_6_AccessRestrictionDateRange(final String ARV_6_AccessRestrictionDateRange) {
        this.ARV_6_AccessRestrictionDateRange = ARV_6_AccessRestrictionDateRange;
    }
}

