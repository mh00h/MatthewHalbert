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
 * A conformance statement is a set of requirements for a desired implementation or a description of how a target application fulfills those requirements in a particular implementation.
 * 
 * <p>Java class for Conformance.SearchParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Conformance.SearchParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name" type="{http://hl7.org/fhir}string"/&gt;
 *         &lt;element name="definition" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="type" type="{http://hl7.org/fhir}SearchParamType"/&gt;
 *         &lt;element name="documentation" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="target" type="{http://hl7.org/fhir}code" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="chain" type="{http://hl7.org/fhir}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.SearchParam", propOrder = {
    "name",
    "definition",
    "type",
    "documentation",
    "targets",
    "chains"
})
public class ConformanceSearchParam
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected org.hl7.fhir.model.String name;
    protected Uri definition;
    @XmlElement(required = true)
    protected SearchParamType type;
    protected org.hl7.fhir.model.String documentation;
    @XmlElement(name = "target")
    protected List<Code> targets;
    @XmlElement(name = "chain")
    protected List<org.hl7.fhir.model.String> chains;

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
     * Gets the value of the definition property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getDefinition() {
        return definition;
    }

    /**
     * Sets the value of the definition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setDefinition(Uri value) {
        this.definition = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link SearchParamType }
     *     
     */
    public SearchParamType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link SearchParamType }
     *     
     */
    public void setType(SearchParamType value) {
        this.type = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDocumentation(org.hl7.fhir.model.String value) {
        this.documentation = value;
    }

    /**
     * Gets the value of the targets property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the targets property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTargets().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Code }
     * 
     * 
     */
    public List<Code> getTargets() {
        if (targets == null) {
            targets = new ArrayList<Code>();
        }
        return this.targets;
    }

    /**
     * Gets the value of the chains property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chains property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChains().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link org.hl7.fhir.model.String }
     * 
     * 
     */
    public List<org.hl7.fhir.model.String> getChains() {
        if (chains == null) {
            chains = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.chains;
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
            org.hl7.fhir.model.String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName);
        }
        {
            Uri theDefinition;
            theDefinition = this.getDefinition();
            strategy.appendField(locator, this, "definition", buffer, theDefinition);
        }
        {
            SearchParamType theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation);
        }
        {
            List<Code> theTargets;
            theTargets = (((this.targets!= null)&&(!this.targets.isEmpty()))?this.getTargets():null);
            strategy.appendField(locator, this, "targets", buffer, theTargets);
        }
        {
            List<org.hl7.fhir.model.String> theChains;
            theChains = (((this.chains!= null)&&(!this.chains.isEmpty()))?this.getChains():null);
            strategy.appendField(locator, this, "chains", buffer, theChains);
        }
        return buffer;
    }

}
