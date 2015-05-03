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
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Significant health events and conditions for people related to the subject relevant in the context of care for the subject.
 * 
 * <p>Java class for FamilyHistory.Relation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FamilyHistory.Relation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="bornPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *           &lt;element name="bornDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="bornString" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="deceasedBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="deceasedAge" type="{http://hl7.org/fhir}Age"/&gt;
 *           &lt;element name="deceasedRange" type="{http://hl7.org/fhir}Range"/&gt;
 *           &lt;element name="deceasedDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="deceasedString" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="note" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="condition" type="{http://hl7.org/fhir}FamilyHistory.Condition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistory.Relation", propOrder = {
    "name",
    "relationship",
    "bornString",
    "bornDate",
    "bornPeriod",
    "deceasedString",
    "deceasedDate",
    "deceasedRange",
    "deceasedAge",
    "deceasedBoolean",
    "note",
    "conditions"
})
public class FamilyHistoryRelation
    extends BackboneElement
    implements ToString
{

    protected org.hl7.fhir.model.String name;
    @XmlElement(required = true)
    protected CodeableConcept relationship;
    protected org.hl7.fhir.model.String bornString;
    protected Date bornDate;
    protected Period bornPeriod;
    protected org.hl7.fhir.model.String deceasedString;
    protected Date deceasedDate;
    protected Range deceasedRange;
    protected Age deceasedAge;
    protected Boolean deceasedBoolean;
    protected org.hl7.fhir.model.String note;
    @XmlElement(name = "condition")
    protected List<FamilyHistoryCondition> conditions;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRelationship(CodeableConcept value) {
        this.relationship = value;
    }

    /**
     * Gets the value of the bornString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getBornString() {
        return bornString;
    }

    /**
     * Sets the value of the bornString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setBornString(org.hl7.fhir.model.String value) {
        this.bornString = value;
    }

    /**
     * Gets the value of the bornDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getBornDate() {
        return bornDate;
    }

    /**
     * Sets the value of the bornDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setBornDate(Date value) {
        this.bornDate = value;
    }

    /**
     * Gets the value of the bornPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getBornPeriod() {
        return bornPeriod;
    }

    /**
     * Sets the value of the bornPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setBornPeriod(Period value) {
        this.bornPeriod = value;
    }

    /**
     * Gets the value of the deceasedString property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDeceasedString() {
        return deceasedString;
    }

    /**
     * Sets the value of the deceasedString property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDeceasedString(org.hl7.fhir.model.String value) {
        this.deceasedString = value;
    }

    /**
     * Gets the value of the deceasedDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    public Date getDeceasedDate() {
        return deceasedDate;
    }

    /**
     * Sets the value of the deceasedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    public void setDeceasedDate(Date value) {
        this.deceasedDate = value;
    }

    /**
     * Gets the value of the deceasedRange property.
     * 
     * @return
     *     possible object is
     *     {@link Range }
     *     
     */
    public Range getDeceasedRange() {
        return deceasedRange;
    }

    /**
     * Sets the value of the deceasedRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link Range }
     *     
     */
    public void setDeceasedRange(Range value) {
        this.deceasedRange = value;
    }

    /**
     * Gets the value of the deceasedAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    public Age getDeceasedAge() {
        return deceasedAge;
    }

    /**
     * Sets the value of the deceasedAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    public void setDeceasedAge(Age value) {
        this.deceasedAge = value;
    }

    /**
     * Gets the value of the deceasedBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    /**
     * Sets the value of the deceasedBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeceasedBoolean(Boolean value) {
        this.deceasedBoolean = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setNote(org.hl7.fhir.model.String value) {
        this.note = value;
    }

    /**
     * Gets the value of the conditions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FamilyHistoryCondition }
     * 
     * 
     */
    public List<FamilyHistoryCondition> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<FamilyHistoryCondition>();
        }
        return this.conditions;
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
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            CodeableConcept theRelationship;
            theRelationship = this.getRelationship();
            strategy.appendField(locator, this, "relationship", buffer, theRelationship);
        }
        {
            org.hl7.fhir.model.String theBornString;
            theBornString = this.getBornString();
            strategy.appendField(locator, this, "bornString", buffer, theBornString);
        }
        {
            Date theBornDate;
            theBornDate = this.getBornDate();
            strategy.appendField(locator, this, "bornDate", buffer, theBornDate);
        }
        {
            Period theBornPeriod;
            theBornPeriod = this.getBornPeriod();
            strategy.appendField(locator, this, "bornPeriod", buffer, theBornPeriod);
        }
        {
            org.hl7.fhir.model.String theDeceasedString;
            theDeceasedString = this.getDeceasedString();
            strategy.appendField(locator, this, "deceasedString", buffer, theDeceasedString);
        }
        {
            Date theDeceasedDate;
            theDeceasedDate = this.getDeceasedDate();
            strategy.appendField(locator, this, "deceasedDate", buffer, theDeceasedDate);
        }
        {
            Range theDeceasedRange;
            theDeceasedRange = this.getDeceasedRange();
            strategy.appendField(locator, this, "deceasedRange", buffer, theDeceasedRange);
        }
        {
            Age theDeceasedAge;
            theDeceasedAge = this.getDeceasedAge();
            strategy.appendField(locator, this, "deceasedAge", buffer, theDeceasedAge);
        }
        {
            Boolean theDeceasedBoolean;
            theDeceasedBoolean = this.getDeceasedBoolean();
            strategy.appendField(locator, this, "deceasedBoolean", buffer, theDeceasedBoolean);
        }
        {
            org.hl7.fhir.model.String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        {
            List<FamilyHistoryCondition> theConditions;
            theConditions = (((this.conditions!= null)&&(!this.conditions.isEmpty()))?this.getConditions():null);
            strategy.appendField(locator, this, "conditions", buffer, theConditions);
        }
        return buffer;
    }

}
