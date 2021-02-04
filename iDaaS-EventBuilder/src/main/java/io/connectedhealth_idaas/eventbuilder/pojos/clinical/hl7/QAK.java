package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class QAK {
    private String QAK_1_QueryTag;
    private String QAK_2_QueryResponseStatus;
    private String QAK_3_MessageQueryName;
    private String QAK_4_HitCountTotal;
    private String QAK_5_Thispayload;
    private String QAK_6_Hitsremaining;

    public String getQAK_1_QueryTag() {
        return this.QAK_1_QueryTag;
    }

    public void setQAK_1_QueryTag(final String QAK_1_QueryTag) {
        this.QAK_1_QueryTag = QAK_1_QueryTag;
    }

    public String getQAK_2_QueryResponseStatus() {
        return this.QAK_2_QueryResponseStatus;
    }

    public void setQAK_2_QueryResponseStatus(final String QAK_2_QueryResponseStatus) {
        this.QAK_2_QueryResponseStatus = QAK_2_QueryResponseStatus;
    }

    public String getQAK_3_MessageQueryName() {
        return this.QAK_3_MessageQueryName;
    }

    public void setQAK_3_MessageQueryName(final String QAK_3_MessageQueryName) {
        this.QAK_3_MessageQueryName = QAK_3_MessageQueryName;
    }

    public String getQAK_4_HitCountTotal() {
        return this.QAK_4_HitCountTotal;
    }

    public void setQAK_4_HitCountTotal(final String QAK_4_HitCountTotal) {
        this.QAK_4_HitCountTotal = QAK_4_HitCountTotal;
    }

    public String getQAK_5_Thispayload() {
        return this.QAK_5_Thispayload;
    }

    public void setQAK_5_Thispayload(final String QAK_5_Thispayload) {
        this.QAK_5_Thispayload = QAK_5_Thispayload;
    }

    public String getQAK_6_Hitsremaining() {
        return this.QAK_6_Hitsremaining;
    }

    public void setQAK_6_Hitsremaining(final String QAK_6_Hitsremaining) {
        this.QAK_6_Hitsremaining = QAK_6_Hitsremaining;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

