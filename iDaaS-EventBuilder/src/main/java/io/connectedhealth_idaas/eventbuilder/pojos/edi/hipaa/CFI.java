package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class CFI {
private String CFI_01_CodeCategory;
private String CFI_02_AdjustmentReasonCode;
private String CFI_03_AdjustmentReasonCodeCharacteristic;
private String CFI_04_MaintenanceTypeCode;
private String CFI_05_FrequencyCode;
private String CFI_06_SettlementTypeCode;
private String CFI_07_LateReasonCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

