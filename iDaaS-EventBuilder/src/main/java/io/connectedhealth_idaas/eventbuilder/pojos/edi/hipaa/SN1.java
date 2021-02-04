package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class SN1 {
private String SN1_01_AssignedIdentification;
private String SN1_02_NumberofUnitsShipped;
private String SN1_03_UnitorBasisforMeasurementCode;
private String SN1_04_QuantityShippedtoDate;
private String SN1_05_Quantity;
private String SN1_06_UnitorBasisforMeasurementCode;
private String SN1_07_ReturnableContainerLoadMakeUpCode;
private String SN1_08_LineItemStatusCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

