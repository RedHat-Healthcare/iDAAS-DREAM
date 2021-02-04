package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GP1 {
    private String GP1_1_TypeofBillCode;
    private String GP1_2_RevenueCode;
    private String GP1_3_OverallClaimDispositionCode;
    private String GP1_4_OCEEditsperVisitCode;
    private String GP1_5_OutlierCost;

    public String getGP1_1_TypeofBillCode() {
        return this.GP1_1_TypeofBillCode;
    }

    public void setGP1_1_TypeofBillCode(final String GP1_1_TypeofBillCode) {
        this.GP1_1_TypeofBillCode = GP1_1_TypeofBillCode;
    }

    public String getGP1_2_RevenueCode() {
        return this.GP1_2_RevenueCode;
    }

    public void setGP1_2_RevenueCode(final String GP1_2_RevenueCode) {
        this.GP1_2_RevenueCode = GP1_2_RevenueCode;
    }

    public String getGP1_3_OverallClaimDispositionCode() {
        return this.GP1_3_OverallClaimDispositionCode;
    }

    public void setGP1_3_OverallClaimDispositionCode(final String GP1_3_OverallClaimDispositionCode) {
        this.GP1_3_OverallClaimDispositionCode = GP1_3_OverallClaimDispositionCode;
    }

    public String getGP1_4_OCEEditsperVisitCode() {
        return this.GP1_4_OCEEditsperVisitCode;
    }

    public void setGP1_4_OCEEditsperVisitCode(final String GP1_4_OCEEditsperVisitCode) {
        this.GP1_4_OCEEditsperVisitCode = GP1_4_OCEEditsperVisitCode;
    }

    public String getGP1_5_OutlierCost() {
        return this.GP1_5_OutlierCost;
    }

    public void setGP1_5_OutlierCost(final String GP1_5_OutlierCost) {
        this.GP1_5_OutlierCost = GP1_5_OutlierCost;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

