//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for DocumentReference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentReference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="masterIdentifier" type="{http://hl7.org/fhir}Identifier"/&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="class" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="author" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded"/&gt;
 *         &lt;element name="custodian" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="policyManager" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="authenticator" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="created" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="indexed" type="{http://hl7.org/fhir}instant"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}DocumentReferenceStatus"/&gt;
 *         &lt;element name="docStatus" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="relatesTo" type="{http://hl7.org/fhir}DocumentReference.RelatesTo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="confidentiality" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="primaryLanguage" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="mimeType" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="format" type="{http://hl7.org/fhir}uri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="service" type="{http://hl7.org/fhir}DocumentReference.Service" minOccurs="0"/&gt;
 *         &lt;element name="context" type="{http://hl7.org/fhir}DocumentReference.Context" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentReference", propOrder = {
    "masterIdentifier",
    "identifiers",
    "subject",
    "type",
    "clazz",
    "authors",
    "custodian",
    "policyManager",
    "authenticator",
    "created",
    "indexed",
    "status",
    "docStatus",
    "relatesTos",
    "description",
    "confidentialities",
    "primaryLanguage",
    "mimeType",
    "formats",
    "size",
    "hash",
    "location",
    "service",
    "context"
})
@XmlRootElement(name = "DocumentReference")
public class DocumentReference
    extends Resource
    implements ToString
{

    @XmlElement(required = true)
    protected Identifier masterIdentifier;
    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    @XmlElement(required = true)
    protected ResourceReference subject;
    @XmlElement(required = true)
    protected CodeableConcept type;
    @XmlElement(name = "class")
    protected CodeableConcept clazz;
    @XmlElement(name = "author", required = true)
    protected List<ResourceReference> authors;
    protected ResourceReference custodian;
    protected Uri policyManager;
    protected ResourceReference authenticator;
    protected DateTime created;
    @XmlElement(required = true)
    protected Instant indexed;
    @XmlElement(required = true)
    protected DocumentReferenceStatus status;
    protected CodeableConcept docStatus;
    @XmlElement(name = "relatesTo")
    protected List<DocumentReferenceRelatesTo> relatesTos;
    protected org.hl7.fhir.model.String description;
    @XmlElement(name = "confidentiality")
    protected List<CodeableConcept> confidentialities;
    protected Code primaryLanguage;
    @XmlElement(required = true)
    protected Code mimeType;
    @XmlElement(name = "format")
    protected List<Uri> formats;
    protected Integer size;
    protected org.hl7.fhir.model.String hash;
    protected Uri location;
    protected DocumentReferenceService service;
    protected DocumentReferenceContext context;

    /**
     * Gets the value of the masterIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getMasterIdentifier() {
        return masterIdentifier;
    }

    /**
     * Sets the value of the masterIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setMasterIdentifier(Identifier value) {
        this.masterIdentifier = value;
    }

    /**
     * Gets the value of the identifiers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifiers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifiers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    public List<Identifier> getIdentifiers() {
        if (identifiers == null) {
            identifiers = new ArrayList<Identifier>();
        }
        return this.identifiers;
    }

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getSubject() {
        return subject;
    }

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setSubject(ResourceReference value) {
        this.subject = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setType(CodeableConcept value) {
        this.type = value;
    }

    /**
     * Gets the value of the clazz property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getClazz() {
        return clazz;
    }

    /**
     * Sets the value of the clazz property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setClazz(CodeableConcept value) {
        this.clazz = value;
    }

    /**
     * Gets the value of the authors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the authors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAuthors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getAuthors() {
        if (authors == null) {
            authors = new ArrayList<ResourceReference>();
        }
        return this.authors;
    }

    /**
     * Gets the value of the custodian property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getCustodian() {
        return custodian;
    }

    /**
     * Sets the value of the custodian property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setCustodian(ResourceReference value) {
        this.custodian = value;
    }

    /**
     * Gets the value of the policyManager property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getPolicyManager() {
        return policyManager;
    }

    /**
     * Sets the value of the policyManager property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setPolicyManager(Uri value) {
        this.policyManager = value;
    }

    /**
     * Gets the value of the authenticator property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getAuthenticator() {
        return authenticator;
    }

    /**
     * Sets the value of the authenticator property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAuthenticator(ResourceReference value) {
        this.authenticator = value;
    }

    /**
     * Gets the value of the created property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getCreated() {
        return created;
    }

    /**
     * Sets the value of the created property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setCreated(DateTime value) {
        this.created = value;
    }

    /**
     * Gets the value of the indexed property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    public Instant getIndexed() {
        return indexed;
    }

    /**
     * Sets the value of the indexed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    public void setIndexed(Instant value) {
        this.indexed = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceStatus }
     *     
     */
    public DocumentReferenceStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceStatus }
     *     
     */
    public void setStatus(DocumentReferenceStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the docStatus property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getDocStatus() {
        return docStatus;
    }

    /**
     * Sets the value of the docStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setDocStatus(CodeableConcept value) {
        this.docStatus = value;
    }

    /**
     * Gets the value of the relatesTos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatesTos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatesTos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentReferenceRelatesTo }
     * 
     * 
     */
    public List<DocumentReferenceRelatesTo> getRelatesTos() {
        if (relatesTos == null) {
            relatesTos = new ArrayList<DocumentReferenceRelatesTo>();
        }
        return this.relatesTos;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = value;
    }

    /**
     * Gets the value of the confidentialities property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confidentialities property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfidentialities().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getConfidentialities() {
        if (confidentialities == null) {
            confidentialities = new ArrayList<CodeableConcept>();
        }
        return this.confidentialities;
    }

    /**
     * Gets the value of the primaryLanguage property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getPrimaryLanguage() {
        return primaryLanguage;
    }

    /**
     * Sets the value of the primaryLanguage property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setPrimaryLanguage(Code value) {
        this.primaryLanguage = value;
    }

    /**
     * Gets the value of the mimeType property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getMimeType() {
        return mimeType;
    }

    /**
     * Sets the value of the mimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setMimeType(Code value) {
        this.mimeType = value;
    }

    /**
     * Gets the value of the formats property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formats property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormats().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Uri }
     * 
     * 
     */
    public List<Uri> getFormats() {
        if (formats == null) {
            formats = new ArrayList<Uri>();
        }
        return this.formats;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSize(Integer value) {
        this.size = value;
    }

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getHash() {
        return hash;
    }

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setHash(org.hl7.fhir.model.String value) {
        this.hash = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setLocation(Uri value) {
        this.location = value;
    }

    /**
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceService }
     *     
     */
    public DocumentReferenceService getService() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceService }
     *     
     */
    public void setService(DocumentReferenceService value) {
        this.service = value;
    }

    /**
     * Gets the value of the context property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentReferenceContext }
     *     
     */
    public DocumentReferenceContext getContext() {
        return context;
    }

    /**
     * Sets the value of the context property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentReferenceContext }
     *     
     */
    public void setContext(DocumentReferenceContext value) {
        this.context = value;
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            CodeableConcept theClazz;
            theClazz = this.getClazz();
            strategy.appendField(locator, this, "clazz", buffer, theClazz);
        }
        {
            List<ResourceReference> theAuthors;
            theAuthors = (((this.authors!= null)&&(!this.authors.isEmpty()))?this.getAuthors():null);
            strategy.appendField(locator, this, "authors", buffer, theAuthors);
        }
        {
            ResourceReference theCustodian;
            theCustodian = this.getCustodian();
            strategy.appendField(locator, this, "custodian", buffer, theCustodian);
        }
        {
            Uri thePolicyManager;
            thePolicyManager = this.getPolicyManager();
            strategy.appendField(locator, this, "policyManager", buffer, thePolicyManager);
        }
        {
            ResourceReference theAuthenticator;
            theAuthenticator = this.getAuthenticator();
            strategy.appendField(locator, this, "authenticator", buffer, theAuthenticator);
        }
        {
            DateTime theCreated;
            theCreated = this.getCreated();
            strategy.appendField(locator, this, "created", buffer, theCreated);
        }
        {
            Instant theIndexed;
            theIndexed = this.getIndexed();
            strategy.appendField(locator, this, "indexed", buffer, theIndexed);
        }
        {
            DocumentReferenceStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            CodeableConcept theDocStatus;
            theDocStatus = this.getDocStatus();
            strategy.appendField(locator, this, "docStatus", buffer, theDocStatus);
        }
        {
            List<DocumentReferenceRelatesTo> theRelatesTos;
            theRelatesTos = (((this.relatesTos!= null)&&(!this.relatesTos.isEmpty()))?this.getRelatesTos():null);
            strategy.appendField(locator, this, "relatesTos", buffer, theRelatesTos);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            List<CodeableConcept> theConfidentialities;
            theConfidentialities = (((this.confidentialities!= null)&&(!this.confidentialities.isEmpty()))?this.getConfidentialities():null);
            strategy.appendField(locator, this, "confidentialities", buffer, theConfidentialities);
        }
        {
            Code thePrimaryLanguage;
            thePrimaryLanguage = this.getPrimaryLanguage();
            strategy.appendField(locator, this, "primaryLanguage", buffer, thePrimaryLanguage);
        }
        {
            Code theMimeType;
            theMimeType = this.getMimeType();
            strategy.appendField(locator, this, "mimeType", buffer, theMimeType);
        }
        {
            List<Uri> theFormats;
            theFormats = (((this.formats!= null)&&(!this.formats.isEmpty()))?this.getFormats():null);
            strategy.appendField(locator, this, "formats", buffer, theFormats);
        }
        {
            Integer theSize;
            theSize = this.getSize();
            strategy.appendField(locator, this, "size", buffer, theSize);
        }
        {
            org.hl7.fhir.model.String theHash;
            theHash = this.getHash();
            strategy.appendField(locator, this, "hash", buffer, theHash);
        }
        {
            Uri theLocation;
            theLocation = this.getLocation();
            strategy.appendField(locator, this, "location", buffer, theLocation);
        }
        {
            DocumentReferenceService theService;
            theService = this.getService();
            strategy.appendField(locator, this, "service", buffer, theService);
        }
        {
            DocumentReferenceContext theContext;
            theContext = this.getContext();
            strategy.appendField(locator, this, "context", buffer, theContext);
        }
        return buffer;
    }

}
