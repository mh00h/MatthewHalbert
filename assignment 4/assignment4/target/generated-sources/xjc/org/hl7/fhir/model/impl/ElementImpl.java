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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Element;
import org.hl7.fhir.model.Extension;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Element", propOrder = {
    "extension"
})
@XmlSeeAlso({
    ReactionSeverityImpl.class,
    ExposureTypeImpl.class,
    CausalityExpectationImpl.class,
    AlertStatusImpl.class,
    SensitivityStatusImpl.class,
    CriticalityImpl.class,
    SensitivityTypeImpl.class,
    CarePlanStatusImpl.class,
    CarePlanActivityCategoryImpl.class,
    CarePlanGoalStatusImpl.class,
    CarePlanActivityStatusImpl.class,
    CompositionStatusImpl.class,
    CompositionAttestationModeImpl.class,
    ConceptMapEquivalenceImpl.class,
    ConditionStatusImpl.class,
    ConditionRelationshipTypeImpl.class,
    DocumentModeImpl.class,
    RestfulConformanceModeImpl.class,
    ConformanceEventModeImpl.class,
    MessageSignificanceCategoryImpl.class,
    RestfulOperationTypeImpl.class,
    ConformanceStatementStatusImpl.class,
    RestfulOperationSystemImpl.class,
    DiagnosticOrderStatusImpl.class,
    DiagnosticOrderPriorityImpl.class,
    DiagnosticReportStatusImpl.class,
    DocumentRelationshipTypeImpl.class,
    EncounterClassImpl.class,
    EncounterStateImpl.class,
    GroupTypeImpl.class,
    ImagingModalityImpl.class,
    InstanceAvailabilityImpl.class,
    ModalityImpl.class,
    ListModeImpl.class,
    LocationStatusImpl.class,
    LocationModeImpl.class,
    MediaTypeImpl.class,
    MedicationKindImpl.class,
    MedicationAdministrationStatusImpl.class,
    MedicationDispenseStatusImpl.class,
    MedicationPrescriptionStatusImpl.class,
    ResponseTypeImpl.class,
    ObservationReliabilityImpl.class,
    ObservationStatusImpl.class,
    ObservationRelationshipTypeImpl.class,
    IssueSeverityImpl.class,
    OrderOutcomeStatusImpl.class,
    LinkTypeImpl.class,
    ProcedureRelationshipTypeImpl.class,
    BindingConformanceImpl.class,
    ConstraintSeverityImpl.class,
    ResourceProfileStatusImpl.class,
    PropertyRepresentationImpl.class,
    AggregationModeImpl.class,
    ExtensionContextImpl.class,
    SlicingRulesImpl.class,
    ProvenanceEntityRoleImpl.class,
    QueryOutcomeImpl.class,
    QuestionnaireStatusImpl.class,
    SecurityEventObjectRoleImpl.class,
    SecurityEventObjectTypeImpl.class,
    SecurityEventActionImpl.class,
    SecurityEventObjectLifecycleImpl.class,
    SecurityEventParticipantNetworkTypeImpl.class,
    SecurityEventOutcomeImpl.class,
    HierarchicalRelationshipTypeImpl.class,
    SupplyDispenseStatusImpl.class,
    SupplyStatusImpl.class,
    FilterOperatorImpl.class,
    IntegerImpl.class,
    DateTimeImpl.class,
    CodeImpl.class,
    DateImpl.class,
    DecimalImpl.class,
    UriImpl.class,
    IdImpl.class,
    Base64BinaryImpl.class,
    OidImpl.class,
    StringImpl.class,
    BooleanImpl.class,
    UuidImpl.class,
    InstantImpl.class,
    BackboneElementImpl.class,
    ExtensionImpl.class,
    NarrativeImpl.class,
    NarrativeStatusImpl.class,
    PeriodImpl.class,
    CodingImpl.class,
    RangeImpl.class,
    QuantityCompararatorImpl.class,
    AttachmentImpl.class,
    RatioImpl.class,
    SampledDataImpl.class,
    SampledDataDataTypeImpl.class,
    ResourceReferenceImpl.class,
    CodeableConceptImpl.class,
    IdentifierImpl.class,
    IdentifierUseImpl.class,
    QuantityImpl.class,
    ScheduleImpl.class,
    ScheduleRepeatImpl.class,
    EventTimingImpl.class,
    UnitsOfTimeImpl.class,
    ContactImpl.class,
    ContactSystemImpl.class,
    ContactUseImpl.class,
    AddressImpl.class,
    AddressUseImpl.class,
    HumanNameImpl.class,
    NameUseImpl.class,
    DocumentReferenceStatusImpl.class,
    SearchParamTypeImpl.class,
    ValueSetStatusImpl.class
})
public class ElementImpl
    implements Element, ToString
{

    @XmlElement(type = ExtensionImpl.class)
    protected List<Extension> extension;
    @XmlAttribute(name = "id")
    protected String id;

    public List<Extension> getExtension() {
        if (extension == null) {
            extension = new ArrayList<Extension>();
        }
        return this.extension;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        this.id = value;
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
        {
            List<Extension> theExtension;
            theExtension = (((this.extension!= null)&&(!this.extension.isEmpty()))?this.getExtension():null);
            strategy.appendField(locator, this, "extension", buffer, theExtension);
        }
        {
            String theId;
            theId = this.getId();
            strategy.appendField(locator, this, "id", buffer, theId);
        }
        return buffer;
    }

}
