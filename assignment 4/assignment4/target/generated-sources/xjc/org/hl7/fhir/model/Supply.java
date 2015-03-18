//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 12:43:31 PM MST 
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
 * <p>Java class for Supply complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Supply"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="kind" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}SupplyStatus" minOccurs="0"/&gt;
 *         &lt;element name="orderedItem" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="patient" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="dispense" type="{http://hl7.org/fhir}Supply.Dispense" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Supply", propOrder = {
    "kind",
    "identifier",
    "status",
    "orderedItem",
    "patient",
    "dispenses"
})
@XmlRootElement(name = "Supply")
public class Supply
    extends Resource
    implements ToString
{

    protected CodeableConcept kind;
    protected Identifier identifier;
    protected SupplyStatus status;
    protected ResourceReference orderedItem;
    protected ResourceReference patient;
    @XmlElement(name = "dispense")
    protected List<SupplyDispense> dispenses;

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setKind(CodeableConcept value) {
        this.kind = value;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    public Identifier getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    public void setIdentifier(Identifier value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link SupplyStatus }
     *     
     */
    public SupplyStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplyStatus }
     *     
     */
    public void setStatus(SupplyStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the orderedItem property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getOrderedItem() {
        return orderedItem;
    }

    /**
     * Sets the value of the orderedItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setOrderedItem(ResourceReference value) {
        this.orderedItem = value;
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
     * Gets the value of the dispenses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dispenses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDispenses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplyDispense }
     * 
     * 
     */
    public List<SupplyDispense> getDispenses() {
        if (dispenses == null) {
            dispenses = new ArrayList<SupplyDispense>();
        }
        return this.dispenses;
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
            CodeableConcept theKind;
            theKind = this.getKind();
            strategy.appendField(locator, this, "kind", buffer, theKind);
        }
        {
            Identifier theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier);
        }
        {
            SupplyStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            ResourceReference theOrderedItem;
            theOrderedItem = this.getOrderedItem();
            strategy.appendField(locator, this, "orderedItem", buffer, theOrderedItem);
        }
        {
            ResourceReference thePatient;
            thePatient = this.getPatient();
            strategy.appendField(locator, this, "patient", buffer, thePatient);
        }
        {
            List<SupplyDispense> theDispenses;
            theDispenses = (((this.dispenses!= null)&&(!this.dispenses.isEmpty()))?this.getDispenses():null);
            strategy.appendField(locator, this, "dispenses", buffer, theDispenses);
        }
        return buffer;
    }

}
