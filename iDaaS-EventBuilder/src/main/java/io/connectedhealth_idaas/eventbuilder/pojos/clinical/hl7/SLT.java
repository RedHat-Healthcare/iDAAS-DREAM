package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SLT {
    private String SLT_1_DeviceNumber;
    private String SLT_2_DeviceName;
    private String SLT_3_LotNumber;
    private String SLT_4_ItemIdentifier;
    private String SLT_5_BarCode;

    public String getSLT_1_DeviceNumber() {
        return this.SLT_1_DeviceNumber;
    }

    public void setSLT_1_DeviceNumber(final String SLT_1_DeviceNumber) {
        this.SLT_1_DeviceNumber = SLT_1_DeviceNumber;
    }

    public String getSLT_2_DeviceName() {
        return this.SLT_2_DeviceName;
    }

    public void setSLT_2_DeviceName(final String SLT_2_DeviceName) {
        this.SLT_2_DeviceName = SLT_2_DeviceName;
    }

    public String getSLT_3_LotNumber() {
        return this.SLT_3_LotNumber;
    }

    public void setSLT_3_LotNumber(final String SLT_3_LotNumber) {
        this.SLT_3_LotNumber = SLT_3_LotNumber;
    }

    public String getSLT_4_ItemIdentifier() {
        return this.SLT_4_ItemIdentifier;
    }

    public void setSLT_4_ItemIdentifier(final String SLT_4_ItemIdentifier) {
        this.SLT_4_ItemIdentifier = SLT_4_ItemIdentifier;
    }

    public String getSLT_5_BarCode() {
        return this.SLT_5_BarCode;
    }

    public void setSLT_5_BarCode(final String SLT_5_BarCode) {
        this.SLT_5_BarCode = SLT_5_BarCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

