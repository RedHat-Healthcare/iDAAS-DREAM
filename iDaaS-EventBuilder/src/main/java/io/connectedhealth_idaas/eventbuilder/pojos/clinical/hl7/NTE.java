package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NTE {
    private String NTE_1_SetIDNTE;
    private String NTE_2_SourceofComment;
    private String NTE_3_Comment;
    private String NTE_4_CommentType;
    private String NTE_5_EnteredBy;
    private String NTE_6_EnteredDateTime;
    private String NTE_7_EffectiveStartDate;
    private String NTE_8_ExpirationDate;

    public String getNTE_1_SetIDNTE() {
        return this.NTE_1_SetIDNTE;
    }

    public void setNTE_1_SetIDNTE(final String NTE_1_SetIDNTE) {
        this.NTE_1_SetIDNTE = NTE_1_SetIDNTE;
    }

    public String getNTE_2_SourceofComment() {
        return this.NTE_2_SourceofComment;
    }

    public void setNTE_2_SourceofComment(final String NTE_2_SourceofComment) {
        this.NTE_2_SourceofComment = NTE_2_SourceofComment;
    }

    public String getNTE_3_Comment() {
        return this.NTE_3_Comment;
    }

    public void setNTE_3_Comment(final String NTE_3_Comment) {
        this.NTE_3_Comment = NTE_3_Comment;
    }

    public String getNTE_4_CommentType() {
        return this.NTE_4_CommentType;
    }

    public void setNTE_4_CommentType(final String NTE_4_CommentType) {
        this.NTE_4_CommentType = NTE_4_CommentType;
    }

    public String getNTE_5_EnteredBy() {
        return this.NTE_5_EnteredBy;
    }

    public void setNTE_5_EnteredBy(final String NTE_5_EnteredBy) {
        this.NTE_5_EnteredBy = NTE_5_EnteredBy;
    }

    public String getNTE_6_EnteredDateTime() {
        return this.NTE_6_EnteredDateTime;
    }

    public void setNTE_6_EnteredDateTime(final String NTE_6_EnteredDateTime) {
        this.NTE_6_EnteredDateTime = NTE_6_EnteredDateTime;
    }

    public String getNTE_7_EffectiveStartDate() {
        return this.NTE_7_EffectiveStartDate;
    }

    public void setNTE_7_EffectiveStartDate(final String NTE_7_EffectiveStartDate) {
        this.NTE_7_EffectiveStartDate = NTE_7_EffectiveStartDate;
    }

    public String getNTE_8_ExpirationDate() {
        return this.NTE_8_ExpirationDate;
    }

    public void setNTE_8_ExpirationDate(final String NTE_8_ExpirationDate) {
        this.NTE_8_ExpirationDate = NTE_8_ExpirationDate;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

