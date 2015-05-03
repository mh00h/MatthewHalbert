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
 * <p>Java class for Specimen complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Specimen"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="source" type="{http://hl7.org/fhir}Specimen.Source" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="accessionIdentifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="receivedTime" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="collection" type="{http://hl7.org/fhir}Specimen.Collection"/&gt;
 *         &lt;element name="treatment" type="{http://hl7.org/fhir}Specimen.Treatment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="container" type="{http://hl7.org/fhir}Specimen.Container" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Specimen", propOrder = {
    "identifiers",
    "type",
    "sources",
    "subject",
    "accessionIdentifier",
    "receivedTime",
    "collection",
    "treatments",
    "containers"
})
@XmlRootElement(name = "Specimen")
public class Specimen
    extends Resource
    implements ToString
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected CodeableConcept type;
    @XmlElement(name = "source")
    protected List<SpecimenSource> sources;
    @XmlElement(required = true)
    protected ResourceReference subject;
    protected Identifier accessionIdentifier;
    protected DateTime receivedTime;
    @XmlElement(required = true)
    protected SpecimenCollection collection;
    @XmlElement(name = "treatment")
    protected List<SpecimenTreatment> treatments;
    @XmlElement(name = "container")
    protected List<SpecimenContainer> containers;

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
     * Gets the value of the sources property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sources property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSources().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenSource }
     * 
     * 
     */
    public List<SpecimenSource> getSources() {
        if (sources == null) {
            sources = new ArrayList<SpecimenSource>();
        }
        return this.sources;
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
     * Gets the value of the accessionIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getAccessionIdentifier() {
        return accessionIdentifier;
    }

    /**
     * Sets the value of the accessionIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setAccessionIdentifier(Identifier value) {
        this.accessionIdentifier = value;
    }

    /**
     * Gets the value of the receivedTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getReceivedTime() {
        return receivedTime;
    }

    /**
     * Sets the value of the receivedTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setReceivedTime(DateTime value) {
        this.receivedTime = value;
    }

    /**
     * Gets the value of the collection property.
     * 
     * @return
     *     possible object is
     *     {@link SpecimenCollection }
     *     
     */
    public SpecimenCollection getCollection() {
        return collection;
    }

    /**
     * Sets the value of the collection property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecimenCollection }
     *     
     */
    public void setCollection(SpecimenCollection value) {
        this.collection = value;
    }

    /**
     * Gets the value of the treatments property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the treatments property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTreatments().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenTreatment }
     * 
     * 
     */
    public List<SpecimenTreatment> getTreatments() {
        if (treatments == null) {
            treatments = new ArrayList<SpecimenTreatment>();
        }
        return this.treatments;
    }

    /**
     * Gets the value of the containers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the containers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContainers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecimenContainer }
     * 
     * 
     */
    public List<SpecimenContainer> getContainers() {
        if (containers == null) {
            containers = new ArrayList<SpecimenContainer>();
        }
        return this.containers;
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
            List<Identifier> theIdentifiers;
            theIdentifiers = (((this.identifiers!= null)&&(!this.identifiers.isEmpty()))?this.getIdentifiers():null);
            strategy.appendField(locator, this, "identifiers", buffer, theIdentifiers);
        }
        {
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            List<SpecimenSource> theSources;
            theSources = (((this.sources!= null)&&(!this.sources.isEmpty()))?this.getSources():null);
            strategy.appendField(locator, this, "sources", buffer, theSources);
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
            List<SpecimenTreatment> theTreatments;
            theTreatments = (((this.treatments!= null)&&(!this.treatments.isEmpty()))?this.getTreatments():null);
            strategy.appendField(locator, this, "treatments", buffer, theTreatments);
        }
        {
            List<SpecimenContainer> theContainers;
            theContainers = (((this.containers!= null)&&(!this.containers.isEmpty()))?this.getContainers():null);
            strategy.appendField(locator, this, "containers", buffer, theContainers);
        }
        return buffer;
    }

}
