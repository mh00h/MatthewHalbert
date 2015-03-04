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
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.ContactSystem;
import org.hl7.fhir.model.ContactUse;
import org.hl7.fhir.model.Period;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "system",
    "value",
    "use",
    "period"
})
public class ContactImpl
    extends ElementImpl
    implements Contact, ToString
{

    @XmlElement(type = ContactSystemImpl.class)
    protected ContactSystemImpl system;
    @XmlElement(type = StringImpl.class)
    protected StringImpl value;
    @XmlElement(type = ContactUseImpl.class)
    protected ContactUseImpl use;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl period;

    public ContactSystem getSystem() {
        return system;
    }

    public void setSystem(ContactSystem value) {
        this.system = ((ContactSystemImpl) value);
    }

    public org.hl7.fhir.model.String getValue() {
        return value;
    }

    public void setValue(org.hl7.fhir.model.String value) {
        this.value = ((StringImpl) value);
    }

    public ContactUse getUse() {
        return use;
    }

    public void setUse(ContactUse value) {
        this.use = ((ContactUseImpl) value);
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period value) {
        this.period = ((PeriodImpl) value);
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
            ContactSystem theSystem;
            theSystem = this.getSystem();
            strategy.appendField(locator, this, "system", buffer, theSystem);
        }
        {
            org.hl7.fhir.model.String theValue;
            theValue = this.getValue();
            strategy.appendField(locator, this, "value", buffer, theValue);
        }
        {
            ContactUse theUse;
            theUse = this.getUse();
            strategy.appendField(locator, this, "use", buffer, theUse);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        return buffer;
    }

}
