package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PO3 {
private String PO3_01_ChangeReasonCode;
private String PO3_02_Date;
private String PO3_03_PriceIdentifierCode;
private String PO3_04_UnitPrice;
private String PO3_05_BasisofUnitPriceCode;
private String PO3_06_Quantity;
private String PO3_07_UnitorBasisforMeasurementCode;
private String PO3_08_Description;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

