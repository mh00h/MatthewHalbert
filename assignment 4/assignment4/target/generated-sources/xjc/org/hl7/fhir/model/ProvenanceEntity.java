//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * Provenance information that describes the activity that led to the creation of a set of resources. This information can be used to help determine their reliability or trace where the information in them came from. The focus of the provenance resource is record keeping, audit and traceability, and not explicit statements of clinical significance.
 * 
 * <p>Java class for Provenance.Entity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Provenance.Entity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="role" type="{http://hl7.org/fhir}ProvenanceEntityRole"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}Coding"/&gt;
 *         &lt;element name="reference" type="{http://hl7.org/fhir}uri"/&gt;
 *         &lt;element name="display" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="agent" type="{http://hl7.org/fhir}Provenance.Agent" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ProvenanceEntity
    extends BackboneElement
{


    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    ProvenanceEntityRole getRole();

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    void setRole(ProvenanceEntityRole value);

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    Coding getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    void setType(Coding value);

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    Uri getReference();

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    void setReference(Uri value);

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDisplay();

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDisplay(String value);

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceAgent }
     *     
     */
    ProvenanceAgent getAgent();

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceAgent }
     *     
     */
    void setAgent(ProvenanceAgent value);

}
