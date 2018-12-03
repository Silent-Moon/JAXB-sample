//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about the zip code and post code.
 * 
 * <p>PostalCode_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PostalCode_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://com.oocl.schema.common}ID_String_V1"/>
 *         &lt;element name="Code" type="{http://com.oocl.schema.common}ZIP_Code_V1"/>
 *         &lt;element name="IsDefault" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GeographicLocationType" type="{http://com.oocl.schema.common}GeoLocationType_V1" minOccurs="0"/>
 *         &lt;element name="LocationInformation" type="{http://com.oocl.schema.common}BasicLocationInformation_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostalCode_V1", propOrder = {
    "id",
    "code",
    "isDefault",
    "sequenceNumber",
    "geographicLocationType",
    "locationInformation"
})
public class PostalCodeV1 {

    @XmlElement(name = "ID", required = true)
    protected String id;
    @XmlElement(name = "Code", required = true)
    protected String code;
    @XmlElement(name = "IsDefault")
    protected Boolean isDefault;
    @XmlElement(name = "SequenceNumber")
    protected BigInteger sequenceNumber;
    @XmlElement(name = "GeographicLocationType")
    @XmlSchemaType(name = "string")
    protected GeoLocationTypeV1 geographicLocationType;
    @XmlElement(name = "LocationInformation")
    protected BasicLocationInformationV1 locationInformation;

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

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
     * 获取isDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsDefault() {
        return isDefault;
    }

    /**
     * 设置isDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsDefault(Boolean value) {
        this.isDefault = value;
    }

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
    }

    /**
     * 获取geographicLocationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GeoLocationTypeV1 }
     *     
     */
    public GeoLocationTypeV1 getGeographicLocationType() {
        return geographicLocationType;
    }

    /**
     * 设置geographicLocationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GeoLocationTypeV1 }
     *     
     */
    public void setGeographicLocationType(GeoLocationTypeV1 value) {
        this.geographicLocationType = value;
    }

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

}
