//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * A Resource Profile - a statement of use of one or more FHIR Resources.  It may include constraints on Resources and Data Types, Terminology Binding Statements and Extension Definitions.
 * 
 * <p>Java class for Profile.Structure complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Profile.Structure"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}code"/&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="publish" type="{http://hl7.org/fhir}boolean" minOccurs="0"/&gt;
 *         &lt;element name="purpose" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="element" type="{http://hl7.org/fhir}Profile.Element" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="searchParam" type="{http://hl7.org/fhir}Profile.SearchParam" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Structure", propOrder = {
    "type",
    "name",
    "publish",
    "purpose",
    "elements",
    "searchParams"
})
public class ProfileStructure
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected Code type;
    protected org.hl7.fhir.model.String name;
    protected Boolean publish;
    protected org.hl7.fhir.model.String purpose;
    @XmlElement(name = "element")
    protected List<ProfileElement> elements;
    @XmlElement(name = "searchParam")
    protected List<ProfileSearchParam> searchParams;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setType(Code value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setName(org.hl7.fhir.model.String value) {
        this.name = value;
    }

    /**
     * Gets the value of the publish property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getPublish() {
        return publish;
    }

    /**
     * Sets the value of the publish property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPublish(Boolean value) {
        this.publish = value;
    }

    /**
     * Gets the value of the purpose property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getPurpose() {
        return purpose;
    }

    /**
     * Sets the value of the purpose property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setPurpose(org.hl7.fhir.model.String value) {
        this.purpose = value;
    }

    /**
     * Gets the value of the elements property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the elements property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getElements().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileElement }
     * 
     * 
     */
    public List<ProfileElement> getElements() {
        if (elements == null) {
            elements = new ArrayList<ProfileElement>();
        }
        return this.elements;
    }

    /**
     * Gets the value of the searchParams property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the searchParams property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSearchParams().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileSearchParam }
     * 
     * 
     */
    public List<ProfileSearchParam> getSearchParams() {
        if (searchParams == null) {
            searchParams = new ArrayList<ProfileSearchParam>();
        }
        return this.searchParams;
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
            Code theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Boolean thePublish;
            thePublish = this.getPublish();
            strategy.appendField(locator, this, "publish", buffer, thePublish);
        }
        {
            org.hl7.fhir.model.String thePurpose;
            thePurpose = this.getPurpose();
            strategy.appendField(locator, this, "purpose", buffer, thePurpose);
        }
        {
            List<ProfileElement> theElements;
            theElements = (((this.elements!= null)&&(!this.elements.isEmpty()))?this.getElements():null);
            strategy.appendField(locator, this, "elements", buffer, theElements);
        }
        {
            List<ProfileSearchParam> theSearchParams;
            theSearchParams = (((this.searchParams!= null)&&(!this.searchParams.isEmpty()))?this.getSearchParams():null);
            strategy.appendField(locator, this, "searchParams", buffer, theSearchParams);
        }
        return buffer;
    }

}
