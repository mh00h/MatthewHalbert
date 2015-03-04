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
 * <p>Java class for PropertyRepresentation-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PropertyRepresentation-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="xmlAttr"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PropertyRepresentation-list")
@XmlEnum
public enum PropertyRepresentationList {


    /**
     * In XML, this property is represented as an attribute not an element.
     * 
     */
    @XmlEnumValue("xmlAttr")
    XML_ATTR("xmlAttr");
    private final java.lang.String value;

    PropertyRepresentationList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static PropertyRepresentationList fromValue(java.lang.String v) {
        for (PropertyRepresentationList c: PropertyRepresentationList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
