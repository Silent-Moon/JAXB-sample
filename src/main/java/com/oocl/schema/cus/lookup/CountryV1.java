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
 * Information about a country.
 * 
 * <p>Country_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="Country_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CountryInformation" type="{http://com.oocl.schema.common}BasicLocationInformation_V1" minOccurs="0"/>
 *         &lt;element name="Continent" type="{http://com.oocl.schema.common}Continent_V1" minOccurs="0"/>
 *         &lt;element name="Currency" type="{http://com.oocl.schema.common}EntityCode_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Country_V1", propOrder = {
    "countryInformation",
    "continent",
    "currency"
})
public class CountryV1 {

    @XmlElement(name = "CountryInformation")
    protected BasicLocationInformationV1 countryInformation;
    @XmlElement(name = "Continent")
    protected ContinentV1 continent;
    @XmlElement(name = "Currency")
    protected String currency;

    /**
     * 获取countryInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public BasicLocationInformationV1 getCountryInformation() {
        return countryInformation;
    }

    /**
     * 设置countryInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BasicLocationInformationV1 }
     *     
     */
    public void setCountryInformation(BasicLocationInformationV1 value) {
        this.countryInformation = value;
    }

    /**
     * 获取continent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContinentV1 }
     *     
     */
    public ContinentV1 getContinent() {
        return continent;
    }

    /**
     * 设置continent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContinentV1 }
     *     
     */
    public void setContinent(ContinentV1 value) {
        this.continent = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

}
