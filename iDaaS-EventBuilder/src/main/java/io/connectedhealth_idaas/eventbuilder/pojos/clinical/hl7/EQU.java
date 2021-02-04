package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EQU {
    private String EQU_1_EquipmentInstanceIdentifier;
    private String EQU_2_EventDateTime;
    private String EQU_3_EquipmentState;
    private String EQU_4_LocalRemoteControlState;
    private String EQU_5_AlertLevel;

    public String getEQU_1_EquipmentInstanceIdentifier() {
        return this.EQU_1_EquipmentInstanceIdentifier;
    }

    public void setEQU_1_EquipmentInstanceIdentifier(final String EQU_1_EquipmentInstanceIdentifier) {
        this.EQU_1_EquipmentInstanceIdentifier = EQU_1_EquipmentInstanceIdentifier;
    }

    public String getEQU_2_EventDateTime() {
        return this.EQU_2_EventDateTime;
    }

    public void setEQU_2_EventDateTime(final String EQU_2_EventDateTime) {
        this.EQU_2_EventDateTime = EQU_2_EventDateTime;
    }

    public String getEQU_3_EquipmentState() {
        return this.EQU_3_EquipmentState;
    }

    public void setEQU_3_EquipmentState(final String EQU_3_EquipmentState) {
        this.EQU_3_EquipmentState = EQU_3_EquipmentState;
    }

    public String getEQU_4_LocalRemoteControlState() {
        return this.EQU_4_LocalRemoteControlState;
    }

    public void setEQU_4_LocalRemoteControlState(final String EQU_4_LocalRemoteControlState) {
        this.EQU_4_LocalRemoteControlState = EQU_4_LocalRemoteControlState;
    }

    public String getEQU_5_AlertLevel() {
        return this.EQU_5_AlertLevel;
    }

    public void setEQU_5_AlertLevel(final String EQU_5_AlertLevel) {
        this.EQU_5_AlertLevel = EQU_5_AlertLevel;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

