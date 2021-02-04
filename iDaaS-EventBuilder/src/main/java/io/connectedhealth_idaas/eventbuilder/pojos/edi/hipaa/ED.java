package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ED {
private String ED_01_EquipmentInitial;
private String ED_02_EquipmentNumber;
private String ED_03_LoadEmptyStatusCode;
private String ED_04_CommodityCode;
private String ED_05_LadingDescription;
private String ED_06_WaybillNumber;
private String ED_07_EquipmentNumber;
private String ED_08_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

