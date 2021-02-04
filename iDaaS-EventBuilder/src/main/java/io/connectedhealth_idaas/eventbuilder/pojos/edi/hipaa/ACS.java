package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ACS {
private String ACS_01_Amount;
private String ACS_02_SpecialChargeorAllowanceCode;
private String ACS_03_Description;
private String ACS_04_ShipmentMethodofPayment;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

