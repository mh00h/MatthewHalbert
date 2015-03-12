//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model;



/**
 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretation, and formatted representation of diagnostic reports.
 * 
 * <p>Java class for DiagnosticReport.Image complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiagnosticReport.Image"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://hl7.org/fhir}BackboneElement"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="comment" type="{http://hl7.org/fhir}string" minOccurs="0"/&gt;
 *         &lt;element name="link" type="{http://hl7.org/fhir}ResourceReference"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
public interface DiagnosticReportImage
    extends BackboneElement
{


    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    String getComment();

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    void setComment(String value);

    /**
     * Gets the value of the link property.
     * 
     * @return
     *     possible object is
     *     {@link ResourceReference }
     *     
     */
    ResourceReference getLink();

    /**
     * Sets the value of the link property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResourceReference }
     *     
     */
    void setLink(ResourceReference value);

}