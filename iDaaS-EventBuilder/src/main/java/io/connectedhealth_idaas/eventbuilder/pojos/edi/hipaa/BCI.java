package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCI {
private String BCI_01_IndustryCode;
private String BCI_02_InsuranceTypeCode;
private String BCI_03_ReferenceIdentification;
private String BCI_04_StateorProvinceCode;
private String BCI_05_DateTimePeriodFormatQualifier;
private String BCI_06_DateTimePeriod;
private String BCI_07_ReportTypeCode;
private String BCI_08_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

