package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ECD {
    private String ECD_1_ReferenceCommandNumber;
    private String ECD_2_RemoteControlCommand;
    private String ECD_3_ResponseRequired;
    private String ECD_4_RequestedCompletionTime;
    private String ECD_5_Parameters;

    public String getECD_1_ReferenceCommandNumber() {
        return this.ECD_1_ReferenceCommandNumber;
    }

    public void setECD_1_ReferenceCommandNumber(final String ECD_1_ReferenceCommandNumber) {
        this.ECD_1_ReferenceCommandNumber = ECD_1_ReferenceCommandNumber;
    }

    public String getECD_2_RemoteControlCommand() {
        return this.ECD_2_RemoteControlCommand;
    }

    public void setECD_2_RemoteControlCommand(final String ECD_2_RemoteControlCommand) {
        this.ECD_2_RemoteControlCommand = ECD_2_RemoteControlCommand;
    }

    public String getECD_3_ResponseRequired() {
        return this.ECD_3_ResponseRequired;
    }

    public void setECD_3_ResponseRequired(final String ECD_3_ResponseRequired) {
        this.ECD_3_ResponseRequired = ECD_3_ResponseRequired;
    }

    public String getECD_4_RequestedCompletionTime() {
        return this.ECD_4_RequestedCompletionTime;
    }

    public void setECD_4_RequestedCompletionTime(final String ECD_4_RequestedCompletionTime) {
        this.ECD_4_RequestedCompletionTime = ECD_4_RequestedCompletionTime;
    }

    public String getECD_5_Parameters() {
        return this.ECD_5_Parameters;
    }

    public void setECD_5_Parameters(final String ECD_5_Parameters) {
        this.ECD_5_Parameters = ECD_5_Parameters;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

