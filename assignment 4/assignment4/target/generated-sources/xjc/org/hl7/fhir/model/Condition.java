//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for Condition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Condition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="encounter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="asserter" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="dateAsserted" type="{http://hl7.org/fhir}date" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;element name="category" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ConditionStatus"/&gt;
 *         &lt;element name="certainty" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="severity" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="onsetDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="onsetAge" type="{http://hl7.org/fhir}Age"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="abatementDate" type="{http://hl7.org/fhir}date"/&gt;
 *           &lt;element name="abatementAge" type="{http://hl7.org/fhir}Age"/&gt;
 *           &lt;element name="abatementBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="stage" type="{http://hl7.org/fhir}Condition.Stage" minOccurs="0"/&gt;
 *         &lt;element name="evidence" type="{http://hl7.org/fhir}Condition.Evidence" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="location" type="{http://hl7.org/fhir}Condition.Location" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="relatedItem" type="{http://hl7.org/fhir}Condition.RelatedItem" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="notes" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface Condition
    extends Resource
{


    /**
     * Gets the value of the identifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Identifier }
     * 
     * 
     */
    List<Identifier> getIdentifier();

    /**
     * Gets the value of the subject property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getSubject();

    /**
     * Sets the value of the subject property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setSubject(ResourceReference value);

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getEncounter();

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setEncounter(ResourceReference value);

    /**
     * Gets the value of the asserter property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getAsserter();

    /**
     * Sets the value of the asserter property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setAsserter(ResourceReference value);

    /**
     * Gets the value of the dateAsserted property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    Date getDateAsserted();

    /**
     * Sets the value of the dateAsserted property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    void setDateAsserted(Date value);

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setCode(CodeableConcept value);

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getCategory();

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setCategory(CodeableConcept value);

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionStatus }
     *     
     */
    ConditionStatus getStatus();

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionStatus }
     *     
     */
    void setStatus(ConditionStatus value);

    /**
     * Gets the value of the certainty property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getCertainty();

    /**
     * Sets the value of the certainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setCertainty(CodeableConcept value);

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getSeverity();

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setSeverity(CodeableConcept value);

    /**
     * Gets the value of the onsetDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    Date getOnsetDate();

    /**
     * Sets the value of the onsetDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    void setOnsetDate(Date value);

    /**
     * Gets the value of the onsetAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    Age getOnsetAge();

    /**
     * Sets the value of the onsetAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    void setOnsetAge(Age value);

    /**
     * Gets the value of the abatementDate property.
     * 
     * @return
     *     possible object is
     *     {@link Date }
     *     
     */
    Date getAbatementDate();

    /**
     * Sets the value of the abatementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     *     
     */
    void setAbatementDate(Date value);

    /**
     * Gets the value of the abatementAge property.
     * 
     * @return
     *     possible object is
     *     {@link Age }
     *     
     */
    Age getAbatementAge();

    /**
     * Sets the value of the abatementAge property.
     * 
     * @param value
     *     allowed object is
     *     {@link Age }
     *     
     */
    void setAbatementAge(Age value);

    /**
     * Gets the value of the abatementBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getAbatementBoolean();

    /**
     * Sets the value of the abatementBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setAbatementBoolean(Boolean value);

    /**
     * Gets the value of the stage property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionStage }
     *     
     */
    ConditionStage getStage();

    /**
     * Sets the value of the stage property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionStage }
     *     
     */
    void setStage(ConditionStage value);

    /**
     * Gets the value of the evidence property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evidence property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvidence().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionEvidence }
     * 
     * 
     */
    List<ConditionEvidence> getEvidence();

    /**
     * Gets the value of the location property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the location property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLocation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionLocation }
     * 
     * 
     */
    List<ConditionLocation> getLocation();

    /**
     * Gets the value of the relatedItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relatedItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelatedItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConditionRelatedItem }
     * 
     * 
     */
    List<ConditionRelatedItem> getRelatedItem();

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getNotes();

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setNotes(String value);

}
