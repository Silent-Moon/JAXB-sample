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
 * <p>FacilityType_V1的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="FacilityType_V1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CustomerSite"/>
 *     &lt;enumeration value="Depot"/>
 *     &lt;enumeration value="RailRamp"/>
 *     &lt;enumeration value="Terminal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacilityType_V1")
@XmlEnum
public enum FacilityTypeV1 {

    @XmlEnumValue("CustomerSite")
    CUSTOMER_SITE("CustomerSite"),
    @XmlEnumValue("Depot")
    DEPOT("Depot"),
    @XmlEnumValue("RailRamp")
    RAIL_RAMP("RailRamp"),
    @XmlEnumValue("Terminal")
    TERMINAL("Terminal");
    private final String value;

    FacilityTypeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FacilityTypeV1 fromValue(String v) {
        for (FacilityTypeV1 c: FacilityTypeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
