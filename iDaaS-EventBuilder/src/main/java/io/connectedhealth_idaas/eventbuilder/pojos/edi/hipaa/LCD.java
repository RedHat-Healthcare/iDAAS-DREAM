package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class LCD {
private String LCD_01_AssignedIdentification;
private String LCD_02_EntityIdentifierCode;
private String LCD_03_ActionCode;
private String LCD_04_Date;
private String LCD_05_IdentificationCodeQualifier;
private String LCD_06_IdentificationCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

