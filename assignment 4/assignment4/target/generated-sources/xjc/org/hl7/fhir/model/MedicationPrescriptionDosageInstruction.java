//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MedicationPrescription.DosageInstruction", propOrder = {
    "text",
    "additionalInstructions",
    "timingSchedule",
    "timingPeriod",
    "timingDateTime",
    "asNeededCodeableConcept",
    "asNeededBoolean",
    "site",
    "route",
    "method",
    "doseQuantity",
    "rate",
    "maxDosePerPeriod"
})
public class MedicationPrescriptionDosageInstruction
    extends BackboneElement
    implements ToString
{

    protected org.hl7.fhir.model.String text;
    protected CodeableConcept additionalInstructions;
    protected Schedule timingSchedule;
    protected Period timingPeriod;
    protected DateTime timingDateTime;
    protected CodeableConcept asNeededCodeableConcept;
    protected Boolean asNeededBoolean;
    protected CodeableConcept site;
    protected CodeableConcept route;
    protected CodeableConcept method;
    protected Quantity doseQuantity;
    protected Ratio rate;
    protected Ratio maxDosePerPeriod;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setText(org.hl7.fhir.model.String value) {
        this.text = value;
    }

    /**
     * Gets the value of the additionalInstructions property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAdditionalInstructions() {
        return additionalInstructions;
    }

    /**
     * Sets the value of the additionalInstructions property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAdditionalInstructions(CodeableConcept value) {
        this.additionalInstructions = value;
    }

    /**
     * Gets the value of the timingSchedule property.
     * 
     * @return
     *     possible object is
     *     {@link Schedule }
     *     
     */
    public Schedule getTimingSchedule() {
        return timingSchedule;
    }

    /**
     * Sets the value of the timingSchedule property.
     * 
     * @param value
     *     allowed object is
     *     {@link Schedule }
     *     
     */
    public void setTimingSchedule(Schedule value) {
        this.timingSchedule = value;
    }

    /**
     * Gets the value of the timingPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Period }
     *     
     */
    public Period getTimingPeriod() {
        return timingPeriod;
    }

    /**
     * Sets the value of the timingPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Period }
     *     
     */
    public void setTimingPeriod(Period value) {
        this.timingPeriod = value;
    }

    /**
     * Gets the value of the timingDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    public DateTime getTimingDateTime() {
        return timingDateTime;
    }

    /**
     * Sets the value of the timingDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    public void setTimingDateTime(DateTime value) {
        this.timingDateTime = value;
    }

    /**
     * Gets the value of the asNeededCodeableConcept property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getAsNeededCodeableConcept() {
        return asNeededCodeableConcept;
    }

    /**
     * Sets the value of the asNeededCodeableConcept property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setAsNeededCodeableConcept(CodeableConcept value) {
        this.asNeededCodeableConcept = value;
    }

    /**
     * Gets the value of the asNeededBoolean property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getAsNeededBoolean() {
        return asNeededBoolean;
    }

    /**
     * Sets the value of the asNeededBoolean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAsNeededBoolean(Boolean value) {
        this.asNeededBoolean = value;
    }

    /**
     * Gets the value of the site property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getSite() {
        return site;
    }

    /**
     * Sets the value of the site property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setSite(CodeableConcept value) {
        this.site = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setRoute(CodeableConcept value) {
        this.route = value;
    }

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    public CodeableConcept getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    public void setMethod(CodeableConcept value) {
        this.method = value;
    }

    /**
     * Gets the value of the doseQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity }
     *     
     */
    public Quantity getDoseQuantity() {
        return doseQuantity;
    }

    /**
     * Sets the value of the doseQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity }
     *     
     */
    public void setDoseQuantity(Quantity value) {
        this.doseQuantity = value;
    }

    /**
     * Gets the value of the rate property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getRate() {
        return rate;
    }

    /**
     * Sets the value of the rate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setRate(Ratio value) {
        this.rate = value;
    }

    /**
     * Gets the value of the maxDosePerPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link Ratio }
     *     
     */
    public Ratio getMaxDosePerPeriod() {
        return maxDosePerPeriod;
    }

    /**
     * Sets the value of the maxDosePerPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Ratio }
     *     
     */
    public void setMaxDosePerPeriod(Ratio value) {
        this.maxDosePerPeriod = value;
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
            org.hl7.fhir.model.String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            CodeableConcept theAdditionalInstructions;
            theAdditionalInstructions = this.getAdditionalInstructions();
            strategy.appendField(locator, this, "additionalInstructions", buffer, theAdditionalInstructions);
        }
        {
            Schedule theTimingSchedule;
            theTimingSchedule = this.getTimingSchedule();
            strategy.appendField(locator, this, "timingSchedule", buffer, theTimingSchedule);
        }
        {
            Period theTimingPeriod;
            theTimingPeriod = this.getTimingPeriod();
            strategy.appendField(locator, this, "timingPeriod", buffer, theTimingPeriod);
        }
        {
            DateTime theTimingDateTime;
            theTimingDateTime = this.getTimingDateTime();
            strategy.appendField(locator, this, "timingDateTime", buffer, theTimingDateTime);
        }
        {
            CodeableConcept theAsNeededCodeableConcept;
            theAsNeededCodeableConcept = this.getAsNeededCodeableConcept();
            strategy.appendField(locator, this, "asNeededCodeableConcept", buffer, theAsNeededCodeableConcept);
        }
        {
            Boolean theAsNeededBoolean;
            theAsNeededBoolean = this.getAsNeededBoolean();
            strategy.appendField(locator, this, "asNeededBoolean", buffer, theAsNeededBoolean);
        }
        {
            CodeableConcept theSite;
            theSite = this.getSite();
            strategy.appendField(locator, this, "site", buffer, theSite);
        }
        {
            CodeableConcept theRoute;
            theRoute = this.getRoute();
            strategy.appendField(locator, this, "route", buffer, theRoute);
        }
        {
            CodeableConcept theMethod;
            theMethod = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theMethod);
        }
        {
            Quantity theDoseQuantity;
            theDoseQuantity = this.getDoseQuantity();
            strategy.appendField(locator, this, "doseQuantity", buffer, theDoseQuantity);
        }
        {
            Ratio theRate;
            theRate = this.getRate();
            strategy.appendField(locator, this, "rate", buffer, theRate);
        }
        {
            Ratio theMaxDosePerPeriod;
            theMaxDosePerPeriod = this.getMaxDosePerPeriod();
            strategy.appendField(locator, this, "maxDosePerPeriod", buffer, theMaxDosePerPeriod);
        }
        return buffer;
    }

}
