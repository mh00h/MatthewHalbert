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
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.CompositionSection;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Composition.Section", propOrder = {
    "title",
    "code",
    "subject",
    "content",
    "section"
})
public class CompositionSectionImpl
    extends BackboneElementImpl
    implements CompositionSection, ToString
{

    @XmlElement(type = StringImpl.class)
    protected StringImpl title;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl code;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl subject;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl content;
    @XmlElement(type = CompositionSectionImpl.class)
    protected List<CompositionSection> section;

    public org.hl7.fhir.model.String getTitle() {
        return title;
    }

    public void setTitle(org.hl7.fhir.model.String value) {
        this.title = ((StringImpl) value);
    }

    public CodeableConcept getCode() {
        return code;
    }

    public void setCode(CodeableConcept value) {
        this.code = ((CodeableConceptImpl) value);
    }

    public ResourceReference getSubject() {
        return subject;
    }

    public void setSubject(ResourceReference value) {
        this.subject = ((ResourceReferenceImpl) value);
    }

    public ResourceReference getContent() {
        return content;
    }

    public void setContent(ResourceReference value) {
        this.content = ((ResourceReferenceImpl) value);
    }

    public List<CompositionSection> getSection() {
        if (section == null) {
            section = new ArrayList<CompositionSection>();
        }
        return this.section;
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
            org.hl7.fhir.model.String theTitle;
            theTitle = this.getTitle();
            strategy.appendField(locator, this, "title", buffer, theTitle);
        }
        {
            CodeableConcept theCode;
            theCode = this.getCode();
            strategy.appendField(locator, this, "code", buffer, theCode);
        }
        {
            ResourceReference theSubject;
            theSubject = this.getSubject();
            strategy.appendField(locator, this, "subject", buffer, theSubject);
        }
        {
            ResourceReference theContent;
            theContent = this.getContent();
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        {
            List<CompositionSection> theSection;
            theSection = (((this.section!= null)&&(!this.section.isEmpty()))?this.getSection():null);
            strategy.appendField(locator, this, "section", buffer, theSection);
        }
        return buffer;
    }

}