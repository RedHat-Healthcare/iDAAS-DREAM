package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class APR {
    private String APR_1_TimeSelectionCriteria;
    private String APR_2_ResourceSelectionCriteria;
    private String APR_3_LocationSelectionCriteria;
    private String APR_4_SlotSpacingCriteria;
    private String APR_5_FillerOverrideCriteria;

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }

    public String getAPR_1_TimeSelectionCriteria() {
        return this.APR_1_TimeSelectionCriteria;
    }

    public void setAPR_1_TimeSelectionCriteria(final String APR_1_TimeSelectionCriteria) {
        this.APR_1_TimeSelectionCriteria = APR_1_TimeSelectionCriteria;
    }

    public String getAPR_2_ResourceSelectionCriteria() {
        return this.APR_2_ResourceSelectionCriteria;
    }

    public void setAPR_2_ResourceSelectionCriteria(final String APR_2_ResourceSelectionCriteria) {
        this.APR_2_ResourceSelectionCriteria = APR_2_ResourceSelectionCriteria;
    }

    public String getAPR_3_LocationSelectionCriteria() {
        return this.APR_3_LocationSelectionCriteria;
    }

    public void setAPR_3_LocationSelectionCriteria(final String APR_3_LocationSelectionCriteria) {
        this.APR_3_LocationSelectionCriteria = APR_3_LocationSelectionCriteria;
    }

    public String getAPR_4_SlotSpacingCriteria() {
        return this.APR_4_SlotSpacingCriteria;
    }

    public void setAPR_4_SlotSpacingCriteria(final String APR_4_SlotSpacingCriteria) {
        this.APR_4_SlotSpacingCriteria = APR_4_SlotSpacingCriteria;
    }

    public String getAPR_5_FillerOverrideCriteria() {
        return this.APR_5_FillerOverrideCriteria;
    }

    public void setAPR_5_FillerOverrideCriteria(final String APR_5_FillerOverrideCriteria) {
        this.APR_5_FillerOverrideCriteria = APR_5_FillerOverrideCriteria;
    }
}

