package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UDA {
private String UDA_01_OfferBasisCode;
private String UDA_02_Description;
private String UDA_03_QuantityQualifier;
private String UDA_04_Quantity;
private String UDA_05_UnitorBasisforMeasurementCode;
private String UDA_06_Amount;
private String UDA_07_PercentageasDecimal;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

