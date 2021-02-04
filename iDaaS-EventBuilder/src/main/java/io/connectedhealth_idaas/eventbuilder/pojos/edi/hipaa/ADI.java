package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class ADI {
private String ADI_01_AnimalDispositionCode;
private String ADI_02_Date;
private String ADI_03_TestPeriodorIntervalValue;
private String ADI_04_UnitofTimePeriodorInterval;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

