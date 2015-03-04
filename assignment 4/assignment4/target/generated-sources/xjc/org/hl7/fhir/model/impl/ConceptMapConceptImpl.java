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
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.ConceptMapConcept;
import org.hl7.fhir.model.ConceptMapDependsOn;
import org.hl7.fhir.model.ConceptMapMap;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.Concept", propOrder = {
    "system",
    "code",
    "dependsOn",
    "map"
})
public class ConceptMapConceptImpl
    extends BackboneElementImpl
    implements ConceptMapConcept, ToString
{

    @XmlElement(required = true, type = UriImpl.class)
    protected UriImpl system;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl code;
    @XmlElement(type = ConceptMapDependsOnImpl.class)
    protected List<ConceptMapDependsOn> dependsOn;
    @XmlElement(type = ConceptMapMapImpl.class)
    protected List<ConceptMapMap> map;

    public Uri getSystem() {
        return system;
    }

    public void setSystem(Uri value) {
        this.system = ((UriImpl) value);
    }

    public Code getCode() {
        return code;
    }

    public void setCode(Code value) {
        this.code = ((CodeImpl) value);
    }

    public List<ConceptMapDependsOn> getDependsOn() {
        if (dependsOn == null) {
            dependsOn = new ArrayList<ConceptMapDependsOn>();
        }
        return this.dependsOn;
    }

    public List<ConceptMapMap> getMap() {
        if (map == null) {
            map = new ArrayList<ConceptMapMap>();
        }
        return this.map;
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
            Uri theSystem;
            theSystem = this.getSystem();
            strategy.appendField(locator, this, "system", buffer, theSystem);
        }
        {
            Code theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            List<ConceptMapDependsOn> theDependsOn;
            theDependsOn = (((this.dependsOn!= null)&&(!this.dependsOn.isEmpty()))?this.getDependsOn():null);
            strategy.appendField(locator, this, "dependsOn", buffer, theDependsOn);
        }
        {
            List<ConceptMapMap> theMap;
            theMap = (((this.map!= null)&&(!this.map.isEmpty()))?this.getMap():null);
            strategy.appendField(locator, this, "map", buffer, theMap);
        }
        return buffer;
    }

}
