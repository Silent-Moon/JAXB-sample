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
 * <p>GeoLocationType_V1的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="GeoLocationType_V1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AutonomousCommunity"/>
 *     &lt;enumeration value="Canton"/>
 *     &lt;enumeration value="City"/>
 *     &lt;enumeration value="CityDistrict"/>
 *     &lt;enumeration value="CityDistrictSuburb"/>
 *     &lt;enumeration value="Country"/>
 *     &lt;enumeration value="County"/>
 *     &lt;enumeration value="Department"/>
 *     &lt;enumeration value="District"/>
 *     &lt;enumeration value="Emirate"/>
 *     &lt;enumeration value="Facility"/>
 *     &lt;enumeration value="Governorate"/>
 *     &lt;enumeration value="Island"/>
 *     &lt;enumeration value="Municipality"/>
 *     &lt;enumeration value="NationState"/>
 *     &lt;enumeration value="Parish"/>
 *     &lt;enumeration value="Port"/>
 *     &lt;enumeration value="Prefecture"/>
 *     &lt;enumeration value="Province"/>
 *     &lt;enumeration value="Region"/>
 *     &lt;enumeration value="State"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "GeoLocationType_V1")
@XmlEnum
public enum GeoLocationTypeV1 {

    @XmlEnumValue("AutonomousCommunity")
    AUTONOMOUS_COMMUNITY("AutonomousCommunity"),
    @XmlEnumValue("Canton")
    CANTON("Canton"),
    @XmlEnumValue("City")
    CITY("City"),
    @XmlEnumValue("CityDistrict")
    CITY_DISTRICT("CityDistrict"),
    @XmlEnumValue("CityDistrictSuburb")
    CITY_DISTRICT_SUBURB("CityDistrictSuburb"),
    @XmlEnumValue("Country")
    COUNTRY("Country"),
    @XmlEnumValue("County")
    COUNTY("County"),
    @XmlEnumValue("Department")
    DEPARTMENT("Department"),
    @XmlEnumValue("District")
    DISTRICT("District"),
    @XmlEnumValue("Emirate")
    EMIRATE("Emirate"),
    @XmlEnumValue("Facility")
    FACILITY("Facility"),
    @XmlEnumValue("Governorate")
    GOVERNORATE("Governorate"),
    @XmlEnumValue("Island")
    ISLAND("Island"),
    @XmlEnumValue("Municipality")
    MUNICIPALITY("Municipality"),
    @XmlEnumValue("NationState")
    NATION_STATE("NationState"),
    @XmlEnumValue("Parish")
    PARISH("Parish"),
    @XmlEnumValue("Port")
    PORT("Port"),
    @XmlEnumValue("Prefecture")
    PREFECTURE("Prefecture"),
    @XmlEnumValue("Province")
    PROVINCE("Province"),
    @XmlEnumValue("Region")
    REGION("Region"),
    @XmlEnumValue("State")
    STATE("State");
    private final String value;

    GeoLocationTypeV1(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GeoLocationTypeV1 fromValue(String v) {
        for (GeoLocationTypeV1 c: GeoLocationTypeV1 .values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
