package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PSH {
    private String PSH_1_ReportType;
    private String PSH_2_ReportFormIdentifier;
    private String PSH_3_ReportDate;
    private String PSH_4_ReportIntervalStartDate;
    private String PSH_5_ReportIntervalEndDate;
    private String PSH_6_QuantityManufactured;
    private String PSH_7_QuantityDistributed;
    private String PSH_8_QuantityDistributedMethod;
    private String PSH_9_QuantityDistributedComment;
    private String PSH_10_QuantityinUse;
    private String PSH_11_QuantityinUseMethod;
    private String PSH_12_QuantityinUseComment;
    private String PSH_13_NumberofProductExperienceReportsFiledbyFacility;
    private String PSH_14_NumberofProductExperienceReportsFiledbyDistributor;

    public String getPSH_1_ReportType() {
        return this.PSH_1_ReportType;
    }

    public void setPSH_1_ReportType(final String PSH_1_ReportType) {
        this.PSH_1_ReportType = PSH_1_ReportType;
    }

    public String getPSH_2_ReportFormIdentifier() {
        return this.PSH_2_ReportFormIdentifier;
    }

    public void setPSH_2_ReportFormIdentifier(final String PSH_2_ReportFormIdentifier) {
        this.PSH_2_ReportFormIdentifier = PSH_2_ReportFormIdentifier;
    }

    public String getPSH_3_ReportDate() {
        return this.PSH_3_ReportDate;
    }

    public void setPSH_3_ReportDate(final String PSH_3_ReportDate) {
        this.PSH_3_ReportDate = PSH_3_ReportDate;
    }

    public String getPSH_4_ReportIntervalStartDate() {
        return this.PSH_4_ReportIntervalStartDate;
    }

    public void setPSH_4_ReportIntervalStartDate(final String PSH_4_ReportIntervalStartDate) {
        this.PSH_4_ReportIntervalStartDate = PSH_4_ReportIntervalStartDate;
    }

    public String getPSH_5_ReportIntervalEndDate() {
        return this.PSH_5_ReportIntervalEndDate;
    }

    public void setPSH_5_ReportIntervalEndDate(final String PSH_5_ReportIntervalEndDate) {
        this.PSH_5_ReportIntervalEndDate = PSH_5_ReportIntervalEndDate;
    }

    public String getPSH_6_QuantityManufactured() {
        return this.PSH_6_QuantityManufactured;
    }

    public void setPSH_6_QuantityManufactured(final String PSH_6_QuantityManufactured) {
        this.PSH_6_QuantityManufactured = PSH_6_QuantityManufactured;
    }

    public String getPSH_7_QuantityDistributed() {
        return this.PSH_7_QuantityDistributed;
    }

    public void setPSH_7_QuantityDistributed(final String PSH_7_QuantityDistributed) {
        this.PSH_7_QuantityDistributed = PSH_7_QuantityDistributed;
    }

    public String getPSH_8_QuantityDistributedMethod() {
        return this.PSH_8_QuantityDistributedMethod;
    }

    public void setPSH_8_QuantityDistributedMethod(final String PSH_8_QuantityDistributedMethod) {
        this.PSH_8_QuantityDistributedMethod = PSH_8_QuantityDistributedMethod;
    }

    public String getPSH_9_QuantityDistributedComment() {
        return this.PSH_9_QuantityDistributedComment;
    }

    public void setPSH_9_QuantityDistributedComment(final String PSH_9_QuantityDistributedComment) {
        this.PSH_9_QuantityDistributedComment = PSH_9_QuantityDistributedComment;
    }

    public String getPSH_10_QuantityinUse() {
        return this.PSH_10_QuantityinUse;
    }

    public void setPSH_10_QuantityinUse(final String PSH_10_QuantityinUse) {
        this.PSH_10_QuantityinUse = PSH_10_QuantityinUse;
    }

    public String getPSH_11_QuantityinUseMethod() {
        return this.PSH_11_QuantityinUseMethod;
    }

    public void setPSH_11_QuantityinUseMethod(final String PSH_11_QuantityinUseMethod) {
        this.PSH_11_QuantityinUseMethod = PSH_11_QuantityinUseMethod;
    }

    public String getPSH_12_QuantityinUseComment() {
        return this.PSH_12_QuantityinUseComment;
    }

    public void setPSH_12_QuantityinUseComment(final String PSH_12_QuantityinUseComment) {
        this.PSH_12_QuantityinUseComment = PSH_12_QuantityinUseComment;
    }

    public String getPSH_13_NumberofProductExperienceReportsFiledbyFacility() {
        return this.PSH_13_NumberofProductExperienceReportsFiledbyFacility;
    }

    public void setPSH_13_NumberofProductExperienceReportsFiledbyFacility(final String PSH_13_NumberofProductExperienceReportsFiledbyFacility) {
        this.PSH_13_NumberofProductExperienceReportsFiledbyFacility = PSH_13_NumberofProductExperienceReportsFiledbyFacility;
    }

    public String getPSH_14_NumberofProductExperienceReportsFiledbyDistributor() {
        return this.PSH_14_NumberofProductExperienceReportsFiledbyDistributor;
    }

    public void setPSH_14_NumberofProductExperienceReportsFiledbyDistributor(final String PSH_14_NumberofProductExperienceReportsFiledbyDistributor) {
        this.PSH_14_NumberofProductExperienceReportsFiledbyDistributor = PSH_14_NumberofProductExperienceReportsFiledbyDistributor;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

