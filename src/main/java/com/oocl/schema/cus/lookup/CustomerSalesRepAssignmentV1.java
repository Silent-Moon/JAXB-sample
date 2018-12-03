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
import javax.xml.bind.annotation.XmlType;


/**
 * 
 * 			This is a type that defines the sales representative-to-customer mapping and the scope that the sales representative covers with regards to helping customers with their shipments with OOCL.
 * 			
 * 
 * <p>CustomerSalesRepAssignment_V1 complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomerSalesRepAssignment_V1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SalesRepAssignmentUUID" type="{http://com.oocl.schema.common}UUID_V1" minOccurs="0"/>
 *         &lt;element name="Representative" type="{http://com.oocl.schema.common}SalesRepresentative_V1" minOccurs="0"/>
 *         &lt;element name="SAP_ID" type="{http://com.oocl.schema.common}SAP_ID_V1" minOccurs="0"/>
 *         &lt;element name="TradeCode" type="{http://com.oocl.schema.tnm}TradeCode_V1" minOccurs="0"/>
 *         &lt;element name="TradeLaneCode" type="{http://com.oocl.schema.tnm}TradeLaneCode_V1" minOccurs="0"/>
 *         &lt;element name="ShipmentBoundCode" type="{http://com.oocl.schema.common}ShipmentBoundCode_V1" minOccurs="0"/>
 *         &lt;element name="ServiceLoopCode" type="{http://com.oocl.schema.common}ServiceLoopCode_V1" minOccurs="0"/>
 *         &lt;element name="CommodityGroupCode" type="{http://com.oocl.schema.common}CommodityGroupAlphaCode_V1" minOccurs="0"/>
 *         &lt;element name="IsPrimaryResponsible" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DefaultSalesMerit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesMerit" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CargoNatureGroupType" type="{http://com.oocl.schema.common}CargoNatureGroupType_V1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerSalesRepAssignment_V1", namespace = "http://com.oocl.schema.customer", propOrder = {
    "salesRepAssignmentUUID",
    "representative",
    "sapid",
    "tradeCode",
    "tradeLaneCode",
    "shipmentBoundCode",
    "serviceLoopCode",
    "commodityGroupCode",
    "isPrimaryResponsible",
    "defaultSalesMerit",
    "salesMerit",
    "cargoNatureGroupType"
})
public class CustomerSalesRepAssignmentV1 {

    @XmlElement(name = "SalesRepAssignmentUUID")
    protected String salesRepAssignmentUUID;
    @XmlElement(name = "Representative")
    protected SalesRepresentativeV1 representative;
    @XmlElement(name = "SAP_ID")
    protected String sapid;
    @XmlElement(name = "TradeCode")
    protected String tradeCode;
    @XmlElement(name = "TradeLaneCode")
    protected String tradeLaneCode;
    @XmlElementRef(name = "ShipmentBoundCode", namespace = "http://com.oocl.schema.customer", type = JAXBElement.class, required = false)
    protected JAXBElement<ShipmentBoundCodeV1> shipmentBoundCode;
    @XmlElement(name = "ServiceLoopCode")
    protected String serviceLoopCode;
    @XmlElement(name = "CommodityGroupCode")
    protected String commodityGroupCode;
    @XmlElement(name = "IsPrimaryResponsible")
    protected Boolean isPrimaryResponsible;
    @XmlElement(name = "DefaultSalesMerit")
    protected String defaultSalesMerit;
    @XmlElement(name = "SalesMerit")
    protected String salesMerit;
    @XmlElementRef(name = "CargoNatureGroupType", namespace = "http://com.oocl.schema.customer", type = JAXBElement.class, required = false)
    protected JAXBElement<CargoNatureGroupTypeV1> cargoNatureGroupType;

    /**
     * 获取salesRepAssignmentUUID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesRepAssignmentUUID() {
        return salesRepAssignmentUUID;
    }

    /**
     * 设置salesRepAssignmentUUID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesRepAssignmentUUID(String value) {
        this.salesRepAssignmentUUID = value;
    }

    /**
     * 获取representative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SalesRepresentativeV1 }
     *     
     */
    public SalesRepresentativeV1 getRepresentative() {
        return representative;
    }

    /**
     * 设置representative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SalesRepresentativeV1 }
     *     
     */
    public void setRepresentative(SalesRepresentativeV1 value) {
        this.representative = value;
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

    /**
     * 获取isPrimaryResponsible属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPrimaryResponsible() {
        return isPrimaryResponsible;
    }

    /**
     * 设置isPrimaryResponsible属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPrimaryResponsible(Boolean value) {
        this.isPrimaryResponsible = value;
    }

    /**
     * 获取defaultSalesMerit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultSalesMerit() {
        return defaultSalesMerit;
    }

    /**
     * 设置defaultSalesMerit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultSalesMerit(String value) {
        this.defaultSalesMerit = value;
    }

    /**
     * 获取salesMerit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesMerit() {
        return salesMerit;
    }

    /**
     * 设置salesMerit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesMerit(String value) {
        this.salesMerit = value;
    }

    /**
     * 获取cargoNatureGroupType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link CargoNatureGroupTypeV1 }{@code >}
     *     
     */
    public JAXBElement<CargoNatureGroupTypeV1> getCargoNatureGroupType() {
        return cargoNatureGroupType;
    }

    /**
     * 设置cargoNatureGroupType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link CargoNatureGroupTypeV1 }{@code >}
     *     
     */
    public void setCargoNatureGroupType(JAXBElement<CargoNatureGroupTypeV1> value) {
        this.cargoNatureGroupType = value;
    }

}
