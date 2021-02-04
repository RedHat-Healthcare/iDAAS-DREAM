package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CDO {
    private String CDO_1_SetIDCDO;
    private String CDO_2_ActionCode;
    private String CDO_3_CumulativeDosageLimit;
    private String CDO_4_CumulativeDosageLimitTimeInterval;

    public String getCDO_1_SetIDCDO() {
        return this.CDO_1_SetIDCDO;
    }

    public void setCDO_1_SetIDCDO(final String CDO_1_SetIDCDO) {
        this.CDO_1_SetIDCDO = CDO_1_SetIDCDO;
    }

    public String getCDO_2_ActionCode() {
        return this.CDO_2_ActionCode;
    }

    public void setCDO_2_ActionCode(final String CDO_2_ActionCode) {
        this.CDO_2_ActionCode = CDO_2_ActionCode;
    }

    public String getCDO_3_CumulativeDosageLimit() {
        return this.CDO_3_CumulativeDosageLimit;
    }

    public void setCDO_3_CumulativeDosageLimit(final String CDO_3_CumulativeDosageLimit) {
        this.CDO_3_CumulativeDosageLimit = CDO_3_CumulativeDosageLimit;
    }

    public String getCDO_4_CumulativeDosageLimitTimeInterval() {
        return this.CDO_4_CumulativeDosageLimitTimeInterval;
    }

    public void setCDO_4_CumulativeDosageLimitTimeInterval(final String CDO_4_CumulativeDosageLimitTimeInterval) {
        this.CDO_4_CumulativeDosageLimitTimeInterval = CDO_4_CumulativeDosageLimitTimeInterval;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

