//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * A value set specifies a set of codes drawn from one or more code systems.
 * 
 * <p>Java class for ValueSet.Expansion complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ValueSet.Expansion"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}Identifier" minOccurs="0"/&gt;
 *         &lt;element name="timestamp" type="{http://hl7.org/fhir}instant"/&gt;
 *         &lt;element name="contains" type="{http://hl7.org/fhir}ValueSet.Contains" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ValueSetExpansion
    extends BackboneElement
{


    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link Identifier }
     *     
     */
    Identifier getIdentifier();

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Identifier }
     *     
     */
    void setIdentifier(Identifier value);

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link Instant }
     *     
     */
    Instant getTimestamp();

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Instant }
     *     
     */
    void setTimestamp(Instant value);

    /**
     * Gets the value of the contains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ValueSetContains }
     * 
     * 
     */
    List<ValueSetContains> getContains();

}
