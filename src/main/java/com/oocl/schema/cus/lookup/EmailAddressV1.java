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
 * <p>EmailAddress_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="EmailAddress_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EmailID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmailType" type="{http://com.oocl.schema.common}EmailType_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EmailAddress_V1", propOrder = {
    "emailID",
    "emailType"
})
public class EmailAddressV1 {

    @XmlElement(name = "EmailID")
    protected String emailID;
    @XmlElement(name = "EmailType", defaultValue = "Unspecified")
    @XmlSchemaType(name = "string")
    protected EmailTypeV1 emailType;

    /**
     * 获取emailID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * 设置emailID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailID(String value) {
        this.emailID = value;
    }

    /**
     * 获取emailType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EmailTypeV1 }
     *     
     */
    public EmailTypeV1 getEmailType() {
        return emailType;
    }

    /**
     * 设置emailType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EmailTypeV1 }
     *     
     */
    public void setEmailType(EmailTypeV1 value) {
        this.emailType = value;
    }

}
