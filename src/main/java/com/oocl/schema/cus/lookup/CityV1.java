//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about a city with shipping and operation info.
 * 
 * <p>City_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="City_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CityInformation" type="{http://com.oocl.schema.common}CityLevel_V1"/>
 *         &lt;element name="TimezoneName" type="{http://com.oocl.schema.common}EntityBriefName_V1" minOccurs="0"/>
 *         &lt;element name="CustomerGroupRegion" type="{http://com.oocl.schema.common}CustomerGroupRegion_V1" minOccurs="0"/>
 *         &lt;element name="OpZone" type="{http://com.oocl.schema.common}OpZone_V1" minOccurs="0"/>
 *         &lt;element name="LocationShippingAttribute" type="{http://com.oocl.schema.common}LocationShippingAttribute_V1" minOccurs="0"/>
 *         &lt;element name="DefaultEmptyPickupFacility" type="{http://com.oocl.schema.common}BasicFacilityInformation_V1" minOccurs="0"/>
 *         &lt;element name="DefaultEmptyReturnFacility" type="{http://com.oocl.schema.common}BasicFacilityInformation_V1" minOccurs="0"/>
 *         &lt;element name="LocationCoordinate" type="{http://com.oocl.schema.common}LocationCoordinate_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "City_V1", propOrder = {
    "cityInformation",
    "timezoneName",
    "customerGroupRegion",
    "opZone",
    "locationShippingAttribute",
    "defaultEmptyPickupFacility",
    "defaultEmptyReturnFacility",
    "locationCoordinate"
})
public class CityV1 {

    @XmlElement(name = "CityInformation", required = true)
    protected CityLevelV1 cityInformation;
    @XmlElement(name = "TimezoneName")
    protected String timezoneName;
    @XmlElement(name = "CustomerGroupRegion")
    protected CustomerGroupRegionV1 customerGroupRegion;
    @XmlElement(name = "OpZone")
    protected OpZoneV1 opZone;
    @XmlElement(name = "LocationShippingAttribute")
    protected LocationShippingAttributeV1 locationShippingAttribute;
    @XmlElement(name = "DefaultEmptyPickupFacility")
    protected BasicFacilityInformationV1 defaultEmptyPickupFacility;
    @XmlElement(name = "DefaultEmptyReturnFacility")
    protected BasicFacilityInformationV1 defaultEmptyReturnFacility;
    @XmlElement(name = "LocationCoordinate")
    protected LocationCoordinateV1 locationCoordinate;

    /**
     * 获取cityInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CityLevelV1 }
     *     
     */
    public CityLevelV1 getCityInformation() {
        return cityInformation;
    }

    /**
     * 设置cityInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CityLevelV1 }
     *     
     */
    public void setCityInformation(CityLevelV1 value) {
        this.cityInformation = value;
    }

    /**
     * 获取timezoneName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * 设置timezoneName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneName(String value) {
        this.timezoneName = value;
    }

    /**
     * 获取customerGroupRegion属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerGroupRegionV1 }
     *     
     */
    public CustomerGroupRegionV1 getCustomerGroupRegion() {
        return customerGroupRegion;
    }

    /**
     * 设置customerGroupRegion属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerGroupRegionV1 }
     *     
     */
    public void setCustomerGroupRegion(CustomerGroupRegionV1 value) {
        this.customerGroupRegion = value;
    }

    /**
     * 获取opZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OpZoneV1 }
     *     
     */
    public OpZoneV1 getOpZone() {
        return opZone;
    }

    /**
     * 设置opZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OpZoneV1 }
     *     
     */
    public void setOpZone(OpZoneV1 value) {
        this.opZone = value;
    }

    /**
     * 获取locationShippingAttribute属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationShippingAttributeV1 }
     *     
     */
    public LocationShippingAttributeV1 getLocationShippingAttribute() {
        return locationShippingAttribute;
    }

    /**
     * 设置locationShippingAttribute属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationShippingAttributeV1 }
     *     
     */
    public void setLocationShippingAttribute(LocationShippingAttributeV1 value) {
        this.locationShippingAttribute = value;
    }

    /**
     * 获取defaultEmptyPickupFacility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicFacilityInformationV1 }
     *     
     */
    public BasicFacilityInformationV1 getDefaultEmptyPickupFacility() {
        return defaultEmptyPickupFacility;
    }

    /**
     * 设置defaultEmptyPickupFacility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicFacilityInformationV1 }
     *     
     */
    public void setDefaultEmptyPickupFacility(BasicFacilityInformationV1 value) {
        this.defaultEmptyPickupFacility = value;
    }

    /**
     * 获取defaultEmptyReturnFacility属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicFacilityInformationV1 }
     *     
     */
    public BasicFacilityInformationV1 getDefaultEmptyReturnFacility() {
        return defaultEmptyReturnFacility;
    }

    /**
     * 设置defaultEmptyReturnFacility属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicFacilityInformationV1 }
     *     
     */
    public void setDefaultEmptyReturnFacility(BasicFacilityInformationV1 value) {
        this.defaultEmptyReturnFacility = value;
    }

    /**
     * 获取locationCoordinate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationCoordinateV1 }
     *     
     */
    public LocationCoordinateV1 getLocationCoordinate() {
        return locationCoordinate;
    }

    /**
     * 设置locationCoordinate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCoordinateV1 }
     *     
     */
    public void setLocationCoordinate(LocationCoordinateV1 value) {
        this.locationCoordinate = value;
    }

}
