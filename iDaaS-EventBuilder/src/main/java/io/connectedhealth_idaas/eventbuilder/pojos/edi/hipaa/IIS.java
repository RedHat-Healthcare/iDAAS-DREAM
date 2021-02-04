package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IIS {
private String IIS_01_ReportedStartSegmentID;
private String IIS_02_ReportedControlNumber;
private String IIS_03_ReportedDate;
private String IIS_04_ReportedTime;
private String IIS_05_ReportedInterchangeSenderIDQualifier;
private String IIS_06_ReportedSenderID;
private String IIS_07_ReportedInterchangeReceiverIDQualifier;
private String IIS_08_ReportedReceiverID;
private String IIS_09_FirstReferenceIDQualifier;
private String IIS_10_FirstReferenceID;
private String IIS_11_SecondReferenceIDQualifier;
private String IIS_12_SecondReferenceID;
private String IIS_13_InterchangeMessageDirectionCode;
private String IIS_14_ReportedGrouporTransactionIdentifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

