//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * An element defined in a FHIR resources - can have modifierExtension elements
 * 
 * <p>Java class for BackboneElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BackboneElement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Element"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="modifierExtension" type="{http://hl7.org/fhir}Extension" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BackboneElement", propOrder = {
    "modifierExtensions"
})
@XmlSeeAlso({
    AdverseReactionSymptom.class,
    AdverseReactionExposure.class,
    CarePlanParticipant.class,
    CarePlanGoal.class,
    CarePlanActivity.class,
    CompositionAttester.class,
    CompositionEvent.class,
    CompositionSection.class,
    ConceptMapConcept.class,
    ConditionStage.class,
    ConditionEvidence.class,
    ConditionLocation.class,
    ConditionRelatedItem.class,
    ConformanceSoftware.class,
    ConformanceImplementation.class,
    ConformanceRest.class,
    ConformanceMessaging.class,
    ConformanceDocument.class,
    DeviceObservationReportVirtualDevice.class,
    DiagnosticOrderEvent.class,
    DiagnosticOrderItem.class,
    DiagnosticReportImage.class,
    DocumentReferenceRelatesTo.class,
    DocumentReferenceService.class,
    DocumentReferenceContext.class,
    EncounterParticipant.class,
    EncounterHospitalization.class,
    EncounterLocation.class,
    FamilyHistoryRelation.class,
    GroupCharacteristic.class,
    ImagingStudySeries.class,
    ImmunizationExplanation.class,
    ImmunizationReaction.class,
    ImmunizationVaccinationProtocol.class,
    ImmunizationRecommendationRecommendation.class,
    ListEntry.class,
    LocationPosition.class,
    MedicationProduct.class,
    MedicationPackage.class,
    MedicationAdministrationDosage.class,
    MedicationDispenseDispense.class,
    MedicationDispenseSubstitution.class,
    MedicationPrescriptionDosageInstruction.class,
    MedicationPrescriptionDispense.class,
    MedicationPrescriptionSubstitution.class,
    MedicationStatementDosage.class,
    MessageHeaderResponse.class,
    MessageHeaderSource.class,
    MessageHeaderDestination.class,
    ObservationReferenceRange.class,
    ObservationRelated.class,
    OperationOutcomeIssue.class,
    OrderWhen.class,
    OrganizationContact.class,
    PatientContact.class,
    PatientAnimal.class,
    PatientLink.class,
    PractitionerQualification.class,
    ProcedurePerformer.class,
    ProcedureRelatedItem.class,
    ProfileMapping.class,
    ProfileStructure.class,
    ProfileExtensionDefn.class,
    ProfileQuery.class,
    ProvenanceAgent.class,
    ProvenanceEntity.class,
    QueryResponse.class,
    QuestionnaireGroup.class,
    SecurityEventEvent.class,
    SecurityEventParticipant.class,
    SecurityEventSource.class,
    SecurityEventObject.class,
    SpecimenSource.class,
    SpecimenCollection.class,
    SpecimenTreatment.class,
    SpecimenContainer.class,
    SubstanceInstance.class,
    SubstanceIngredient.class,
    SupplyDispense.class,
    ValueSetDefine.class,
    ValueSetCompose.class,
    ValueSetExpansion.class,
    CarePlanSimple.class,
    ConceptMapDependsOn.class,
    ConceptMapMap.class,
    ConformanceSecurity.class,
    ConformanceCertificate.class,
    ConformanceResource.class,
    ConformanceOperation.class,
    ConformanceSearchParam.class,
    ConformanceOperation1 .class,
    ConformanceQuery.class,
    ConformanceEvent.class,
    DeviceObservationReportChannel.class,
    DeviceObservationReportMetric.class,
    DocumentReferenceParameter.class,
    EncounterAccomodation.class,
    FamilyHistoryCondition.class,
    ImagingStudyInstance.class,
    ImmunizationRecommendationDateCriterion.class,
    ImmunizationRecommendationProtocol.class,
    MedicationIngredient.class,
    MedicationContent.class,
    MedicationDispenseDosage.class,
    ProfileElement.class,
    ProfileSlicing.class,
    ProfileDefinition.class,
    ProfileType.class,
    ProfileConstraint.class,
    ProfileBinding.class,
    ProfileMapping1 .class,
    ProfileSearchParam.class,
    QuestionnaireQuestion.class,
    SecurityEventNetwork.class,
    SecurityEventDetail.class,
    ValueSetConcept.class,
    ValueSetInclude.class,
    ValueSetFilter.class,
    ValueSetContains.class,
    Resource.class
})
public class BackboneElement
    extends Element
    implements ToString
{

    @XmlElement(name = "modifierExtension")
    protected List<Extension> modifierExtensions;

    /**
     * Gets the value of the modifierExtensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the modifierExtensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getModifierExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getModifierExtensions() {
        if (modifierExtensions == null) {
            modifierExtensions = new ArrayList<Extension>();
        }
        return this.modifierExtensions;
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
            List<Extension> theModifierExtensions;
            theModifierExtensions = (((this.modifierExtensions!= null)&&(!this.modifierExtensions.isEmpty()))?this.getModifierExtensions():null);
            strategy.appendField(locator, this, "modifierExtensions", buffer, theModifierExtensions);
        }
        return buffer;
    }

}
