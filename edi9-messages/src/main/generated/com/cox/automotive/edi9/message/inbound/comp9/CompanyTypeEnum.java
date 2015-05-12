//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.comp9;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for null.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType>
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Sole Proprietorship"/>
 *     &lt;enumeration value="General Partnership"/>
 *     &lt;enumeration value="Limited Partnership"/>
 *     &lt;enumeration value="Sub C Corporation"/>
 *     &lt;enumeration value="Sub S Corporation"/>
 *     &lt;enumeration value="LLC-Sole"/>
 *     &lt;enumeration value="LLC-Partnership"/>
 *     &lt;enumeration value="LLC-Corporation"/>
 *     &lt;enumeration value="Business Corporation"/>
 *     &lt;enumeration value="Limited Liability Company"/>
 *     &lt;enumeration value="Unlimited Liability Corporation"/>
 *     &lt;enumeration value="Government Agency"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum CompanyTypeEnum {

    @XmlEnumValue("Sole Proprietorship")
    SOLE_PROPRIETORSHIP("Sole Proprietorship"),
    @XmlEnumValue("General Partnership")
    GENERAL_PARTNERSHIP("General Partnership"),
    @XmlEnumValue("Limited Partnership")
    LIMITED_PARTNERSHIP("Limited Partnership"),
    @XmlEnumValue("Sub C Corporation")
    SUB_C_CORPORATION("Sub C Corporation"),
    @XmlEnumValue("Sub S Corporation")
    SUB_S_CORPORATION("Sub S Corporation"),
    @XmlEnumValue("LLC-Sole")
    LLC_SOLE("LLC-Sole"),
    @XmlEnumValue("LLC-Partnership")
    LLC_PARTNERSHIP("LLC-Partnership"),
    @XmlEnumValue("LLC-Corporation")
    LLC_CORPORATION("LLC-Corporation"),
    @XmlEnumValue("Business Corporation")
    BUSINESS_CORPORATION("Business Corporation"),
    @XmlEnumValue("Limited Liability Company")
    LIMITED_LIABILITY_COMPANY("Limited Liability Company"),
    @XmlEnumValue("Unlimited Liability Corporation")
    UNLIMITED_LIABILITY_CORPORATION("Unlimited Liability Corporation"),
    @XmlEnumValue("Government Agency")
    GOVERNMENT_AGENCY("Government Agency");
    private final String value;

    CompanyTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompanyTypeEnum fromValue(String v) {
        for (CompanyTypeEnum c: CompanyTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}