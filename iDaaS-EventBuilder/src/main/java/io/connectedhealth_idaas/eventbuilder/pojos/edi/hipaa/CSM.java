package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSM {
private String CSM_01_CryptographicServiceMessageCSMMessageClassCode;
private String CSM_02_SecurityOriginatorName;
private String CSM_03_SecurityRecipientName;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

