package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DPS {
    private String DPS_1_DiagnosisCodeMCP;
    private String DPS_2_ProcedureCode;
    private String DPS_3_EffectiveDateTime;
    private String DPS_4_ExpirationDateTime;
    private String DPS_5_TypeofLimitation;

    public String getDPS_1_DiagnosisCodeMCP() {
        return this.DPS_1_DiagnosisCodeMCP;
    }

    public void setDPS_1_DiagnosisCodeMCP(final String DPS_1_DiagnosisCodeMCP) {
        this.DPS_1_DiagnosisCodeMCP = DPS_1_DiagnosisCodeMCP;
    }

    public String getDPS_2_ProcedureCode() {
        return this.DPS_2_ProcedureCode;
    }

    public void setDPS_2_ProcedureCode(final String DPS_2_ProcedureCode) {
        this.DPS_2_ProcedureCode = DPS_2_ProcedureCode;
    }

    public String getDPS_3_EffectiveDateTime() {
        return this.DPS_3_EffectiveDateTime;
    }

    public void setDPS_3_EffectiveDateTime(final String DPS_3_EffectiveDateTime) {
        this.DPS_3_EffectiveDateTime = DPS_3_EffectiveDateTime;
    }

    public String getDPS_4_ExpirationDateTime() {
        return this.DPS_4_ExpirationDateTime;
    }

    public void setDPS_4_ExpirationDateTime(final String DPS_4_ExpirationDateTime) {
        this.DPS_4_ExpirationDateTime = DPS_4_ExpirationDateTime;
    }

    public String getDPS_5_TypeofLimitation() {
        return this.DPS_5_TypeofLimitation;
    }

    public void setDPS_5_TypeofLimitation(final String DPS_5_TypeofLimitation) {
        this.DPS_5_TypeofLimitation = DPS_5_TypeofLimitation;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

