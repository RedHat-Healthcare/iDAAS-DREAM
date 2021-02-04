package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SWD {
private String SWD_01_InvoiceNumber;
private String SWD_02_Weight;
private String SWD_03_TariffApplicationCode;
private String SWD_04_ApplicationErrorConditionCode;
private String SWD_05_YesNoConditionorResponseCode;
private String SWD_06_YesNoConditionorResponseCode;
private String SWD_07_IndustryCode;
private String SWD_08_Number;
private String SWD_09_Number;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

