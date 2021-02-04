package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TXN {
private String TXN_01_ActionCode;
private String TXN_02_ResponsibleAgencyCode;
private String TXN_03_TransactionSetIdentifierCode;
private String TXN_04_VersionReleaseIndustryIdentifierCode;
private String TXN_05_ActionCode;
private String TXN_06_ApplicationReceiversCode;
private String TXN_07_ApplicationSendersCode;
private String TXN_08_Date;
private String TXN_09_Time;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

