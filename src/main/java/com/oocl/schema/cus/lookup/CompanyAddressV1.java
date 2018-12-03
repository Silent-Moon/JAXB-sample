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
 * 
 * 					Company Address datatype contains SiteName, Address, GeoCity, and OfficeType.
 * 			
 * 
 * <p>CompanyAddress_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CompanyAddress_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressID" type="{http://com.oocl.schema.common}UUID_V1" minOccurs="0"/>
 *         &lt;element name="SiteName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://com.oocl.schema.common}Address_V1" minOccurs="0"/>
 *         &lt;element name="City" type="{http://com.oocl.schema.common}CityLevel_V1" minOccurs="0"/>
 *         &lt;element name="OfficeType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Main"/>
 *               &lt;enumeration value="Branch"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyAddress_V1", propOrder = {
    "addressID",
    "siteName",
    "address",
    "city",
    "officeType"
})
public class CompanyAddressV1 {

    @XmlElement(name = "AddressID")
    protected String addressID;
    @XmlElement(name = "SiteName")
    protected String siteName;
    @XmlElement(name = "Address")
    protected AddressV1 address;
    @XmlElement(name = "City")
    protected CityLevelV1 city;
    @XmlElement(name = "OfficeType")
    protected String officeType;

    /**
     * 获取addressID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressID() {
        return addressID;
    }

    /**
     * 设置addressID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressID(String value) {
        this.addressID = value;
    }

    /**
     * 获取siteName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSiteName() {
        return siteName;
    }

    /**
     * 设置siteName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSiteName(String value) {
        this.siteName = value;
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

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CityLevelV1 }
     *     
     */
    public CityLevelV1 getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CityLevelV1 }
     *     
     */
    public void setCity(CityLevelV1 value) {
        this.city = value;
    }

    /**
     * 获取officeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOfficeType() {
        return officeType;
    }

    /**
     * 设置officeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOfficeType(String value) {
        this.officeType = value;
    }

}
