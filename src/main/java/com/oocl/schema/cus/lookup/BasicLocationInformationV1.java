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
 * Information about the basic information of a location.
 * 
 * <p>BasicLocationInformation_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BasicLocationInformation_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type" type="{http://com.oocl.schema.common}GeoLocationTypeString_V1" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://com.oocl.schema.common}ID_LongNumeric_V1" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://com.oocl.schema.common}UUID_V1" minOccurs="0"/>
 *         &lt;element name="Code" type="{http://com.oocl.schema.common}LocationCode_V1" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://com.oocl.schema.common}LocationName_V1" minOccurs="0"/>
 *         &lt;element name="ParentID" type="{http://com.oocl.schema.common}ID_LongNumeric_V1" minOccurs="0"/>
 *         &lt;element name="IsActive" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BasicLocationInformation_V1", propOrder = {
    "type",
    "id",
    "uuid",
    "code",
    "name",
    "parentID",
    "isActive"
})
public class BasicLocationInformationV1 {

    @XmlElement(name = "Type")
    protected String type;
    @XmlElement(name = "ID")
    protected Long id;
    @XmlElement(name = "UUID")
    protected String uuid;
    @XmlElement(name = "Code")
    protected LocationCodeV1 code;
    @XmlElement(name = "Name")
    protected LocationNameV1 name;
    @XmlElement(name = "ParentID")
    protected Long parentID;
    @XmlElement(name = "IsActive")
    protected Boolean isActive;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setID(Long value) {
        this.id = value;
    }

    /**
     * 获取uuid属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUUID() {
        return uuid;
    }

    /**
     * 设置uuid属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUUID(String value) {
        this.uuid = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationCodeV1 }
     *     
     */
    public LocationCodeV1 getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationCodeV1 }
     *     
     */
    public void setCode(LocationCodeV1 value) {
        this.code = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationNameV1 }
     *     
     */
    public LocationNameV1 getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationNameV1 }
     *     
     */
    public void setName(LocationNameV1 value) {
        this.name = value;
    }

    /**
     * 获取parentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getParentID() {
        return parentID;
    }

    /**
     * 设置parentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setParentID(Long value) {
        this.parentID = value;
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

}
