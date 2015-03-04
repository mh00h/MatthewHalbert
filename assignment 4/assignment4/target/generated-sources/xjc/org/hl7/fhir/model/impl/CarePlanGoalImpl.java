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
import org.hl7.fhir.model.CarePlanGoal;
import org.hl7.fhir.model.CarePlanGoalStatus;
import org.hl7.fhir.model.ResourceReference;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarePlan.Goal", propOrder = {
    "description",
    "status",
    "notes",
    "concern"
})
public class CarePlanGoalImpl
    extends BackboneElementImpl
    implements CarePlanGoal, ToString
{

    @XmlElement(required = true, type = StringImpl.class)
    protected StringImpl description;
    @XmlElement(type = CarePlanGoalStatusImpl.class)
    protected CarePlanGoalStatusImpl status;
    @XmlElement(type = StringImpl.class)
    protected StringImpl notes;
    @XmlElement(type = ResourceReferenceImpl.class)
    protected List<ResourceReference> concern;

    public org.hl7.fhir.model.String getDescription() {
        return description;
    }

    public void setDescription(org.hl7.fhir.model.String value) {
        this.description = ((StringImpl) value);
    }

    public CarePlanGoalStatus getStatus() {
        return status;
    }

    public void setStatus(CarePlanGoalStatus value) {
        this.status = ((CarePlanGoalStatusImpl) value);
    }

    public org.hl7.fhir.model.String getNotes() {
        return notes;
    }

    public void setNotes(org.hl7.fhir.model.String value) {
        this.notes = ((StringImpl) value);
    }

    public List<ResourceReference> getConcern() {
        if (concern == null) {
            concern = new ArrayList<ResourceReference>();
        }
        return this.concern;
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
            org.hl7.fhir.model.String theDescription;
            theDescription = this.getDescription();
            strategy.appendField(locator, this, "description", buffer, theDescription);
        }
        {
            CarePlanGoalStatus theStatus;
            theStatus = this.getStatus();
            strategy.appendField(locator, this, "status", buffer, theStatus);
        }
        {
            org.hl7.fhir.model.String theNotes;
            theNotes = this.getNotes();
            strategy.appendField(locator, this, "notes", buffer, theNotes);
        }
        {
            List<ResourceReference> theConcern;
            theConcern = (((this.concern!= null)&&(!this.concern.isEmpty()))?this.getConcern():null);
            strategy.appendField(locator, this, "concern", buffer, theConcern);
        }
        return buffer;
    }

}
