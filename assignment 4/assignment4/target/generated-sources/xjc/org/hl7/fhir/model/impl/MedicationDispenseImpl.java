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
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.MedicationDispense;
import org.hl7.fhir.model.MedicationDispenseDispense;
import org.hl7.fhir.model.MedicationDispenseStatus;
import org.hl7.fhir.model.MedicationDispenseSubstitution;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationDispense", propOrder = {
    "identifier",
    "status",
    "patient",
    "dispenser",
    "authorizingPrescription",
    "dispense",
    "substitution"
})
public class MedicationDispenseImpl
    extends ResourceImpl
    implements MedicationDispense, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl identifier;
    @XmlElement(type = MedicationDispenseStatusImpl.class)
    protected MedicationDispenseStatusImpl status;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl patient;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl dispenser;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected List<ResourceReference> authorizingPrescription;
    @XmlElement(type = MedicationDispenseDispenseImpl.class)
    protected List<MedicationDispenseDispense> dispense;
    @XmlElement(type = MedicationDispenseSubstitutionImpl.class)
    protected MedicationDispenseSubstitutionImpl substitution;

    public Identifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Identifier value) {
        this.identifier = ((IdentifierImpl) value);
    }

    public MedicationDispenseStatus getStatus() {
        return status;
    }

    public void setStatus(MedicationDispenseStatus value) {
        this.status = ((MedicationDispenseStatusImpl) value);
    }

    public ResourceReference getPatient() {
        return patient;
    }

    public void setPatient(ResourceReference value) {
        this.patient = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getDispenser() {
        return dispenser;
    }

    public void setDispenser(ResourceReference value) {
        this.dispenser = ((ResourceReferenceImpl) value);
    }

    public List<ResourceReference> getAuthorizingPrescription() {
        if (authorizingPrescription == null) {
            authorizingPrescription = new ArrayList<ResourceReference>();
        }
        return this.authorizingPrescription;
    }

    public List<MedicationDispenseDispense> getDispense() {
        if (dispense == null) {
            dispense = new ArrayList<MedicationDispenseDispense>();
        }
        return this.dispense;
    }

    public MedicationDispenseSubstitution getSubstitution() {
        return substitution;
    }

    public void setSubstitution(MedicationDispenseSubstitution value) {
        this.substitution = ((MedicationDispenseSubstitutionImpl) value);
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
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            MedicationDispenseStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            ResourceReference theDispenser;
            theDispenser = this.getDispenser();
            strategy.appendField(locator, this, "dispenser", buffer, theDispenser);
        }
        {
            List<ResourceReference> theAuthorizingPrescription;
            theAuthorizingPrescription = (((this.authorizingPrescription!= null)&&(!this.authorizingPrescription.isEmpty()))?this.getAuthorizingPrescription():null);
            strategy.appendField(locator, this, "authorizingPrescription", buffer, theAuthorizingPrescription);
        }
        {
            List<MedicationDispenseDispense> theDispense;
            theDispense = (((this.dispense!= null)&&(!this.dispense.isEmpty()))?this.getDispense():null);
            strategy.appendField(locator, this, "dispense", buffer, theDispense);
        }
        {
            MedicationDispenseSubstitution theSubstitution;
            theSubstitution = this.getSubstitution();
            strategy.appendField(locator, this, "substitution", buffer, theSubstitution);
        }
        return buffer;
    }

}
