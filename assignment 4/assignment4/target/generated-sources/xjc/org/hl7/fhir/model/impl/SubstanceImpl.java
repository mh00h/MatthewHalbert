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
import org.hl7.fhir.model.Substance;
import org.hl7.fhir.model.SubstanceIngredient;
import org.hl7.fhir.model.SubstanceInstance;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Substance", propOrder = {
    "type",
    "description",
    "instance",
    "ingredient"
})
public class SubstanceImpl
    extends ResourceImpl
    implements Substance, ToString
{

    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl type;
    @XmlElement(type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = SubstanceInstanceImpl.class)
    protected SubstanceInstanceImpl instance;
    @XmlElement(type = SubstanceIngredientImpl.class)
    protected List<SubstanceIngredient> ingredient;

    public CodeableConcept getType() {
        return type;
    }

    public void setType(CodeableConcept value) {
        this.type = ((CodeableConceptImpl) value);
    }

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public SubstanceInstance getInstance() {
        return instance;
    }

    public void setInstance(SubstanceInstance value) {
        this.instance = ((SubstanceInstanceImpl) value);
    }

    public List<SubstanceIngredient> getIngredient() {
        if (ingredient == null) {
            ingredient = new ArrayList<SubstanceIngredient>();
        }
        return this.ingredient;
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
            CodeableConcept theType;
            theType = this.getType();
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            SubstanceInstance theInstance;
            theInstance = this.getInstance();
            strategy.appendField(locator, this, "instance", buffer, theInstance);
        }
        {
            List<SubstanceIngredient> theIngredient;
            theIngredient = (((this.ingredient!= null)&&(!this.ingredient.isEmpty()))?this.getIngredient():null);
            strategy.appendField(locator, this, "ingredient", buffer, theIngredient);
        }
        return buffer;
    }

}