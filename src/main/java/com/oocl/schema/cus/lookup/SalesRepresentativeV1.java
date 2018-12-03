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
 * 			This defines a Sales Representative data type.
 * 			
 * 
 * <p>SalesRepresentative_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SalesRepresentative_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesRepName" type="{http://com.oocl.schema.common}PersonName_V1" minOccurs="0"/>
 *         &lt;element name="SalesOffice" type="{http://com.oocl.schema.common}BasicOfficeInformation_V1" minOccurs="0"/>
 *         &lt;element name="EmailAddress" type="{http://com.oocl.schema.common}EmailAddress_V1" minOccurs="0"/>
 *         &lt;element name="PhoneNumber" type="{http://com.oocl.schema.common}PhoneNumber_V1" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DepartmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhoneNumber" type="{http://com.oocl.schema.common}PhoneNumber_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesRepresentative_V1", propOrder = {
    "code",
    "salesRepName",
    "salesOffice",
    "emailAddress",
    "phoneNumber",
    "isActive",
    "departmentCode",
    "mobilePhoneNumber"
})
public class SalesRepresentativeV1 {

    @XmlElement(name = "Code")
    protected String code;
    @XmlElement(name = "SalesRepName")
    protected PersonNameV1 salesRepName;
    @XmlElement(name = "SalesOffice")
    protected BasicOfficeInformationV1 salesOffice;
    @XmlElement(name = "EmailAddress")
    protected EmailAddressV1 emailAddress;
    @XmlElement(name = "PhoneNumber")
    protected PhoneNumberV1 phoneNumber;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;
    @XmlElement(name = "DepartmentCode")
    protected String departmentCode;
    @XmlElement(name = "MobilePhoneNumber")
    protected PhoneNumberV1 mobilePhoneNumber;

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取salesRepName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameV1 }
     *     
     */
    public PersonNameV1 getSalesRepName() {
        return salesRepName;
    }

    /**
     * 设置salesRepName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameV1 }
     *     
     */
    public void setSalesRepName(PersonNameV1 value) {
        this.salesRepName = value;
    }

    /**
     * 获取salesOffice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicOfficeInformationV1 }
     *     
     */
    public BasicOfficeInformationV1 getSalesOffice() {
        return salesOffice;
    }

    /**
     * 设置salesOffice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicOfficeInformationV1 }
     *     
     */
    public void setSalesOffice(BasicOfficeInformationV1 value) {
        this.salesOffice = value;
    }

    /**
     * 获取emailAddress属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailAddressV1 }
     *     
     */
    public EmailAddressV1 getEmailAddress() {
        return emailAddress;
    }

    /**
     * 设置emailAddress属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailAddressV1 }
     *     
     */
    public void setEmailAddress(EmailAddressV1 value) {
        this.emailAddress = value;
    }

    /**
     * 获取phoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public PhoneNumberV1 getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置phoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public void setPhoneNumber(PhoneNumberV1 value) {
        this.phoneNumber = value;
    }

    /**
     * 获取isActive属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsActive() {
        return isActive;
    }

    /**
     * 设置isActive属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsActive(Boolean value) {
        this.isActive = value;
    }

    /**
     * 获取departmentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartmentCode() {
        return departmentCode;
    }

    /**
     * 设置departmentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartmentCode(String value) {
        this.departmentCode = value;
    }

    /**
     * 获取mobilePhoneNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public PhoneNumberV1 getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    /**
     * 设置mobilePhoneNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public void setMobilePhoneNumber(PhoneNumberV1 value) {
        this.mobilePhoneNumber = value;
    }

}
