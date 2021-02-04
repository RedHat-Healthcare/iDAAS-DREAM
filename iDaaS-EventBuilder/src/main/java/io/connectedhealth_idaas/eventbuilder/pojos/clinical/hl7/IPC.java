package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IPC {
    private String IPC_1_AccessionIdentifier;
    private String IPC_2_RequestedProcedureID;
    private String IPC_3_StudyInstanceUID;
    private String IPC_4_ScheduledProcedureStepID;
    private String IPC_5_Modality;
    private String IPC_6_ProtocolCode;
    private String IPC_7_ScheduledStationName;
    private String IPC_8_ScheduledProcedureStepLocation;
    private String IPC_9_ScheduledStationAETitle;

    public String getIPC_1_AccessionIdentifier() {
        return this.IPC_1_AccessionIdentifier;
    }

    public void setIPC_1_AccessionIdentifier(final String IPC_1_AccessionIdentifier) {
        this.IPC_1_AccessionIdentifier = IPC_1_AccessionIdentifier;
    }

    public String getIPC_2_RequestedProcedureID() {
        return this.IPC_2_RequestedProcedureID;
    }

    public void setIPC_2_RequestedProcedureID(final String IPC_2_RequestedProcedureID) {
        this.IPC_2_RequestedProcedureID = IPC_2_RequestedProcedureID;
    }

    public String getIPC_3_StudyInstanceUID() {
        return this.IPC_3_StudyInstanceUID;
    }

    public void setIPC_3_StudyInstanceUID(final String IPC_3_StudyInstanceUID) {
        this.IPC_3_StudyInstanceUID = IPC_3_StudyInstanceUID;
    }

    public String getIPC_4_ScheduledProcedureStepID() {
        return this.IPC_4_ScheduledProcedureStepID;
    }

    public void setIPC_4_ScheduledProcedureStepID(final String IPC_4_ScheduledProcedureStepID) {
        this.IPC_4_ScheduledProcedureStepID = IPC_4_ScheduledProcedureStepID;
    }

    public String getIPC_5_Modality() {
        return this.IPC_5_Modality;
    }

    public void setIPC_5_Modality(final String IPC_5_Modality) {
        this.IPC_5_Modality = IPC_5_Modality;
    }

    public String getIPC_6_ProtocolCode() {
        return this.IPC_6_ProtocolCode;
    }

    public void setIPC_6_ProtocolCode(final String IPC_6_ProtocolCode) {
        this.IPC_6_ProtocolCode = IPC_6_ProtocolCode;
    }

    public String getIPC_7_ScheduledStationName() {
        return this.IPC_7_ScheduledStationName;
    }

    public void setIPC_7_ScheduledStationName(final String IPC_7_ScheduledStationName) {
        this.IPC_7_ScheduledStationName = IPC_7_ScheduledStationName;
    }

    public String getIPC_8_ScheduledProcedureStepLocation() {
        return this.IPC_8_ScheduledProcedureStepLocation;
    }

    public void setIPC_8_ScheduledProcedureStepLocation(final String IPC_8_ScheduledProcedureStepLocation) {
        this.IPC_8_ScheduledProcedureStepLocation = IPC_8_ScheduledProcedureStepLocation;
    }

    public String getIPC_9_ScheduledStationAETitle() {
        return this.IPC_9_ScheduledStationAETitle;
    }

    public void setIPC_9_ScheduledStationAETitle(final String IPC_9_ScheduledStationAETitle) {
        this.IPC_9_ScheduledStationAETitle = IPC_9_ScheduledStationAETitle;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

