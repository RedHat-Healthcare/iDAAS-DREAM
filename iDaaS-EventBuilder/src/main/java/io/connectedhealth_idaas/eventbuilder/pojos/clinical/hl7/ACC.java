package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ACC {
    private String ACC_1_AccidentDateTime;
    private String ACC_2_AccidentCode;
    private String ACC_3_AccidentLocation;
    private String ACC_4_AutoAccidentState;
    private String ACC_5_AccidentJobRelatedIndicator;
    private String ACC_6_AccidentDeathIndicator;
    private String ACC_7_EnteredBy;
    private String ACC_8_AccidentDescription;
    private String ACC_9_BroughtInBy;
    private String ACC_10_PoliceNotifiedIndicator;
    private String ACC_11_AccidentAddress;
    private String ACC_12_Degreeofpatientliability;
    private String ACC_13_AccidentIdentifier;

    public String getACC_1_AccidentDateTime() {
        return this.ACC_1_AccidentDateTime;
    }

    public void setACC_1_AccidentDateTime(final String ACC_1_AccidentDateTime) {
        this.ACC_1_AccidentDateTime = ACC_1_AccidentDateTime;
    }

    public String getACC_2_AccidentCode() {
        return this.ACC_2_AccidentCode;
    }

    public void setACC_2_AccidentCode(final String ACC_2_AccidentCode) {
        this.ACC_2_AccidentCode = ACC_2_AccidentCode;
    }

    public String getACC_3_AccidentLocation() {
        return this.ACC_3_AccidentLocation;
    }

    public void setACC_3_AccidentLocation(final String ACC_3_AccidentLocation) {
        this.ACC_3_AccidentLocation = ACC_3_AccidentLocation;
    }

    public String getACC_4_AutoAccidentState() {
        return this.ACC_4_AutoAccidentState;
    }

    public void setACC_4_AutoAccidentState(final String ACC_4_AutoAccidentState) {
        this.ACC_4_AutoAccidentState = ACC_4_AutoAccidentState;
    }

    public String getACC_5_AccidentJobRelatedIndicator() {
        return this.ACC_5_AccidentJobRelatedIndicator;
    }

    public void setACC_5_AccidentJobRelatedIndicator(final String ACC_5_AccidentJobRelatedIndicator) {
        this.ACC_5_AccidentJobRelatedIndicator = ACC_5_AccidentJobRelatedIndicator;
    }

    public String getACC_6_AccidentDeathIndicator() {
        return this.ACC_6_AccidentDeathIndicator;
    }

    public void setACC_6_AccidentDeathIndicator(final String ACC_6_AccidentDeathIndicator) {
        this.ACC_6_AccidentDeathIndicator = ACC_6_AccidentDeathIndicator;
    }

    public String getACC_7_EnteredBy() {
        return this.ACC_7_EnteredBy;
    }

    public void setACC_7_EnteredBy(final String ACC_7_EnteredBy) {
        this.ACC_7_EnteredBy = ACC_7_EnteredBy;
    }

    public String getACC_8_AccidentDescription() {
        return this.ACC_8_AccidentDescription;
    }

    public void setACC_8_AccidentDescription(final String ACC_8_AccidentDescription) {
        this.ACC_8_AccidentDescription = ACC_8_AccidentDescription;
    }

    public String getACC_9_BroughtInBy() {
        return this.ACC_9_BroughtInBy;
    }

    public void setACC_9_BroughtInBy(final String ACC_9_BroughtInBy) {
        this.ACC_9_BroughtInBy = ACC_9_BroughtInBy;
    }

    public String getACC_10_PoliceNotifiedIndicator() {
        return this.ACC_10_PoliceNotifiedIndicator;
    }

    public void setACC_10_PoliceNotifiedIndicator(final String ACC_10_PoliceNotifiedIndicator) {
        this.ACC_10_PoliceNotifiedIndicator = ACC_10_PoliceNotifiedIndicator;
    }

    public String getACC_11_AccidentAddress() {
        return this.ACC_11_AccidentAddress;
    }

    public void setACC_11_AccidentAddress(final String ACC_11_AccidentAddress) {
        this.ACC_11_AccidentAddress = ACC_11_AccidentAddress;
    }

    public String getACC_12_Degreeofpatientliability() {
        return this.ACC_12_Degreeofpatientliability;
    }

    public void setACC_12_Degreeofpatientliability(final String ACC_12_Degreeofpatientliability) {
        this.ACC_12_Degreeofpatientliability = ACC_12_Degreeofpatientliability;
    }

    public String getACC_13_AccidentIdentifier() {
        return this.ACC_13_AccidentIdentifier;
    }

    public void setACC_13_AccidentIdentifier(final String ACC_13_AccidentIdentifier) {
        this.ACC_13_AccidentIdentifier = ACC_13_AccidentIdentifier;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

