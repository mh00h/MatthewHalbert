//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.03.18 at 12:43:31 PM MST 
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
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Provenance.Entity", propOrder = {
    "role",
    "type",
    "reference",
    "display",
    "agent"
})
public class ProvenanceEntity
    extends BackboneElement
    implements ToString
{

    @XmlElement(required = true)
    protected ProvenanceEntityRole role;
    @XmlElement(required = true)
    protected Coding type;
    @XmlElement(required = true)
    protected Uri reference;
    protected org.hl7.fhir.model.String display;
    protected ProvenanceAgent agent;

    /**
     * Gets the value of the role property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public ProvenanceEntityRole getRole() {
        return role;
    }

    /**
     * Sets the value of the role property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceEntityRole }
     *     
     */
    public void setRole(ProvenanceEntityRole value) {
        this.role = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link Coding }
     *     
     */
    public Coding getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link Coding }
     *     
     */
    public void setType(Coding value) {
        this.type = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setReference(Uri value) {
        this.reference = value;
    }

    /**
     * Gets the value of the display property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getDisplay() {
        return display;
    }

    /**
     * Sets the value of the display property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setDisplay(org.hl7.fhir.model.String value) {
        this.display = value;
    }

    /**
     * Gets the value of the agent property.
     * 
     * @return
     *     possible object is
     *     {@link ProvenanceAgent }
     *     
     */
    public ProvenanceAgent getAgent() {
        return agent;
    }

    /**
     * Sets the value of the agent property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProvenanceAgent }
     *     
     */
    public void setAgent(ProvenanceAgent value) {
        this.agent = value;
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
            ProvenanceEntityRole theRole;
            theRole = this.getRole();
            strategy.appendField(locator, this, "role", buffer, theRole);
        }
        {
            Coding theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            Uri theReference;
            theReference = this.getReference();
            strategy.appendField(locator, this, "reference", buffer, theReference);
        }
        {
            org.hl7.fhir.model.String theDisplay;
            theDisplay = this.getDisplay();
            strategy.appendField(locator, this, "display", buffer, theDisplay);
        }
        {
            ProvenanceAgent theAgent;
            theAgent = this.getAgent();
            strategy.appendField(locator, this, "agent", buffer, theAgent);
        }
        return buffer;
    }

}
