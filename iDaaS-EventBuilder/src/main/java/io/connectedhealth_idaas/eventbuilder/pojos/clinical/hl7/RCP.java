package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RCP {
    private String RCP_1_QueryPriority;
    private String RCP_2_QuantityLimitedRequest;
    private String RCP_3_ResponseModality;
    private String RCP_4_ExecutionandDeliveryTime;
    private String RCP_5_ModifyIndicator;
    private String RCP_6_SortbyField;
    private String RCP_7_Segmentgroupinclusion;

    public String getRCP_1_QueryPriority() {
        return this.RCP_1_QueryPriority;
    }

    public void setRCP_1_QueryPriority(final String RCP_1_QueryPriority) {
        this.RCP_1_QueryPriority = RCP_1_QueryPriority;
    }

    public String getRCP_2_QuantityLimitedRequest() {
        return this.RCP_2_QuantityLimitedRequest;
    }

    public void setRCP_2_QuantityLimitedRequest(final String RCP_2_QuantityLimitedRequest) {
        this.RCP_2_QuantityLimitedRequest = RCP_2_QuantityLimitedRequest;
    }

    public String getRCP_3_ResponseModality() {
        return this.RCP_3_ResponseModality;
    }

    public void setRCP_3_ResponseModality(final String RCP_3_ResponseModality) {
        this.RCP_3_ResponseModality = RCP_3_ResponseModality;
    }

    public String getRCP_4_ExecutionandDeliveryTime() {
        return this.RCP_4_ExecutionandDeliveryTime;
    }

    public void setRCP_4_ExecutionandDeliveryTime(final String RCP_4_ExecutionandDeliveryTime) {
        this.RCP_4_ExecutionandDeliveryTime = RCP_4_ExecutionandDeliveryTime;
    }

    public String getRCP_5_ModifyIndicator() {
        return this.RCP_5_ModifyIndicator;
    }

    public void setRCP_5_ModifyIndicator(final String RCP_5_ModifyIndicator) {
        this.RCP_5_ModifyIndicator = RCP_5_ModifyIndicator;
    }

    public String getRCP_6_SortbyField() {
        return this.RCP_6_SortbyField;
    }

    public void setRCP_6_SortbyField(final String RCP_6_SortbyField) {
        this.RCP_6_SortbyField = RCP_6_SortbyField;
    }

    public String getRCP_7_Segmentgroupinclusion() {
        return this.RCP_7_Segmentgroupinclusion;
    }

    public void setRCP_7_Segmentgroupinclusion(final String RCP_7_Segmentgroupinclusion) {
        this.RCP_7_Segmentgroupinclusion = RCP_7_Segmentgroupinclusion;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

