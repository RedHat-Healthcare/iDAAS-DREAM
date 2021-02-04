package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ATA {
private String ATA_01_StandardCarrierAlphaCode;
private String ATA_02_ReferenceIdentification;
private String ATA_03_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

