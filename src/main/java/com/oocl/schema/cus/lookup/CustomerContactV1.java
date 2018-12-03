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
 * 
 * 			This defines a contact for a Customer.  A customer contact is someone to whom an OOCL sales representative communicates regarding business transactions between OOCL and the Customer.
 * 			
 * 
 * <p>CustomerContact_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerContact_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactUUID" type="{http://com.oocl.schema.common}UUID_V1" minOccurs="0"/>
 *         &lt;element name="ContactInformation" type="{http://com.oocl.schema.common}ContactInformation_V1" minOccurs="0"/>
 *         &lt;element name="SAP_ID" type="{http://com.oocl.schema.common}SAP_ID_V1" minOccurs="0"/>
 *         &lt;element name="Title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="JobTitle" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Department" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="35"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Specifications" type="{http://com.oocl.schema.customer}CustomerContactSpecification_V1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerContact_V1", namespace = "http://com.oocl.schema.customer", propOrder = {
    "contactUUID",
    "contactInformation",
    "sapid",
    "title",
    "jobTitle",
    "department",
    "specifications"
})
public class CustomerContactV1 {

    @XmlElement(name = "ContactUUID")
    protected String contactUUID;
    @XmlElement(name = "ContactInformation")
    protected ContactInformationV1 contactInformation;
    @XmlElement(name = "SAP_ID")
    protected String sapid;
    @XmlElement(name = "Title")
    protected String title;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "Department")
    protected String department;
    @XmlElement(name = "Specifications")
    protected List<CustomerContactSpecificationV1> specifications;

    /**
     * 获取contactUUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactUUID() {
        return contactUUID;
    }

    /**
     * 设置contactUUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactUUID(String value) {
        this.contactUUID = value;
    }

    /**
     * 获取contactInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInformationV1 }
     *     
     */
    public ContactInformationV1 getContactInformation() {
        return contactInformation;
    }

    /**
     * 设置contactInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInformationV1 }
     *     
     */
    public void setContactInformation(ContactInformationV1 value) {
        this.contactInformation = value;
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
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取jobTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * 设置jobTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * 获取department属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置department属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartment(String value) {
        this.department = value;
    }

    /**
     * Gets the value of the specifications property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifications property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifications().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerContactSpecificationV1 }
     * 
     * 
     */
    public List<CustomerContactSpecificationV1> getSpecifications() {
        if (specifications == null) {
            specifications = new ArrayList<CustomerContactSpecificationV1>();
        }
        return this.specifications;
    }

}
