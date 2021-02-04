package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class UAC {
    private String UAC_1_UserAuthenticationCredentialTypeCode;
    private String UAC_2_UserAuthenticationCredential;

    public String getUAC_1_UserAuthenticationCredentialTypeCode() {
        return this.UAC_1_UserAuthenticationCredentialTypeCode;
    }

    public void setUAC_1_UserAuthenticationCredentialTypeCode(final String UAC_1_UserAuthenticationCredentialTypeCode) {
        this.UAC_1_UserAuthenticationCredentialTypeCode = UAC_1_UserAuthenticationCredentialTypeCode;
    }

    public String getUAC_2_UserAuthenticationCredential() {
        return this.UAC_2_UserAuthenticationCredential;
    }

    public void setUAC_2_UserAuthenticationCredential(final String UAC_2_UserAuthenticationCredential) {
        this.UAC_2_UserAuthenticationCredential = UAC_2_UserAuthenticationCredential;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

