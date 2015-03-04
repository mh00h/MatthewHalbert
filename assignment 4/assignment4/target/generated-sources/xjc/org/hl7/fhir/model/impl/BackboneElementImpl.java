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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.BackboneElement;
import org.hl7.fhir.model.Extension;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackboneElement", propOrder = {
    "modifierExtension"
})
@XmlSeeAlso({
    AdverseReactionSymptomImpl.class,
    AdverseReactionExposureImpl.class,
    CarePlanParticipantImpl.class,
    CarePlanGoalImpl.class,
    CarePlanActivityImpl.class,
    CarePlanSimpleImpl.class,
    CompositionAttesterImpl.class,
    CompositionEventImpl.class,
    CompositionSectionImpl.class,
    ConceptMapConceptImpl.class,
    ConceptMapDependsOnImpl.class,
    ConceptMapMapImpl.class,
    ConditionStageImpl.class,
    ConditionEvidenceImpl.class,
    ConditionLocationImpl.class,
    ConditionRelatedItemImpl.class,
    ConformanceSoftwareImpl.class,
    ConformanceImplementationImpl.class,
    ConformanceRestImpl.class,
    ConformanceSecurityImpl.class,
    ConformanceCertificateImpl.class,
    ConformanceResourceImpl.class,
    ConformanceOperationImpl.class,
    ConformanceSearchParamImpl.class,
    ConformanceOperation1Impl.class,
    ConformanceQueryImpl.class,
    ConformanceMessagingImpl.class,
    ConformanceEventImpl.class,
    ConformanceDocumentImpl.class,
    DeviceObservationReportVirtualDeviceImpl.class,
    DeviceObservationReportChannelImpl.class,
    DeviceObservationReportMetricImpl.class,
    DiagnosticOrderEventImpl.class,
    DiagnosticOrderItemImpl.class,
    DiagnosticReportImageImpl.class,
    DocumentReferenceRelatesToImpl.class,
    DocumentReferenceServiceImpl.class,
    DocumentReferenceParameterImpl.class,
    DocumentReferenceContextImpl.class,
    EncounterParticipantImpl.class,
    EncounterHospitalizationImpl.class,
    EncounterAccomodationImpl.class,
    EncounterLocationImpl.class,
    FamilyHistoryRelationImpl.class,
    FamilyHistoryConditionImpl.class,
    GroupCharacteristicImpl.class,
    ImagingStudySeriesImpl.class,
    ImagingStudyInstanceImpl.class,
    ImmunizationExplanationImpl.class,
    ImmunizationReactionImpl.class,
    ImmunizationVaccinationProtocolImpl.class,
    ImmunizationRecommendationRecommendationImpl.class,
    ImmunizationRecommendationDateCriterionImpl.class,
    ImmunizationRecommendationProtocolImpl.class,
    ListEntryImpl.class,
    LocationPositionImpl.class,
    MedicationProductImpl.class,
    MedicationIngredientImpl.class,
    MedicationPackageImpl.class,
    MedicationContentImpl.class,
    MedicationAdministrationDosageImpl.class,
    MedicationDispenseDispenseImpl.class,
    MedicationDispenseDosageImpl.class,
    MedicationDispenseSubstitutionImpl.class,
    MedicationPrescriptionDosageInstructionImpl.class,
    MedicationPrescriptionDispenseImpl.class,
    MedicationPrescriptionSubstitutionImpl.class,
    MedicationStatementDosageImpl.class,
    MessageHeaderResponseImpl.class,
    MessageHeaderSourceImpl.class,
    MessageHeaderDestinationImpl.class,
    ObservationReferenceRangeImpl.class,
    ObservationRelatedImpl.class,
    OperationOutcomeIssueImpl.class,
    OrderWhenImpl.class,
    OrganizationContactImpl.class,
    PatientContactImpl.class,
    PatientAnimalImpl.class,
    PatientLinkImpl.class,
    PractitionerQualificationImpl.class,
    ProcedurePerformerImpl.class,
    ProcedureRelatedItemImpl.class,
    ProfileMappingImpl.class,
    ProfileStructureImpl.class,
    ProfileElementImpl.class,
    ProfileSlicingImpl.class,
    ProfileDefinitionImpl.class,
    ProfileTypeImpl.class,
    ProfileConstraintImpl.class,
    ProfileBindingImpl.class,
    ProfileMapping1Impl.class,
    ProfileSearchParamImpl.class,
    ProfileExtensionDefnImpl.class,
    ProfileQueryImpl.class,
    ProvenanceAgentImpl.class,
    ProvenanceEntityImpl.class,
    QueryResponseImpl.class,
    QuestionnaireGroupImpl.class,
    QuestionnaireQuestionImpl.class,
    SecurityEventEventImpl.class,
    SecurityEventParticipantImpl.class,
    SecurityEventNetworkImpl.class,
    SecurityEventSourceImpl.class,
    SecurityEventObjectImpl.class,
    SecurityEventDetailImpl.class,
    SpecimenSourceImpl.class,
    SpecimenCollectionImpl.class,
    SpecimenTreatmentImpl.class,
    SpecimenContainerImpl.class,
    SubstanceInstanceImpl.class,
    SubstanceIngredientImpl.class,
    SupplyDispenseImpl.class,
    ValueSetDefineImpl.class,
    ValueSetConceptImpl.class,
    ValueSetComposeImpl.class,
    ValueSetIncludeImpl.class,
    ValueSetFilterImpl.class,
    ValueSetExpansionImpl.class,
    ValueSetContainsImpl.class,
    ResourceImpl.class
})
public class BackboneElementImpl
    extends ElementImpl
    implements BackboneElement, ToString
{

    @XmlElement(type = ExtensionImpl.class)
    protected List<Extension> modifierExtension;

    public List<Extension> getModifierExtension() {
        if (modifierExtension == null) {
            modifierExtension = new ArrayList<Extension>();
        }
        return this.modifierExtension;
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
            List<Extension> theModifierExtension;
            theModifierExtension = (((this.modifierExtension!= null)&&(!this.modifierExtension.isEmpty()))?this.getModifierExtension():null);
            strategy.appendField(locator, this, "modifierExtension", buffer, theModifierExtension);
        }
        return buffer;
    }

}
