package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class BOS {
private String BOS_01_StatementNumber;
private String BOS_02_Date;
private String BOS_03_AgencyQualifierCode;
private String BOS_04_StatementFormatCode;
private String BOS_05_TransactionTypeCode;
private String BOS_06_Date;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

