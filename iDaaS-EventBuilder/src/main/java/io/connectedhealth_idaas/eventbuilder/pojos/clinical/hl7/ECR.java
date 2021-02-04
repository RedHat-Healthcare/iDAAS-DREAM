package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ECR {
    private String ECR_1_CommandResponse;
    private String ECR_2_DateTimeCompleted;
    private String ECR_3_CommandResponseParameters;

    public String getECR_1_CommandResponse() {
        return this.ECR_1_CommandResponse;
    }

    public void setECR_1_CommandResponse(final String ECR_1_CommandResponse) {
        this.ECR_1_CommandResponse = ECR_1_CommandResponse;
    }

    public String getECR_2_DateTimeCompleted() {
        return this.ECR_2_DateTimeCompleted;
    }

    public void setECR_2_DateTimeCompleted(final String ECR_2_DateTimeCompleted) {
        this.ECR_2_DateTimeCompleted = ECR_2_DateTimeCompleted;
    }

    public String getECR_3_CommandResponseParameters() {
        return this.ECR_3_CommandResponseParameters;
    }

    public void setECR_3_CommandResponseParameters(final String ECR_3_CommandResponseParameters) {
        this.ECR_3_CommandResponseParameters = ECR_3_CommandResponseParameters;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

