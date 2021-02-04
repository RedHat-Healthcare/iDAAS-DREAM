package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PWK {
private String PWK_01_ReportTypeCode;
private String PWK_02_ReportTransmissionCode;
private String PWK_03_ReportCopiesNeeded;
private String PWK_04_EntityIdentifierCode;
private String PWK_05_IdentificationCodeQualifier;
private String PWK_06_IdentificationCode;
private String PWK_07_Description;
private String PWK_09_RequestCategoryCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

