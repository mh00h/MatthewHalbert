//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * A statement of relationships from one set of concepts to one or more other concept systems.
 * 
 * <p>Java class for ConceptMap.Map complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConceptMap.Map"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="equivalence" type="{http://hl7.org/fhir}ConceptMapEquivalence"/&gt;
 *         &lt;element name="comments" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="product" type="{http://hl7.org/fhir}ConceptMap.DependsOn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ConceptMapMap
    extends BackboneElement
{


    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    Uri getSystem();

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    void setSystem(Uri value);

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    Code getCode();

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    void setCode(Code value);

    /**
     * Gets the value of the equivalence property.
     * 
     * @return
     *     possible object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    ConceptMapEquivalence getEquivalence();

    /**
     * Sets the value of the equivalence property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConceptMapEquivalence }
     *     
     */
    void setEquivalence(ConceptMapEquivalence value);

    /**
     * Gets the value of the comments property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getComments();

    /**
     * Sets the value of the comments property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setComments(String value);

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConceptMapDependsOn }
     * 
     * 
     */
    List<ConceptMapDependsOn> getProduct();

}
