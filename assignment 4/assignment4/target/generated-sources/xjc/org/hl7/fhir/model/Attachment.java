//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Attachment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Attachment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="contentType" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="language" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *         &lt;element name="data" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="hash" type="{http://hl7.org/fhir}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface Attachment
    extends Element
{


    /**
     * Gets the value of the contentType property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    Code getContentType();

    /**
     * Sets the value of the contentType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    void setContentType(Code value);

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    Code getLanguage();

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    void setLanguage(Code value);

    /**
     * Gets the value of the data property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    Base64Binary getData();

    /**
     * Sets the value of the data property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    void setData(Base64Binary value);

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    Uri getUrl();

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    void setUrl(Uri value);

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    Integer getSize();

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    void setSize(Integer value);

    /**
     * Gets the value of the hash property.
     * 
     * @return
     *     possible object is
     *     {@link Base64Binary }
     *     
     */
    Base64Binary getHash();

    /**
     * Sets the value of the hash property.
     * 
     * @param value
     *     allowed object is
     *     {@link Base64Binary }
     *     
     */
    void setHash(Base64Binary value);

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getTitle();

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setTitle(String value);

}
