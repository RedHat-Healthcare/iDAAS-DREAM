package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class NDS {
    private String NDS_1_NotificationReferenceNumber;
    private String NDS_2_NotificationDateTime;
    private String NDS_3_NotificationAlertSeverity;
    private String NDS_4_NotificationCode;

    public String getNDS_1_NotificationReferenceNumber() {
        return this.NDS_1_NotificationReferenceNumber;
    }

    public void setNDS_1_NotificationReferenceNumber(final String NDS_1_NotificationReferenceNumber) {
        this.NDS_1_NotificationReferenceNumber = NDS_1_NotificationReferenceNumber;
    }

    public String getNDS_2_NotificationDateTime() {
        return this.NDS_2_NotificationDateTime;
    }

    public void setNDS_2_NotificationDateTime(final String NDS_2_NotificationDateTime) {
        this.NDS_2_NotificationDateTime = NDS_2_NotificationDateTime;
    }

    public String getNDS_3_NotificationAlertSeverity() {
        return this.NDS_3_NotificationAlertSeverity;
    }

    public void setNDS_3_NotificationAlertSeverity(final String NDS_3_NotificationAlertSeverity) {
        this.NDS_3_NotificationAlertSeverity = NDS_3_NotificationAlertSeverity;
    }

    public String getNDS_4_NotificationCode() {
        return this.NDS_4_NotificationCode;
    }

    public void setNDS_4_NotificationCode(final String NDS_4_NotificationCode) {
        this.NDS_4_NotificationCode = NDS_4_NotificationCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

