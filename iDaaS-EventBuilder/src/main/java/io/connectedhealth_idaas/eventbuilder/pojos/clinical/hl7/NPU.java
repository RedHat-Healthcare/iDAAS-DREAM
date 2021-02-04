package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NPU {
    private String NPU_1_BedLocation;
    private String NPU_2_BedStatus;

    public String getNPU_1_BedLocation() {
        return this.NPU_1_BedLocation;
    }

    public void setNPU_1_BedLocation(final String NPU_1_BedLocation) {
        this.NPU_1_BedLocation = NPU_1_BedLocation;
    }

    public String getNPU_2_BedStatus() {
        return this.NPU_2_BedStatus;
    }

    public void setNPU_2_BedStatus(final String NPU_2_BedStatus) {
        this.NPU_2_BedStatus = NPU_2_BedStatus;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

