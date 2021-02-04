package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DB1 {
    private String DB1_1_SetIDDB1;
    private String DB1_2_DisabledPersonCode;
    private String DB1_3_DisabledPersonIdentifier;
    private String DB1_4_DisabilityIndicator;
    private String DB1_5_DisabilityStartDate;
    private String DB1_6_DisabilityEndDate;
    private String DB1_7_DisabilityReturntoWorkDate;
    private String DB1_8_DisabilityUnabletoWorkDate;

    public String getDB1_1_SetIDDB1() {
        return this.DB1_1_SetIDDB1;
    }

    public void setDB1_1_SetIDDB1(final String DB1_1_SetIDDB1) {
        this.DB1_1_SetIDDB1 = DB1_1_SetIDDB1;
    }

    public String getDB1_2_DisabledPersonCode() {
        return this.DB1_2_DisabledPersonCode;
    }

    public void setDB1_2_DisabledPersonCode(final String DB1_2_DisabledPersonCode) {
        this.DB1_2_DisabledPersonCode = DB1_2_DisabledPersonCode;
    }

    public String getDB1_3_DisabledPersonIdentifier() {
        return this.DB1_3_DisabledPersonIdentifier;
    }

    public void setDB1_3_DisabledPersonIdentifier(final String DB1_3_DisabledPersonIdentifier) {
        this.DB1_3_DisabledPersonIdentifier = DB1_3_DisabledPersonIdentifier;
    }

    public String getDB1_4_DisabilityIndicator() {
        return this.DB1_4_DisabilityIndicator;
    }

    public void setDB1_4_DisabilityIndicator(final String DB1_4_DisabilityIndicator) {
        this.DB1_4_DisabilityIndicator = DB1_4_DisabilityIndicator;
    }

    public String getDB1_5_DisabilityStartDate() {
        return this.DB1_5_DisabilityStartDate;
    }

    public void setDB1_5_DisabilityStartDate(final String DB1_5_DisabilityStartDate) {
        this.DB1_5_DisabilityStartDate = DB1_5_DisabilityStartDate;
    }

    public String getDB1_6_DisabilityEndDate() {
        return this.DB1_6_DisabilityEndDate;
    }

    public void setDB1_6_DisabilityEndDate(final String DB1_6_DisabilityEndDate) {
        this.DB1_6_DisabilityEndDate = DB1_6_DisabilityEndDate;
    }

    public String getDB1_7_DisabilityReturntoWorkDate() {
        return this.DB1_7_DisabilityReturntoWorkDate;
    }

    public void setDB1_7_DisabilityReturntoWorkDate(final String DB1_7_DisabilityReturntoWorkDate) {
        this.DB1_7_DisabilityReturntoWorkDate = DB1_7_DisabilityReturntoWorkDate;
    }

    public String getDB1_8_DisabilityUnabletoWorkDate() {
        return this.DB1_8_DisabilityUnabletoWorkDate;
    }

    public void setDB1_8_DisabilityUnabletoWorkDate(final String DB1_8_DisabilityUnabletoWorkDate) {
        this.DB1_8_DisabilityUnabletoWorkDate = DB1_8_DisabilityUnabletoWorkDate;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

