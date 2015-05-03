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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;


/**
 * If the element is present, it must have either a @value, an @id, or extensions
 * 
 * <p>Java class for SecurityEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SecurityEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}Resource"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="event" type="{http://hl7.org/fhir}SecurityEvent.Event"/&gt;
 *         &lt;element name="participant" type="{http://hl7.org/fhir}SecurityEvent.Participant" maxOccurs="unbounded"/&gt;
 *         &lt;element name="source" type="{http://hl7.org/fhir}SecurityEvent.Source"/&gt;
 *         &lt;element name="object" type="{http://hl7.org/fhir}SecurityEvent.Object" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityEvent", propOrder = {
    "event",
    "participants",
    "source",
    "objects"
})
@XmlRootElement(name = "SecurityEvent")
public class SecurityEvent
    extends Resource
    implements ToString
{

    @XmlElement(required = true)
    protected SecurityEventEvent event;
    @XmlElement(name = "participant", required = true)
    protected List<SecurityEventParticipant> participants;
    @XmlElement(required = true)
    protected SecurityEventSource source;
    @XmlElement(name = "object")
    protected List<SecurityEventObject> objects;

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventEvent }
     *     
     */
    public SecurityEventEvent getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventEvent }
     *     
     */
    public void setEvent(SecurityEventEvent value) {
        this.event = value;
    }

    /**
     * Gets the value of the participants property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the participants property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParticipants().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventParticipant }
     * 
     * 
     */
    public List<SecurityEventParticipant> getParticipants() {
        if (participants == null) {
            participants = new ArrayList<SecurityEventParticipant>();
        }
        return this.participants;
    }

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityEventSource }
     *     
     */
    public SecurityEventSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityEventSource }
     *     
     */
    public void setSource(SecurityEventSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the objects property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the objects property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getObjects().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityEventObject }
     * 
     * 
     */
    public List<SecurityEventObject> getObjects() {
        if (objects == null) {
            objects = new ArrayList<SecurityEventObject>();
        }
        return this.objects;
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
            SecurityEventEvent theEvent;
            theEvent = this.getEvent();
            strategy.appendField(locator, this, "event", buffer, theEvent);
        }
        {
            List<SecurityEventParticipant> theParticipants;
            theParticipants = (((this.participants!= null)&&(!this.participants.isEmpty()))?this.getParticipants():null);
            strategy.appendField(locator, this, "participants", buffer, theParticipants);
        }
        {
            SecurityEventSource theSource;
            theSource = this.getSource();
            strategy.appendField(locator, this, "source", buffer, theSource);
        }
        {
            List<SecurityEventObject> theObjects;
            theObjects = (((this.objects!= null)&&(!this.objects.isEmpty()))?this.getObjects():null);
            strategy.appendField(locator, this, "objects", buffer, theObjects);
        }
        return buffer;
    }

}
