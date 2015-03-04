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
import org.hl7.fhir.model.Decimal;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.SampledData;
import org.hl7.fhir.model.SampledDataDataType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SampledData", propOrder = {
    "origin",
    "period",
    "factor",
    "lowerLimit",
    "upperLimit",
    "dimensions",
    "data"
})
public class SampledDataImpl
    extends ElementImpl
    implements SampledData, ToString
{

    @XmlElement(required = true, type = QuantityImpl.class)
    protected QuantityImpl origin;
    @XmlElement(required = true, type = DecimalImpl.class)
    protected DecimalImpl period;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl factor;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl lowerLimit;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl upperLimit;
    @XmlElement(required = true, type = IntegerImpl.class)
    protected IntegerImpl dimensions;
    @XmlElement(required = true, type = SampledDataDataTypeImpl.class)
    protected SampledDataDataTypeImpl data;

    public Quantity getOrigin() {
        return origin;
    }

    public void setOrigin(Quantity value) {
        this.origin = ((QuantityImpl) value);
    }

    public Decimal getPeriod() {
        return period;
    }

    public void setPeriod(Decimal value) {
        this.period = ((DecimalImpl) value);
    }

    public Decimal getFactor() {
        return factor;
    }

    public void setFactor(Decimal value) {
        this.factor = ((DecimalImpl) value);
    }

    public Decimal getLowerLimit() {
        return lowerLimit;
    }

    public void setLowerLimit(Decimal value) {
        this.lowerLimit = ((DecimalImpl) value);
    }

    public Decimal getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Decimal value) {
        this.upperLimit = ((DecimalImpl) value);
    }

    public Integer getDimensions() {
        return dimensions;
    }

    public void setDimensions(Integer value) {
        this.dimensions = ((IntegerImpl) value);
    }

    public SampledDataDataType getData() {
        return data;
    }

    public void setData(SampledDataDataType value) {
        this.data = ((SampledDataDataTypeImpl) value);
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
            Quantity theOrigin;
            theOrigin = this.getOrigin();
            strategy.appendField(locator, this, "origin", buffer, theOrigin);
        }
        {
            Decimal thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        {
            Decimal theFactor;
            theFactor = this.getFactor();
            strategy.appendField(locator, this, "factor", buffer, theFactor);
        }
        {
            Decimal theLowerLimit;
            theLowerLimit = this.getLowerLimit();
            strategy.appendField(locator, this, "lowerLimit", buffer, theLowerLimit);
        }
        {
            Decimal theUpperLimit;
            theUpperLimit = this.getUpperLimit();
            strategy.appendField(locator, this, "upperLimit", buffer, theUpperLimit);
        }
        {
            Integer theDimensions;
            theDimensions = this.getDimensions();
            strategy.appendField(locator, this, "dimensions", buffer, theDimensions);
        }
        {
            SampledDataDataType theData;
            theData = this.getData();
            strategy.appendField(locator, this, "data", buffer, theData);
        }
        return buffer;
    }

}
