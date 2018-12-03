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
 * <p>CargoNatureGroupType_V1的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CargoNatureGroupType_V1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Reefer"/>
 *     &lt;enumeration value="Dry"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CargoNatureGroupType_V1")
@XmlEnum
public enum CargoNatureGroupTypeV1 {


    /**
     * Reefer Cargo Nature group
     * 
     */
    @XmlEnumValue("Reefer")
    REEFER("Reefer"),

    /**
     * Dry Cargo Nature Group
     * 
     */
    @XmlEnumValue("Dry")
    DRY("Dry");
    private final String value;

    CargoNatureGroupTypeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CargoNatureGroupTypeV1 fromValue(String v) {
        for (CargoNatureGroupTypeV1 c: CargoNatureGroupTypeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
