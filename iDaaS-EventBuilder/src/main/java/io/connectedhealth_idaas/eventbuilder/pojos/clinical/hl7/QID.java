package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class QID {
    private String QID_1_QueryTag;
    private String QID_2_MessageQueryName;

    public String getQID_1_QueryTag() {
        return this.QID_1_QueryTag;
    }

    public void setQID_1_QueryTag(final String QID_1_QueryTag) {
        this.QID_1_QueryTag = QID_1_QueryTag;
    }

    public String getQID_2_MessageQueryName() {
        return this.QID_2_MessageQueryName;
    }

    public void setQID_2_MessageQueryName(final String QID_2_MessageQueryName) {
        this.QID_2_MessageQueryName = QID_2_MessageQueryName;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

