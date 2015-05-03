//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * Manifest of a set of images produced in study. The set of images may include every image in the study, or it may be an incomplete sample, such as a list of key images.
 * 
 * <p>Java class for ImagingStudy.Instance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImagingStudy.Instance"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="number" type="{http://hl7.org/fhir}integer" minOccurs="0"/&gt;
 *         &lt;element name="uid" type="{http://hl7.org/fhir}oid"/&gt;
 *         &lt;element name="sopclass" type="{http://hl7.org/fhir}oid"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="title" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="url" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="attachment" type="{http://hl7.org/fhir}ResourceReference" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImagingStudy.Instance", propOrder = {
    "number",
    "uid",
    "sopclass",
    "type",
    "title",
    "url",
    "attachment"
})
public class ImagingStudyInstance
    extends BackboneElement
    implements ToString
{

    protected Integer number;
    @XmlElement(required = true)
    protected Oid uid;
    @XmlElement(required = true)
    protected Oid sopclass;
    protected org.hl7.fhir.model.String type;
    protected org.hl7.fhir.model.String title;
    protected Uri url;
    protected ResourceReference attachment;

    /**
     * Gets the value of the number property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Sets the value of the number property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNumber(Integer value) {
        this.number = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getUid() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setUid(Oid value) {
        this.uid = value;
    }

    /**
     * Gets the value of the sopclass property.
     * 
     * @return
     *     possible object is
     *     {@link Oid }
     *     
     */
    public Oid getSopclass() {
        return sopclass;
    }

    /**
     * Sets the value of the sopclass property.
     * 
     * @param value
     *     allowed object is
     *     {@link Oid }
     *     
     */
    public void setSopclass(Oid value) {
        this.sopclass = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setType(org.hl7.fhir.model.String value) {
        this.type = value;
    }

    /**
     * Gets the value of the title property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getTitle() {
        return title;
    }

    /**
     * Sets the value of the title property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setTitle(org.hl7.fhir.model.String value) {
        this.title = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setUrl(Uri value) {
        this.url = value;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    public ResourceReference getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    public void setAttachment(ResourceReference value) {
        this.attachment = value;
    }

    public java.lang.String toString() {
        final ToStringStrategy strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy strategy) {
        super.appendFields(locator, buffer, strategy);
        {
            Integer theNumber;
            theNumber = this.getNumber();
            strategy.appendField(locator, this, "number", buffer, theNumber);
        }
        {
            Oid theUid;
            theUid = this.getUid();
            strategy.appendField(locator, this, "uid", buffer, theUid);
        }
        {
            Oid theSopclass;
            theSopclass = this.getSopclass();
            strategy.appendField(locator, this, "sopclass", buffer, theSopclass);
        }
        {
            org.hl7.fhir.model.String theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            Uri theUrl;
            theUrl = this.getUrl();
            strategy.appendField(locator, this, "url", buffer, theUrl);
        }
        {
            ResourceReference theAttachment;
            theAttachment = this.getAttachment();
            strategy.appendField(locator, this, "attachment", buffer, theAttachment);
        }
        return buffer;
    }

}
