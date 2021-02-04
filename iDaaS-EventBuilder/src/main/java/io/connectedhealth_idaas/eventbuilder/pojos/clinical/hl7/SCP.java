package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SCP {
    private String SCP_1_NumberOfDecontaminationSterilizationDevices;
    private String SCP_2_LaborCalculationType;
    private String SCP_3_DateFormat;
    private String SCP_4_DeviceNumber;
    private String SCP_5_DeviceName;
    private String SCP_6_DeviceModelName;
    private String SCP_7_DeviceType;
    private String SCP_8_LotControl;

    public String getSCP_1_NumberOfDecontaminationSterilizationDevices() {
        return this.SCP_1_NumberOfDecontaminationSterilizationDevices;
    }

    public void setSCP_1_NumberOfDecontaminationSterilizationDevices(final String SCP_1_NumberOfDecontaminationSterilizationDevices) {
        this.SCP_1_NumberOfDecontaminationSterilizationDevices = SCP_1_NumberOfDecontaminationSterilizationDevices;
    }

    public String getSCP_2_LaborCalculationType() {
        return this.SCP_2_LaborCalculationType;
    }

    public void setSCP_2_LaborCalculationType(final String SCP_2_LaborCalculationType) {
        this.SCP_2_LaborCalculationType = SCP_2_LaborCalculationType;
    }

    public String getSCP_3_DateFormat() {
        return this.SCP_3_DateFormat;
    }

    public void setSCP_3_DateFormat(final String SCP_3_DateFormat) {
        this.SCP_3_DateFormat = SCP_3_DateFormat;
    }

    public String getSCP_4_DeviceNumber() {
        return this.SCP_4_DeviceNumber;
    }

    public void setSCP_4_DeviceNumber(final String SCP_4_DeviceNumber) {
        this.SCP_4_DeviceNumber = SCP_4_DeviceNumber;
    }

    public String getSCP_5_DeviceName() {
        return this.SCP_5_DeviceName;
    }

    public void setSCP_5_DeviceName(final String SCP_5_DeviceName) {
        this.SCP_5_DeviceName = SCP_5_DeviceName;
    }

    public String getSCP_6_DeviceModelName() {
        return this.SCP_6_DeviceModelName;
    }

    public void setSCP_6_DeviceModelName(final String SCP_6_DeviceModelName) {
        this.SCP_6_DeviceModelName = SCP_6_DeviceModelName;
    }

    public String getSCP_7_DeviceType() {
        return this.SCP_7_DeviceType;
    }

    public void setSCP_7_DeviceType(final String SCP_7_DeviceType) {
        this.SCP_7_DeviceType = SCP_7_DeviceType;
    }

    public String getSCP_8_LotControl() {
        return this.SCP_8_LotControl;
    }

    public void setSCP_8_LotControl(final String SCP_8_LotControl) {
        this.SCP_8_LotControl = SCP_8_LotControl;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

