package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class TCD {
    private String TCD_1_UniversalServiceIdentifier;
    private String TCD_2_AutoDilutionFactor;
    private String TCD_3_RerunDilutionFactor;
    private String TCD_4_PreDilutionFactor;
    private String TCD_5_EndogenousContentofPreDilutionDiluent;
    private String TCD_6_AutomaticRepeatAllowed;
    private String TCD_7_ReflexAllowed;
    private String TCD_8_AnalyteRepeatStatus;

    public String getTCD_1_UniversalServiceIdentifier() {
        return this.TCD_1_UniversalServiceIdentifier;
    }

    public void setTCD_1_UniversalServiceIdentifier(final String TCD_1_UniversalServiceIdentifier) {
        this.TCD_1_UniversalServiceIdentifier = TCD_1_UniversalServiceIdentifier;
    }

    public String getTCD_2_AutoDilutionFactor() {
        return this.TCD_2_AutoDilutionFactor;
    }

    public void setTCD_2_AutoDilutionFactor(final String TCD_2_AutoDilutionFactor) {
        this.TCD_2_AutoDilutionFactor = TCD_2_AutoDilutionFactor;
    }

    public String getTCD_3_RerunDilutionFactor() {
        return this.TCD_3_RerunDilutionFactor;
    }

    public void setTCD_3_RerunDilutionFactor(final String TCD_3_RerunDilutionFactor) {
        this.TCD_3_RerunDilutionFactor = TCD_3_RerunDilutionFactor;
    }

    public String getTCD_4_PreDilutionFactor() {
        return this.TCD_4_PreDilutionFactor;
    }

    public void setTCD_4_PreDilutionFactor(final String TCD_4_PreDilutionFactor) {
        this.TCD_4_PreDilutionFactor = TCD_4_PreDilutionFactor;
    }

    public String getTCD_5_EndogenousContentofPreDilutionDiluent() {
        return this.TCD_5_EndogenousContentofPreDilutionDiluent;
    }

    public void setTCD_5_EndogenousContentofPreDilutionDiluent(final String TCD_5_EndogenousContentofPreDilutionDiluent) {
        this.TCD_5_EndogenousContentofPreDilutionDiluent = TCD_5_EndogenousContentofPreDilutionDiluent;
    }

    public String getTCD_6_AutomaticRepeatAllowed() {
        return this.TCD_6_AutomaticRepeatAllowed;
    }

    public void setTCD_6_AutomaticRepeatAllowed(final String TCD_6_AutomaticRepeatAllowed) {
        this.TCD_6_AutomaticRepeatAllowed = TCD_6_AutomaticRepeatAllowed;
    }

    public String getTCD_7_ReflexAllowed() {
        return this.TCD_7_ReflexAllowed;
    }

    public void setTCD_7_ReflexAllowed(final String TCD_7_ReflexAllowed) {
        this.TCD_7_ReflexAllowed = TCD_7_ReflexAllowed;
    }

    public String getTCD_8_AnalyteRepeatStatus() {
        return this.TCD_8_AnalyteRepeatStatus;
    }

    public void setTCD_8_AnalyteRepeatStatus(final String TCD_8_AnalyteRepeatStatus) {
        this.TCD_8_AnalyteRepeatStatus = TCD_8_AnalyteRepeatStatus;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

