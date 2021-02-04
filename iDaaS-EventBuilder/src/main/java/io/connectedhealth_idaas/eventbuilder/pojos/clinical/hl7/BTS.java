package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BTS {
    private String BTS_1_BatchMessageCount;
    private String BTS_2_BatchComment;
    private String BTS_3_BatchTotals;

    public String getBTS_1_BatchMessageCount() {
        return this.BTS_1_BatchMessageCount;
    }

    public void setBTS_1_BatchMessageCount(final String BTS_1_BatchMessageCount) {
        this.BTS_1_BatchMessageCount = BTS_1_BatchMessageCount;
    }

    public String getBTS_2_BatchComment() {
        return this.BTS_2_BatchComment;
    }

    public void setBTS_2_BatchComment(final String BTS_2_BatchComment) {
        this.BTS_2_BatchComment = BTS_2_BatchComment;
    }

    public String getBTS_3_BatchTotals() {
        return this.BTS_3_BatchTotals;
    }

    public void setBTS_3_BatchTotals(final String BTS_3_BatchTotals) {
        this.BTS_3_BatchTotals = BTS_3_BatchTotals;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

