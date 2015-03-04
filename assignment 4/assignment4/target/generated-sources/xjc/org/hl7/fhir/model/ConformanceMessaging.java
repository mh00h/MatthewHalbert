//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.Messaging complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.Messaging"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="endpoint" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="reliableCache" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="event" type="{http://hl7.org/fhir}Conformance.Event" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ConformanceMessaging
    extends BackboneElement
{


    /**
     * Gets the value of the endpoint property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    Uri getEndpoint();

    /**
     * Sets the value of the endpoint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    void setEndpoint(Uri value);

    /**
     * Gets the value of the reliableCache property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    Integer getReliableCache();

    /**
     * Sets the value of the reliableCache property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    void setReliableCache(Integer value);

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDocumentation();

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDocumentation(String value);

    /**
     * Gets the value of the event property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the event property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConformanceEvent }
     * 
     * 
     */
    List<ConformanceEvent> getEvent();

}
