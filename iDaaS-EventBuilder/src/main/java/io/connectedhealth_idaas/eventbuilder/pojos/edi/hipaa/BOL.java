package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BOL {
private String BOL_01_StandardCarrierAlphaCode;
private String BOL_02_ShipmentMethodofPayment;
private String BOL_03_ShipmentIdentificationNumber;
private String BOL_04_Date;
private String BOL_05_Time;
private String BOL_06_ReferenceIdentification;
private String BOL_07_StatusReportRequestCode;
private String BOL_08_SectionSevenCode;
private String BOL_09_CustomsDocumentationHandlingCode;
private String BOL_10_ShipmentMethodofPayment;
private String BOL_11_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

