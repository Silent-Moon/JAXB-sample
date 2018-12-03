//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerContactSpecification_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerContactSpecification_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ContactSpecUUID" type="{http://com.oocl.schema.common}UUID_V1" minOccurs="0"/>
 *         &lt;element name="ContactUUID" type="{http://com.oocl.schema.common}UUID_V1" minOccurs="0"/>
 *         &lt;element name="Role" type="{http://com.oocl.schema.customer}CustomerContactRoleType_V1" minOccurs="0"/>
 *         &lt;element name="SAP_ID" type="{http://com.oocl.schema.common}SAP_ID_V1" minOccurs="0"/>
 *         &lt;element name="TradeCode" type="{http://com.oocl.schema.tnm}TradeCode_V1" minOccurs="0"/>
 *         &lt;element name="TradeLaneCode" type="{http://com.oocl.schema.tnm}TradeLaneCode_V1" minOccurs="0"/>
 *         &lt;element name="ServiceLoopCode" type="{http://com.oocl.schema.common}ServiceLoopCode_V1" minOccurs="0"/>
 *         &lt;element name="ShipmentBoundCode" type="{http://com.oocl.schema.common}ShipmentBoundCode_V1" minOccurs="0"/>
 *         &lt;element name="CommodityGroupCode" type="{http://com.oocl.schema.common}CommodityGroupAlphaCode_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerContactSpecification_V1", namespace = "http://com.oocl.schema.customer", propOrder = {
    "contactSpecUUID",
    "contactUUID",
    "role",
    "sapid",
    "tradeCode",
    "tradeLaneCode",
    "serviceLoopCode",
    "shipmentBoundCode",
    "commodityGroupCode"
})
public class CustomerContactSpecificationV1 {

    @XmlElement(name = "ContactSpecUUID")
    protected String contactSpecUUID;
    @XmlElement(name = "ContactUUID")
    protected String contactUUID;
    @XmlElement(name = "Role")
    @XmlSchemaType(name = "string")
    protected CustomerContactRoleTypeV1 role;
    @XmlElement(name = "SAP_ID")
    protected String sapid;
    @XmlElement(name = "TradeCode")
    protected String tradeCode;
    @XmlElement(name = "TradeLaneCode")
    protected String tradeLaneCode;
    @XmlElement(name = "ServiceLoopCode")
    protected String serviceLoopCode;
    @XmlElementRef(name = "ShipmentBoundCode", namespace = "http://com.oocl.schema.customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ShipmentBoundCodeV1> shipmentBoundCode;
    @XmlElement(name = "CommodityGroupCode")
    protected String commodityGroupCode;

    /**
     * 获取contactSpecUUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactSpecUUID() {
        return contactSpecUUID;
    }

    /**
     * 设置contactSpecUUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactSpecUUID(String value) {
        this.contactSpecUUID = value;
    }

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
     * 获取role属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerContactRoleTypeV1 }
     *     
     */
    public CustomerContactRoleTypeV1 getRole() {
        return role;
    }

    /**
     * 设置role属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerContactRoleTypeV1 }
     *     
     */
    public void setRole(CustomerContactRoleTypeV1 value) {
        this.role = value;
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
     * 获取tradeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeCode() {
        return tradeCode;
    }

    /**
     * 设置tradeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeCode(String value) {
        this.tradeCode = value;
    }

    /**
     * 获取tradeLaneCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeLaneCode() {
        return tradeLaneCode;
    }

    /**
     * 设置tradeLaneCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeLaneCode(String value) {
        this.tradeLaneCode = value;
    }

    /**
     * 获取serviceLoopCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceLoopCode() {
        return serviceLoopCode;
    }

    /**
     * 设置serviceLoopCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceLoopCode(String value) {
        this.serviceLoopCode = value;
    }

    /**
     * 获取shipmentBoundCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ShipmentBoundCodeV1 }{@code >}
     *     
     */
    public JAXBElement<ShipmentBoundCodeV1> getShipmentBoundCode() {
        return shipmentBoundCode;
    }

    /**
     * 设置shipmentBoundCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ShipmentBoundCodeV1 }{@code >}
     *     
     */
    public void setShipmentBoundCode(JAXBElement<ShipmentBoundCodeV1> value) {
        this.shipmentBoundCode = value;
    }

    /**
     * 获取commodityGroupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCommodityGroupCode() {
        return commodityGroupCode;
    }

    /**
     * 设置commodityGroupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCommodityGroupCode(String value) {
        this.commodityGroupCode = value;
    }

}
