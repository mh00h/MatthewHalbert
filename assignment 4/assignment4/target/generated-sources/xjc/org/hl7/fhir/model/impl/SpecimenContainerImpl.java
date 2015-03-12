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
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SpecimenContainer;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen.Container", propOrder = {
    "identifier",
    "description",
    "type",
    "capacity",
    "specimenQuantity",
    "additive"
})
public class SpecimenContainerImpl
    extends BackboneElementImpl
    implements SpecimenContainer, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected List<Identifier> identifier;
    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl capacity;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl specimenQuantity;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl additive;

    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public Quantity getCapacity() {
        return capacity;
    }

    public void setCapacity(Quantity value) {
        this.capacity = ((QuantityImpl) value);
    }

    public Quantity getSpecimenQuantity() {
        return specimenQuantity;
    }

    public void setSpecimenQuantity(Quantity value) {
        this.specimenQuantity = ((QuantityImpl) value);
    }

    public ResourceReference getAdditive() {
        return additive;
    }

    public void setAdditive(ResourceReference value) {
        this.additive = ((ResourceReferenceImpl) value);
    }

    public java.lang.String toString() {
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
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            Quantity theCapacity;
            theCapacity = this.getCapacity();
            strategy.appendField(locator, this, "capacity", buffer, theCapacity);
        }
        {
            Quantity theSpecimenQuantity;
            theSpecimenQuantity = this.getSpecimenQuantity();
            strategy.appendField(locator, this, "specimenQuantity", buffer, theSpecimenQuantity);
        }
        {
            ResourceReference theAdditive;
            theAdditive = this.getAdditive();
            strategy.appendField(locator, this, "additive", buffer, theAdditive);
        }
        return buffer;
    }

}