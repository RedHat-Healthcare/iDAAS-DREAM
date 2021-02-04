package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CM2 {
    private String CM2_1_SetIDCM2;
    private String CM2_2_ScheduledTimePoint;
    private String CM2_3_DescriptionofTimePoint;
    private String CM2_4_EventsScheduledThisTimePoint;

    public String getCM2_1_SetIDCM2() {
        return this.CM2_1_SetIDCM2;
    }

    public void setCM2_1_SetIDCM2(final String CM2_1_SetIDCM2) {
        this.CM2_1_SetIDCM2 = CM2_1_SetIDCM2;
    }

    public String getCM2_2_ScheduledTimePoint() {
        return this.CM2_2_ScheduledTimePoint;
    }

    public void setCM2_2_ScheduledTimePoint(final String CM2_2_ScheduledTimePoint) {
        this.CM2_2_ScheduledTimePoint = CM2_2_ScheduledTimePoint;
    }

    public String getCM2_3_DescriptionofTimePoint() {
        return this.CM2_3_DescriptionofTimePoint;
    }

    public void setCM2_3_DescriptionofTimePoint(final String CM2_3_DescriptionofTimePoint) {
        this.CM2_3_DescriptionofTimePoint = CM2_3_DescriptionofTimePoint;
    }

    public String getCM2_4_EventsScheduledThisTimePoint() {
        return this.CM2_4_EventsScheduledThisTimePoint;
    }

    public void setCM2_4_EventsScheduledThisTimePoint(final String CM2_4_EventsScheduledThisTimePoint) {
        this.CM2_4_EventsScheduledThisTimePoint = CM2_4_EventsScheduledThisTimePoint;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

