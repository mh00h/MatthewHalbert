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
 * <p>Java class for BindingConformance-list.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BindingConformance-list"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="required"/&gt;
 *     &lt;enumeration value="preferred"/&gt;
 *     &lt;enumeration value="example"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BindingConformance-list")
@XmlEnum
public enum BindingConformanceList {


    /**
     * Only codes in the specified set are allowed.  If the binding is extensible, other codes may be used for concepts not covered by the bound set of codes.
     * 
     */
    @XmlEnumValue("required")
    REQUIRED("required"),

    /**
     * For greater interoperability, implementers are strongly encouraged to use the bound set of codes, however alternate codes may be used in derived profiles and implementations if necessary without being considered non-conformant.
     * 
     */
    @XmlEnumValue("preferred")
    PREFERRED("preferred"),

    /**
     * The codes in the set are an example to illustrate the meaning of the field. There is no particular preference for its use nor any assertion that the provided values are sufficient to meet implementation needs.
     * 
     */
    @XmlEnumValue("example")
    EXAMPLE("example");
    private final java.lang.String value;

    BindingConformanceList(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static BindingConformanceList fromValue(java.lang.String v) {
        for (BindingConformanceList c: BindingConformanceList.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
