package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VAR {
    private String VAR_1_VarianceInstanceID;
    private String VAR_2_DocumentedDateTime;
    private String VAR_3_StatedVarianceDateTime;
    private String VAR_4_VarianceOriginator;
    private String VAR_5_VarianceClassification;
    private String VAR_6_VarianceDescription;

    public String getVAR_1_VarianceInstanceID() {
        return this.VAR_1_VarianceInstanceID;
    }

    public void setVAR_1_VarianceInstanceID(final String VAR_1_VarianceInstanceID) {
        this.VAR_1_VarianceInstanceID = VAR_1_VarianceInstanceID;
    }

    public String getVAR_2_DocumentedDateTime() {
        return this.VAR_2_DocumentedDateTime;
    }

    public void setVAR_2_DocumentedDateTime(final String VAR_2_DocumentedDateTime) {
        this.VAR_2_DocumentedDateTime = VAR_2_DocumentedDateTime;
    }

    public String getVAR_3_StatedVarianceDateTime() {
        return this.VAR_3_StatedVarianceDateTime;
    }

    public void setVAR_3_StatedVarianceDateTime(final String VAR_3_StatedVarianceDateTime) {
        this.VAR_3_StatedVarianceDateTime = VAR_3_StatedVarianceDateTime;
    }

    public String getVAR_4_VarianceOriginator() {
        return this.VAR_4_VarianceOriginator;
    }

    public void setVAR_4_VarianceOriginator(final String VAR_4_VarianceOriginator) {
        this.VAR_4_VarianceOriginator = VAR_4_VarianceOriginator;
    }

    public String getVAR_5_VarianceClassification() {
        return this.VAR_5_VarianceClassification;
    }

    public void setVAR_5_VarianceClassification(final String VAR_5_VarianceClassification) {
        this.VAR_5_VarianceClassification = VAR_5_VarianceClassification;
    }

    public String getVAR_6_VarianceDescription() {
        return this.VAR_6_VarianceDescription;
    }

    public void setVAR_6_VarianceDescription(final String VAR_6_VarianceDescription) {
        this.VAR_6_VarianceDescription = VAR_6_VarianceDescription;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

