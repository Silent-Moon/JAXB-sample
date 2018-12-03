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
 * Information about the shipping info of a location.
 * 
 * <p>LocationShippingAttribute_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="LocationShippingAttribute_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IsShippingPoint" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsContainerYard" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsDoor" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LocationShippingAttribute_V1", propOrder = {
    "isShippingPoint",
    "isContainerYard",
    "isDoor"
})
public class LocationShippingAttributeV1 {

    @XmlElement(name = "IsShippingPoint")
    protected boolean isShippingPoint;
    @XmlElement(name = "IsContainerYard")
    protected boolean isContainerYard;
    @XmlElement(name = "IsDoor")
    protected boolean isDoor;

    /**
     * 获取isShippingPoint属性的值。
     * 
     */
    public boolean isIsShippingPoint() {
        return isShippingPoint;
    }

    /**
     * 设置isShippingPoint属性的值。
     * 
     */
    public void setIsShippingPoint(boolean value) {
        this.isShippingPoint = value;
    }

    /**
     * 获取isContainerYard属性的值。
     * 
     */
    public boolean isIsContainerYard() {
        return isContainerYard;
    }

    /**
     * 设置isContainerYard属性的值。
     * 
     */
    public void setIsContainerYard(boolean value) {
        this.isContainerYard = value;
    }

    /**
     * 获取isDoor属性的值。
     * 
     */
    public boolean isIsDoor() {
        return isDoor;
    }

    /**
     * 设置isDoor属性的值。
     * 
     */
    public void setIsDoor(boolean value) {
        this.isDoor = value;
    }

}
