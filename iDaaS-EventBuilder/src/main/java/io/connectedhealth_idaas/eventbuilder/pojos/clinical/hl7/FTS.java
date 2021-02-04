package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class FTS {
    private String FTS_1_FileBatchCount;
    private String FTS_2_FileTrailerComment;

    public String getFTS_1_FileBatchCount() {
        return this.FTS_1_FileBatchCount;
    }

    public void setFTS_1_FileBatchCount(final String FTS_1_FileBatchCount) {
        this.FTS_1_FileBatchCount = FTS_1_FileBatchCount;
    }

    public String getFTS_2_FileTrailerComment() {
        return this.FTS_2_FileTrailerComment;
    }

    public void setFTS_2_FileTrailerComment(final String FTS_2_FileTrailerComment) {
        this.FTS_2_FileTrailerComment = FTS_2_FileTrailerComment;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

