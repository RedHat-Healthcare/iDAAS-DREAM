package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LRL {
    private String LRL_1_PrimaryKeyValueLRL;
    private String LRL_2_SegmentActionCode;
    private String LRL_3_SegmentUniqueKey;
    private String LRL_4_LocationRelationshipID;
    private String LRL_5_OrganizationalLocationRelationshipValue;
    private String LRL_6_PatientLocationRelationshipValue;

    public String getLRL_1_PrimaryKeyValueLRL() {
        return this.LRL_1_PrimaryKeyValueLRL;
    }

    public void setLRL_1_PrimaryKeyValueLRL(final String LRL_1_PrimaryKeyValueLRL) {
        this.LRL_1_PrimaryKeyValueLRL = LRL_1_PrimaryKeyValueLRL;
    }

    public String getLRL_2_SegmentActionCode() {
        return this.LRL_2_SegmentActionCode;
    }

    public void setLRL_2_SegmentActionCode(final String LRL_2_SegmentActionCode) {
        this.LRL_2_SegmentActionCode = LRL_2_SegmentActionCode;
    }

    public String getLRL_3_SegmentUniqueKey() {
        return this.LRL_3_SegmentUniqueKey;
    }

    public void setLRL_3_SegmentUniqueKey(final String LRL_3_SegmentUniqueKey) {
        this.LRL_3_SegmentUniqueKey = LRL_3_SegmentUniqueKey;
    }

    public String getLRL_4_LocationRelationshipID() {
        return this.LRL_4_LocationRelationshipID;
    }

    public void setLRL_4_LocationRelationshipID(final String LRL_4_LocationRelationshipID) {
        this.LRL_4_LocationRelationshipID = LRL_4_LocationRelationshipID;
    }

    public String getLRL_5_OrganizationalLocationRelationshipValue() {
        return this.LRL_5_OrganizationalLocationRelationshipValue;
    }

    public void setLRL_5_OrganizationalLocationRelationshipValue(final String LRL_5_OrganizationalLocationRelationshipValue) {
        this.LRL_5_OrganizationalLocationRelationshipValue = LRL_5_OrganizationalLocationRelationshipValue;
    }

    public String getLRL_6_PatientLocationRelationshipValue() {
        return this.LRL_6_PatientLocationRelationshipValue;
    }

    public void setLRL_6_PatientLocationRelationshipValue(final String LRL_6_PatientLocationRelationshipValue) {
        this.LRL_6_PatientLocationRelationshipValue = LRL_6_PatientLocationRelationshipValue;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

