package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SDD {
    private String SDD_1_LotNumber;
    private String SDD_2_DeviceNumber;
    private String SDD_3_DeviceName;
    private String SDD_4_DeviceDataState;
    private String SDD_5_LoadStatus;
    private String SDD_6_ControlCode;
    private String SDD_7_OperatorName;

    public String getSDD_1_LotNumber() {
        return this.SDD_1_LotNumber;
    }

    public void setSDD_1_LotNumber(final String SDD_1_LotNumber) {
        this.SDD_1_LotNumber = SDD_1_LotNumber;
    }

    public String getSDD_2_DeviceNumber() {
        return this.SDD_2_DeviceNumber;
    }

    public void setSDD_2_DeviceNumber(final String SDD_2_DeviceNumber) {
        this.SDD_2_DeviceNumber = SDD_2_DeviceNumber;
    }

    public String getSDD_3_DeviceName() {
        return this.SDD_3_DeviceName;
    }

    public void setSDD_3_DeviceName(final String SDD_3_DeviceName) {
        this.SDD_3_DeviceName = SDD_3_DeviceName;
    }

    public String getSDD_4_DeviceDataState() {
        return this.SDD_4_DeviceDataState;
    }

    public void setSDD_4_DeviceDataState(final String SDD_4_DeviceDataState) {
        this.SDD_4_DeviceDataState = SDD_4_DeviceDataState;
    }

    public String getSDD_5_LoadStatus() {
        return this.SDD_5_LoadStatus;
    }

    public void setSDD_5_LoadStatus(final String SDD_5_LoadStatus) {
        this.SDD_5_LoadStatus = SDD_5_LoadStatus;
    }

    public String getSDD_6_ControlCode() {
        return this.SDD_6_ControlCode;
    }

    public void setSDD_6_ControlCode(final String SDD_6_ControlCode) {
        this.SDD_6_ControlCode = SDD_6_ControlCode;
    }

    public String getSDD_7_OperatorName() {
        return this.SDD_7_OperatorName;
    }

    public void setSDD_7_OperatorName(final String SDD_7_OperatorName) {
        this.SDD_7_OperatorName = SDD_7_OperatorName;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

