//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.*;


/**
 * A complex type that represents the lookup criteria for the customer.
 * 
 * <p>CPFLookUpCriteria_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CPFLookUpCriteria_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerSearchCriteria" type="{http://com.oocl.schema.customer.lookup}CustomerCriteria_V1" minOccurs="0"/>
 *         &lt;element name="CustomerAlias" type="{http://com.oocl.schema.common}CompanyName_V1" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://com.oocl.schema.common}Country_V1" minOccurs="0"/>
 *         &lt;element name="State" type="{http://com.oocl.schema.common}AddressLine_V1" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://com.oocl.schema.common}ZIP_Code_V1" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://com.oocl.schema.common}Address_V1" minOccurs="0"/>
 *         &lt;element name="PhoneInformation" type="{http://com.oocl.schema.common}PhoneNumber_V1" minOccurs="0"/>
 *         &lt;element name="CustomerContacts" type="{http://com.oocl.schema.customer}CustomerContact_V1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReferenceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="AgreementNumber"/>
 *               &lt;enumeration value="BookingNumber"/>
 *               &lt;enumeration value="BillOfLadingNumber"/>
 *               &lt;enumeration value="ContainerNumber"/>
 *               &lt;enumeration value="InvoiceNumber"/>
 *               &lt;enumeration value="CustomerReferenceNumber"/>
 *               &lt;enumeration value="ForwarderReferenceNumber"/>
 *               &lt;enumeration value="PurchaseOrderNumber"/>
 *               &lt;enumeration value="ShipperIdentifyingNumber"/>
 *               &lt;enumeration value="ShipperReferenceNumber"/>
 *               &lt;enumeration value="TrackingNumber"/>
 *               &lt;enumeration value="ServiceRequestNumber"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ReferenceValue" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="30"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="SalesRepresentative" type="{http://com.oocl.schema.customer}CustomerSalesRepAssignment_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CPFLookUpCriteria_V1", namespace = "http://com.oocl.schema.customer.lookup", propOrder = {
    "customerSearchCriteria",
    "customerAlias",
    "country",
    "state",
    "postalCode",
    "address",
    "phoneInformation",
    "customerContacts",
    "referenceType",
    "referenceValue",
    "salesRepresentative"
})
@XmlRootElement
public class CPFLookUpCriteriaV1 {

    @XmlElement(name = "CustomerSearchCriteria")
    protected CustomerCriteriaV1 customerSearchCriteria;
    @XmlElement(name = "CustomerAlias")
    protected String customerAlias;
    @XmlElement(name = "Country")
    protected CountryV1 country;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "PostalCode")
    protected String postalCode;
    @XmlElement(name = "Address")
    protected AddressV1 address;
    @XmlElement(name = "PhoneInformation")
    protected PhoneNumberV1 phoneInformation;
    @XmlElement(name = "CustomerContacts")
    protected List<CustomerContactV1> customerContacts;
    @XmlElement(name = "ReferenceType")
    protected String referenceType;
    @XmlElement(name = "ReferenceValue")
    protected String referenceValue;
    @XmlElement(name = "SalesRepresentative")
    protected CustomerSalesRepAssignmentV1 salesRepresentative;

    /**
     * 获取customerSearchCriteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerCriteriaV1 }
     *     
     */
    public CustomerCriteriaV1 getCustomerSearchCriteria() {
        return customerSearchCriteria;
    }

    /**
     * 设置customerSearchCriteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCriteriaV1 }
     *     
     */
    public void setCustomerSearchCriteria(CustomerCriteriaV1 value) {
        this.customerSearchCriteria = value;
    }

    /**
     * 获取customerAlias属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAlias() {
        return customerAlias;
    }

    /**
     * 设置customerAlias属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAlias(String value) {
        this.customerAlias = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryV1 }
     *     
     */
    public CountryV1 getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryV1 }
     *     
     */
    public void setCountry(CountryV1 value) {
        this.country = value;
    }

    /**
     * 获取state属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * 设置state属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * 获取postalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * 设置postalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostalCode(String value) {
        this.postalCode = value;
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
     * 获取phoneInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public PhoneNumberV1 getPhoneInformation() {
        return phoneInformation;
    }

    /**
     * 设置phoneInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PhoneNumberV1 }
     *     
     */
    public void setPhoneInformation(PhoneNumberV1 value) {
        this.phoneInformation = value;
    }

    /**
     * Gets the value of the customerContacts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customerContacts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomerContacts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerContactV1 }
     * 
     * 
     */
    public List<CustomerContactV1> getCustomerContacts() {
        if (customerContacts == null) {
            customerContacts = new ArrayList<CustomerContactV1>();
        }
        return this.customerContacts;
    }

    /**
     * 获取referenceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceType() {
        return referenceType;
    }

    /**
     * 设置referenceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceType(String value) {
        this.referenceType = value;
    }

    /**
     * 获取referenceValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceValue() {
        return referenceValue;
    }

    /**
     * 设置referenceValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceValue(String value) {
        this.referenceValue = value;
    }

    /**
     * 获取salesRepresentative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerSalesRepAssignmentV1 }
     *     
     */
    public CustomerSalesRepAssignmentV1 getSalesRepresentative() {
        return salesRepresentative;
    }

    /**
     * 设置salesRepresentative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerSalesRepAssignmentV1 }
     *     
     */
    public void setSalesRepresentative(CustomerSalesRepAssignmentV1 value) {
        this.salesRepresentative = value;
    }

}
