//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.01 at 06:36:19 PM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CarePlanActivityStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CarePlanActivityStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="not started"/&gt;
 *     &lt;enumeration value="scheduled"/&gt;
 *     &lt;enumeration value="in progress"/&gt;
 *     &lt;enumeration value="on hold"/&gt;
 *     &lt;enumeration value="completed"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CarePlanActivityStatus-list")
@XmlEnum
public enum CarePlanActivityStatusList {


    /**
     * Activity is planned but no action has yet been taken.
     * 
     */
    @XmlEnumValue("not started")
    NOT_STARTED("not started"),

    /**
     * Appointment or other booking has occurred but activity has not yet begun.
     * 
     */
    @XmlEnumValue("scheduled")
    SCHEDULED("scheduled"),

    /**
     * Activity has been started but is not yet complete.
     * 
     */
    @XmlEnumValue("in progress")
    IN_PROGRESS("in progress"),

    /**
     * Activity was started but has temporarily ceased with an expectation of resumption at a future time.
     * 
     */
    @XmlEnumValue("on hold")
    ON_HOLD("on hold"),

    /**
     * The activities have been completed (more or less) as planned.
     * 
     */
    @XmlEnumValue("completed")
    COMPLETED("completed"),

    /**
     * The activities have been ended prior to completion (perhaps even before they were started).
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled");
    private final java.lang.String value;

    CarePlanActivityStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static CarePlanActivityStatusList fromValue(java.lang.String v) {
        for (CarePlanActivityStatusList c: CarePlanActivityStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
