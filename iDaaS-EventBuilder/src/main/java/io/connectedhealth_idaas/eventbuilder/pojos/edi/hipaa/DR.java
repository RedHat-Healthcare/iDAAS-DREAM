package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DR {
private String DR_01_Date;
private String DR_02_StandardCarrierAlphaCode;
private String DR_03_DocketControlNumber;
private String DR_04_DocketIdentification;
private String DR_05_RevisionNumber;
private String DR_06_DocketIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

