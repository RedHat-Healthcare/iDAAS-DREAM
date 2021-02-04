package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CM1 {
    private String CM1_1_SetIDCM1;
    private String CM1_2_StudyPhaseIdentifier;
    private String CM1_3_DescriptionofStudyPhase;

    public String getCM1_1_SetIDCM1() {
        return this.CM1_1_SetIDCM1;
    }

    public void setCM1_1_SetIDCM1(final String CM1_1_SetIDCM1) {
        this.CM1_1_SetIDCM1 = CM1_1_SetIDCM1;
    }

    public String getCM1_2_StudyPhaseIdentifier() {
        return this.CM1_2_StudyPhaseIdentifier;
    }

    public void setCM1_2_StudyPhaseIdentifier(final String CM1_2_StudyPhaseIdentifier) {
        this.CM1_2_StudyPhaseIdentifier = CM1_2_StudyPhaseIdentifier;
    }

    public String getCM1_3_DescriptionofStudyPhase() {
        return this.CM1_3_DescriptionofStudyPhase;
    }

    public void setCM1_3_DescriptionofStudyPhase(final String CM1_3_DescriptionofStudyPhase) {
        this.CM1_3_DescriptionofStudyPhase = CM1_3_DescriptionofStudyPhase;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

