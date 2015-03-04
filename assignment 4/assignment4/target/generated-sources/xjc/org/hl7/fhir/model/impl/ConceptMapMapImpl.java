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
import org.hl7.fhir.model.ConceptMapDependsOn;
import org.hl7.fhir.model.ConceptMapEquivalence;
import org.hl7.fhir.model.ConceptMapMap;
import org.hl7.fhir.model.Uri;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConceptMap.Map", propOrder = {
    "system",
    "code",
    "equivalence",
    "comments",
    "product"
})
public class ConceptMapMapImpl
    extends BackboneElementImpl
    implements ConceptMapMap, ToString
{

    @XmlElement(type = UriImpl.class)
    protected UriImpl system;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl code;
    @XmlElement(required = true, type = ConceptMapEquivalenceImpl.class)
    protected ConceptMapEquivalenceImpl equivalence;
    @XmlElement(type = StringImpl.class)
    protected StringImpl comments;
    @XmlElement(type = ConceptMapDependsOnImpl.class)
    protected List<ConceptMapDependsOn> product;

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

    public ConceptMapEquivalence getEquivalence() {
        return equivalence;
    }

    public void setEquivalence(ConceptMapEquivalence value) {
        this.equivalence = ((ConceptMapEquivalenceImpl) value);
    }

    public org.hl7.fhir.model.String getComments() {
        return comments;
    }

    public void setComments(org.hl7.fhir.model.String value) {
        this.comments = ((StringImpl) value);
    }

    public List<ConceptMapDependsOn> getProduct() {
        if (product == null) {
            product = new ArrayList<ConceptMapDependsOn>();
        }
        return this.product;
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
            ConceptMapEquivalence theEquivalence;
            theEquivalence = this.getEquivalence();
            strategy.appendField(locator, this, "equivalence", buffer, theEquivalence);
        }
        {
            org.hl7.fhir.model.String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            List<ConceptMapDependsOn> theProduct;
            theProduct = (((this.product!= null)&&(!this.product.isEmpty()))?this.getProduct():null);
            strategy.appendField(locator, this, "product", buffer, theProduct);
        }
        return buffer;
    }

}
