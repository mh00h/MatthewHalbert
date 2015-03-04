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
 * <p>Java class for Profile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifier" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="version" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="publisher" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="telecom" type="{http://hl7.org/fhir}Contact" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="description" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}Coding" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="status" type="{http://hl7.org/fhir}ResourceProfileStatus"/&gt;
 *         &lt;element name="experimental" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://hl7.org/fhir}dateTime" minOccurs="0"/&gt;
 *         &lt;element name="requirements" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="fhirVersion" type="{http://hl7.org/fhir}id" minOccurs="0"/&gt;
 *         &lt;element name="mapping" type="{http://hl7.org/fhir}Profile.Mapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="structure" type="{http://hl7.org/fhir}Profile.Structure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="extensionDefn" type="{http://hl7.org/fhir}Profile.ExtensionDefn" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="query" type="{http://hl7.org/fhir}Profile.Query" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface Profile
    extends Resource
{


    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getIdentifier();

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setIdentifier(String value);

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getVersion();

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setVersion(String value);

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getName();

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setName(String value);

    /**
     * Gets the value of the publisher property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getPublisher();

    /**
     * Sets the value of the publisher property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setPublisher(String value);

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
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getDescription();

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setDescription(String value);

    /**
     * Gets the value of the code property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the code property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Coding }
     * 
     * 
     */
    List<Coding> getCode();

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceProfileStatus }
     *     
     */
    ResourceProfileStatus getStatus();

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceProfileStatus }
     *     
     */
    void setStatus(ResourceProfileStatus value);

    /**
     * Gets the value of the experimental property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    Boolean getExperimental();

    /**
     * Sets the value of the experimental property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    void setExperimental(Boolean value);

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
     * Gets the value of the requirements property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getRequirements();

    /**
     * Sets the value of the requirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setRequirements(String value);

    /**
     * Gets the value of the fhirVersion property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    Id getFhirVersion();

    /**
     * Sets the value of the fhirVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    void setFhirVersion(Id value);

    /**
     * Gets the value of the mapping property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mapping property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMapping().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileMapping }
     * 
     * 
     */
    List<ProfileMapping> getMapping();

    /**
     * Gets the value of the structure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the structure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStructure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileStructure }
     * 
     * 
     */
    List<ProfileStructure> getStructure();

    /**
     * Gets the value of the extensionDefn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionDefn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionDefn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileExtensionDefn }
     * 
     * 
     */
    List<ProfileExtensionDefn> getExtensionDefn();

    /**
     * Gets the value of the query property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the query property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQuery().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileQuery }
     * 
     * 
     */
    List<ProfileQuery> getQuery();

}
