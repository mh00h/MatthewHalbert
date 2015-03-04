//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * An order for both supply of the medication and the instructions for administration of the medicine to a patient.
 * 
 * <p>Java class for MedicationPrescription.DosageInstruction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MedicationPrescription.DosageInstruction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="text" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="additionalInstructions" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="timingDateTime" type="{http://hl7.org/fhir}dateTime"/&gt;
 *           &lt;element name="timingPeriod" type="{http://hl7.org/fhir}Period"/&gt;
 *           &lt;element name="timingSchedule" type="{http://hl7.org/fhir}Schedule"/&gt;
 *         &lt;/choice&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="asNeededBoolean" type="{http://hl7.org/fhir}boolean"/&gt;
 *           &lt;element name="asNeededCodeableConcept" type="{http://hl7.org/fhir}CodeableConcept"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="site" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="route" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="method" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="doseQuantity" type="{http://hl7.org/fhir}Quantity" minOccurs="0"/&gt;
 *         &lt;element name="rate" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/&gt;
 *         &lt;element name="maxDosePerPeriod" type="{http://hl7.org/fhir}Ratio" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface MedicationPrescriptionDosageInstruction
    extends BackboneElement
{


    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getText();

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setText(String value);

    /**
     * Gets the value of the additionalInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getAdditionalInstructions();

    /**
     * Sets the value of the additionalInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setAdditionalInstructions(CodeableConcept value);

    /**
     * Gets the value of the timingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getTimingDateTime();

    /**
     * Sets the value of the timingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setTimingDateTime(DateTime value);

    /**
     * Gets the value of the timingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    Period getTimingPeriod();

    /**
     * Sets the value of the timingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    void setTimingPeriod(Period value);

    /**
     * Gets the value of the timingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    Schedule getTimingSchedule();

    /**
     * Sets the value of the timingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    void setTimingSchedule(Schedule value);

    /**
     * Gets the value of the asNeededBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getAsNeededBoolean();

    /**
     * Sets the value of the asNeededBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setAsNeededBoolean(Boolean value);

    /**
     * Gets the value of the asNeededCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getAsNeededCodeableConcept();

    /**
     * Sets the value of the asNeededCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setAsNeededCodeableConcept(CodeableConcept value);

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getSite();

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setSite(CodeableConcept value);

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getRoute();

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setRoute(CodeableConcept value);

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getMethod();

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setMethod(CodeableConcept value);

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    Quantity getDoseQuantity();

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    void setDoseQuantity(Quantity value);

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    Ratio getRate();

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    void setRate(Ratio value);

    /**
     * Gets the value of the maxDosePerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    Ratio getMaxDosePerPeriod();

    /**
     * Sets the value of the maxDosePerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    void setMaxDosePerPeriod(Ratio value);

}
