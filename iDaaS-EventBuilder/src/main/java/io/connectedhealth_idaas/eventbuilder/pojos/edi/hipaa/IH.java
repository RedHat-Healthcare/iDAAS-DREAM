package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IH {
private String IH_01_InterconnectMailbagVersionNumber;
private String IH_02_InterconnectMailbagLogonID;
private String IH_03_InterconnectMailbagPassword;
private String IH_04_InterconnectMailbagIDQualifierCode;
private String IH_05_InterconnectMailbagSenderID;
private String IH_06_InterconnectMailbagIDQualifierCode;
private String IH_07_InterconnectMailbagReceiverID;
private String IH_08_InterconnectMailbagDate;
private String IH_09_InterconnectMailbagTime;
private String IH_10_InterconnectMailbagTimeCode;
private String IH_11_InterconnectMailbagControlNumber;
private String IH_12_InterconnectMailbagTestIndicator;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

