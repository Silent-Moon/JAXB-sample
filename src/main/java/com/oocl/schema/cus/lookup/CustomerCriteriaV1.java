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
 * A complex type that represents the basic search criteria for a customer.
 * 
 * <p>CustomerCriteria_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerCriteria_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerName" type="{http://com.oocl.schema.common}CompanyName_V1" minOccurs="0"/>
 *         &lt;element name="City" type="{http://com.oocl.schema.common}CityLevel_V1" minOccurs="0"/>
 *         &lt;element name="SAP_ID" type="{http://com.oocl.schema.common}SAP_ID_V1" minOccurs="0"/>
 *         &lt;element name="Customer_ID" type="{http://com.oocl.schema.common}IRIS2_ID_V1" minOccurs="0"/>
 *         &lt;element name="CargoSmart_ID" type="{http://com.oocl.schema.common}CargoSmart_ID_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerCriteria_V1", namespace = "http://com.oocl.schema.customer.lookup", propOrder = {
    "customerName",
    "city",
    "sapid",
    "customerID",
    "cargoSmartID"
})
public class CustomerCriteriaV1 {

    @XmlElement(name = "CustomerName")
    protected String customerName;
    @XmlElement(name = "City")
    protected CityLevelV1 city;
    @XmlElement(name = "SAP_ID")
    protected String sapid;
    @XmlElement(name = "Customer_ID")
    protected String customerID;
    @XmlElement(name = "CargoSmart_ID")
    protected String cargoSmartID;

    /**
     * 获取customerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置customerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
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
     * 获取sapid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSAPID() {
        return sapid;
    }

    /**
     * 设置sapid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSAPID(String value) {
        this.sapid = value;
    }

    /**
     * 获取customerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * 设置customerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * 获取cargoSmartID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCargoSmartID() {
        return cargoSmartID;
    }

    /**
     * 设置cargoSmartID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCargoSmartID(String value) {
        this.cargoSmartID = value;
    }

}
