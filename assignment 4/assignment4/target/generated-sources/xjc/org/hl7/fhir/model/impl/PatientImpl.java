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
import org.hl7.fhir.model.Address;
import org.hl7.fhir.model.Attachment;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.HumanName;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Patient;
import org.hl7.fhir.model.PatientAnimal;
import org.hl7.fhir.model.PatientContact;
import org.hl7.fhir.model.PatientLink;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Patient", propOrder = {
    "identifier",
    "name",
    "telecom",
    "gender",
    "birthDate",
    "deceasedBoolean",
    "deceasedDateTime",
    "address",
    "maritalStatus",
    "multipleBirthBoolean",
    "multipleBirthInteger",
    "photo",
    "contact",
    "animal",
    "communication",
    "careProvider",
    "managingOrganization",
    "link",
    "active"
})
public class PatientImpl
    extends ResourceImpl
    implements Patient, ToString
{

    @XmlElement(type = IdentifierImpl.class)
    protected List<Identifier> identifier;
    @XmlElement(type = HumanNameImpl.class)
    protected List<HumanName> name;
    @XmlElement(type = ContactImpl.class)
    protected List<Contact> telecom;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl gender;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl birthDate;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl deceasedBoolean;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl deceasedDateTime;
    @XmlElement(type = AddressImpl.class)
    protected List<Address> address;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl maritalStatus;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl multipleBirthBoolean;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl multipleBirthInteger;
    @XmlElement(type = AttachmentImpl.class)
    protected List<Attachment> photo;
    @XmlElement(type = PatientContactImpl.class)
    protected List<PatientContact> contact;
    @XmlElement(type = PatientAnimalImpl.class)
    protected PatientAnimalImpl animal;
    @XmlElement(type = CodeableConceptImpl.class)
    protected List<CodeableConcept> communication;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected List<ResourceReference> careProvider;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl managingOrganization;
    @XmlElement(type = PatientLinkImpl.class)
    protected List<PatientLink> link;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl active;

    public List<Identifier> getIdentifier() {
        if (identifier == null) {
            identifier = new ArrayList<Identifier>();
        }
        return this.identifier;
    }

    public List<HumanName> getName() {
        if (name == null) {
            name = new ArrayList<HumanName>();
        }
        return this.name;
    }

    public List<Contact> getTelecom() {
        if (telecom == null) {
            telecom = new ArrayList<Contact>();
        }
        return this.telecom;
    }

    public CodeableConcept getGender() {
        return gender;
    }

    public void setGender(CodeableConcept value) {
        this.gender = ((CodeableConceptImpl) value);
    }

    public DateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(DateTime value) {
        this.birthDate = ((DateTimeImpl) value);
    }

    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    public void setDeceasedBoolean(Boolean value) {
        this.deceasedBoolean = ((BooleanImpl) value);
    }

    public DateTime getDeceasedDateTime() {
        return deceasedDateTime;
    }

    public void setDeceasedDateTime(DateTime value) {
        this.deceasedDateTime = ((DateTimeImpl) value);
    }

    public List<Address> getAddress() {
        if (address == null) {
            address = new ArrayList<Address>();
        }
        return this.address;
    }

    public CodeableConcept getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(CodeableConcept value) {
        this.maritalStatus = ((CodeableConceptImpl) value);
    }

    public Boolean getMultipleBirthBoolean() {
        return multipleBirthBoolean;
    }

    public void setMultipleBirthBoolean(Boolean value) {
        this.multipleBirthBoolean = ((BooleanImpl) value);
    }

    public Integer getMultipleBirthInteger() {
        return multipleBirthInteger;
    }

    public void setMultipleBirthInteger(Integer value) {
        this.multipleBirthInteger = ((IntegerImpl) value);
    }

    public List<Attachment> getPhoto() {
        if (photo == null) {
            photo = new ArrayList<Attachment>();
        }
        return this.photo;
    }

    public List<PatientContact> getContact() {
        if (contact == null) {
            contact = new ArrayList<PatientContact>();
        }
        return this.contact;
    }

    public PatientAnimal getAnimal() {
        return animal;
    }

    public void setAnimal(PatientAnimal value) {
        this.animal = ((PatientAnimalImpl) value);
    }

    public List<CodeableConcept> getCommunication() {
        if (communication == null) {
            communication = new ArrayList<CodeableConcept>();
        }
        return this.communication;
    }

    public List<ResourceReference> getCareProvider() {
        if (careProvider == null) {
            careProvider = new ArrayList<ResourceReference>();
        }
        return this.careProvider;
    }

    public ResourceReference getManagingOrganization() {
        return managingOrganization;
    }

    public void setManagingOrganization(ResourceReference value) {
        this.managingOrganization = ((ResourceReferenceImpl) value);
    }

    public List<PatientLink> getLink() {
        if (link == null) {
            link = new ArrayList<PatientLink>();
        }
        return this.link;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean value) {
        this.active = ((BooleanImpl) value);
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
            List<HumanName> theName;
            theName = (((this.name!= null)&&(!this.name.isEmpty()))?this.getName():null);
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            List<Contact> theTelecom;
            theTelecom = (((this.telecom!= null)&&(!this.telecom.isEmpty()))?this.getTelecom():null);
            strategy.appendField(locator, this, "telecom", buffer, theTelecom);
        }
        {
            CodeableConcept theGender;
            theGender = this.getGender();
            strategy.appendField(locator, this, "gender", buffer, theGender);
        }
        {
            DateTime theBirthDate;
            theBirthDate = this.getBirthDate();
            strategy.appendField(locator, this, "birthDate", buffer, theBirthDate);
        }
        {
            Boolean theDeceasedBoolean;
            theDeceasedBoolean = this.getDeceasedBoolean();
            strategy.appendField(locator, this, "deceasedBoolean", buffer, theDeceasedBoolean);
        }
        {
            DateTime theDeceasedDateTime;
            theDeceasedDateTime = this.getDeceasedDateTime();
            strategy.appendField(locator, this, "deceasedDateTime", buffer, theDeceasedDateTime);
        }
        {
            List<Address> theAddress;
            theAddress = (((this.address!= null)&&(!this.address.isEmpty()))?this.getAddress():null);
            strategy.appendField(locator, this, "address", buffer, theAddress);
        }
        {
            CodeableConcept theMaritalStatus;
            theMaritalStatus = this.getMaritalStatus();
            strategy.appendField(locator, this, "maritalStatus", buffer, theMaritalStatus);
        }
        {
            Boolean theMultipleBirthBoolean;
            theMultipleBirthBoolean = this.getMultipleBirthBoolean();
            strategy.appendField(locator, this, "multipleBirthBoolean", buffer, theMultipleBirthBoolean);
        }
        {
            Integer theMultipleBirthInteger;
            theMultipleBirthInteger = this.getMultipleBirthInteger();
            strategy.appendField(locator, this, "multipleBirthInteger", buffer, theMultipleBirthInteger);
        }
        {
            List<Attachment> thePhoto;
            thePhoto = (((this.photo!= null)&&(!this.photo.isEmpty()))?this.getPhoto():null);
            strategy.appendField(locator, this, "photo", buffer, thePhoto);
        }
        {
            List<PatientContact> theContact;
            theContact = (((this.contact!= null)&&(!this.contact.isEmpty()))?this.getContact():null);
            strategy.appendField(locator, this, "contact", buffer, theContact);
        }
        {
            PatientAnimal theAnimal;
            theAnimal = this.getAnimal();
            strategy.appendField(locator, this, "animal", buffer, theAnimal);
        }
        {
            List<CodeableConcept> theCommunication;
            theCommunication = (((this.communication!= null)&&(!this.communication.isEmpty()))?this.getCommunication():null);
            strategy.appendField(locator, this, "communication", buffer, theCommunication);
        }
        {
            List<ResourceReference> theCareProvider;
            theCareProvider = (((this.careProvider!= null)&&(!this.careProvider.isEmpty()))?this.getCareProvider():null);
            strategy.appendField(locator, this, "careProvider", buffer, theCareProvider);
        }
        {
            ResourceReference theManagingOrganization;
            theManagingOrganization = this.getManagingOrganization();
            strategy.appendField(locator, this, "managingOrganization", buffer, theManagingOrganization);
        }
        {
            List<PatientLink> theLink;
            theLink = (((this.link!= null)&&(!this.link.isEmpty()))?this.getLink():null);
            strategy.appendField(locator, this, "link", buffer, theLink);
        }
        {
            Boolean theActive;
            theActive = this.getActive();
            strategy.appendField(locator, this, "active", buffer, theActive);
        }
        return buffer;
    }

}
