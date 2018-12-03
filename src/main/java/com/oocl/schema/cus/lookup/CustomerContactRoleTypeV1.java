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
 * <p>CustomerContactRoleType_V1的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CustomerContactRoleType_V1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;maxLength value="20"/>
 *     &lt;enumeration value="Accounting"/>
 *     &lt;enumeration value="Booking"/>
 *     &lt;enumeration value="Booking_CS"/>
 *     &lt;enumeration value="Documentation"/>
 *     &lt;enumeration value="General"/>
 *     &lt;enumeration value="Operations"/>
 *     &lt;enumeration value="Pricing"/>
 *     &lt;enumeration value="Sales"/>
 *     &lt;enumeration value="Sales_SMM"/>
 *     &lt;enumeration value="Warehouse"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CustomerContactRoleType_V1", namespace = "http://com.oocl.schema.customer")
@XmlEnum
public enum CustomerContactRoleTypeV1 {

    @XmlEnumValue("Accounting")
    ACCOUNTING("Accounting"),
    @XmlEnumValue("Booking")
    BOOKING("Booking"),
    @XmlEnumValue("Booking_CS")
    BOOKING_CS("Booking_CS"),
    @XmlEnumValue("Documentation")
    DOCUMENTATION("Documentation"),
    @XmlEnumValue("General")
    GENERAL("General"),
    @XmlEnumValue("Operations")
    OPERATIONS("Operations"),
    @XmlEnumValue("Pricing")
    PRICING("Pricing"),
    @XmlEnumValue("Sales")
    SALES("Sales"),
    @XmlEnumValue("Sales_SMM")
    SALES_SMM("Sales_SMM"),
    @XmlEnumValue("Warehouse")
    WAREHOUSE("Warehouse");
    private final String value;

    CustomerContactRoleTypeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CustomerContactRoleTypeV1 fromValue(String v) {
        for (CustomerContactRoleTypeV1 c: CustomerContactRoleTypeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
