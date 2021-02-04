package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MRG {
    private String MRG_1_PriorPatientIdentifierList;
    private String MRG_2_PriorAlternatePatientID;
    private String MRG_3_PriorPatientAccountNumber;
    private String MRG_4_PriorPatientID;
    private String MRG_5_PriorVisitNumber;
    private String MRG_6_PriorAlternateVisitID;
    private String MRG_7_PriorPatientName;

    public String getMRG_1_PriorPatientIdentifierList() {
        return this.MRG_1_PriorPatientIdentifierList;
    }

    public void setMRG_1_PriorPatientIdentifierList(final String MRG_1_PriorPatientIdentifierList) {
        this.MRG_1_PriorPatientIdentifierList = MRG_1_PriorPatientIdentifierList;
    }

    public String getMRG_2_PriorAlternatePatientID() {
        return this.MRG_2_PriorAlternatePatientID;
    }

    public void setMRG_2_PriorAlternatePatientID(final String MRG_2_PriorAlternatePatientID) {
        this.MRG_2_PriorAlternatePatientID = MRG_2_PriorAlternatePatientID;
    }

    public String getMRG_3_PriorPatientAccountNumber() {
        return this.MRG_3_PriorPatientAccountNumber;
    }

    public void setMRG_3_PriorPatientAccountNumber(final String MRG_3_PriorPatientAccountNumber) {
        this.MRG_3_PriorPatientAccountNumber = MRG_3_PriorPatientAccountNumber;
    }

    public String getMRG_4_PriorPatientID() {
        return this.MRG_4_PriorPatientID;
    }

    public void setMRG_4_PriorPatientID(final String MRG_4_PriorPatientID) {
        this.MRG_4_PriorPatientID = MRG_4_PriorPatientID;
    }

    public String getMRG_5_PriorVisitNumber() {
        return this.MRG_5_PriorVisitNumber;
    }

    public void setMRG_5_PriorVisitNumber(final String MRG_5_PriorVisitNumber) {
        this.MRG_5_PriorVisitNumber = MRG_5_PriorVisitNumber;
    }

    public String getMRG_6_PriorAlternateVisitID() {
        return this.MRG_6_PriorAlternateVisitID;
    }

    public void setMRG_6_PriorAlternateVisitID(final String MRG_6_PriorAlternateVisitID) {
        this.MRG_6_PriorAlternateVisitID = MRG_6_PriorAlternateVisitID;
    }

    public String getMRG_7_PriorPatientName() {
        return this.MRG_7_PriorPatientName;
    }

    public void setMRG_7_PriorPatientName(final String MRG_7_PriorPatientName) {
        this.MRG_7_PriorPatientName = MRG_7_PriorPatientName;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

