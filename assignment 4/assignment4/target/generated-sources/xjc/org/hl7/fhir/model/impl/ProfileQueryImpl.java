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
import org.hl7.fhir.model.ProfileQuery;
import org.hl7.fhir.model.ProfileSearchParam;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Query", propOrder = {
    "name",
    "documentation",
    "parameter"
})
public class ProfileQueryImpl
    extends BackboneElementImpl
    implements ProfileQuery, ToString
{

    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl documentation;
    @XmlElement(type = ProfileSearchParamImpl.class)
    protected List<ProfileSearchParam> parameter;

    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getDocumentation() {
        return documentation;
    }

    public void setDocumentation(org.hl7.fhir.model.String value) {
        this.documentation = ((StringImpl) value);
    }

    public List<ProfileSearchParam> getParameter() {
        if (parameter == null) {
            parameter = new ArrayList<ProfileSearchParam>();
        }
        return this.parameter;
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
            org.hl7.fhir.model.String theDocumentation;
            theDocumentation = this.getDocumentation();
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation);
        }
        {
            List<ProfileSearchParam> theParameter;
            theParameter = (((this.parameter!= null)&&(!this.parameter.isEmpty()))?this.getParameter():null);
            strategy.appendField(locator, this, "parameter", buffer, theParameter);
        }
        return buffer;
    }

}
