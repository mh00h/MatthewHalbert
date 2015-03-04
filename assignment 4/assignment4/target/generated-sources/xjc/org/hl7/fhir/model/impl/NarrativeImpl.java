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
import org.hl7.fhir.model.Narrative;
import org.hl7.fhir.model.NarrativeStatus;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.w3._1999.xhtml.Div;
import org.w3._1999.xhtml.impl.DivImpl;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Narrative", propOrder = {
    "status",
    "div"
})
public class NarrativeImpl
    extends ElementImpl
    implements Narrative, ToString
{

    @XmlElement(required = true, type = NarrativeStatusImpl.class)
    protected NarrativeStatusImpl status;
    @XmlElement(namespace = "http://www.w3.org/1999/xhtml", required = true, type = DivImpl.class)
    protected DivImpl div;

    public NarrativeStatus getStatus() {
        return status;
    }

    public void setStatus(NarrativeStatus value) {
        this.status = ((NarrativeStatusImpl) value);
    }

    public Div getDiv() {
        return div;
    }

    public void setDiv(Div value) {
        this.div = ((DivImpl) value);
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
            NarrativeStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            Div theDiv;
            theDiv = this.getDiv();
            strategy.appendField(locator, this, "div", buffer, theDiv);
        }
        return buffer;
    }

}
