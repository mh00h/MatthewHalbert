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
import org.hl7.fhir.model.DocumentManifest;
import org.hl7.fhir.model.DocumentReferenceStatus;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentManifest", propOrder = {
    "masterIdentifier",
    "identifier",
    "subject",
    "recipient",
    "type",
    "author",
    "created",
    "source",
    "status",
    "supercedes",
    "description",
    "confidentiality",
    "content"
})
public class DocumentManifestImpl
    extends ResourceImpl
    implements DocumentManifest, ToString
{

    @XmlElement(required = true, type = IdentifierImpl.class)
    protected IdentifierImpl masterIdentifier;
    @XmlElement(type = IdentifierImpl.class)
    protected List<Identifier> identifier;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected List<ResourceReference> subject;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected List<ResourceReference> recipient;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected List<ResourceReference> author;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl created;
    @XmlElement(type = UriImpl.class)
    protected UriImpl source;
    @XmlElement(required = true, type = DocumentReferenceStatusImpl.class)
    protected DocumentReferenceStatusImpl status;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl supercedes;
    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl confidentiality;
    @XmlElement(required = true, type = ResourceReferenceImpl.class)
    protected List<ResourceReference> content;

    public Identifier getMasterIdentifier() {
        return masterIdentifier;
    }

    public void setMasterIdentifier(Identifier value) {
        this.masterIdentifier = ((IdentifierImpl) value);
    }

    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    public List<ResourceReference> getSubject() {
        if (subject == null) {
            subject = new ArrayList<ResourceReference>();
        }
        return this.subject;
    }

    public List<ResourceReference> getRecipient() {
        if (recipient == null) {
            recipient = new ArrayList<ResourceReference>();
        }
        return this.recipient;
    }

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public List<ResourceReference> getAuthor() {
        if (author == null) {
            author = new ArrayList<ResourceReference>();
        }
        return this.author;
    }

    public DateTime getCreated() {
        return created;
    }

    public void setCreated(DateTime value) {
        this.created = ((DateTimeImpl) value);
    }

    public Uri getSource() {
        return source;
    }

    public void setSource(Uri value) {
        this.source = ((UriImpl) value);
    }

    public DocumentReferenceStatus getStatus() {
        return status;
    }

    public void setStatus(DocumentReferenceStatus value) {
        this.status = ((DocumentReferenceStatusImpl) value);
    }

    public ResourceReference getSupercedes() {
        return supercedes;
    }

    public void setSupercedes(ResourceReference value) {
        this.supercedes = ((ResourceReferenceImpl) value);
    }

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public CodeableConcept getConfidentiality() {
        return confidentiality;
    }

    public void setConfidentiality(CodeableConcept value) {
        this.confidentiality = ((CodeableConceptImpl) value);
    }

    public List<ResourceReference> getContent() {
        if (content == null) {
            content = new ArrayList<ResourceReference>();
        }
        return this.content;
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
            Identifier theMasterIdentifier;
            theMasterIdentifier = this.getMasterIdentifier();
            strategy.appendField(locator, this, "masterIdentifier", buffer, theMasterIdentifier);
        }
        {
            List<Identifier> theIdentifier;
            theIdentifier = (((this.identifier!= null)&&(!this.identifier.isEmpty()))?this.getIdentifier():null);
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            List<ResourceReference> theSubject;
            theSubject = (((this.subject!= null)&&(!this.subject.isEmpty()))?this.getSubject():null);
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            List<ResourceReference> theRecipient;
            theRecipient = (((this.recipient!= null)&&(!this.recipient.isEmpty()))?this.getRecipient():null);
            strategy.appendField(locator, this, "recipient", buffer, theRecipient);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<ResourceReference> theAuthor;
            theAuthor = (((this.author!= null)&&(!this.author.isEmpty()))?this.getAuthor():null);
            strategy.appendField(locator, this, "author", buffer, theAuthor);
        }
        {
            DateTime theCreated;
            theCreated = this.getCreated();
            strategy.appendField(locator, this, "created", buffer, theCreated);
        }
        {
            Uri theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            DocumentReferenceStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference theSupercedes;
            theSupercedes = this.getSupercedes();
            strategy.appendField(locator, this, "supercedes", buffer, theSupercedes);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            CodeableConcept theConfidentiality;
            theConfidentiality = this.getConfidentiality();
            strategy.appendField(locator, this, "confidentiality", buffer, theConfidentiality);
        }
        {
            List<ResourceReference> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        return buffer;
    }

}