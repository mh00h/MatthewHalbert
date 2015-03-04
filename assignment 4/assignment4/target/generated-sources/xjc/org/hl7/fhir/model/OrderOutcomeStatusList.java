//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OrderOutcomeStatus-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="OrderOutcomeStatus-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="pending"/&gt;
 *     &lt;enumeration value="review"/&gt;
 *     &lt;enumeration value="rejected"/&gt;
 *     &lt;enumeration value="error"/&gt;
 *     &lt;enumeration value="accepted"/&gt;
 *     &lt;enumeration value="cancelled"/&gt;
 *     &lt;enumeration value="replaced"/&gt;
 *     &lt;enumeration value="aborted"/&gt;
 *     &lt;enumeration value="complete"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OrderOutcomeStatus-list")
@XmlEnum
public enum OrderOutcomeStatusList {


    /**
     * The order is known, but no processing has occurred at this time.
     * 
     */
    @XmlEnumValue("pending")
    PENDING("pending"),

    /**
     * The order is undergoing initial processing to determine whether it will be accepted (usually this involves human review).
     * 
     */
    @XmlEnumValue("review")
    REVIEW("review"),

    /**
     * The order was rejected because of a workflow/business logic reason.
     * 
     */
    @XmlEnumValue("rejected")
    REJECTED("rejected"),

    /**
     * The order was unable to be processed because of a technical error (i.e. unexpected error).
     * 
     */
    @XmlEnumValue("error")
    ERROR("error"),

    /**
     * The order has been accepted, and work is in progress.
     * 
     */
    @XmlEnumValue("accepted")
    ACCEPTED("accepted"),

    /**
     * Processing the order was halted at the initiators request.
     * 
     */
    @XmlEnumValue("cancelled")
    CANCELLED("cancelled"),

    /**
     * The order has been cancelled and replaced by another.
     * 
     */
    @XmlEnumValue("replaced")
    REPLACED("replaced"),

    /**
     * Processing the order was stopped because of some workflow/business logic reason.
     * 
     */
    @XmlEnumValue("aborted")
    ABORTED("aborted"),

    /**
     * The order has been completed.
     * 
     */
    @XmlEnumValue("complete")
    COMPLETE("complete");
    private final java.lang.String value;

    OrderOutcomeStatusList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static OrderOutcomeStatusList fromValue(java.lang.String v) {
        for (OrderOutcomeStatusList c: OrderOutcomeStatusList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
