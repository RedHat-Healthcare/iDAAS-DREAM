package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CNS {
    private String CNS_1_StartingNotificationReferenceNumber;
    private String CNS_2_EndingNotificationReferenceNumber;
    private String CNS_3_StartingNotificationDateTime;
    private String CNS_4_EndingNotificationDateTime;
    private String CNS_5_StartingNotificationCode;
    private String CNS_6_EndingNotificationCode;

    public String getCNS_1_StartingNotificationReferenceNumber() {
        return this.CNS_1_StartingNotificationReferenceNumber;
    }

    public void setCNS_1_StartingNotificationReferenceNumber(final String CNS_1_StartingNotificationReferenceNumber) {
        this.CNS_1_StartingNotificationReferenceNumber = CNS_1_StartingNotificationReferenceNumber;
    }

    public String getCNS_2_EndingNotificationReferenceNumber() {
        return this.CNS_2_EndingNotificationReferenceNumber;
    }

    public void setCNS_2_EndingNotificationReferenceNumber(final String CNS_2_EndingNotificationReferenceNumber) {
        this.CNS_2_EndingNotificationReferenceNumber = CNS_2_EndingNotificationReferenceNumber;
    }

    public String getCNS_3_StartingNotificationDateTime() {
        return this.CNS_3_StartingNotificationDateTime;
    }

    public void setCNS_3_StartingNotificationDateTime(final String CNS_3_StartingNotificationDateTime) {
        this.CNS_3_StartingNotificationDateTime = CNS_3_StartingNotificationDateTime;
    }

    public String getCNS_4_EndingNotificationDateTime() {
        return this.CNS_4_EndingNotificationDateTime;
    }

    public void setCNS_4_EndingNotificationDateTime(final String CNS_4_EndingNotificationDateTime) {
        this.CNS_4_EndingNotificationDateTime = CNS_4_EndingNotificationDateTime;
    }

    public String getCNS_5_StartingNotificationCode() {
        return this.CNS_5_StartingNotificationCode;
    }

    public void setCNS_5_StartingNotificationCode(final String CNS_5_StartingNotificationCode) {
        this.CNS_5_StartingNotificationCode = CNS_5_StartingNotificationCode;
    }

    public String getCNS_6_EndingNotificationCode() {
        return this.CNS_6_EndingNotificationCode;
    }

    public void setCNS_6_EndingNotificationCode(final String CNS_6_EndingNotificationCode) {
        this.CNS_6_EndingNotificationCode = CNS_6_EndingNotificationCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

