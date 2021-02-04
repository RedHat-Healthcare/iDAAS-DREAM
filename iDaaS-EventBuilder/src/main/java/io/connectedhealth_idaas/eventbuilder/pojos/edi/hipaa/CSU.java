package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CSU {
private String CSU_01_Name;
private String CSU_02_ReferenceIdentification;
private String CSU_03_DateTimePeriodFormatQualifier;
private String CSU_04_DateTimePeriod;
private String CSU_05_DateTimePeriodFormatQualifier;
private String CSU_06_DateTimePeriod;
private String CSU_07_InstructionalSettingCode;
private String CSU_08_AcademicCreditTypeCode;
private String CSU_09_Quantity;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

