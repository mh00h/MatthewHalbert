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
 * <p>Java class for MedicationStatement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationStatement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="wasNotGiven" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="reasonNotGiven" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="whenGiven" type="{http://hl7.org/fhir}Period" minOccurs="0"/&gt;
 *         &lt;element name="medication" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="device" type="{http://hl7.org/fhir}ResourceReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="dosage" type="{http://hl7.org/fhir}MedicationStatement.Dosage" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationStatement", propOrder = {
    "identifiers",
    "patient",
    "wasNotGiven",
    "reasonNotGivens",
    "whenGiven",
    "medication",
    "devices",
    "dosages"
})
@XmlRootElement(name = "MedicationStatement")
public class MedicationStatement
    extends Resource
    implements ToString
{

    @XmlElement(name = "identifier")
    protected List<Identifier> identifiers;
    protected ResourceReference patient;
    protected Boolean wasNotGiven;
    @XmlElement(name = "reasonNotGiven")
    protected List<CodeableConcept> reasonNotGivens;
    protected Period whenGiven;
    protected ResourceReference medication;
    @XmlElement(name = "device")
    protected List<ResourceReference> devices;
    @XmlElement(name = "dosage")
    protected List<MedicationStatementDosage> dosages;

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
     * Gets the value of the patient property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getPatient() {
        return patient;
    }

    /**
     * Sets the value of the patient property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setPatient(ResourceReference value) {
        this.patient = value;
    }

    /**
     * Gets the value of the wasNotGiven property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getWasNotGiven() {
        return wasNotGiven;
    }

    /**
     * Sets the value of the wasNotGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWasNotGiven(Boolean value) {
        this.wasNotGiven = value;
    }

    /**
     * Gets the value of the reasonNotGivens property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reasonNotGivens property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReasonNotGivens().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    public List<CodeableConcept> getReasonNotGivens() {
        if (reasonNotGivens == null) {
            reasonNotGivens = new ArrayList<CodeableConcept>();
        }
        return this.reasonNotGivens;
    }

    /**
     * Gets the value of the whenGiven property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getWhenGiven() {
        return whenGiven;
    }

    /**
     * Sets the value of the whenGiven property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setWhenGiven(Period value) {
        this.whenGiven = value;
    }

    /**
     * Gets the value of the medication property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getMedication() {
        return medication;
    }

    /**
     * Sets the value of the medication property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setMedication(ResourceReference value) {
        this.medication = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResourceReference }
     * 
     * 
     */
    public List<ResourceReference> getDevices() {
        if (devices == null) {
            devices = new ArrayList<ResourceReference>();
        }
        return this.devices;
    }

    /**
     * Gets the value of the dosages property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dosages property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDosages().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationStatementDosage }
     * 
     * 
     */
    public List<MedicationStatementDosage> getDosages() {
        if (dosages == null) {
            dosages = new ArrayList<MedicationStatementDosage>();
        }
        return this.dosages;
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
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            Boolean theWasNotGiven;
            theWasNotGiven = this.getWasNotGiven();
            strategy.appendField(locator, this, "wasNotGiven", buffer, theWasNotGiven);
        }
        {
            List<CodeableConcept> theReasonNotGivens;
            theReasonNotGivens = (((this.reasonNotGivens!= null)&&(!this.reasonNotGivens.isEmpty()))?this.getReasonNotGivens():null);
            strategy.appendField(locator, this, "reasonNotGivens", buffer, theReasonNotGivens);
        }
        {
            Period theWhenGiven;
            theWhenGiven = this.getWhenGiven();
            strategy.appendField(locator, this, "whenGiven", buffer, theWhenGiven);
        }
        {
            ResourceReference theMedication;
            theMedication = this.getMedication();
            strategy.appendField(locator, this, "medication", buffer, theMedication);
        }
        {
            List<ResourceReference> theDevices;
            theDevices = (((this.devices!= null)&&(!this.devices.isEmpty()))?this.getDevices():null);
            strategy.appendField(locator, this, "devices", buffer, theDevices);
        }
        {
            List<MedicationStatementDosage> theDosages;
            theDosages = (((this.dosages!= null)&&(!this.dosages.isEmpty()))?this.getDosages():null);
            strategy.appendField(locator, this, "dosages", buffer, theDosages);
        }
        return buffer;
    }

}
