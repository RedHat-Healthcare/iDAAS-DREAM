package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BNX {
private String BNX_01_ShipmentWeightCode;
private String BNX_02_ReferencedPatternIdentifier;
private String BNX_03_BillingCode;
private String BNX_04_RepetitivePatternNumber;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

