package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RQD {
    private String RQD_1_RequisitionLineNumber;
    private String RQD_2_ItemCodeInternal;
    private String RQD_3_ItemCodeExternal;
    private String RQD_4_HospitalItemCode;
    private String RQD_5_RequisitionQuantity;
    private String RQD_6_RequisitionUnitofMeasure;
    private String RQD_7_CostCenterAccountNumber;
    private String RQD_8_ItemNaturalAccountCode;
    private String RQD_9_DeliverToID;
    private String RQD_10_DateNeeded;

    public String getRQD_1_RequisitionLineNumber() {
        return this.RQD_1_RequisitionLineNumber;
    }

    public void setRQD_1_RequisitionLineNumber(final String RQD_1_RequisitionLineNumber) {
        this.RQD_1_RequisitionLineNumber = RQD_1_RequisitionLineNumber;
    }

    public String getRQD_2_ItemCodeInternal() {
        return this.RQD_2_ItemCodeInternal;
    }

    public void setRQD_2_ItemCodeInternal(final String RQD_2_ItemCodeInternal) {
        this.RQD_2_ItemCodeInternal = RQD_2_ItemCodeInternal;
    }

    public String getRQD_3_ItemCodeExternal() {
        return this.RQD_3_ItemCodeExternal;
    }

    public void setRQD_3_ItemCodeExternal(final String RQD_3_ItemCodeExternal) {
        this.RQD_3_ItemCodeExternal = RQD_3_ItemCodeExternal;
    }

    public String getRQD_4_HospitalItemCode() {
        return this.RQD_4_HospitalItemCode;
    }

    public void setRQD_4_HospitalItemCode(final String RQD_4_HospitalItemCode) {
        this.RQD_4_HospitalItemCode = RQD_4_HospitalItemCode;
    }

    public String getRQD_5_RequisitionQuantity() {
        return this.RQD_5_RequisitionQuantity;
    }

    public void setRQD_5_RequisitionQuantity(final String RQD_5_RequisitionQuantity) {
        this.RQD_5_RequisitionQuantity = RQD_5_RequisitionQuantity;
    }

    public String getRQD_6_RequisitionUnitofMeasure() {
        return this.RQD_6_RequisitionUnitofMeasure;
    }

    public void setRQD_6_RequisitionUnitofMeasure(final String RQD_6_RequisitionUnitofMeasure) {
        this.RQD_6_RequisitionUnitofMeasure = RQD_6_RequisitionUnitofMeasure;
    }

    public String getRQD_7_CostCenterAccountNumber() {
        return this.RQD_7_CostCenterAccountNumber;
    }

    public void setRQD_7_CostCenterAccountNumber(final String RQD_7_CostCenterAccountNumber) {
        this.RQD_7_CostCenterAccountNumber = RQD_7_CostCenterAccountNumber;
    }

    public String getRQD_8_ItemNaturalAccountCode() {
        return this.RQD_8_ItemNaturalAccountCode;
    }

    public void setRQD_8_ItemNaturalAccountCode(final String RQD_8_ItemNaturalAccountCode) {
        this.RQD_8_ItemNaturalAccountCode = RQD_8_ItemNaturalAccountCode;
    }

    public String getRQD_9_DeliverToID() {
        return this.RQD_9_DeliverToID;
    }

    public void setRQD_9_DeliverToID(final String RQD_9_DeliverToID) {
        this.RQD_9_DeliverToID = RQD_9_DeliverToID;
    }

    public String getRQD_10_DateNeeded() {
        return this.RQD_10_DateNeeded;
    }

    public void setRQD_10_DateNeeded(final String RQD_10_DateNeeded) {
        this.RQD_10_DateNeeded = RQD_10_DateNeeded;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

