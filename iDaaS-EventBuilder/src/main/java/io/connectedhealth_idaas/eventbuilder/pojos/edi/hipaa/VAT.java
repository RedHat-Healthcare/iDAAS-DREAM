package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class VAT {
private String VAT_01_IndustryCode;
private String VAT_02_AmountQualifierCode;
private String VAT_03_Amount;
private String VAT_04_CurrencyCode;
private String VAT_05_ProductProcessCharacteristicCode;
private String VAT_06_AgencyQualifierCode;
private String VAT_07_SourceSubqualifier;
private String VAT_08_IndustryCode;
private String VAT_09_Description;
private String VAT_10_Quantity;
private String VAT_11_UnitorBasisforMeasurementCode;
private String VAT_12_SurfaceLayerPositionCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

