package io.connectedhealth_idaas.eventbuilder.pojos.edi.hipaa;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class MPI {
private String MPI_01_InformationStatusCode;
private String MPI_02_EmploymentStatusCode;
private String MPI_03_GovernmentServiceAffiliationCode;
private String MPI_04_Description;
private String MPI_05_MilitaryServiceRankCode;
private String MPI_06_DateTimePeriodFormatQualifier;
private String MPI_07_DateTimePeriod;
public String toString() { return ReflectionToStringBuilder.toString(this);}
}

