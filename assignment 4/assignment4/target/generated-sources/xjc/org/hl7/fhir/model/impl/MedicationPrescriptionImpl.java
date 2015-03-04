//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.MedicationPrescription;
import org.hl7.fhir.model.MedicationPrescriptionDispense;
import org.hl7.fhir.model.MedicationPrescriptionDosageInstruction;
import org.hl7.fhir.model.MedicationPrescriptionStatus;
import org.hl7.fhir.model.MedicationPrescriptionSubstitution;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationPrescription", propOrder = {
    "identifier",
    "dateWritten",
    "status",
    "patient",
    "prescriber",
    "encounter",
    "reasonCodeableConcept",
    "reasonResource",
    "medication",
    "dosageInstruction",
    "dispense",
    "substitution"
})
public class MedicationPrescriptionImpl
    extends ResourceImpl
    implements MedicationPrescription, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected List<Identifier> identifier;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl dateWritten;
    @XmlElement(type = MedicationPrescriptionStatusImpl.class)
    protected MedicationPrescriptionStatusImpl status;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl patient;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl prescriber;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl encounter;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl reasonCodeableConcept;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl reasonResource;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl medication;
    @XmlElement(type = MedicationPrescriptionDosageInstructionImpl.class)
    protected List<MedicationPrescriptionDosageInstruction> dosageInstruction;
    @XmlElement(type = MedicationPrescriptionDispenseImpl.class)
    protected MedicationPrescriptionDispenseImpl dispense;
    @XmlElement(type = MedicationPrescriptionSubstitutionImpl.class)
    protected MedicationPrescriptionSubstitutionImpl substitution;

    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    public DateTime getDateWritten() {
        return dateWritten;
    }

    public void setDateWritten(DateTime value) {
        this.dateWritten = ((DateTimeImpl) value);
    }

    public MedicationPrescriptionStatus getStatus() {
        return status;
    }

    public void setStatus(MedicationPrescriptionStatus value) {
        this.status = ((MedicationPrescriptionStatusImpl) value);
    }

    public ResourceReference getPatient() {
        return patient;
    }

    public void setPatient(ResourceReference value) {
        this.patient = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getPrescriber() {
        return prescriber;
    }

    public void setPrescriber(ResourceReference value) {
        this.prescriber = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getEncounter() {
        return encounter;
    }

    public void setEncounter(ResourceReference value) {
        this.encounter = ((ResourceReferenceImpl) value);
    }

    public CodeableConcept getReasonCodeableConcept() {
        return reasonCodeableConcept;
    }

    public void setReasonCodeableConcept(CodeableConcept value) {
        this.reasonCodeableConcept = ((CodeableConceptImpl) value);
    }

    public ResourceReference getReasonResource() {
        return reasonResource;
    }

    public void setReasonResource(ResourceReference value) {
        this.reasonResource = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getMedication() {
        return medication;
    }

    public void setMedication(ResourceReference value) {
        this.medication = ((ResourceReferenceImpl) value);
    }

    public List<MedicationPrescriptionDosageInstruction> getDosageInstruction() {
        if (dosageInstruction == null) {
            dosageInstruction = new ArrayList<MedicationPrescriptionDosageInstruction>();
        }
        return this.dosageInstruction;
    }

    public MedicationPrescriptionDispense getDispense() {
        return dispense;
    }

    public void setDispense(MedicationPrescriptionDispense value) {
        this.dispense = ((MedicationPrescriptionDispenseImpl) value);
    }

    public MedicationPrescriptionSubstitution getSubstitution() {
        return substitution;
    }

    public void setSubstitution(MedicationPrescriptionSubstitution value) {
        this.substitution = ((MedicationPrescriptionSubstitutionImpl) value);
    }

    public String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            DateTime theDateWritten;
            theDateWritten = this.getDateWritten();
            strategy.appendField(locator, this, "dateWritten", buffer, theDateWritten);
        }
        {
            MedicationPrescriptionStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            ResourceReference thePrescriber;
            thePrescriber = this.getPrescriber();
            strategy.appendField(locator, this, "prescriber", buffer, thePrescriber);
        }
        {
            ResourceReference theEncounter;
            theEncounter = this.getEncounter();
            strategy.appendField(locator, this, "encounter", buffer, theEncounter);
        }
        {
            CodeableConcept theReasonCodeableConcept;
            theReasonCodeableConcept = this.getReasonCodeableConcept();
            strategy.appendField(locator, this, "reasonCodeableConcept", buffer, theReasonCodeableConcept);
        }
        {
            ResourceReference theReasonResource;
            theReasonResource = this.getReasonResource();
            strategy.appendField(locator, this, "reasonResource", buffer, theReasonResource);
        }
        {
            ResourceReference theMedication;
            theMedication = this.getMedication();
            strategy.appendField(locator, this, "medication", buffer, theMedication);
        }
        {
            List<MedicationPrescriptionDosageInstruction> theDosageInstruction;
            theDosageInstruction = (((this.dosageInstruction!= null)&&(!this.dosageInstruction.isEmpty()))?this.getDosageInstruction():null);
            strategy.appendField(locator, this, "dosageInstruction", buffer, theDosageInstruction);
        }
        {
            MedicationPrescriptionDispense theDispense;
            theDispense = this.getDispense();
            strategy.appendField(locator, this, "dispense", buffer, theDispense);
        }
        {
            MedicationPrescriptionSubstitution theSubstitution;
            theSubstitution = this.getSubstitution();
            strategy.appendField(locator, this, "substitution", buffer, theSubstitution);
        }
        return buffer;
    }

}
