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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the basic information of a facility.
 * 
 * <p>BasicFacilityInformation_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BasicFacilityInformation_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LocationInformation" type="{http://com.oocl.schema.common}BasicLocationInformation_V1"/>
 *         &lt;element name="FacilityType" type="{http://com.oocl.schema.common}FacilityType_V1"/>
 *         &lt;element name="Address" type="{http://com.oocl.schema.common}Address_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicFacilityInformation_V1", propOrder = {
    "locationInformation",
    "facilityType",
    "address"
})
public class BasicFacilityInformationV1 {

    @XmlElement(name = "LocationInformation", required = true)
    protected BasicLocationInformationV1 locationInformation;
    @XmlElement(name = "FacilityType", required = true)
    @XmlSchemaType(name = "string")
    protected FacilityTypeV1 facilityType;
    @XmlElement(name = "Address")
    protected AddressV1 address;

    /**
     * 获取locationInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public BasicLocationInformationV1 getLocationInformation() {
        return locationInformation;
    }

    /**
     * 设置locationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public void setLocationInformation(BasicLocationInformationV1 value) {
        this.locationInformation = value;
    }

    /**
     * 获取facilityType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityTypeV1 }
     *     
     */
    public FacilityTypeV1 getFacilityType() {
        return facilityType;
    }

    /**
     * 设置facilityType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityTypeV1 }
     *     
     */
    public void setFacilityType(FacilityTypeV1 value) {
        this.facilityType = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressV1 }
     *     
     */
    public AddressV1 getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressV1 }
     *     
     */
    public void setAddress(AddressV1 value) {
        this.address = value;
    }

}
