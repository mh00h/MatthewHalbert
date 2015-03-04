//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * An action that is performed on a patient. This can be a physical 'thing' like an operation, or less invasive like counseling or hypnotherapy.
 * 
 * <p>Java class for Procedure.RelatedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Procedure.RelatedItem"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}ProcedureRelationshipType" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface ProcedureRelatedItem
    extends BackboneElement
{


    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link ProcedureRelationshipType }
     *     
     */
    ProcedureRelationshipType getType();

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcedureRelationshipType }
     *     
     */
    void setType(ProcedureRelationshipType value);

    /**
     * Gets the value of the target property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getTarget();

    /**
     * Sets the value of the target property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setTarget(ResourceReference value);

}
