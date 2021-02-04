package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EQP {
    private String EQP_1_Eventtype;
    private String EQP_2_FileName;
    private String EQP_3_StartDateTime;
    private String EQP_4_EndDateTime;
    private String EQP_5_TransactionData;

    public String getEQP_1_Eventtype() {
        return this.EQP_1_Eventtype;
    }

    public void setEQP_1_Eventtype(final String EQP_1_Eventtype) {
        this.EQP_1_Eventtype = EQP_1_Eventtype;
    }

    public String getEQP_2_FileName() {
        return this.EQP_2_FileName;
    }

    public void setEQP_2_FileName(final String EQP_2_FileName) {
        this.EQP_2_FileName = EQP_2_FileName;
    }

    public String getEQP_3_StartDateTime() {
        return this.EQP_3_StartDateTime;
    }

    public void setEQP_3_StartDateTime(final String EQP_3_StartDateTime) {
        this.EQP_3_StartDateTime = EQP_3_StartDateTime;
    }

    public String getEQP_4_EndDateTime() {
        return this.EQP_4_EndDateTime;
    }

    public void setEQP_4_EndDateTime(final String EQP_4_EndDateTime) {
        this.EQP_4_EndDateTime = EQP_4_EndDateTime;
    }

    public String getEQP_5_TransactionData() {
        return this.EQP_5_TransactionData;
    }

    public void setEQP_5_TransactionData(final String EQP_5_TransactionData) {
        this.EQP_5_TransactionData = EQP_5_TransactionData;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

