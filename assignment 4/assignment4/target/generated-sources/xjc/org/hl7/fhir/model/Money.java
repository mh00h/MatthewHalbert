//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * <p>Java class for Money complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Money"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://hl7.org/fhir}Quantity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="value" type="{http://hl7.org/fhir}decimal" minOccurs="0"/&gt;
 *         &lt;element name="comparator" type="{http://hl7.org/fhir}QuantityCompararator" minOccurs="0"/&gt;
 *         &lt;element name="units" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="system" type="{http://hl7.org/fhir}uri" minOccurs="0"/&gt;
 *         &lt;element name="code" type="{http://hl7.org/fhir}code" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://hl7.org/fhir}id-primitive" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface Money
    extends Quantity
{


}
