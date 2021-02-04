package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class STZ {
    private String STZ_1_SterilizationType;
    private String STZ_2_SterilizationCycle;
    private String STZ_3_MaintenanceCycle;
    private String STZ_4_MaintenanceType;

    public String getSTZ_1_SterilizationType() {
        return this.STZ_1_SterilizationType;
    }

    public void setSTZ_1_SterilizationType(final String STZ_1_SterilizationType) {
        this.STZ_1_SterilizationType = STZ_1_SterilizationType;
    }

    public String getSTZ_2_SterilizationCycle() {
        return this.STZ_2_SterilizationCycle;
    }

    public void setSTZ_2_SterilizationCycle(final String STZ_2_SterilizationCycle) {
        this.STZ_2_SterilizationCycle = STZ_2_SterilizationCycle;
    }

    public String getSTZ_3_MaintenanceCycle() {
        return this.STZ_3_MaintenanceCycle;
    }

    public void setSTZ_3_MaintenanceCycle(final String STZ_3_MaintenanceCycle) {
        this.STZ_3_MaintenanceCycle = STZ_3_MaintenanceCycle;
    }

    public String getSTZ_4_MaintenanceType() {
        return this.STZ_4_MaintenanceType;
    }

    public void setSTZ_4_MaintenanceType(final String STZ_4_MaintenanceType) {
        this.STZ_4_MaintenanceType = STZ_4_MaintenanceType;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

