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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Information about a city, district or suburb.
 * 
 * <p>CityLevel_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CityLevel_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GeographicLocationType" type="{http://com.oocl.schema.common}GeoLocationType_V1" minOccurs="0"/>
 *         &lt;element name="LocationInformation" type="{http://com.oocl.schema.common}BasicLocationInformation_V1" minOccurs="0"/>
 *         &lt;element name="CountryDivision" type="{http://com.oocl.schema.common}CountryDivision_V1" minOccurs="0"/>
 *         &lt;element name="PostalCode" type="{http://com.oocl.schema.common}ZIP_Code_V1" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CityLevel_V1", propOrder = {
    "geographicLocationType",
    "locationInformation",
    "countryDivision",
    "postalCode"
})
public class CityLevelV1 {

    @XmlElement(name = "GeographicLocationType")
    @XmlSchemaType(name = "string")
    protected GeoLocationTypeV1 geographicLocationType;
    @XmlElement(name = "LocationInformation")
    protected BasicLocationInformationV1 locationInformation;
    @XmlElement(name = "CountryDivision")
    protected CountryDivisionV1 countryDivision;
    @XmlElement(name = "PostalCode")
    protected List<String> postalCode;

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

    /**
     * 获取countryDivision属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CountryDivisionV1 }
     *     
     */
    public CountryDivisionV1 getCountryDivision() {
        return countryDivision;
    }

    /**
     * 设置countryDivision属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CountryDivisionV1 }
     *     
     */
    public void setCountryDivision(CountryDivisionV1 value) {
        this.countryDivision = value;
    }

    /**
     * Gets the value of the postalCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the postalCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPostalCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPostalCode() {
        if (postalCode == null) {
            postalCode = new ArrayList<String>();
        }
        return this.postalCode;
    }

}
