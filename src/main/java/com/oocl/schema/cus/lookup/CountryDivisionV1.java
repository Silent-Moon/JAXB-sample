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
 * Information about a country subentity. A territorial division of a country.
 * 
 * <p>CountryDivision_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CountryDivision_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryDivisionInformation" type="{http://com.oocl.schema.common}BasicLocationInformation_V1" minOccurs="0"/>
 *         &lt;element name="TimezoneName" type="{http://com.oocl.schema.common}EntityBriefName_V1" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://com.oocl.schema.common}Country_V1" minOccurs="0"/>
 *         &lt;element name="ParentDivisionInformation" type="{http://com.oocl.schema.common}BasicLocationInformation_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CountryDivision_V1", propOrder = {
    "countryDivisionInformation",
    "timezoneName",
    "country",
    "parentDivisionInformation"
})
public class CountryDivisionV1 {

    @XmlElement(name = "CountryDivisionInformation")
    protected BasicLocationInformationV1 countryDivisionInformation;
    @XmlElement(name = "TimezoneName")
    protected String timezoneName;
    @XmlElement(name = "Country")
    protected CountryV1 country;
    @XmlElement(name = "ParentDivisionInformation")
    protected BasicLocationInformationV1 parentDivisionInformation;

    /**
     * 获取countryDivisionInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public BasicLocationInformationV1 getCountryDivisionInformation() {
        return countryDivisionInformation;
    }

    /**
     * 设置countryDivisionInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public void setCountryDivisionInformation(BasicLocationInformationV1 value) {
        this.countryDivisionInformation = value;
    }

    /**
     * 获取timezoneName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezoneName() {
        return timezoneName;
    }

    /**
     * 设置timezoneName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezoneName(String value) {
        this.timezoneName = value;
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
     * 获取parentDivisionInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public BasicLocationInformationV1 getParentDivisionInformation() {
        return parentDivisionInformation;
    }

    /**
     * 设置parentDivisionInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public void setParentDivisionInformation(BasicLocationInformationV1 value) {
        this.parentDivisionInformation = value;
    }

}
