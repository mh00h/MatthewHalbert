//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have a value for at least one of the defined elements, an @id referenced from the Narrative, or extensions
 * 
 * <p>Java class for Quantity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Quantity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/&gt;
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityCompararator" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Quantity", propOrder = {
    "value",
    "comparator",
    "units",
    "system",
    "code"
})
@XmlSeeAlso({
    Age.class,
    TimeDuration.class,
    Count.class,
    Money.class,
    Distance.class
})
public class Quantity
    extends Element
    implements ToString
{

    protected Decimal value;
    protected QuantityCompararator comparator;
    protected org.hl7.fhir.model.String units;
    protected Uri system;
    protected Code code;

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link Decimal }
     *     
     */
    public Decimal getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link Decimal }
     *     
     */
    public void setValue(Decimal value) {
        this.value = value;
    }

    /**
     * Gets the value of the comparator property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityCompararator }
     *     
     */
    public QuantityCompararator getComparator() {
        return comparator;
    }

    /**
     * Sets the value of the comparator property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityCompararator }
     *     
     */
    public void setComparator(QuantityCompararator value) {
        this.comparator = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public org.hl7.fhir.model.String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link org.hl7.fhir.model.String }
     *     
     */
    public void setUnits(org.hl7.fhir.model.String value) {
        this.units = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link Uri }
     *     
     */
    public Uri getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uri }
     *     
     */
    public void setSystem(Uri value) {
        this.system = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link Code }
     *     
     */
    public Code getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link Code }
     *     
     */
    public void setCode(Code value) {
        this.code = value;
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
            Decimal theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            QuantityCompararator theComparator;
            theComparator = this.getComparator();
            strategy.appendField(locator, this, "comparator", buffer, theComparator);
        }
        {
            org.hl7.fhir.model.String theUnits;
            theUnits = this.getUnits();
            strategy.appendField(locator, this, "units", buffer, theUnits);
        }
        {
            Uri theSystem;
            theSystem = this.getSystem();
            strategy.appendField(locator, this, "system", buffer, theSystem);
        }
        {
            Code theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        return buffer;
    }

}
