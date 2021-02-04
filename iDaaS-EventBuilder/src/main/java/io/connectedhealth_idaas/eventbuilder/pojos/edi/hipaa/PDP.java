package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PDP {
private String PDP_01_TypeofPersonalorBusinessAssetCode;
private String PDP_02_CommodityCodeQualifier;
private String PDP_03_CommodityCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

