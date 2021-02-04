package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ITC {
private String ITC_01_InformationRequestResultCode;
private String ITC_02_InformationType;
private String ITC_03_InformationStatusCode;
private String ITC_04_ActionCode;
private String ITC_05_FinancialInformationTypeCode;
private String ITC_06_ConsolidationCode;
private String ITC_07_ConditionIndicator;
private String ITC_08_FinancialStatementFormatCode;
private String ITC_09_FreeformInformation;
private String ITC_10_UnitofTimePeriodorInterval;
private String ITC_11_Description;
private String ITC_12_SourceofDisclosureCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

