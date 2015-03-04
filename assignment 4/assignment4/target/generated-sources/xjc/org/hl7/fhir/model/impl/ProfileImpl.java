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
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Id;
import org.hl7.fhir.model.Profile;
import org.hl7.fhir.model.ProfileExtensionDefn;
import org.hl7.fhir.model.ProfileMapping;
import org.hl7.fhir.model.ProfileQuery;
import org.hl7.fhir.model.ProfileStructure;
import org.hl7.fhir.model.ResourceProfileStatus;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile", propOrder = {
    "identifier",
    "version",
    "name",
    "publisher",
    "telecom",
    "description",
    "code",
    "status",
    "experimental",
    "date",
    "requirements",
    "fhirVersion",
    "mapping",
    "structure",
    "extensionDefn",
    "query"
})
public class ProfileImpl
    extends ResourceImpl
    implements Profile, ToString
{

    @XmlElement(type = StringImpl.class)
    protected StringImpl identifier;
    @XmlElement(type = StringImpl.class)
    protected StringImpl version;
    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(type = StringImpl.class)
    protected StringImpl publisher;
    @XmlElement(type = ContactImpl.class)
    protected List<Contact> telecom;
    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = CodingImpl.class)
    protected List<Coding> code;
    @XmlElement(required = true, type = ResourceProfileStatusImpl.class)
    protected ResourceProfileStatusImpl status;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl experimental;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl date;
    @XmlElement(type = StringImpl.class)
    protected StringImpl requirements;
    @XmlElement(type = IdImpl.class)
    protected IdImpl fhirVersion;
    @XmlElement(type = ProfileMappingImpl.class)
    protected List<ProfileMapping> mapping;
    @XmlElement(type = ProfileStructureImpl.class)
    protected List<ProfileStructure> structure;
    @XmlElement(type = ProfileExtensionDefnImpl.class)
    protected List<ProfileExtensionDefn> extensionDefn;
    @XmlElement(type = ProfileQueryImpl.class)
    protected List<ProfileQuery> query;

    public org.hl7.fhir.model.String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(org.hl7.fhir.model.String value) {
        this.identifier = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getVersion() {
        return version;
    }

    public void setVersion(org.hl7.fhir.model.String value) {
        this.version = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getPublisher() {
        return publisher;
    }

    public void setPublisher(org.hl7.fhir.model.String value) {
        this.publisher = ((StringImpl) value);
    }

    public List<Contact> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Contact>();
        }
        return this.telecom;
    }

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public List<Coding> getCode() {
        if (code == null) {
            code = new ArrayList<Coding>();
        }
        return this.code;
    }

    public ResourceProfileStatus getStatus() {
        return status;
    }

    public void setStatus(ResourceProfileStatus value) {
        this.status = ((ResourceProfileStatusImpl) value);
    }

    public Boolean getExperimental() {
        return experimental;
    }

    public void setExperimental(Boolean value) {
        this.experimental = ((BooleanImpl) value);
    }

    public DateTime getDate() {
        return date;
    }

    public void setDate(DateTime value) {
        this.date = ((DateTimeImpl) value);
    }

    public org.hl7.fhir.model.String getRequirements() {
        return requirements;
    }

    public void setRequirements(org.hl7.fhir.model.String value) {
        this.requirements = ((StringImpl) value);
    }

    public Id getFhirVersion() {
        return fhirVersion;
    }

    public void setFhirVersion(Id value) {
        this.fhirVersion = ((IdImpl) value);
    }

    public List<ProfileMapping> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<ProfileMapping>();
        }
        return this.mapping;
    }

    public List<ProfileStructure> getStructure() {
        if (structure == null) {
            structure = new ArrayList<ProfileStructure>();
        }
        return this.structure;
    }

    public List<ProfileExtensionDefn> getExtensionDefn() {
        if (extensionDefn == null) {
            extensionDefn = new ArrayList<ProfileExtensionDefn>();
        }
        return this.extensionDefn;
    }

    public List<ProfileQuery> getQuery() {
        if (query == null) {
            query = new ArrayList<ProfileQuery>();
        }
        return this.query;
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
            org.hl7.fhir.model.String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            org.hl7.fhir.model.String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            org.hl7.fhir.model.String thePublisher;
            thePublisher = this.getPublisher();
            strategy.appendField(locator, this, "publisher", buffer, thePublisher);
        }
        {
            List<Contact> theTelecom;
            theTelecom = (((this.telecom!= null)&&(!this.telecom.isEmpty()))?this.getTelecom():null);
            strategy.appendField(locator, this, "telecom", buffer, theTelecom);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            List<Coding> theCode;
            theCode = (((this.code!= null)&&(!this.code.isEmpty()))?this.getCode():null);
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            ResourceProfileStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Boolean theExperimental;
            theExperimental = this.getExperimental();
            strategy.appendField(locator, this, "experimental", buffer, theExperimental);
        }
        {
            DateTime theDate;
            theDate = this.getDate();
            strategy.appendField(locator, this, "date", buffer, theDate);
        }
        {
            org.hl7.fhir.model.String theRequirements;
            theRequirements = this.getRequirements();
            strategy.appendField(locator, this, "requirements", buffer, theRequirements);
        }
        {
            Id theFhirVersion;
            theFhirVersion = this.getFhirVersion();
            strategy.appendField(locator, this, "fhirVersion", buffer, theFhirVersion);
        }
        {
            List<ProfileMapping> theMapping;
            theMapping = (((this.mapping!= null)&&(!this.mapping.isEmpty()))?this.getMapping():null);
            strategy.appendField(locator, this, "mapping", buffer, theMapping);
        }
        {
            List<ProfileStructure> theStructure;
            theStructure = (((this.structure!= null)&&(!this.structure.isEmpty()))?this.getStructure():null);
            strategy.appendField(locator, this, "structure", buffer, theStructure);
        }
        {
            List<ProfileExtensionDefn> theExtensionDefn;
            theExtensionDefn = (((this.extensionDefn!= null)&&(!this.extensionDefn.isEmpty()))?this.getExtensionDefn():null);
            strategy.appendField(locator, this, "extensionDefn", buffer, theExtensionDefn);
        }
        {
            List<ProfileQuery> theQuery;
            theQuery = (((this.query!= null)&&(!this.query.isEmpty()))?this.getQuery():null);
            strategy.appendField(locator, this, "query", buffer, theQuery);
        }
        return buffer;
    }

}
