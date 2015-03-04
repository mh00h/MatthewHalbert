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
 * <p>Java class for RestfulOperationType-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RestfulOperationType-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="read"/&gt;
 *     &lt;enumeration value="vread"/&gt;
 *     &lt;enumeration value="update"/&gt;
 *     &lt;enumeration value="delete"/&gt;
 *     &lt;enumeration value="history-instance"/&gt;
 *     &lt;enumeration value="validate"/&gt;
 *     &lt;enumeration value="history-type"/&gt;
 *     &lt;enumeration value="create"/&gt;
 *     &lt;enumeration value="search-type"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RestfulOperationType-list")
@XmlEnum
public enum RestfulOperationTypeList {

    @XmlEnumValue("read")
    READ("read"),
    @XmlEnumValue("vread")
    VREAD("vread"),
    @XmlEnumValue("update")
    UPDATE("update"),
    @XmlEnumValue("delete")
    DELETE("delete"),
    @XmlEnumValue("history-instance")
    HISTORY_INSTANCE("history-instance"),
    @XmlEnumValue("validate")
    VALIDATE("validate"),
    @XmlEnumValue("history-type")
    HISTORY_TYPE("history-type"),
    @XmlEnumValue("create")
    CREATE("create"),
    @XmlEnumValue("search-type")
    SEARCH_TYPE("search-type");
    private final java.lang.String value;

    RestfulOperationTypeList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static RestfulOperationTypeList fromValue(java.lang.String v) {
        for (RestfulOperationTypeList c: RestfulOperationTypeList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
