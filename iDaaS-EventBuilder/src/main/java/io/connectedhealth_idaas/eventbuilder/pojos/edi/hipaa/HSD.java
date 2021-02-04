package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class HSD {
private String HSD_01_QuantityQualifier;
private String HSD_02_Quantity;
private String HSD_03_UnitorBasisforMeasurementCode;
private String HSD_04_SampleSelectionModulus;
private String HSD_05_TimePeriodQualifier;
private String HSD_06_NumberofPeriods;
private String HSD_07_ShipDeliveryorCalendarPatternCode;
private String HSD_08_ShipDeliveryPatternTimeCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

