//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.w3._1999.xhtml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRules.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TRules"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="none"/&gt;
 *     &lt;enumeration value="groups"/&gt;
 *     &lt;enumeration value="rows"/&gt;
 *     &lt;enumeration value="cols"/&gt;
 *     &lt;enumeration value="all"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TRules")
@XmlEnum
public enum TRules {

    @XmlEnumValue("none")
    NONE("none"),
    @XmlEnumValue("groups")
    GROUPS("groups"),
    @XmlEnumValue("rows")
    ROWS("rows"),
    @XmlEnumValue("cols")
    COLS("cols"),
    @XmlEnumValue("all")
    ALL("all");
    private final String value;

    TRules(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRules fromValue(String v) {
        for (TRules c: TRules.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
