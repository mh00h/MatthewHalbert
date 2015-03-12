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
import org.hl7.fhir.model.Age;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Date;
import org.hl7.fhir.model.FamilyHistoryCondition;
import org.hl7.fhir.model.FamilyHistoryRelation;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.Range;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FamilyHistory.Relation", propOrder = {
    "name",
    "relationship",
    "bornPeriod",
    "bornDate",
    "bornString",
    "deceasedBoolean",
    "deceasedAge",
    "deceasedRange",
    "deceasedDate",
    "deceasedString",
    "note",
    "condition"
})
public class FamilyHistoryRelationImpl
    extends BackboneElementImpl
    implements FamilyHistoryRelation, ToString
{

    @XmlElement(type = StringImpl.class)
    protected StringImpl name;
    @XmlElement(required = true, type = CodeableConceptImpl.class)
    protected CodeableConceptImpl relationship;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl bornPeriod;
    @XmlElement(type = DateImpl.class)
    protected DateImpl bornDate;
    @XmlElement(type = StringImpl.class)
    protected StringImpl bornString;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl deceasedBoolean;
    @XmlElement(type = AgeImpl.class)
    protected AgeImpl deceasedAge;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl deceasedRange;
    @XmlElement(type = DateImpl.class)
    protected DateImpl deceasedDate;
    @XmlElement(type = StringImpl.class)
    protected StringImpl deceasedString;
    @XmlElement(type = StringImpl.class)
    protected StringImpl note;
    @XmlElement(type = FamilyHistoryConditionImpl.class)
    protected List<FamilyHistoryCondition> condition;

    public org.hl7.fhir.model.String getName() {
        return name;
    }

    public void setName(org.hl7.fhir.model.String value) {
        this.name = ((StringImpl) value);
    }

    public CodeableConcept getRelationship() {
        return relationship;
    }

    public void setRelationship(CodeableConcept value) {
        this.relationship = ((CodeableConceptImpl) value);
    }

    public Period getBornPeriod() {
        return bornPeriod;
    }

    public void setBornPeriod(Period value) {
        this.bornPeriod = ((PeriodImpl) value);
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date value) {
        this.bornDate = ((DateImpl) value);
    }

    public org.hl7.fhir.model.String getBornString() {
        return bornString;
    }

    public void setBornString(org.hl7.fhir.model.String value) {
        this.bornString = ((StringImpl) value);
    }

    public Boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    public void setDeceasedBoolean(Boolean value) {
        this.deceasedBoolean = ((BooleanImpl) value);
    }

    public Age getDeceasedAge() {
        return deceasedAge;
    }

    public void setDeceasedAge(Age value) {
        this.deceasedAge = ((AgeImpl) value);
    }

    public Range getDeceasedRange() {
        return deceasedRange;
    }

    public void setDeceasedRange(Range value) {
        this.deceasedRange = ((RangeImpl) value);
    }

    public Date getDeceasedDate() {
        return deceasedDate;
    }

    public void setDeceasedDate(Date value) {
        this.deceasedDate = ((DateImpl) value);
    }

    public org.hl7.fhir.model.String getDeceasedString() {
        return deceasedString;
    }

    public void setDeceasedString(org.hl7.fhir.model.String value) {
        this.deceasedString = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getNote() {
        return note;
    }

    public void setNote(org.hl7.fhir.model.String value) {
        this.note = ((StringImpl) value);
    }

    public List<FamilyHistoryCondition> getCondition() {
        if (condition == null) {
            condition = new ArrayList<FamilyHistoryCondition>();
        }
        return this.condition;
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
            CodeableConcept theRelationship;
            theRelationship = this.getRelationship();
            strategy.appendField(locator, this, "relationship", buffer, theRelationship);
        }
        {
            Period theBornPeriod;
            theBornPeriod = this.getBornPeriod();
            strategy.appendField(locator, this, "bornPeriod", buffer, theBornPeriod);
        }
        {
            Date theBornDate;
            theBornDate = this.getBornDate();
            strategy.appendField(locator, this, "bornDate", buffer, theBornDate);
        }
        {
            org.hl7.fhir.model.String theBornString;
            theBornString = this.getBornString();
            strategy.appendField(locator, this, "bornString", buffer, theBornString);
        }
        {
            Boolean theDeceasedBoolean;
            theDeceasedBoolean = this.getDeceasedBoolean();
            strategy.appendField(locator, this, "deceasedBoolean", buffer, theDeceasedBoolean);
        }
        {
            Age theDeceasedAge;
            theDeceasedAge = this.getDeceasedAge();
            strategy.appendField(locator, this, "deceasedAge", buffer, theDeceasedAge);
        }
        {
            Range theDeceasedRange;
            theDeceasedRange = this.getDeceasedRange();
            strategy.appendField(locator, this, "deceasedRange", buffer, theDeceasedRange);
        }
        {
            Date theDeceasedDate;
            theDeceasedDate = this.getDeceasedDate();
            strategy.appendField(locator, this, "deceasedDate", buffer, theDeceasedDate);
        }
        {
            org.hl7.fhir.model.String theDeceasedString;
            theDeceasedString = this.getDeceasedString();
            strategy.appendField(locator, this, "deceasedString", buffer, theDeceasedString);
        }
        {
            org.hl7.fhir.model.String theNote;
            theNote = this.getNote();
            strategy.appendField(locator, this, "note", buffer, theNote);
        }
        {
            List<FamilyHistoryCondition> theCondition;
            theCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        return buffer;
    }

}