package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PTH {
    private String PTH_1_ActionCode;
    private String PTH_2_PathwayID;
    private String PTH_3_PathwayInstanceID;
    private String PTH_4_PathwayEstablishedDateTime;
    private String PTH_5_PathwayLifeCycleStatus;
    private String PTH_6_ChangePathwayLifeCycleStatusDateTime;
    private String PTH_7_MoodCode;

    public String getPTH_1_ActionCode() {
        return this.PTH_1_ActionCode;
    }

    public void setPTH_1_ActionCode(final String PTH_1_ActionCode) {
        this.PTH_1_ActionCode = PTH_1_ActionCode;
    }

    public String getPTH_2_PathwayID() {
        return this.PTH_2_PathwayID;
    }

    public void setPTH_2_PathwayID(final String PTH_2_PathwayID) {
        this.PTH_2_PathwayID = PTH_2_PathwayID;
    }

    public String getPTH_3_PathwayInstanceID() {
        return this.PTH_3_PathwayInstanceID;
    }

    public void setPTH_3_PathwayInstanceID(final String PTH_3_PathwayInstanceID) {
        this.PTH_3_PathwayInstanceID = PTH_3_PathwayInstanceID;
    }

    public String getPTH_4_PathwayEstablishedDateTime() {
        return this.PTH_4_PathwayEstablishedDateTime;
    }

    public void setPTH_4_PathwayEstablishedDateTime(final String PTH_4_PathwayEstablishedDateTime) {
        this.PTH_4_PathwayEstablishedDateTime = PTH_4_PathwayEstablishedDateTime;
    }

    public String getPTH_5_PathwayLifeCycleStatus() {
        return this.PTH_5_PathwayLifeCycleStatus;
    }

    public void setPTH_5_PathwayLifeCycleStatus(final String PTH_5_PathwayLifeCycleStatus) {
        this.PTH_5_PathwayLifeCycleStatus = PTH_5_PathwayLifeCycleStatus;
    }

    public String getPTH_6_ChangePathwayLifeCycleStatusDateTime() {
        return this.PTH_6_ChangePathwayLifeCycleStatusDateTime;
    }

    public void setPTH_6_ChangePathwayLifeCycleStatusDateTime(final String PTH_6_ChangePathwayLifeCycleStatusDateTime) {
        this.PTH_6_ChangePathwayLifeCycleStatusDateTime = PTH_6_ChangePathwayLifeCycleStatusDateTime;
    }

    public String getPTH_7_MoodCode() {
        return this.PTH_7_MoodCode;
    }

    public void setPTH_7_MoodCode(final String PTH_7_MoodCode) {
        this.PTH_7_MoodCode = PTH_7_MoodCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

