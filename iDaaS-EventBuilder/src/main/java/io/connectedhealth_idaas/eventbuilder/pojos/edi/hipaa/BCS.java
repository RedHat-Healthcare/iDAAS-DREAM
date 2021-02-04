package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BCS {
private String BCS_01_TransactionSetPurposeCode;
private String BCS_02_Date;
private String BCS_03_ContractNumber;
private String BCS_04_Date;
private String BCS_05_ContractTypeCode;
private String BCS_06_Description;
private String BCS_07_ReferenceIdentification;
private String BCS_08_ProgramTypeCode;
private String BCS_09_SecurityLevelCode;
private String BCS_10_PercentageasDecimal;
private String BCS_11_PercentageasDecimal;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

