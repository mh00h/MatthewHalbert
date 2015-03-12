//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import java.util.List;


/**
 * Demographics and other administrative information about a person or animal receiving care or other health-related services.
 * 
 * <p>Java class for Patient.Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Patient.Contact"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="relationship" type="{http://hl7.org/fhir}CodeableConcept" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}HumanName" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="address" type="{http://hl7.org/fhir}Address" minOccurs="0"/&gt;
 *         &lt;element name="gender" type="{http://hl7.org/fhir}CodeableConcept" minOccurs="0"/&gt;
 *         &lt;element name="organization" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface PatientContact
    extends BackboneElement
{


    /**
     * Gets the value of the relationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CodeableConcept }
     * 
     * 
     */
    List<CodeableConcept> getRelationship();

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link HumanName }
     *     
     */
    HumanName getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link HumanName }
     *     
     */
    void setName(HumanName value);

    /**
     * Gets the value of the telecom property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telecom property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelecom().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contact }
     * 
     * 
     */
    List<Contact> getTelecom();

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    Address getAddress();

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    void setAddress(Address value);

    /**
     * Gets the value of the gender property.
     * 
     * @return
     *     possible object is
     *     {@link CodeableConcept }
     *     
     */
    CodeableConcept getGender();

    /**
     * Sets the value of the gender property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodeableConcept }
     *     
     */
    void setGender(CodeableConcept value);

    /**
     * Gets the value of the organization property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getOrganization();

    /**
     * Sets the value of the organization property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setOrganization(ResourceReference value);

}