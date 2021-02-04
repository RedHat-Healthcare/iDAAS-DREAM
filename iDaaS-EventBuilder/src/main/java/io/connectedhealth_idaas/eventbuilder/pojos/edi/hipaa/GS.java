package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class GS {
private String GS_01_FunctionalIdentifierCode;
private String GS_02_ApplicationSendersCode;
private String GS_03_ApplicationReceiversCode;
private String GS_04_Date;
private String GS_05_Time;
private String GS_06_GroupControlNumber;
private String GS_07_ResponsibleAgencyCode;
private String GS_08_VersionReleaseIndustryIdentifierCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

