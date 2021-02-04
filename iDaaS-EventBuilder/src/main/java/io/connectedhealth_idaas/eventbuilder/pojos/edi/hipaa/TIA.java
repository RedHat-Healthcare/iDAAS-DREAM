package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TIA {
private String TIA_02_MonetaryAmount;
private String TIA_03_FixedFormatInformation;
private String TIA_04_Quantity;
private String TIA_06_PercentageasDecimal;
private String TIA_07_MonetaryAmount;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

