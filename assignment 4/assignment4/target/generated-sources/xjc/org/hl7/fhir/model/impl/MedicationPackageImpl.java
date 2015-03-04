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
import org.hl7.fhir.model.MedicationContent;
import org.hl7.fhir.model.MedicationPackage;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Medication.Package", propOrder = {
    "container",
    "content"
})
public class MedicationPackageImpl
    extends BackboneElementImpl
    implements MedicationPackage, ToString
{

    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl container;
    @XmlElement(type = MedicationContentImpl.class)
    protected List<MedicationContent> content;

    public CodeableConcept getContainer() {
        return container;
    }

    public void setContainer(CodeableConcept value) {
        this.container = ((CodeableConceptImpl) value);
    }

    public List<MedicationContent> getContent() {
        if (content == null) {
            content = new ArrayList<MedicationContent>();
        }
        return this.content;
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
            CodeableConcept theContainer;
            theContainer = this.getContainer();
            strategy.appendField(locator, this, "container", buffer, theContainer);
        }
        {
            List<MedicationContent> theContent;
            theContent = (((this.content!= null)&&(!this.content.isEmpty()))?this.getContent():null);
            strategy.appendField(locator, this, "content", buffer, theContent);
        }
        return buffer;
    }

}
