package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CED {
private String CED_01_AdministrationofJusticeEventTypeCode;
private String CED_02_ActionCode;
private String CED_03_NoticeTypeCode;
private String CED_04_CaseTypeCode;
private String CED_05_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

