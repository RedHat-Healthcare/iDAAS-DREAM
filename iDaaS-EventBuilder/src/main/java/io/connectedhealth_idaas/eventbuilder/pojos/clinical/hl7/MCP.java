package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MCP {
    private String MCP_1_SetIDMCP;
    private String MCP_2_ProducersServiceTestObservationID;
    private String MCP_3_UniversalServicePriceRangeLowValue;
    private String MCP_4_UniversalServicePriceRangeHighValue;
    private String MCP_5_ReasonforUniversalServiceCostRange;

    public String getMCP_1_SetIDMCP() {
        return this.MCP_1_SetIDMCP;
    }

    public void setMCP_1_SetIDMCP(final String MCP_1_SetIDMCP) {
        this.MCP_1_SetIDMCP = MCP_1_SetIDMCP;
    }

    public String getMCP_2_ProducersServiceTestObservationID() {
        return this.MCP_2_ProducersServiceTestObservationID;
    }

    public void setMCP_2_ProducersServiceTestObservationID(final String MCP_2_ProducersServiceTestObservationID) {
        this.MCP_2_ProducersServiceTestObservationID = MCP_2_ProducersServiceTestObservationID;
    }

    public String getMCP_3_UniversalServicePriceRangeLowValue() {
        return this.MCP_3_UniversalServicePriceRangeLowValue;
    }

    public void setMCP_3_UniversalServicePriceRangeLowValue(final String MCP_3_UniversalServicePriceRangeLowValue) {
        this.MCP_3_UniversalServicePriceRangeLowValue = MCP_3_UniversalServicePriceRangeLowValue;
    }

    public String getMCP_4_UniversalServicePriceRangeHighValue() {
        return this.MCP_4_UniversalServicePriceRangeHighValue;
    }

    public void setMCP_4_UniversalServicePriceRangeHighValue(final String MCP_4_UniversalServicePriceRangeHighValue) {
        this.MCP_4_UniversalServicePriceRangeHighValue = MCP_4_UniversalServicePriceRangeHighValue;
    }

    public String getMCP_5_ReasonforUniversalServiceCostRange() {
        return this.MCP_5_ReasonforUniversalServiceCostRange;
    }

    public void setMCP_5_ReasonforUniversalServiceCostRange(final String MCP_5_ReasonforUniversalServiceCostRange) {
        this.MCP_5_ReasonforUniversalServiceCostRange = MCP_5_ReasonforUniversalServiceCostRange;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

