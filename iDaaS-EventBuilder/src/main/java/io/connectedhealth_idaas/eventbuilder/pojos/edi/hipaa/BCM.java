package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCM {
private String BCM_01_TransactionSetPurposeCode;
private String BCM_02_Date;
private String BCM_03_Date;
private String BCM_04_ContractNumber;
private String BCM_05_FreeformDescription;
private String BCM_06_ContractActionCode;
private String BCM_07_ProgramTypeCode;
private String BCM_08_FreeformDescription;
private String BCM_09_ContractingFundingCode;
private String BCM_10_ContractTypeCode;
private String BCM_11_SecurityLevelCode;
private String BCM_12_CurrencyCode;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

