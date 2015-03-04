//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.GroupCharacteristic;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.Range;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Group.Characteristic", propOrder = {
    "code",
    "valueCodeableConcept",
    "valueBoolean",
    "valueQuantity",
    "valueRange",
    "exclude"
})
public class GroupCharacteristicImpl
    extends BackboneElementImpl
    implements GroupCharacteristic, ToString
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl valueCodeableConcept;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl valueBoolean;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl valueQuantity;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl valueRange;
    @XmlElement(required = true, type = BooleanImpl.class)
    protected BooleanImpl exclude;

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = ((CodeableConceptImpl) value);
    }

    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(Boolean value) {
        this.valueBoolean = ((BooleanImpl) value);
    }

    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    public void setValueQuantity(Quantity value) {
        this.valueQuantity = ((QuantityImpl) value);
    }

    public Range getValueRange() {
        return valueRange;
    }

    public void setValueRange(Range value) {
        this.valueRange = ((RangeImpl) value);
    }

    public Boolean getExclude() {
        return exclude;
    }

    public void setExclude(Boolean value) {
        this.exclude = ((BooleanImpl) value);
    }

    public String toString() {
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
            CodeableConcept theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            CodeableConcept theValueCodeableConcept;
            theValueCodeableConcept = this.getValueCodeableConcept();
            strategy.appendField(locator, this, "valueCodeableConcept", buffer, theValueCodeableConcept);
        }
        {
            Boolean theValueBoolean;
            theValueBoolean = this.getValueBoolean();
            strategy.appendField(locator, this, "valueBoolean", buffer, theValueBoolean);
        }
        {
            Quantity theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity);
        }
        {
            Range theValueRange;
            theValueRange = this.getValueRange();
            strategy.appendField(locator, this, "valueRange", buffer, theValueRange);
        }
        {
            Boolean theExclude;
            theExclude = this.getExclude();
            strategy.appendField(locator, this, "exclude", buffer, theExclude);
        }
        return buffer;
    }

}
