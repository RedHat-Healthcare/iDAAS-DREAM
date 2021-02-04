package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IAR {
    private String IAR_1_AllergyReactionCode;
    private String IAR_2_AllergySeverityCode;
    private String IAR_3_SensitivitytoCausativeAgentCode;
    private String IAR_4_Management;

    public String getIAR_1_AllergyReactionCode() {
        return this.IAR_1_AllergyReactionCode;
    }

    public void setIAR_1_AllergyReactionCode(final String IAR_1_AllergyReactionCode) {
        this.IAR_1_AllergyReactionCode = IAR_1_AllergyReactionCode;
    }

    public String getIAR_2_AllergySeverityCode() {
        return this.IAR_2_AllergySeverityCode;
    }

    public void setIAR_2_AllergySeverityCode(final String IAR_2_AllergySeverityCode) {
        this.IAR_2_AllergySeverityCode = IAR_2_AllergySeverityCode;
    }

    public String getIAR_3_SensitivitytoCausativeAgentCode() {
        return this.IAR_3_SensitivitytoCausativeAgentCode;
    }

    public void setIAR_3_SensitivitytoCausativeAgentCode(final String IAR_3_SensitivitytoCausativeAgentCode) {
        this.IAR_3_SensitivitytoCausativeAgentCode = IAR_3_SensitivitytoCausativeAgentCode;
    }

    public String getIAR_4_Management() {
        return this.IAR_4_Management;
    }

    public void setIAR_4_Management(final String IAR_4_Management) {
        this.IAR_4_Management = IAR_4_Management;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

