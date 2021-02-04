package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CDM {
    private String CDM_1_PrimaryKeyValueCDM;
    private String CDM_2_ChargeCodeAlias;
    private String CDM_3_ChargeDescriptionShort;
    private String CDM_4_ChargeDescriptionLong;
    private String CDM_5_DescriptionOverrideIndicator;
    private String CDM_6_ExplodingCharges;
    private String CDM_7_ProcedureCode;
    private String CDM_8_ActiveInactiveFlag;
    private String CDM_9_InventoryNumber;
    private String CDM_10_ResourceLoad;
    private String CDM_11_ContractNumber;
    private String CDM_12_ContractOrganization;
    private String CDM_13_RoomFeeIndicator;

    public String getCDM_1_PrimaryKeyValueCDM() {
        return this.CDM_1_PrimaryKeyValueCDM;
    }

    public void setCDM_1_PrimaryKeyValueCDM(final String CDM_1_PrimaryKeyValueCDM) {
        this.CDM_1_PrimaryKeyValueCDM = CDM_1_PrimaryKeyValueCDM;
    }

    public String getCDM_2_ChargeCodeAlias() {
        return this.CDM_2_ChargeCodeAlias;
    }

    public void setCDM_2_ChargeCodeAlias(final String CDM_2_ChargeCodeAlias) {
        this.CDM_2_ChargeCodeAlias = CDM_2_ChargeCodeAlias;
    }

    public String getCDM_3_ChargeDescriptionShort() {
        return this.CDM_3_ChargeDescriptionShort;
    }

    public void setCDM_3_ChargeDescriptionShort(final String CDM_3_ChargeDescriptionShort) {
        this.CDM_3_ChargeDescriptionShort = CDM_3_ChargeDescriptionShort;
    }

    public String getCDM_4_ChargeDescriptionLong() {
        return this.CDM_4_ChargeDescriptionLong;
    }

    public void setCDM_4_ChargeDescriptionLong(final String CDM_4_ChargeDescriptionLong) {
        this.CDM_4_ChargeDescriptionLong = CDM_4_ChargeDescriptionLong;
    }

    public String getCDM_5_DescriptionOverrideIndicator() {
        return this.CDM_5_DescriptionOverrideIndicator;
    }

    public void setCDM_5_DescriptionOverrideIndicator(final String CDM_5_DescriptionOverrideIndicator) {
        this.CDM_5_DescriptionOverrideIndicator = CDM_5_DescriptionOverrideIndicator;
    }

    public String getCDM_6_ExplodingCharges() {
        return this.CDM_6_ExplodingCharges;
    }

    public void setCDM_6_ExplodingCharges(final String CDM_6_ExplodingCharges) {
        this.CDM_6_ExplodingCharges = CDM_6_ExplodingCharges;
    }

    public String getCDM_7_ProcedureCode() {
        return this.CDM_7_ProcedureCode;
    }

    public void setCDM_7_ProcedureCode(final String CDM_7_ProcedureCode) {
        this.CDM_7_ProcedureCode = CDM_7_ProcedureCode;
    }

    public String getCDM_8_ActiveInactiveFlag() {
        return this.CDM_8_ActiveInactiveFlag;
    }

    public void setCDM_8_ActiveInactiveFlag(final String CDM_8_ActiveInactiveFlag) {
        this.CDM_8_ActiveInactiveFlag = CDM_8_ActiveInactiveFlag;
    }

    public String getCDM_9_InventoryNumber() {
        return this.CDM_9_InventoryNumber;
    }

    public void setCDM_9_InventoryNumber(final String CDM_9_InventoryNumber) {
        this.CDM_9_InventoryNumber = CDM_9_InventoryNumber;
    }

    public String getCDM_10_ResourceLoad() {
        return this.CDM_10_ResourceLoad;
    }

    public void setCDM_10_ResourceLoad(final String CDM_10_ResourceLoad) {
        this.CDM_10_ResourceLoad = CDM_10_ResourceLoad;
    }

    public String getCDM_11_ContractNumber() {
        return this.CDM_11_ContractNumber;
    }

    public void setCDM_11_ContractNumber(final String CDM_11_ContractNumber) {
        this.CDM_11_ContractNumber = CDM_11_ContractNumber;
    }

    public String getCDM_12_ContractOrganization() {
        return this.CDM_12_ContractOrganization;
    }

    public void setCDM_12_ContractOrganization(final String CDM_12_ContractOrganization) {
        this.CDM_12_ContractOrganization = CDM_12_ContractOrganization;
    }

    public String getCDM_13_RoomFeeIndicator() {
        return this.CDM_13_RoomFeeIndicator;
    }

    public void setCDM_13_RoomFeeIndicator(final String CDM_13_RoomFeeIndicator) {
        this.CDM_13_RoomFeeIndicator = CDM_13_RoomFeeIndicator;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

