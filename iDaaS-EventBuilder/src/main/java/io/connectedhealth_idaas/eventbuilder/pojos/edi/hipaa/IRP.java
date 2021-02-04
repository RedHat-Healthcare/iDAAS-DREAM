package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class IRP {
private String IRP_01_InterchangeReportTypeCode;
private String IRP_02_InterchangeReportIdentifier;
private String IRP_03_InterchangeReportIncrementalIndicatorCode;
private String IRP_04_InterchangeMessageDirectionCode;
private String IRP_05_InterchangeReportStatusLevelCode;
private String IRP_06_InterchangeReportLevelofDetailCode;
private String IRP_07_ShipDeliveryorCalendarPatternCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

