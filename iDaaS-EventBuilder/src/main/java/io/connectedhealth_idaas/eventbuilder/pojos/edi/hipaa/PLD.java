package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PLD {
private String PLD_01_QuantityofPalletsShipped;
private String PLD_02_PalletExchangeCode;
private String PLD_03_WeightUnitCode;
private String PLD_04_Weight;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

