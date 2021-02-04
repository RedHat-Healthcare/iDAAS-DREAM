package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BGP {
private String BGP_01_TransactionSetPurposeCode;
private String BGP_02_ProblemLogReasonCode;
private String BGP_03_ReferenceIdentificationQualifier;
private String BGP_04_ReferenceIdentification;
private String BGP_05_EquipmentInitial;
private String BGP_06_EquipmentNumber;
private String BGP_07_DateTimePeriod;
private String BGP_08_StandardPointLocationCode;
private String BGP_09_InterchangeTrainIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

