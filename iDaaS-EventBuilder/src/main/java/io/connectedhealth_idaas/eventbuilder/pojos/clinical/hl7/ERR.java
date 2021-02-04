package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ERR {
    private String ERR_1_ErrorCodeandLocation;
    private String ERR_2_ErrorLocation;
    private String ERR_3_HL7ErrorCode;
    private String ERR_4_Severity;
    private String ERR_5_ApplicationErrorCode;
    private String ERR_6_ApplicationErrorParameter;
    private String ERR_7_DiagnosticInformation;
    private String ERR_8_UserMessage;
    private String ERR_9_InformPersonIndicator;
    private String ERR_10_OverrideType;
    private String ERR_11_OverrideReasonCode;
    private String ERR_12_HelpDeskContactPoint;

    public String getERR_1_ErrorCodeandLocation() {
        return this.ERR_1_ErrorCodeandLocation;
    }

    public void setERR_1_ErrorCodeandLocation(final String ERR_1_ErrorCodeandLocation) {
        this.ERR_1_ErrorCodeandLocation = ERR_1_ErrorCodeandLocation;
    }

    public String getERR_2_ErrorLocation() {
        return this.ERR_2_ErrorLocation;
    }

    public void setERR_2_ErrorLocation(final String ERR_2_ErrorLocation) {
        this.ERR_2_ErrorLocation = ERR_2_ErrorLocation;
    }

    public String getERR_3_HL7ErrorCode() {
        return this.ERR_3_HL7ErrorCode;
    }

    public void setERR_3_HL7ErrorCode(final String ERR_3_HL7ErrorCode) {
        this.ERR_3_HL7ErrorCode = ERR_3_HL7ErrorCode;
    }

    public String getERR_4_Severity() {
        return this.ERR_4_Severity;
    }

    public void setERR_4_Severity(final String ERR_4_Severity) {
        this.ERR_4_Severity = ERR_4_Severity;
    }

    public String getERR_5_ApplicationErrorCode() {
        return this.ERR_5_ApplicationErrorCode;
    }

    public void setERR_5_ApplicationErrorCode(final String ERR_5_ApplicationErrorCode) {
        this.ERR_5_ApplicationErrorCode = ERR_5_ApplicationErrorCode;
    }

    public String getERR_6_ApplicationErrorParameter() {
        return this.ERR_6_ApplicationErrorParameter;
    }

    public void setERR_6_ApplicationErrorParameter(final String ERR_6_ApplicationErrorParameter) {
        this.ERR_6_ApplicationErrorParameter = ERR_6_ApplicationErrorParameter;
    }

    public String getERR_7_DiagnosticInformation() {
        return this.ERR_7_DiagnosticInformation;
    }

    public void setERR_7_DiagnosticInformation(final String ERR_7_DiagnosticInformation) {
        this.ERR_7_DiagnosticInformation = ERR_7_DiagnosticInformation;
    }

    public String getERR_8_UserMessage() {
        return this.ERR_8_UserMessage;
    }

    public void setERR_8_UserMessage(final String ERR_8_UserMessage) {
        this.ERR_8_UserMessage = ERR_8_UserMessage;
    }

    public String getERR_9_InformPersonIndicator() {
        return this.ERR_9_InformPersonIndicator;
    }

    public void setERR_9_InformPersonIndicator(final String ERR_9_InformPersonIndicator) {
        this.ERR_9_InformPersonIndicator = ERR_9_InformPersonIndicator;
    }

    public String getERR_10_OverrideType() {
        return this.ERR_10_OverrideType;
    }

    public void setERR_10_OverrideType(final String ERR_10_OverrideType) {
        this.ERR_10_OverrideType = ERR_10_OverrideType;
    }

    public String getERR_11_OverrideReasonCode() {
        return this.ERR_11_OverrideReasonCode;
    }

    public void setERR_11_OverrideReasonCode(final String ERR_11_OverrideReasonCode) {
        this.ERR_11_OverrideReasonCode = ERR_11_OverrideReasonCode;
    }

    public String getERR_12_HelpDeskContactPoint() {
        return this.ERR_12_HelpDeskContactPoint;
    }

    public void setERR_12_HelpDeskContactPoint(final String ERR_12_HelpDeskContactPoint) {
        this.ERR_12_HelpDeskContactPoint = ERR_12_HelpDeskContactPoint;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

