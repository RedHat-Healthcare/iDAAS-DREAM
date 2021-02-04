package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PCE {
    private String PCE_1_SetIDPCE;
    private String PCE_2_CostCenterAccountNumber;
    private String PCE_3_TransactionCode;
    private String PCE_4_Transactionamountunit;

    public String getPCE_1_SetIDPCE() {
        return this.PCE_1_SetIDPCE;
    }

    public void setPCE_1_SetIDPCE(final String PCE_1_SetIDPCE) {
        this.PCE_1_SetIDPCE = PCE_1_SetIDPCE;
    }

    public String getPCE_2_CostCenterAccountNumber() {
        return this.PCE_2_CostCenterAccountNumber;
    }

    public void setPCE_2_CostCenterAccountNumber(final String PCE_2_CostCenterAccountNumber) {
        this.PCE_2_CostCenterAccountNumber = PCE_2_CostCenterAccountNumber;
    }

    public String getPCE_3_TransactionCode() {
        return this.PCE_3_TransactionCode;
    }

    public void setPCE_3_TransactionCode(final String PCE_3_TransactionCode) {
        this.PCE_3_TransactionCode = PCE_3_TransactionCode;
    }

    public String getPCE_4_Transactionamountunit() {
        return this.PCE_4_Transactionamountunit;
    }

    public void setPCE_4_Transactionamountunit(final String PCE_4_Transactionamountunit) {
        this.PCE_4_Transactionamountunit = PCE_4_Transactionamountunit;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

