package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TS {
private String TS_01_TariffSectionIdentifier;
private String TS_02_TariffItemNumber;
private String TS_03_TariffItemSuffix;
private String TS_04_TariffSectionIDCode;
private String TS_05_RateValueQualifier;
private String TS_06_EquipmentDescriptionCode;
private String TS_07_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

