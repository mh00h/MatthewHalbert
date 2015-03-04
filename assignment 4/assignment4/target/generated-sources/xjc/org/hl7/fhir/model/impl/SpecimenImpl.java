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
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Specimen;
import org.hl7.fhir.model.SpecimenCollection;
import org.hl7.fhir.model.SpecimenContainer;
import org.hl7.fhir.model.SpecimenSource;
import org.hl7.fhir.model.SpecimenTreatment;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen", propOrder = {
    "identifier",
    "type",
    "source",
    "subject",
    "accessionIdentifier",
    "receivedTime",
    "collection",
    "treatment",
    "container"
})
public class SpecimenImpl
    extends ResourceImpl
    implements Specimen, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected List<Identifier> identifier;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = SpecimenSourceImpl.class)
    protected List<SpecimenSource> source;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl accessionIdentifier;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl receivedTime;
    @XmlElement(required = true, type = SpecimenCollectionImpl.class)
    protected SpecimenCollectionImpl collection;
    @XmlElement(type = SpecimenTreatmentImpl.class)
    protected List<SpecimenTreatment> treatment;
    @XmlElement(type = SpecimenContainerImpl.class)
    protected List<SpecimenContainer> container;

    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public List<SpecimenSource> getSource() {
        if (source == null) {
            source = new ArrayList<SpecimenSource>();
        }
        return this.source;
    }

    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    public Identifier getAccessionIdentifier() {
        return accessionIdentifier;
    }

    public void setAccessionIdentifier(Identifier value) {
        this.accessionIdentifier = ((IdentifierImpl) value);
    }

    public DateTime getReceivedTime() {
        return receivedTime;
    }

    public void setReceivedTime(DateTime value) {
        this.receivedTime = ((DateTimeImpl) value);
    }

    public SpecimenCollection getCollection() {
        return collection;
    }

    public void setCollection(SpecimenCollection value) {
        this.collection = ((SpecimenCollectionImpl) value);
    }

    public List<SpecimenTreatment> getTreatment() {
        if (treatment == null) {
            treatment = new ArrayList<SpecimenTreatment>();
        }
        return this.treatment;
    }

    public List<SpecimenContainer> getContainer() {
        if (container == null) {
            container = new ArrayList<SpecimenContainer>();
        }
        return this.container;
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
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<SpecimenSource> theSource;
            theSource = (((this.source!= null)&&(!this.source.isEmpty()))?this.getSource():null);
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            Identifier theAccessionIdentifier;
            theAccessionIdentifier = this.getAccessionIdentifier();
            strategy.appendField(locator, this, "accessionIdentifier", buffer, theAccessionIdentifier);
        }
        {
            DateTime theReceivedTime;
            theReceivedTime = this.getReceivedTime();
            strategy.appendField(locator, this, "receivedTime", buffer, theReceivedTime);
        }
        {
            SpecimenCollection theCollection;
            theCollection = this.getCollection();
            strategy.appendField(locator, this, "collection", buffer, theCollection);
        }
        {
            List<SpecimenTreatment> theTreatment;
            theTreatment = (((this.treatment!= null)&&(!this.treatment.isEmpty()))?this.getTreatment():null);
            strategy.appendField(locator, this, "treatment", buffer, theTreatment);
        }
        {
            List<SpecimenContainer> theContainer;
            theContainer = (((this.container!= null)&&(!this.container.isEmpty()))?this.getContainer():null);
            strategy.appendField(locator, this, "container", buffer, theContainer);
        }
        return buffer;
    }

}
