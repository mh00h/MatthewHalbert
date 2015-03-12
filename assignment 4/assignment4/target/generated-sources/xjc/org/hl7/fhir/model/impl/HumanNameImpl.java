//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model.impl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.HumanName;
import org.hl7.fhir.model.NameUse;
import org.hl7.fhir.model.Period;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HumanName", propOrder = {
    "use",
    "text",
    "family",
    "given",
    "prefix",
    "suffix",
    "period"
})
public class HumanNameImpl
    extends ElementImpl
    implements HumanName, ToString
{

    @XmlElement(type = NameUseImpl.class)
    protected NameUseImpl use;
    @XmlElement(type = StringImpl.class)
    protected StringImpl text;
    @XmlElement(type = StringImpl.class)
    protected List<org.hl7.fhir.model.String> family;
    @XmlElement(type = StringImpl.class)
    protected List<org.hl7.fhir.model.String> given;
    @XmlElement(type = StringImpl.class)
    protected List<org.hl7.fhir.model.String> prefix;
    @XmlElement(type = StringImpl.class)
    protected List<org.hl7.fhir.model.String> suffix;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl period;

    public NameUse getUse() {
        return use;
    }

    public void setUse(NameUse value) {
        this.use = ((NameUseImpl) value);
    }

    public org.hl7.fhir.model.String getText() {
        return text;
    }

    public void setText(org.hl7.fhir.model.String value) {
        this.text = ((StringImpl) value);
    }

    public List<org.hl7.fhir.model.String> getFamily() {
        if (family == null) {
            family = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.family;
    }

    public List<org.hl7.fhir.model.String> getGiven() {
        if (given == null) {
            given = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.given;
    }

    public List<org.hl7.fhir.model.String> getPrefix() {
        if (prefix == null) {
            prefix = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.prefix;
    }

    public List<org.hl7.fhir.model.String> getSuffix() {
        if (suffix == null) {
            suffix = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.suffix;
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
            NameUse theUse;
            theUse = this.getUse();
            strategy.appendField(locator, this, "use", buffer, theUse);
        }
        {
            org.hl7.fhir.model.String theText;
            theText = this.getText();
            strategy.appendField(locator, this, "text", buffer, theText);
        }
        {
            List<org.hl7.fhir.model.String> theFamily;
            theFamily = (((this.family!= null)&&(!this.family.isEmpty()))?this.getFamily():null);
            strategy.appendField(locator, this, "family", buffer, theFamily);
        }
        {
            List<org.hl7.fhir.model.String> theGiven;
            theGiven = (((this.given!= null)&&(!this.given.isEmpty()))?this.getGiven():null);
            strategy.appendField(locator, this, "given", buffer, theGiven);
        }
        {
            List<org.hl7.fhir.model.String> thePrefix;
            thePrefix = (((this.prefix!= null)&&(!this.prefix.isEmpty()))?this.getPrefix():null);
            strategy.appendField(locator, this, "prefix", buffer, thePrefix);
        }
        {
            List<org.hl7.fhir.model.String> theSuffix;
            theSuffix = (((this.suffix!= null)&&(!this.suffix.isEmpty()))?this.getSuffix():null);
            strategy.appendField(locator, this, "suffix", buffer, theSuffix);
        }
        {
            Period thePeriod;
            thePeriod = this.getPeriod();
            strategy.appendField(locator, this, "period", buffer, thePeriod);
        }
        return buffer;
    }

}