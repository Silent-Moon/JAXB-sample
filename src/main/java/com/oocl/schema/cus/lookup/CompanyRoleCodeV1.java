//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2018.12.03 时间 08:57:04 PM CST 
//


package com.oocl.schema.cus.lookup;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompanyRoleCode_V1的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CompanyRoleCode_V1">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="CCP"/>
 *     &lt;enumeration value="CON"/>
 *     &lt;enumeration value="FOR"/>
 *     &lt;enumeration value="NOT"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SIG"/>
 *     &lt;enumeration value="ASC"/>
 *     &lt;enumeration value="BRO"/>
 *     &lt;enumeration value="FRE"/>
 *     &lt;enumeration value="SCP"/>
 *     &lt;enumeration value="BKP"/>
 *     &lt;enumeration value="ACN"/>
 *     &lt;enumeration value="FNP"/>
 *     &lt;enumeration value="SNP"/>
 *     &lt;enumeration value="AFF"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompanyRoleCode_V1")
@XmlEnum
public enum CompanyRoleCodeV1 {


    /**
     * Cargo Control Party
     * 
     */
    CCP,

    /**
     * Consignee
     * 
     */
    CON,

    /**
     * Forwarder
     * 
     */
    FOR,

    /**
     * Notify Party
     * 
     */
    NOT,

    /**
     * Shipper
     * 
     */
    SHP,

    /**
     * Signature Party
     * 
     */
    SIG,

    /**
     * Associate
     * 
     */
    ASC,

    /**
     * Broker
     * 
     */
    BRO,

    /**
     * Freight Payer
     * 
     */
    FRE,

    /**
     * Shipment Control Party
     * 
     */
    SCP,

    /**
     * Booking Party
     * 
     */
    BKP,

    /**
     * Actual Consignee
     * 
     */
    ACN,

    /**
     * First Notify
     * 
     */
    FNP,

    /**
     * Second Notify
     * 
     */
    SNP,

    /**
     * Affliate
     * 
     */
    AFF;

    public String value() {
        return name();
    }

    public static CompanyRoleCodeV1 fromValue(String v) {
        return valueOf(v);
    }

}
