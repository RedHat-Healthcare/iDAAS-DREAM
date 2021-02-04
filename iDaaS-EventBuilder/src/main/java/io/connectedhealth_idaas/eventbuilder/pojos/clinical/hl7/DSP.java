package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DSP {
    private String DSP_1_SetIDDSP;
    private String DSP_2_DisplayLevel;
    private String DSP_3_DataLine;
    private String DSP_4_LogicalBreakPoint;
    private String DSP_5_ResultID;

    public String getDSP_1_SetIDDSP() {
        return this.DSP_1_SetIDDSP;
    }

    public void setDSP_1_SetIDDSP(final String DSP_1_SetIDDSP) {
        this.DSP_1_SetIDDSP = DSP_1_SetIDDSP;
    }

    public String getDSP_2_DisplayLevel() {
        return this.DSP_2_DisplayLevel;
    }

    public void setDSP_2_DisplayLevel(final String DSP_2_DisplayLevel) {
        this.DSP_2_DisplayLevel = DSP_2_DisplayLevel;
    }

    public String getDSP_3_DataLine() {
        return this.DSP_3_DataLine;
    }

    public void setDSP_3_DataLine(final String DSP_3_DataLine) {
        this.DSP_3_DataLine = DSP_3_DataLine;
    }

    public String getDSP_4_LogicalBreakPoint() {
        return this.DSP_4_LogicalBreakPoint;
    }

    public void setDSP_4_LogicalBreakPoint(final String DSP_4_LogicalBreakPoint) {
        this.DSP_4_LogicalBreakPoint = DSP_4_LogicalBreakPoint;
    }

    public String getDSP_5_ResultID() {
        return this.DSP_5_ResultID;
    }

    public void setDSP_5_ResultID(final String DSP_5_ResultID) {
        this.DSP_5_ResultID = DSP_5_ResultID;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

