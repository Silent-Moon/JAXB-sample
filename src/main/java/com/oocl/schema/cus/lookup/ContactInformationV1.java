//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactInformation_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactInformation_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://com.oocl.schema.common}PersonName_V1" minOccurs="0"/>
 *         &lt;element name="EmailAddresses" type="{http://com.oocl.schema.common}EmailAddress_V1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="PhoneNumbers" type="{http://com.oocl.schema.common}PhoneNumber_V1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactInformation_V1", propOrder = {
    "name",
    "emailAddresses",
    "phoneNumbers"
})
public class ContactInformationV1 {

    @XmlElement(name = "Name")
    protected PersonNameV1 name;
    @XmlElement(name = "EmailAddresses")
    protected List<EmailAddressV1> emailAddresses;
    @XmlElement(name = "PhoneNumbers")
    protected List<PhoneNumberV1> phoneNumbers;

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameV1 }
     *     
     */
    public PersonNameV1 getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameV1 }
     *     
     */
    public void setName(PersonNameV1 value) {
        this.name = value;
    }

    /**
     * Gets the value of the emailAddresses property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emailAddresses property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmailAddresses().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailAddressV1 }
     * 
     * 
     */
    public List<EmailAddressV1> getEmailAddresses() {
        if (emailAddresses == null) {
            emailAddresses = new ArrayList<EmailAddressV1>();
        }
        return this.emailAddresses;
    }

    /**
     * Gets the value of the phoneNumbers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the phoneNumbers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPhoneNumbers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PhoneNumberV1 }
     * 
     * 
     */
    public List<PhoneNumberV1> getPhoneNumbers() {
        if (phoneNumbers == null) {
            phoneNumbers = new ArrayList<PhoneNumberV1>();
        }
        return this.phoneNumbers;
    }

}
