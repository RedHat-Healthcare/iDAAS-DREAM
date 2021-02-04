package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MSS {
private String MSS_01_ReportSectionNameCode;
private String MSS_02_Description;
private String MSS_03_StateorProvinceCode;
private String MSS_04_CountryCode;
private String MSS_05_ChangeTypeCode;
private String MSS_06_ReportSectionNumber;
private String MSS_07_SafetyCharacteristicHazardCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

