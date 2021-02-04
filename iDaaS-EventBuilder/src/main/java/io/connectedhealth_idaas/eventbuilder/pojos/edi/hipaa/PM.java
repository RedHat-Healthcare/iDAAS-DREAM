package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class PM {
private String PM_01_DFIIdentificationNumber;
private String PM_02_AccountNumber;
private String PM_03_YesNoConditionorResponseCode;
private String PM_04_YesNoConditionorResponseCode;
private String PM_05_AccountNumberQualifier;
private String PM_06_DFIIDNumberQualifier;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

