//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.02.28 at 10:41:42 AM MST 
//


package org.hl7.fhir.model.impl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.hl7.fhir.model.Decimal;
import org.hl7.fhir.model.LocationPosition;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Location.Position", propOrder = {
    "longitude",
    "latitude",
    "altitude"
})
public class LocationPositionImpl
    extends BackboneElementImpl
    implements LocationPosition, ToString
{

    @XmlElement(required = true, type = DecimalImpl.class)
    protected DecimalImpl longitude;
    @XmlElement(required = true, type = DecimalImpl.class)
    protected DecimalImpl latitude;
    @XmlElement(type = DecimalImpl.class)
    protected DecimalImpl altitude;

    public Decimal getLongitude() {
        return longitude;
    }

    public void setLongitude(Decimal value) {
        this.longitude = ((DecimalImpl) value);
    }

    public Decimal getLatitude() {
        return latitude;
    }

    public void setLatitude(Decimal value) {
        this.latitude = ((DecimalImpl) value);
    }

    public Decimal getAltitude() {
        return altitude;
    }

    public void setAltitude(Decimal value) {
        this.altitude = ((DecimalImpl) value);
    }

    public String toString() {
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
            Decimal theLongitude;
            theLongitude = this.getLongitude();
            strategy.appendField(locator, this, "longitude", buffer, theLongitude);
        }
        {
            Decimal theLatitude;
            theLatitude = this.getLatitude();
            strategy.appendField(locator, this, "latitude", buffer, theLatitude);
        }
        {
            Decimal theAltitude;
            theAltitude = this.getAltitude();
            strategy.appendField(locator, this, "altitude", buffer, theAltitude);
        }
        return buffer;
    }

}