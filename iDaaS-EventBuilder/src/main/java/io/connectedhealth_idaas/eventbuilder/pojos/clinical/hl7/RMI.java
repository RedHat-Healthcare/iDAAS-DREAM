package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RMI {
    private String RMI_1_RiskManagementIncidentCode;
    private String RMI_2_DateTimeIncident;
    private String RMI_3_IncidentTypeCode;

    public String getRMI_1_RiskManagementIncidentCode() {
        return this.RMI_1_RiskManagementIncidentCode;
    }

    public void setRMI_1_RiskManagementIncidentCode(final String RMI_1_RiskManagementIncidentCode) {
        this.RMI_1_RiskManagementIncidentCode = RMI_1_RiskManagementIncidentCode;
    }

    public String getRMI_2_DateTimeIncident() {
        return this.RMI_2_DateTimeIncident;
    }

    public void setRMI_2_DateTimeIncident(final String RMI_2_DateTimeIncident) {
        this.RMI_2_DateTimeIncident = RMI_2_DateTimeIncident;
    }

    public String getRMI_3_IncidentTypeCode() {
        return this.RMI_3_IncidentTypeCode;
    }

    public void setRMI_3_IncidentTypeCode(final String RMI_3_IncidentTypeCode) {
        this.RMI_3_IncidentTypeCode = RMI_3_IncidentTypeCode;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

