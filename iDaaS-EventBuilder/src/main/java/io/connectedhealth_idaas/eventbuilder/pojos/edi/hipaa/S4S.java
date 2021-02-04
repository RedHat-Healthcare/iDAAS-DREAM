package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class S4S {
private String S4S_01_SecurityVersionReleaseIdentifierCode;
private String S4S_02_SecurityTypeCode;
private String S4S_03_SecurityOriginatorName;
private String S4S_04_SecurityRecipientName;
private String S4S_05_AuthenticationKeyName;
private String S4S_06_AuthenticationServiceCode;
private String S4S_10_LengthofData;
private String S4S_11_TransformedData;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

