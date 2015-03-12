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
import org.hl7.fhir.model.Address;
import org.hl7.fhir.model.Attachment;
import org.hl7.fhir.model.Base64Binary;
import org.hl7.fhir.model.Boolean;
import org.hl7.fhir.model.Code;
import org.hl7.fhir.model.CodeableConcept;
import org.hl7.fhir.model.Coding;
import org.hl7.fhir.model.Contact;
import org.hl7.fhir.model.Date;
import org.hl7.fhir.model.DateTime;
import org.hl7.fhir.model.Decimal;
import org.hl7.fhir.model.HumanName;
import org.hl7.fhir.model.Id;
import org.hl7.fhir.model.Identifier;
import org.hl7.fhir.model.Instant;
import org.hl7.fhir.model.Integer;
import org.hl7.fhir.model.Oid;
import org.hl7.fhir.model.Period;
import org.hl7.fhir.model.ProfileBinding;
import org.hl7.fhir.model.ProfileConstraint;
import org.hl7.fhir.model.ProfileDefinition;
import org.hl7.fhir.model.ProfileMapping1;
import org.hl7.fhir.model.ProfileType;
import org.hl7.fhir.model.Quantity;
import org.hl7.fhir.model.Range;
import org.hl7.fhir.model.Ratio;
import org.hl7.fhir.model.ResourceReference;
import org.hl7.fhir.model.SampledData;
import org.hl7.fhir.model.Schedule;
import org.hl7.fhir.model.Uri;
import org.hl7.fhir.model.Uuid;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Profile.Definition", propOrder = {
    "_short",
    "formal",
    "comments",
    "requirements",
    "synonym",
    "min",
    "max",
    "type",
    "nameReference",
    "valueBoolean",
    "valueInteger",
    "valueDecimal",
    "valueBase64Binary",
    "valueInstant",
    "valueString",
    "valueUri",
    "valueDate",
    "valueDateTime",
    "valueCode",
    "valueOid",
    "valueUuid",
    "valueId",
    "valueAttachment",
    "valueIdentifier",
    "valueCodeableConcept",
    "valueCoding",
    "valueQuantity",
    "valueRange",
    "valuePeriod",
    "valueRatio",
    "valueResource",
    "valueSampledData",
    "valueHumanName",
    "valueAddress",
    "valueContact",
    "valueSchedule",
    "exampleBoolean",
    "exampleInteger",
    "exampleDecimal",
    "exampleBase64Binary",
    "exampleInstant",
    "exampleString",
    "exampleUri",
    "exampleDate",
    "exampleDateTime",
    "exampleCode",
    "exampleOid",
    "exampleUuid",
    "exampleId",
    "exampleAttachment",
    "exampleIdentifier",
    "exampleCodeableConcept",
    "exampleCoding",
    "exampleQuantity",
    "exampleRange",
    "examplePeriod",
    "exampleRatio",
    "exampleResource",
    "exampleSampledData",
    "exampleHumanName",
    "exampleAddress",
    "exampleContact",
    "exampleSchedule",
    "maxLength",
    "condition",
    "constraint",
    "mustSupport",
    "isModifier",
    "binding",
    "mapping"
})
public class ProfileDefinitionImpl
    extends BackboneElementImpl
    implements ProfileDefinition, ToString
{

    @XmlElement(name = "short", required = true, type = StringImpl.class)
    protected StringImpl _short;
    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl formal;
    @XmlElement(type = StringImpl.class)
    protected StringImpl comments;
    @XmlElement(type = StringImpl.class)
    protected StringImpl requirements;
    @XmlElement(type = StringImpl.class)
    protected List<org.hl7.fhir.model.String> synonym;
    @XmlElement(required = true, type = IntegerImpl.class)
    protected IntegerImpl min;
    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl max;
    @XmlElement(type = ProfileTypeImpl.class)
    protected List<ProfileType> type;
    @XmlElement(type = StringImpl.class)
    protected StringImpl nameReference;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl valueBoolean;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl valueInteger;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl valueDecimal;
    @XmlElement(type = Base64BinaryImpl.class)
    protected Base64BinaryImpl valueBase64Binary;
    @XmlElement(type = InstantImpl.class)
    protected InstantImpl valueInstant;
    @XmlElement(type = StringImpl.class)
    protected StringImpl valueString;
    @XmlElement(type = UriImpl.class)
    protected UriImpl valueUri;
    @XmlElement(type = DateImpl.class)
    protected DateImpl valueDate;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl valueDateTime;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl valueCode;
    @XmlElement(type = OidImpl.class)
    protected OidImpl valueOid;
    @XmlElement(type = UuidImpl.class)
    protected UuidImpl valueUuid;
    @XmlElement(type = IdImpl.class)
    protected IdImpl valueId;
    @XmlElement(type = AttachmentImpl.class)
    protected AttachmentImpl valueAttachment;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl valueIdentifier;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl valueCodeableConcept;
    @XmlElement(type = CodingImpl.class)
    protected CodingImpl valueCoding;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl valueQuantity;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl valueRange;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl valuePeriod;
    @XmlElement(type = RatioImpl.class)
    protected RatioImpl valueRatio;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl valueResource;
    @XmlElement(type = SampledDataImpl.class)
    protected SampledDataImpl valueSampledData;
    @XmlElement(type = HumanNameImpl.class)
    protected HumanNameImpl valueHumanName;
    @XmlElement(type = AddressImpl.class)
    protected AddressImpl valueAddress;
    @XmlElement(type = ContactImpl.class)
    protected ContactImpl valueContact;
    @XmlElement(type = ScheduleImpl.class)
    protected ScheduleImpl valueSchedule;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl exampleBoolean;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl exampleInteger;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl exampleDecimal;
    @XmlElement(type = Base64BinaryImpl.class)
    protected Base64BinaryImpl exampleBase64Binary;
    @XmlElement(type = InstantImpl.class)
    protected InstantImpl exampleInstant;
    @XmlElement(type = StringImpl.class)
    protected StringImpl exampleString;
    @XmlElement(type = UriImpl.class)
    protected UriImpl exampleUri;
    @XmlElement(type = DateImpl.class)
    protected DateImpl exampleDate;
    @XmlElement(type = DateTimeImpl.class)
    protected DateTimeImpl exampleDateTime;
    @XmlElement(type = CodeImpl.class)
    protected CodeImpl exampleCode;
    @XmlElement(type = OidImpl.class)
    protected OidImpl exampleOid;
    @XmlElement(type = UuidImpl.class)
    protected UuidImpl exampleUuid;
    @XmlElement(type = IdImpl.class)
    protected IdImpl exampleId;
    @XmlElement(type = AttachmentImpl.class)
    protected AttachmentImpl exampleAttachment;
    @XmlElement(type = IdentifierImpl.class)
    protected IdentifierImpl exampleIdentifier;
    @XmlElement(type = CodeableConceptImpl.class)
    protected CodeableConceptImpl exampleCodeableConcept;
    @XmlElement(type = CodingImpl.class)
    protected CodingImpl exampleCoding;
    @XmlElement(type = QuantityImpl.class)
    protected QuantityImpl exampleQuantity;
    @XmlElement(type = RangeImpl.class)
    protected RangeImpl exampleRange;
    @XmlElement(type = PeriodImpl.class)
    protected PeriodImpl examplePeriod;
    @XmlElement(type = RatioImpl.class)
    protected RatioImpl exampleRatio;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected ResourceReferenceImpl exampleResource;
    @XmlElement(type = SampledDataImpl.class)
    protected SampledDataImpl exampleSampledData;
    @XmlElement(type = HumanNameImpl.class)
    protected HumanNameImpl exampleHumanName;
    @XmlElement(type = AddressImpl.class)
    protected AddressImpl exampleAddress;
    @XmlElement(type = ContactImpl.class)
    protected ContactImpl exampleContact;
    @XmlElement(type = ScheduleImpl.class)
    protected ScheduleImpl exampleSchedule;
    @XmlElement(type = IntegerImpl.class)
    protected IntegerImpl maxLength;
    @XmlElement(type = IdImpl.class)
    protected List<Id> condition;
    @XmlElement(type = ProfileConstraintImpl.class)
    protected List<ProfileConstraint> constraint;
    @XmlElement(type = BooleanImpl.class)
    protected BooleanImpl mustSupport;
    @XmlElement(required = true, type = BooleanImpl.class)
    protected BooleanImpl isModifier;
    @XmlElement(type = ProfileBindingImpl.class)
    protected ProfileBindingImpl binding;
    @XmlElement(type = ProfileMapping1Impl.class)
    protected List<ProfileMapping1> mapping;

    public org.hl7.fhir.model.String getShort() {
        return _short;
    }

    public void setShort(org.hl7.fhir.model.String value) {
        this._short = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getFormal() {
        return formal;
    }

    public void setFormal(org.hl7.fhir.model.String value) {
        this.formal = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getComments() {
        return comments;
    }

    public void setComments(org.hl7.fhir.model.String value) {
        this.comments = ((StringImpl) value);
    }

    public org.hl7.fhir.model.String getRequirements() {
        return requirements;
    }

    public void setRequirements(org.hl7.fhir.model.String value) {
        this.requirements = ((StringImpl) value);
    }

    public List<org.hl7.fhir.model.String> getSynonym() {
        if (synonym == null) {
            synonym = new ArrayList<org.hl7.fhir.model.String>();
        }
        return this.synonym;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer value) {
        this.min = ((IntegerImpl) value);
    }

    public org.hl7.fhir.model.String getMax() {
        return max;
    }

    public void setMax(org.hl7.fhir.model.String value) {
        this.max = ((StringImpl) value);
    }

    public List<ProfileType> getType() {
        if (type == null) {
            type = new ArrayList<ProfileType>();
        }
        return this.type;
    }

    public org.hl7.fhir.model.String getNameReference() {
        return nameReference;
    }

    public void setNameReference(org.hl7.fhir.model.String value) {
        this.nameReference = ((StringImpl) value);
    }

    public Boolean getValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(Boolean value) {
        this.valueBoolean = ((BooleanImpl) value);
    }

    public Integer getValueInteger() {
        return valueInteger;
    }

    public void setValueInteger(Integer value) {
        this.valueInteger = ((IntegerImpl) value);
    }

    public Decimal getValueDecimal() {
        return valueDecimal;
    }

    public void setValueDecimal(Decimal value) {
        this.valueDecimal = ((DecimalImpl) value);
    }

    public Base64Binary getValueBase64Binary() {
        return valueBase64Binary;
    }

    public void setValueBase64Binary(Base64Binary value) {
        this.valueBase64Binary = ((Base64BinaryImpl) value);
    }

    public Instant getValueInstant() {
        return valueInstant;
    }

    public void setValueInstant(Instant value) {
        this.valueInstant = ((InstantImpl) value);
    }

    public org.hl7.fhir.model.String getValueString() {
        return valueString;
    }

    public void setValueString(org.hl7.fhir.model.String value) {
        this.valueString = ((StringImpl) value);
    }

    public Uri getValueUri() {
        return valueUri;
    }

    public void setValueUri(Uri value) {
        this.valueUri = ((UriImpl) value);
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date value) {
        this.valueDate = ((DateImpl) value);
    }

    public DateTime getValueDateTime() {
        return valueDateTime;
    }

    public void setValueDateTime(DateTime value) {
        this.valueDateTime = ((DateTimeImpl) value);
    }

    public Code getValueCode() {
        return valueCode;
    }

    public void setValueCode(Code value) {
        this.valueCode = ((CodeImpl) value);
    }

    public Oid getValueOid() {
        return valueOid;
    }

    public void setValueOid(Oid value) {
        this.valueOid = ((OidImpl) value);
    }

    public Uuid getValueUuid() {
        return valueUuid;
    }

    public void setValueUuid(Uuid value) {
        this.valueUuid = ((UuidImpl) value);
    }

    public Id getValueId() {
        return valueId;
    }

    public void setValueId(Id value) {
        this.valueId = ((IdImpl) value);
    }

    public Attachment getValueAttachment() {
        return valueAttachment;
    }

    public void setValueAttachment(Attachment value) {
        this.valueAttachment = ((AttachmentImpl) value);
    }

    public Identifier getValueIdentifier() {
        return valueIdentifier;
    }

    public void setValueIdentifier(Identifier value) {
        this.valueIdentifier = ((IdentifierImpl) value);
    }

    public CodeableConcept getValueCodeableConcept() {
        return valueCodeableConcept;
    }

    public void setValueCodeableConcept(CodeableConcept value) {
        this.valueCodeableConcept = ((CodeableConceptImpl) value);
    }

    public Coding getValueCoding() {
        return valueCoding;
    }

    public void setValueCoding(Coding value) {
        this.valueCoding = ((CodingImpl) value);
    }

    public Quantity getValueQuantity() {
        return valueQuantity;
    }

    public void setValueQuantity(Quantity value) {
        this.valueQuantity = ((QuantityImpl) value);
    }

    public Range getValueRange() {
        return valueRange;
    }

    public void setValueRange(Range value) {
        this.valueRange = ((RangeImpl) value);
    }

    public Period getValuePeriod() {
        return valuePeriod;
    }

    public void setValuePeriod(Period value) {
        this.valuePeriod = ((PeriodImpl) value);
    }

    public Ratio getValueRatio() {
        return valueRatio;
    }

    public void setValueRatio(Ratio value) {
        this.valueRatio = ((RatioImpl) value);
    }

    public ResourceReference getValueResource() {
        return valueResource;
    }

    public void setValueResource(ResourceReference value) {
        this.valueResource = ((ResourceReferenceImpl) value);
    }

    public SampledData getValueSampledData() {
        return valueSampledData;
    }

    public void setValueSampledData(SampledData value) {
        this.valueSampledData = ((SampledDataImpl) value);
    }

    public HumanName getValueHumanName() {
        return valueHumanName;
    }

    public void setValueHumanName(HumanName value) {
        this.valueHumanName = ((HumanNameImpl) value);
    }

    public Address getValueAddress() {
        return valueAddress;
    }

    public void setValueAddress(Address value) {
        this.valueAddress = ((AddressImpl) value);
    }

    public Contact getValueContact() {
        return valueContact;
    }

    public void setValueContact(Contact value) {
        this.valueContact = ((ContactImpl) value);
    }

    public Schedule getValueSchedule() {
        return valueSchedule;
    }

    public void setValueSchedule(Schedule value) {
        this.valueSchedule = ((ScheduleImpl) value);
    }

    public Boolean getExampleBoolean() {
        return exampleBoolean;
    }

    public void setExampleBoolean(Boolean value) {
        this.exampleBoolean = ((BooleanImpl) value);
    }

    public Integer getExampleInteger() {
        return exampleInteger;
    }

    public void setExampleInteger(Integer value) {
        this.exampleInteger = ((IntegerImpl) value);
    }

    public Decimal getExampleDecimal() {
        return exampleDecimal;
    }

    public void setExampleDecimal(Decimal value) {
        this.exampleDecimal = ((DecimalImpl) value);
    }

    public Base64Binary getExampleBase64Binary() {
        return exampleBase64Binary;
    }

    public void setExampleBase64Binary(Base64Binary value) {
        this.exampleBase64Binary = ((Base64BinaryImpl) value);
    }

    public Instant getExampleInstant() {
        return exampleInstant;
    }

    public void setExampleInstant(Instant value) {
        this.exampleInstant = ((InstantImpl) value);
    }

    public org.hl7.fhir.model.String getExampleString() {
        return exampleString;
    }

    public void setExampleString(org.hl7.fhir.model.String value) {
        this.exampleString = ((StringImpl) value);
    }

    public Uri getExampleUri() {
        return exampleUri;
    }

    public void setExampleUri(Uri value) {
        this.exampleUri = ((UriImpl) value);
    }

    public Date getExampleDate() {
        return exampleDate;
    }

    public void setExampleDate(Date value) {
        this.exampleDate = ((DateImpl) value);
    }

    public DateTime getExampleDateTime() {
        return exampleDateTime;
    }

    public void setExampleDateTime(DateTime value) {
        this.exampleDateTime = ((DateTimeImpl) value);
    }

    public Code getExampleCode() {
        return exampleCode;
    }

    public void setExampleCode(Code value) {
        this.exampleCode = ((CodeImpl) value);
    }

    public Oid getExampleOid() {
        return exampleOid;
    }

    public void setExampleOid(Oid value) {
        this.exampleOid = ((OidImpl) value);
    }

    public Uuid getExampleUuid() {
        return exampleUuid;
    }

    public void setExampleUuid(Uuid value) {
        this.exampleUuid = ((UuidImpl) value);
    }

    public Id getExampleId() {
        return exampleId;
    }

    public void setExampleId(Id value) {
        this.exampleId = ((IdImpl) value);
    }

    public Attachment getExampleAttachment() {
        return exampleAttachment;
    }

    public void setExampleAttachment(Attachment value) {
        this.exampleAttachment = ((AttachmentImpl) value);
    }

    public Identifier getExampleIdentifier() {
        return exampleIdentifier;
    }

    public void setExampleIdentifier(Identifier value) {
        this.exampleIdentifier = ((IdentifierImpl) value);
    }

    public CodeableConcept getExampleCodeableConcept() {
        return exampleCodeableConcept;
    }

    public void setExampleCodeableConcept(CodeableConcept value) {
        this.exampleCodeableConcept = ((CodeableConceptImpl) value);
    }

    public Coding getExampleCoding() {
        return exampleCoding;
    }

    public void setExampleCoding(Coding value) {
        this.exampleCoding = ((CodingImpl) value);
    }

    public Quantity getExampleQuantity() {
        return exampleQuantity;
    }

    public void setExampleQuantity(Quantity value) {
        this.exampleQuantity = ((QuantityImpl) value);
    }

    public Range getExampleRange() {
        return exampleRange;
    }

    public void setExampleRange(Range value) {
        this.exampleRange = ((RangeImpl) value);
    }

    public Period getExamplePeriod() {
        return examplePeriod;
    }

    public void setExamplePeriod(Period value) {
        this.examplePeriod = ((PeriodImpl) value);
    }

    public Ratio getExampleRatio() {
        return exampleRatio;
    }

    public void setExampleRatio(Ratio value) {
        this.exampleRatio = ((RatioImpl) value);
    }

    public ResourceReference getExampleResource() {
        return exampleResource;
    }

    public void setExampleResource(ResourceReference value) {
        this.exampleResource = ((ResourceReferenceImpl) value);
    }

    public SampledData getExampleSampledData() {
        return exampleSampledData;
    }

    public void setExampleSampledData(SampledData value) {
        this.exampleSampledData = ((SampledDataImpl) value);
    }

    public HumanName getExampleHumanName() {
        return exampleHumanName;
    }

    public void setExampleHumanName(HumanName value) {
        this.exampleHumanName = ((HumanNameImpl) value);
    }

    public Address getExampleAddress() {
        return exampleAddress;
    }

    public void setExampleAddress(Address value) {
        this.exampleAddress = ((AddressImpl) value);
    }

    public Contact getExampleContact() {
        return exampleContact;
    }

    public void setExampleContact(Contact value) {
        this.exampleContact = ((ContactImpl) value);
    }

    public Schedule getExampleSchedule() {
        return exampleSchedule;
    }

    public void setExampleSchedule(Schedule value) {
        this.exampleSchedule = ((ScheduleImpl) value);
    }

    public Integer getMaxLength() {
        return maxLength;
    }

    public void setMaxLength(Integer value) {
        this.maxLength = ((IntegerImpl) value);
    }

    public List<Id> getCondition() {
        if (condition == null) {
            condition = new ArrayList<Id>();
        }
        return this.condition;
    }

    public List<ProfileConstraint> getConstraint() {
        if (constraint == null) {
            constraint = new ArrayList<ProfileConstraint>();
        }
        return this.constraint;
    }

    public Boolean getMustSupport() {
        return mustSupport;
    }

    public void setMustSupport(Boolean value) {
        this.mustSupport = ((BooleanImpl) value);
    }

    public Boolean getIsModifier() {
        return isModifier;
    }

    public void setIsModifier(Boolean value) {
        this.isModifier = ((BooleanImpl) value);
    }

    public ProfileBinding getBinding() {
        return binding;
    }

    public void setBinding(ProfileBinding value) {
        this.binding = ((ProfileBindingImpl) value);
    }

    public List<ProfileMapping1> getMapping() {
        if (mapping == null) {
            mapping = new ArrayList<ProfileMapping1>();
        }
        return this.mapping;
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
            org.hl7.fhir.model.String theShort;
            theShort = this.getShort();
            strategy.appendField(locator, this, "_short", buffer, theShort);
        }
        {
            org.hl7.fhir.model.String theFormal;
            theFormal = this.getFormal();
            strategy.appendField(locator, this, "formal", buffer, theFormal);
        }
        {
            org.hl7.fhir.model.String theComments;
            theComments = this.getComments();
            strategy.appendField(locator, this, "comments", buffer, theComments);
        }
        {
            org.hl7.fhir.model.String theRequirements;
            theRequirements = this.getRequirements();
            strategy.appendField(locator, this, "requirements", buffer, theRequirements);
        }
        {
            List<org.hl7.fhir.model.String> theSynonym;
            theSynonym = (((this.synonym!= null)&&(!this.synonym.isEmpty()))?this.getSynonym():null);
            strategy.appendField(locator, this, "synonym", buffer, theSynonym);
        }
        {
            Integer theMin;
            theMin = this.getMin();
            strategy.appendField(locator, this, "min", buffer, theMin);
        }
        {
            org.hl7.fhir.model.String theMax;
            theMax = this.getMax();
            strategy.appendField(locator, this, "max", buffer, theMax);
        }
        {
            List<ProfileType> theType;
            theType = (((this.type!= null)&&(!this.type.isEmpty()))?this.getType():null);
            strategy.appendField(locator, this, "type", buffer, theType);
        }
        {
            org.hl7.fhir.model.String theNameReference;
            theNameReference = this.getNameReference();
            strategy.appendField(locator, this, "nameReference", buffer, theNameReference);
        }
        {
            Boolean theValueBoolean;
            theValueBoolean = this.getValueBoolean();
            strategy.appendField(locator, this, "valueBoolean", buffer, theValueBoolean);
        }
        {
            Integer theValueInteger;
            theValueInteger = this.getValueInteger();
            strategy.appendField(locator, this, "valueInteger", buffer, theValueInteger);
        }
        {
            Decimal theValueDecimal;
            theValueDecimal = this.getValueDecimal();
            strategy.appendField(locator, this, "valueDecimal", buffer, theValueDecimal);
        }
        {
            Base64Binary theValueBase64Binary;
            theValueBase64Binary = this.getValueBase64Binary();
            strategy.appendField(locator, this, "valueBase64Binary", buffer, theValueBase64Binary);
        }
        {
            Instant theValueInstant;
            theValueInstant = this.getValueInstant();
            strategy.appendField(locator, this, "valueInstant", buffer, theValueInstant);
        }
        {
            org.hl7.fhir.model.String theValueString;
            theValueString = this.getValueString();
            strategy.appendField(locator, this, "valueString", buffer, theValueString);
        }
        {
            Uri theValueUri;
            theValueUri = this.getValueUri();
            strategy.appendField(locator, this, "valueUri", buffer, theValueUri);
        }
        {
            Date theValueDate;
            theValueDate = this.getValueDate();
            strategy.appendField(locator, this, "valueDate", buffer, theValueDate);
        }
        {
            DateTime theValueDateTime;
            theValueDateTime = this.getValueDateTime();
            strategy.appendField(locator, this, "valueDateTime", buffer, theValueDateTime);
        }
        {
            Code theValueCode;
            theValueCode = this.getValueCode();
            strategy.appendField(locator, this, "valueCode", buffer, theValueCode);
        }
        {
            Oid theValueOid;
            theValueOid = this.getValueOid();
            strategy.appendField(locator, this, "valueOid", buffer, theValueOid);
        }
        {
            Uuid theValueUuid;
            theValueUuid = this.getValueUuid();
            strategy.appendField(locator, this, "valueUuid", buffer, theValueUuid);
        }
        {
            Id theValueId;
            theValueId = this.getValueId();
            strategy.appendField(locator, this, "valueId", buffer, theValueId);
        }
        {
            Attachment theValueAttachment;
            theValueAttachment = this.getValueAttachment();
            strategy.appendField(locator, this, "valueAttachment", buffer, theValueAttachment);
        }
        {
            Identifier theValueIdentifier;
            theValueIdentifier = this.getValueIdentifier();
            strategy.appendField(locator, this, "valueIdentifier", buffer, theValueIdentifier);
        }
        {
            CodeableConcept theValueCodeableConcept;
            theValueCodeableConcept = this.getValueCodeableConcept();
            strategy.appendField(locator, this, "valueCodeableConcept", buffer, theValueCodeableConcept);
        }
        {
            Coding theValueCoding;
            theValueCoding = this.getValueCoding();
            strategy.appendField(locator, this, "valueCoding", buffer, theValueCoding);
        }
        {
            Quantity theValueQuantity;
            theValueQuantity = this.getValueQuantity();
            strategy.appendField(locator, this, "valueQuantity", buffer, theValueQuantity);
        }
        {
            Range theValueRange;
            theValueRange = this.getValueRange();
            strategy.appendField(locator, this, "valueRange", buffer, theValueRange);
        }
        {
            Period theValuePeriod;
            theValuePeriod = this.getValuePeriod();
            strategy.appendField(locator, this, "valuePeriod", buffer, theValuePeriod);
        }
        {
            Ratio theValueRatio;
            theValueRatio = this.getValueRatio();
            strategy.appendField(locator, this, "valueRatio", buffer, theValueRatio);
        }
        {
            ResourceReference theValueResource;
            theValueResource = this.getValueResource();
            strategy.appendField(locator, this, "valueResource", buffer, theValueResource);
        }
        {
            SampledData theValueSampledData;
            theValueSampledData = this.getValueSampledData();
            strategy.appendField(locator, this, "valueSampledData", buffer, theValueSampledData);
        }
        {
            HumanName theValueHumanName;
            theValueHumanName = this.getValueHumanName();
            strategy.appendField(locator, this, "valueHumanName", buffer, theValueHumanName);
        }
        {
            Address theValueAddress;
            theValueAddress = this.getValueAddress();
            strategy.appendField(locator, this, "valueAddress", buffer, theValueAddress);
        }
        {
            Contact theValueContact;
            theValueContact = this.getValueContact();
            strategy.appendField(locator, this, "valueContact", buffer, theValueContact);
        }
        {
            Schedule theValueSchedule;
            theValueSchedule = this.getValueSchedule();
            strategy.appendField(locator, this, "valueSchedule", buffer, theValueSchedule);
        }
        {
            Boolean theExampleBoolean;
            theExampleBoolean = this.getExampleBoolean();
            strategy.appendField(locator, this, "exampleBoolean", buffer, theExampleBoolean);
        }
        {
            Integer theExampleInteger;
            theExampleInteger = this.getExampleInteger();
            strategy.appendField(locator, this, "exampleInteger", buffer, theExampleInteger);
        }
        {
            Decimal theExampleDecimal;
            theExampleDecimal = this.getExampleDecimal();
            strategy.appendField(locator, this, "exampleDecimal", buffer, theExampleDecimal);
        }
        {
            Base64Binary theExampleBase64Binary;
            theExampleBase64Binary = this.getExampleBase64Binary();
            strategy.appendField(locator, this, "exampleBase64Binary", buffer, theExampleBase64Binary);
        }
        {
            Instant theExampleInstant;
            theExampleInstant = this.getExampleInstant();
            strategy.appendField(locator, this, "exampleInstant", buffer, theExampleInstant);
        }
        {
            org.hl7.fhir.model.String theExampleString;
            theExampleString = this.getExampleString();
            strategy.appendField(locator, this, "exampleString", buffer, theExampleString);
        }
        {
            Uri theExampleUri;
            theExampleUri = this.getExampleUri();
            strategy.appendField(locator, this, "exampleUri", buffer, theExampleUri);
        }
        {
            Date theExampleDate;
            theExampleDate = this.getExampleDate();
            strategy.appendField(locator, this, "exampleDate", buffer, theExampleDate);
        }
        {
            DateTime theExampleDateTime;
            theExampleDateTime = this.getExampleDateTime();
            strategy.appendField(locator, this, "exampleDateTime", buffer, theExampleDateTime);
        }
        {
            Code theExampleCode;
            theExampleCode = this.getExampleCode();
            strategy.appendField(locator, this, "exampleCode", buffer, theExampleCode);
        }
        {
            Oid theExampleOid;
            theExampleOid = this.getExampleOid();
            strategy.appendField(locator, this, "exampleOid", buffer, theExampleOid);
        }
        {
            Uuid theExampleUuid;
            theExampleUuid = this.getExampleUuid();
            strategy.appendField(locator, this, "exampleUuid", buffer, theExampleUuid);
        }
        {
            Id theExampleId;
            theExampleId = this.getExampleId();
            strategy.appendField(locator, this, "exampleId", buffer, theExampleId);
        }
        {
            Attachment theExampleAttachment;
            theExampleAttachment = this.getExampleAttachment();
            strategy.appendField(locator, this, "exampleAttachment", buffer, theExampleAttachment);
        }
        {
            Identifier theExampleIdentifier;
            theExampleIdentifier = this.getExampleIdentifier();
            strategy.appendField(locator, this, "exampleIdentifier", buffer, theExampleIdentifier);
        }
        {
            CodeableConcept theExampleCodeableConcept;
            theExampleCodeableConcept = this.getExampleCodeableConcept();
            strategy.appendField(locator, this, "exampleCodeableConcept", buffer, theExampleCodeableConcept);
        }
        {
            Coding theExampleCoding;
            theExampleCoding = this.getExampleCoding();
            strategy.appendField(locator, this, "exampleCoding", buffer, theExampleCoding);
        }
        {
            Quantity theExampleQuantity;
            theExampleQuantity = this.getExampleQuantity();
            strategy.appendField(locator, this, "exampleQuantity", buffer, theExampleQuantity);
        }
        {
            Range theExampleRange;
            theExampleRange = this.getExampleRange();
            strategy.appendField(locator, this, "exampleRange", buffer, theExampleRange);
        }
        {
            Period theExamplePeriod;
            theExamplePeriod = this.getExamplePeriod();
            strategy.appendField(locator, this, "examplePeriod", buffer, theExamplePeriod);
        }
        {
            Ratio theExampleRatio;
            theExampleRatio = this.getExampleRatio();
            strategy.appendField(locator, this, "exampleRatio", buffer, theExampleRatio);
        }
        {
            ResourceReference theExampleResource;
            theExampleResource = this.getExampleResource();
            strategy.appendField(locator, this, "exampleResource", buffer, theExampleResource);
        }
        {
            SampledData theExampleSampledData;
            theExampleSampledData = this.getExampleSampledData();
            strategy.appendField(locator, this, "exampleSampledData", buffer, theExampleSampledData);
        }
        {
            HumanName theExampleHumanName;
            theExampleHumanName = this.getExampleHumanName();
            strategy.appendField(locator, this, "exampleHumanName", buffer, theExampleHumanName);
        }
        {
            Address theExampleAddress;
            theExampleAddress = this.getExampleAddress();
            strategy.appendField(locator, this, "exampleAddress", buffer, theExampleAddress);
        }
        {
            Contact theExampleContact;
            theExampleContact = this.getExampleContact();
            strategy.appendField(locator, this, "exampleContact", buffer, theExampleContact);
        }
        {
            Schedule theExampleSchedule;
            theExampleSchedule = this.getExampleSchedule();
            strategy.appendField(locator, this, "exampleSchedule", buffer, theExampleSchedule);
        }
        {
            Integer theMaxLength;
            theMaxLength = this.getMaxLength();
            strategy.appendField(locator, this, "maxLength", buffer, theMaxLength);
        }
        {
            List<Id> theCondition;
            theCondition = (((this.condition!= null)&&(!this.condition.isEmpty()))?this.getCondition():null);
            strategy.appendField(locator, this, "condition", buffer, theCondition);
        }
        {
            List<ProfileConstraint> theConstraint;
            theConstraint = (((this.constraint!= null)&&(!this.constraint.isEmpty()))?this.getConstraint():null);
            strategy.appendField(locator, this, "constraint", buffer, theConstraint);
        }
        {
            Boolean theMustSupport;
            theMustSupport = this.getMustSupport();
            strategy.appendField(locator, this, "mustSupport", buffer, theMustSupport);
        }
        {
            Boolean theIsModifier;
            theIsModifier = this.getIsModifier();
            strategy.appendField(locator, this, "isModifier", buffer, theIsModifier);
        }
        {
            ProfileBinding theBinding;
            theBinding = this.getBinding();
            strategy.appendField(locator, this, "binding", buffer, theBinding);
        }
        {
            List<ProfileMapping1> theMapping;
            theMapping = (((this.mapping!= null)&&(!this.mapping.isEmpty()))?this.getMapping():null);
            strategy.appendField(locator, this, "mapping", buffer, theMapping);
        }
        return buffer;
    }

}