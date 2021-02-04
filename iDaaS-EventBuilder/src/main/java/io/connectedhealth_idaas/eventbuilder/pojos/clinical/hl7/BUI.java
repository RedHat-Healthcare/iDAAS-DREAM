package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BUI {
    private String BUI_1_SetIDBUI;
    private String BUI_2_BloodUnitIdentifier;
    private String BUI_3_BloodUnitType;
    private String BUI_4_BloodUnitWeight;
    private String BUI_5_WeightUnits;
    private String BUI_6_BloodUnitVolume;
    private String BUI_7_VolumeUnits;
    private String BUI_8_ContainerCatalogNumber;
    private String BUI_9_ContainerLotNumber;
    private String BUI_10_ContainerManufacturer;
    private String BUI_11_TransportTemperature;
    private String BUI_12_TransportTemperatureUnits;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getBUI_1_SetIDBUI() {
        return this.BUI_1_SetIDBUI;
    }

    public void setBUI_1_SetIDBUI(final String BUI_1_SetIDBUI) {
        this.BUI_1_SetIDBUI = BUI_1_SetIDBUI;
    }

    public String getBUI_2_BloodUnitIdentifier() {
        return this.BUI_2_BloodUnitIdentifier;
    }

    public void setBUI_2_BloodUnitIdentifier(final String BUI_2_BloodUnitIdentifier) {
        this.BUI_2_BloodUnitIdentifier = BUI_2_BloodUnitIdentifier;
    }

    public String getBUI_3_BloodUnitType() {
        return this.BUI_3_BloodUnitType;
    }

    public void setBUI_3_BloodUnitType(final String BUI_3_BloodUnitType) {
        this.BUI_3_BloodUnitType = BUI_3_BloodUnitType;
    }

    public String getBUI_4_BloodUnitWeight() {
        return this.BUI_4_BloodUnitWeight;
    }

    public void setBUI_4_BloodUnitWeight(final String BUI_4_BloodUnitWeight) {
        this.BUI_4_BloodUnitWeight = BUI_4_BloodUnitWeight;
    }

    public String getBUI_5_WeightUnits() {
        return this.BUI_5_WeightUnits;
    }

    public void setBUI_5_WeightUnits(final String BUI_5_WeightUnits) {
        this.BUI_5_WeightUnits = BUI_5_WeightUnits;
    }

    public String getBUI_6_BloodUnitVolume() {
        return this.BUI_6_BloodUnitVolume;
    }

    public void setBUI_6_BloodUnitVolume(final String BUI_6_BloodUnitVolume) {
        this.BUI_6_BloodUnitVolume = BUI_6_BloodUnitVolume;
    }

    public String getBUI_7_VolumeUnits() {
        return this.BUI_7_VolumeUnits;
    }

    public void setBUI_7_VolumeUnits(final String BUI_7_VolumeUnits) {
        this.BUI_7_VolumeUnits = BUI_7_VolumeUnits;
    }

    public String getBUI_8_ContainerCatalogNumber() {
        return this.BUI_8_ContainerCatalogNumber;
    }

    public void setBUI_8_ContainerCatalogNumber(final String BUI_8_ContainerCatalogNumber) {
        this.BUI_8_ContainerCatalogNumber = BUI_8_ContainerCatalogNumber;
    }

    public String getBUI_9_ContainerLotNumber() {
        return this.BUI_9_ContainerLotNumber;
    }

    public void setBUI_9_ContainerLotNumber(final String BUI_9_ContainerLotNumber) {
        this.BUI_9_ContainerLotNumber = BUI_9_ContainerLotNumber;
    }

    public String getBUI_10_ContainerManufacturer() {
        return this.BUI_10_ContainerManufacturer;
    }

    public void setBUI_10_ContainerManufacturer(final String BUI_10_ContainerManufacturer) {
        this.BUI_10_ContainerManufacturer = BUI_10_ContainerManufacturer;
    }

    public String getBUI_11_TransportTemperature() {
        return this.BUI_11_TransportTemperature;
    }

    public void setBUI_11_TransportTemperature(final String BUI_11_TransportTemperature) {
        this.BUI_11_TransportTemperature = BUI_11_TransportTemperature;
    }

    public String getBUI_12_TransportTemperatureUnits() {
        return this.BUI_12_TransportTemperatureUnits;
    }

    public void setBUI_12_TransportTemperatureUnits(final String BUI_12_TransportTemperatureUnits) {
        this.BUI_12_TransportTemperatureUnits = BUI_12_TransportTemperatureUnits;
    }
}

