package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import io.connectedhealth_idaas.eventbuilder.common.hl7.HL7Versions;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EVN {
    private String EVN_1_EventTypeCode;
    private String EVN_2_RecordedDateTime;
    private String EVN_3_DateTimePlannedEvent;
    private String EVN_4_EventReasonCode;
    private String EVN_5_OperatorID;
    private String EVN_6_EventOccurred;
    private String EVN_7_EventFacility;

    public String buildSegment(HL7Versions hl7Version, String fieldDelimiter) {
        StringBuilder builder = new StringBuilder();
        switch (hl7Version)
        {
            case VERSION_2_5_1: {
                builder.append("EVN").append(fieldDelimiter).append(EVN_1_EventTypeCode).append(fieldDelimiter).append(EVN_2_RecordedDateTime).append(fieldDelimiter)
                        .append(EVN_3_DateTimePlannedEvent).append(fieldDelimiter).append(EVN_4_EventReasonCode).append(fieldDelimiter).append(EVN_5_OperatorID)
                        .append(fieldDelimiter).append(EVN_6_EventOccurred).append(fieldDelimiter).append( EVN_7_EventFacility).append(fieldDelimiter);
            }
            break;
        }
        return builder.toString();
    }
    public String buildSegment(HL7Versions hl7Version) {
        return buildSegment(hl7Version,"|");
    }

    public String getEVN_1_EventTypeCode() {
        return this.EVN_1_EventTypeCode;
    }

    public void setEVN_1_EventTypeCode(final String EVN_1_EventTypeCode) {
        this.EVN_1_EventTypeCode = EVN_1_EventTypeCode;
    }

    public String getEVN_2_RecordedDateTime() {
        return this.EVN_2_RecordedDateTime;
    }

    public void setEVN_2_RecordedDateTime(final String EVN_2_RecordedDateTime) {
        this.EVN_2_RecordedDateTime = EVN_2_RecordedDateTime;
    }

    public String getEVN_3_DateTimePlannedEvent() {
        return this.EVN_3_DateTimePlannedEvent;
    }

    public void setEVN_3_DateTimePlannedEvent(final String EVN_3_DateTimePlannedEvent) {
        this.EVN_3_DateTimePlannedEvent = EVN_3_DateTimePlannedEvent;
    }

    public String getEVN_4_EventReasonCode() {
        return this.EVN_4_EventReasonCode;
    }

    public void setEVN_4_EventReasonCode(final String EVN_4_EventReasonCode) {
        this.EVN_4_EventReasonCode = EVN_4_EventReasonCode;
    }

    public String getEVN_5_OperatorID() {
        return this.EVN_5_OperatorID;
    }

    public void setEVN_5_OperatorID(final String EVN_5_OperatorID) {
        this.EVN_5_OperatorID = EVN_5_OperatorID;
    }

    public String getEVN_6_EventOccurred() {
        return this.EVN_6_EventOccurred;
    }

    public void setEVN_6_EventOccurred(final String EVN_6_EventOccurred) {
        this.EVN_6_EventOccurred = EVN_6_EventOccurred;
    }

    public String getEVN_7_EventFacility() {
        return this.EVN_7_EventFacility;
    }

    public void setEVN_7_EventFacility(final String EVN_7_EventFacility) {
        this.EVN_7_EventFacility = EVN_7_EventFacility;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

