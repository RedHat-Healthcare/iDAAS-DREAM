package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TXP {
private String TXP_01_TaxIdentificationNumber;
private String TXP_02_TaxPaymentTypeCode;
private String TXP_03_Date;
private String TXP_04_TaxInformationIdentificationNumber;
private String TXP_05_TaxAmount;
private String TXP_06_TaxInformationIdentificationNumber;
private String TXP_07_TaxAmount;
private String TXP_08_TaxInformationIdentificationNumber;
private String TXP_09_TaxAmount;
private String TXP_10_TaxpayerVerification;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

