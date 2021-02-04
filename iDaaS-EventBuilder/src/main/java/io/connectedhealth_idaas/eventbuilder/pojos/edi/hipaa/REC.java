package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class REC {
private String REC_01_OccupancyCode;
private String REC_02_RealEstatePropertyConditionCode;
private String REC_03_PropertyDamageCode;
private String REC_04_YesNoConditionorResponseCode;
private String REC_05_Quantity;
private String REC_06_PropertyInspectionQualifier;
private String REC_07_ActionCode;
private String REC_08_QuantityQualifier;
private String REC_09_Quantity;
private String REC_11_OccupancyVerificationCode;
private String REC_12_NoteReferenceCode;
private String REC_13_FreeformMessage;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

