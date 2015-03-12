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
import org.hl7.fhir.model.ConformanceEvent;
import org.hl7.fhir.model.ConformanceMessaging;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Conformance.Messaging", propOrder = {
    "endpoint",
    "reliableCache",
    "documentation",
    "event"
})
public class ConformanceMessagingImpl
    extends BackboneElementImpl
    implements ConformanceMessaging, ToString
{

    @XmlElement(type = UriImpl.class)
    protected UriImpl endpoint;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl reliableCache;
    @XmlElement(type = StringImpl.class)
    protected StringImpl documentation;
    @XmlElement(required = true, type = ConformanceEventImpl.class)
    protected List<ConformanceEvent> event;

    public Uri getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(Uri value) {
        this.endpoint = ((UriImpl) value);
    }

    public Integer getReliableCache() {
        return reliableCache;
    }

    public void setReliableCache(Integer value) {
        this.reliableCache = ((IntegerImpl) value);
    }

    public org.hl7.fhir.model.String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(org.hl7.fhir.model.String value) {
        this.documentation = ((StringImpl) value);
    }

    public List<ConformanceEvent> getEvent() {
        if (event == null) {
            event = new ArrayList<ConformanceEvent>();
        }
        return this.event;
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
            Uri theEndpoint;
            theEndpoint = this.getEndpoint();
            strategy.appendField(locator, this, "endpoint", buffer, theEndpoint);
        }
        {
            Integer theReliableCache;
            theReliableCache = this.getReliableCache();
            strategy.appendField(locator, this, "reliableCache", buffer, theReliableCache);
        }
        {
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation);
        }
        {
            List<ConformanceEvent> theEvent;
            theEvent = (((this.event!= null)&&(!this.event.isEmpty()))?this.getEvent():null);
            strategy.appendField(locator, this, "event", buffer, theEvent);
        }
        return buffer;
    }

}