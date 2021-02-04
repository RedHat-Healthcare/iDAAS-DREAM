package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CPR {
private String CPR_01_MarketExchangeIdentifier;
private String CPR_02_Date;
private String CPR_03_UnitPrice;
private String CPR_04_CommodityIdentification;
private String CPR_05_YesNoConditionorResponseCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

