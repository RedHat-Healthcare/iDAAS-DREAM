package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LCC {
    private String LCC_1_PrimaryKeyValueLCC;
    private String LCC_2_LocationDepartment;
    private String LCC_3_AccommodationType;
    private String LCC_4_ChargeCode;

    public String getLCC_1_PrimaryKeyValueLCC() {
        return this.LCC_1_PrimaryKeyValueLCC;
    }

    public void setLCC_1_PrimaryKeyValueLCC(final String LCC_1_PrimaryKeyValueLCC) {
        this.LCC_1_PrimaryKeyValueLCC = LCC_1_PrimaryKeyValueLCC;
    }

    public String getLCC_2_LocationDepartment() {
        return this.LCC_2_LocationDepartment;
    }

    public void setLCC_2_LocationDepartment(final String LCC_2_LocationDepartment) {
        this.LCC_2_LocationDepartment = LCC_2_LocationDepartment;
    }

    public String getLCC_3_AccommodationType() {
        return this.LCC_3_AccommodationType;
    }

    public void setLCC_3_AccommodationType(final String LCC_3_AccommodationType) {
        this.LCC_3_AccommodationType = LCC_3_AccommodationType;
    }

    public String getLCC_4_ChargeCode() {
        return this.LCC_4_ChargeCode;
    }

    public void setLCC_4_ChargeCode(final String LCC_4_ChargeCode) {
        this.LCC_4_ChargeCode = LCC_4_ChargeCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

