package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BMP {
private String BMP_01_TransactionHandlingCode;
private String BMP_02_ReferenceIdentification;
private String BMP_03_PaymentMethodCode;
private String BMP_04_ReferenceIdentification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

