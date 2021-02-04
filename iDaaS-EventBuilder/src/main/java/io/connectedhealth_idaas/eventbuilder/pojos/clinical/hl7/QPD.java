package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class QPD {
    private String QPD_1_MessageQueryName;
    private String QPD_2_QueryTag;
    private String QPD_3_UserParametersinsuccessivefields;

    public String getQPD_1_MessageQueryName() {
        return this.QPD_1_MessageQueryName;
    }

    public void setQPD_1_MessageQueryName(final String QPD_1_MessageQueryName) {
        this.QPD_1_MessageQueryName = QPD_1_MessageQueryName;
    }

    public String getQPD_2_QueryTag() {
        return this.QPD_2_QueryTag;
    }

    public void setQPD_2_QueryTag(final String QPD_2_QueryTag) {
        this.QPD_2_QueryTag = QPD_2_QueryTag;
    }

    public String getQPD_3_UserParametersinsuccessivefields() {
        return this.QPD_3_UserParametersinsuccessivefields;
    }

    public void setQPD_3_UserParametersinsuccessivefields(final String QPD_3_UserParametersinsuccessivefields) {
        this.QPD_3_UserParametersinsuccessivefields = QPD_3_UserParametersinsuccessivefields;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

