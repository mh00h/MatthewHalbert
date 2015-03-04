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
 * <p>Java class for AdverseReaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AdverseReaction"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="subject" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *         &lt;element name="didNotOccurFlag" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="recorder" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *         &lt;element name="symptom" type="{http://hl7.org/fhir}AdverseReaction.Symptom" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="exposure" type="{http://hl7.org/fhir}AdverseReaction.Exposure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface AdverseReaction
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
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link DateTime }
     *     
     */
    DateTime getDate();

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTime }
     *     
     */
    void setDate(DateTime value);

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
     * Gets the value of the didNotOccurFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getDidNotOccurFlag();

    /**
     * Sets the value of the didNotOccurFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setDidNotOccurFlag(Boolean value);

    /**
     * Gets the value of the recorder property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getRecorder();

    /**
     * Sets the value of the recorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setRecorder(ResourceReference value);

    /**
     * Gets the value of the symptom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the symptom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSymptom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdverseReactionSymptom }
     * 
     * 
     */
    List<AdverseReactionSymptom> getSymptom();

    /**
     * Gets the value of the exposure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exposure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExposure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AdverseReactionExposure }
     * 
     * 
     */
    List<AdverseReactionExposure> getExposure();

}
