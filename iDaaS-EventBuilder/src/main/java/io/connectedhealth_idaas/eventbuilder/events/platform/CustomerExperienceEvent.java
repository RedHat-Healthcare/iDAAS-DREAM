package io.connectedhealth_idaas.eventbuilder.events.platform;

import io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy.*;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy.AppointmentInformation;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.Location;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy.MessageHeader;
import io.connectedhealth_idaas.eventbuilder.pojos.clinical.legacy.PharmacyTreatmentOrder;

public class CustomerExperienceEvent {

    public MessageHeader messageHeader;
    public PatientIdentifiers patientIdentifiers;
    public PatientVisit patientVisit;
    public PharmacyTreatmentOrder pharmacyTreatmentOrder;
    public Location Location;
    public OrderControl orderControl;
    public Observation observation;
    public ObservationRequest observationRequest;
    public Allergies allergies;
    public Diagnosis diagnosis;
    public AppointmentInformation appointmentInformation;
    public Insurance insurance;

}
