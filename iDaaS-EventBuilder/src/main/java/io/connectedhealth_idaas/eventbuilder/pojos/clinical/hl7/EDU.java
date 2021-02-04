package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class EDU {
    private String EDU_1_SetIDEDU;
    private String EDU_2_AcademicDegree;
    private String EDU_3_AcademicDegreeProgramDateRange;
    private String EDU_4_AcademicDegreeProgramParticipationDateRange;
    private String EDU_5_AcademicDegreeGrantedDate;
    private String EDU_6_School;
    private String EDU_7_SchoolTypeCode;
    private String EDU_8_SchoolAddress;
    private String EDU_9_MajorFieldofStudy;

    public String getEDU_1_SetIDEDU() {
        return this.EDU_1_SetIDEDU;
    }

    public void setEDU_1_SetIDEDU(final String EDU_1_SetIDEDU) {
        this.EDU_1_SetIDEDU = EDU_1_SetIDEDU;
    }

    public String getEDU_2_AcademicDegree() {
        return this.EDU_2_AcademicDegree;
    }

    public void setEDU_2_AcademicDegree(final String EDU_2_AcademicDegree) {
        this.EDU_2_AcademicDegree = EDU_2_AcademicDegree;
    }

    public String getEDU_3_AcademicDegreeProgramDateRange() {
        return this.EDU_3_AcademicDegreeProgramDateRange;
    }

    public void setEDU_3_AcademicDegreeProgramDateRange(final String EDU_3_AcademicDegreeProgramDateRange) {
        this.EDU_3_AcademicDegreeProgramDateRange = EDU_3_AcademicDegreeProgramDateRange;
    }

    public String getEDU_4_AcademicDegreeProgramParticipationDateRange() {
        return this.EDU_4_AcademicDegreeProgramParticipationDateRange;
    }

    public void setEDU_4_AcademicDegreeProgramParticipationDateRange(final String EDU_4_AcademicDegreeProgramParticipationDateRange) {
        this.EDU_4_AcademicDegreeProgramParticipationDateRange = EDU_4_AcademicDegreeProgramParticipationDateRange;
    }

    public String getEDU_5_AcademicDegreeGrantedDate() {
        return this.EDU_5_AcademicDegreeGrantedDate;
    }

    public void setEDU_5_AcademicDegreeGrantedDate(final String EDU_5_AcademicDegreeGrantedDate) {
        this.EDU_5_AcademicDegreeGrantedDate = EDU_5_AcademicDegreeGrantedDate;
    }

    public String getEDU_6_School() {
        return this.EDU_6_School;
    }

    public void setEDU_6_School(final String EDU_6_School) {
        this.EDU_6_School = EDU_6_School;
    }

    public String getEDU_7_SchoolTypeCode() {
        return this.EDU_7_SchoolTypeCode;
    }

    public void setEDU_7_SchoolTypeCode(final String EDU_7_SchoolTypeCode) {
        this.EDU_7_SchoolTypeCode = EDU_7_SchoolTypeCode;
    }

    public String getEDU_8_SchoolAddress() {
        return this.EDU_8_SchoolAddress;
    }

    public void setEDU_8_SchoolAddress(final String EDU_8_SchoolAddress) {
        this.EDU_8_SchoolAddress = EDU_8_SchoolAddress;
    }

    public String getEDU_9_MajorFieldofStudy() {
        return this.EDU_9_MajorFieldofStudy;
    }

    public void setEDU_9_MajorFieldofStudy(final String EDU_9_MajorFieldofStudy) {
        this.EDU_9_MajorFieldofStudy = EDU_9_MajorFieldofStudy;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

