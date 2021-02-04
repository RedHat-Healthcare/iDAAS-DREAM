package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class OVR {
    private String OVR_1_BusinessRuleOverrideType;
    private String OVR_2_BusinessRuleOverrideCode;
    private String OVR_3_OverrideComments;
    private String OVR_4_OverrideEnteredBy;
    private String OVR_5_OverrideAuthorizedBy;

    public String getOVR_1_BusinessRuleOverrideType() {
        return this.OVR_1_BusinessRuleOverrideType;
    }

    public void setOVR_1_BusinessRuleOverrideType(final String OVR_1_BusinessRuleOverrideType) {
        this.OVR_1_BusinessRuleOverrideType = OVR_1_BusinessRuleOverrideType;
    }

    public String getOVR_2_BusinessRuleOverrideCode() {
        return this.OVR_2_BusinessRuleOverrideCode;
    }

    public void setOVR_2_BusinessRuleOverrideCode(final String OVR_2_BusinessRuleOverrideCode) {
        this.OVR_2_BusinessRuleOverrideCode = OVR_2_BusinessRuleOverrideCode;
    }

    public String getOVR_3_OverrideComments() {
        return this.OVR_3_OverrideComments;
    }

    public void setOVR_3_OverrideComments(final String OVR_3_OverrideComments) {
        this.OVR_3_OverrideComments = OVR_3_OverrideComments;
    }

    public String getOVR_4_OverrideEnteredBy() {
        return this.OVR_4_OverrideEnteredBy;
    }

    public void setOVR_4_OverrideEnteredBy(final String OVR_4_OverrideEnteredBy) {
        this.OVR_4_OverrideEnteredBy = OVR_4_OverrideEnteredBy;
    }

    public String getOVR_5_OverrideAuthorizedBy() {
        return this.OVR_5_OverrideAuthorizedBy;
    }

    public void setOVR_5_OverrideAuthorizedBy(final String OVR_5_OverrideAuthorizedBy) {
        this.OVR_5_OverrideAuthorizedBy = OVR_5_OverrideAuthorizedBy;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

