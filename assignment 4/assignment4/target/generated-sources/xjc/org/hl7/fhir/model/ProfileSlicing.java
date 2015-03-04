//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Slicing complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Slicing"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="discriminator" type="{http://hl7.org/fhir}id"/&gt;
 *         &lt;element name="ordered" type="{http://hl7.org/fhir}boolean"/&gt;
 *         &lt;element name="rules" type="{http://hl7.org/fhir}SlicingRules"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ProfileSlicing
    extends BackboneElement
{


    /**
     * Gets the value of the discriminator property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    Id getDiscriminator();

    /**
     * Sets the value of the discriminator property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    void setDiscriminator(Id value);

    /**
     * Gets the value of the ordered property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getOrdered();

    /**
     * Sets the value of the ordered property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setOrdered(Boolean value);

    /**
     * Gets the value of the rules property.
     * 
     * @return
     *     possible object is
     *     {@link SlicingRules }
     *     
     */
    SlicingRules getRules();

    /**
     * Sets the value of the rules property.
     * 
     * @param value
     *     allowed object is
     *     {@link SlicingRules }
     *     
     */
    void setRules(SlicingRules value);

}
