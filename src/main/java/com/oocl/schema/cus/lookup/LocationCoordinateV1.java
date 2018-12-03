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
 * Information about a physical geographical location.
 * 
 * <p>LocationCoordinate_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationCoordinate_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="LatitudeDegreesMeasure" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://com.oocl.schema.common}EntityBriefName_V1">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="LongitudeDegreesMeasure" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://com.oocl.schema.common}EntityBriefName_V1">
 *               &lt;maxLength value="15"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationCoordinate_V1", propOrder = {
    "latitudeDegreesMeasure",
    "longitudeDegreesMeasure"
})
public class LocationCoordinateV1 {

    @XmlElement(name = "LatitudeDegreesMeasure")
    protected String latitudeDegreesMeasure;
    @XmlElement(name = "LongitudeDegreesMeasure")
    protected String longitudeDegreesMeasure;

    /**
     * 获取latitudeDegreesMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitudeDegreesMeasure() {
        return latitudeDegreesMeasure;
    }

    /**
     * 设置latitudeDegreesMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitudeDegreesMeasure(String value) {
        this.latitudeDegreesMeasure = value;
    }

    /**
     * 获取longitudeDegreesMeasure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitudeDegreesMeasure() {
        return longitudeDegreesMeasure;
    }

    /**
     * 设置longitudeDegreesMeasure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitudeDegreesMeasure(String value) {
        this.longitudeDegreesMeasure = value;
    }

}
