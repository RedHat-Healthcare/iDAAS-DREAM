package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSC {
private String CSC_01_CryptographicManagementPurpose;
private String CSC_02_SecurityOriginatorName;
private String CSC_03_SecurityRecipientName;
private String CSC_06_FilterIDCode;
private String CSC_07_VersionIdentifier;
private String CSC_08_LengthofData;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

