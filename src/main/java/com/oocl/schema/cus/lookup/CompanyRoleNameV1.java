//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompanyRoleName_V1的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyRoleName_V1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CargoControlParty"/>
 *     &lt;enumeration value="Consignee"/>
 *     &lt;enumeration value="Forwarder"/>
 *     &lt;enumeration value="NotifyParty"/>
 *     &lt;enumeration value="Shipper"/>
 *     &lt;enumeration value="SignatureParty"/>
 *     &lt;enumeration value="Associate"/>
 *     &lt;enumeration value="Broker"/>
 *     &lt;enumeration value="FreightPayer"/>
 *     &lt;enumeration value="ShipmentControlParty"/>
 *     &lt;enumeration value="BookingParty"/>
 *     &lt;enumeration value="ActualConsignee"/>
 *     &lt;enumeration value="FirstNotify"/>
 *     &lt;enumeration value="SecondNotify"/>
 *     &lt;enumeration value="Affliate"/>
 *     &lt;enumeration value="ShipToParty"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyRoleName_V1")
@XmlEnum
public enum CompanyRoleNameV1 {

    @XmlEnumValue("CargoControlParty")
    CARGO_CONTROL_PARTY("CargoControlParty"),
    @XmlEnumValue("Consignee")
    CONSIGNEE("Consignee"),
    @XmlEnumValue("Forwarder")
    FORWARDER("Forwarder"),
    @XmlEnumValue("NotifyParty")
    NOTIFY_PARTY("NotifyParty"),
    @XmlEnumValue("Shipper")
    SHIPPER("Shipper"),
    @XmlEnumValue("SignatureParty")
    SIGNATURE_PARTY("SignatureParty"),
    @XmlEnumValue("Associate")
    ASSOCIATE("Associate"),
    @XmlEnumValue("Broker")
    BROKER("Broker"),
    @XmlEnumValue("FreightPayer")
    FREIGHT_PAYER("FreightPayer"),
    @XmlEnumValue("ShipmentControlParty")
    SHIPMENT_CONTROL_PARTY("ShipmentControlParty"),
    @XmlEnumValue("BookingParty")
    BOOKING_PARTY("BookingParty"),
    @XmlEnumValue("ActualConsignee")
    ACTUAL_CONSIGNEE("ActualConsignee"),
    @XmlEnumValue("FirstNotify")
    FIRST_NOTIFY("FirstNotify"),
    @XmlEnumValue("SecondNotify")
    SECOND_NOTIFY("SecondNotify"),
    @XmlEnumValue("Affliate")
    AFFLIATE("Affliate"),
    @XmlEnumValue("ShipToParty")
    SHIP_TO_PARTY("ShipToParty");
    private final String value;

    CompanyRoleNameV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyRoleNameV1 fromValue(String v) {
        for (CompanyRoleNameV1 c: CompanyRoleNameV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
