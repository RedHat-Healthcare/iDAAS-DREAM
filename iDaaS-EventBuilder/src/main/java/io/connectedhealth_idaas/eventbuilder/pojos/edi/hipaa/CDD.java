package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CDD {
private String CDD_01_AdjustmentReasonCode;
private String CDD_02_CreditDebitFlagCode;
private String CDD_03_AssignedIdentification;
private String CDD_04_Amount;
private String CDD_05_YesNoConditionorResponseCode;
private String CDD_06_PriceBracketIdentifier;
private String CDD_07_CreditDebitQuantity;
private String CDD_08_UnitorBasisforMeasurementCode;
private String CDD_09_UnitPriceDifference;
private String CDD_10_PriceIdentifierCode;
private String CDD_11_UnitPrice;
private String CDD_12_PriceIdentifierCode;
private String CDD_13_UnitPrice;
private String CDD_14_FreeformMessageText;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

