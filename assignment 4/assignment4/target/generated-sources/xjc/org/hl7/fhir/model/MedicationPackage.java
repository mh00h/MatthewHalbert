//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * Primarily used for identification and definition of Medication, but also covers ingredients and packaging.
 * 
 * <p>Java class for Medication.Package complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Medication.Package"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="container" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="content" type="{http://hl7.org/fhir}Medication.Content" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface MedicationPackage
    extends BackboneElement
{


    /**
     * Gets the value of the container property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getContainer();

    /**
     * Sets the value of the container property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setContainer(CodeableConcept value);

    /**
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MedicationContent }
     * 
     * 
     */
    List<MedicationContent> getContent();

}
