package io.connectedhealth_idaas.eventbuilder.pojos.clinical.hl7;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class RXR {
    private String RXR_1_Route;
    private String RXR_2_AdministrationSite;
    private String RXR_3_AdministrationDevice;
    private String RXR_4_AdministrationMethod;
    private String RXR_5_RoutingInstruction;
    private String RXR_6_AdministrationSiteModifier;

    public String getRXR_1_Route() {
        return this.RXR_1_Route;
    }

    public void setRXR_1_Route(final String RXR_1_Route) {
        this.RXR_1_Route = RXR_1_Route;
    }

    public String getRXR_2_AdministrationSite() {
        return this.RXR_2_AdministrationSite;
    }

    public void setRXR_2_AdministrationSite(final String RXR_2_AdministrationSite) {
        this.RXR_2_AdministrationSite = RXR_2_AdministrationSite;
    }

    public String getRXR_3_AdministrationDevice() {
        return this.RXR_3_AdministrationDevice;
    }

    public void setRXR_3_AdministrationDevice(final String RXR_3_AdministrationDevice) {
        this.RXR_3_AdministrationDevice = RXR_3_AdministrationDevice;
    }

    public String getRXR_4_AdministrationMethod() {
        return this.RXR_4_AdministrationMethod;
    }

    public void setRXR_4_AdministrationMethod(final String RXR_4_AdministrationMethod) {
        this.RXR_4_AdministrationMethod = RXR_4_AdministrationMethod;
    }

    public String getRXR_5_RoutingInstruction() {
        return this.RXR_5_RoutingInstruction;
    }

    public void setRXR_5_RoutingInstruction(final String RXR_5_RoutingInstruction) {
        this.RXR_5_RoutingInstruction = RXR_5_RoutingInstruction;
    }

    public String getRXR_6_AdministrationSiteModifier() {
        return this.RXR_6_AdministrationSiteModifier;
    }

    public void setRXR_6_AdministrationSiteModifier(final String RXR_6_AdministrationSiteModifier) {
        this.RXR_6_AdministrationSiteModifier = RXR_6_AdministrationSiteModifier;
    }

    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}

