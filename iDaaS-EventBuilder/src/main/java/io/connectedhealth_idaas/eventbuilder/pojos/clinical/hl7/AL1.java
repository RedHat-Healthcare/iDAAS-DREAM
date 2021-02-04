package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class AL1 {
    private String AL1_1_SetIDAL1;
    private String AL1_2_AllergenTypeCode;
    private String AL1_3_AllergenCodeMnemonicDescription;
    private String AL1_4_AllergySeverityCode;
    private String AL1_5_AllergyReactionCode;
    private String AL1_6_IdentificationDate;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAL1_1_SetIDAL1() {
        return this.AL1_1_SetIDAL1;
    }

    public void setAL1_1_SetIDAL1(final String AL1_1_SetIDAL1) {
        this.AL1_1_SetIDAL1 = AL1_1_SetIDAL1;
    }

    public String getAL1_2_AllergenTypeCode() {
        return this.AL1_2_AllergenTypeCode;
    }

    public void setAL1_2_AllergenTypeCode(final String AL1_2_AllergenTypeCode) {
        this.AL1_2_AllergenTypeCode = AL1_2_AllergenTypeCode;
    }

    public String getAL1_3_AllergenCodeMnemonicDescription() {
        return this.AL1_3_AllergenCodeMnemonicDescription;
    }

    public void setAL1_3_AllergenCodeMnemonicDescription(final String AL1_3_AllergenCodeMnemonicDescription) {
        this.AL1_3_AllergenCodeMnemonicDescription = AL1_3_AllergenCodeMnemonicDescription;
    }

    public String getAL1_4_AllergySeverityCode() {
        return this.AL1_4_AllergySeverityCode;
    }

    public void setAL1_4_AllergySeverityCode(final String AL1_4_AllergySeverityCode) {
        this.AL1_4_AllergySeverityCode = AL1_4_AllergySeverityCode;
    }

    public String getAL1_5_AllergyReactionCode() {
        return this.AL1_5_AllergyReactionCode;
    }

    public void setAL1_5_AllergyReactionCode(final String AL1_5_AllergyReactionCode) {
        this.AL1_5_AllergyReactionCode = AL1_5_AllergyReactionCode;
    }

    public String getAL1_6_IdentificationDate() {
        return this.AL1_6_IdentificationDate;
    }

    public void setAL1_6_IdentificationDate(final String AL1_6_IdentificationDate) {
        this.AL1_6_IdentificationDate = AL1_6_IdentificationDate;
    }
}

