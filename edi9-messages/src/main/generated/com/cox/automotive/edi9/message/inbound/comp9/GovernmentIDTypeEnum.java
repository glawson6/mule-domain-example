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
 *     &lt;enumeration value="GovtPersonalID"/>
 *     &lt;enumeration value="GovtID"/>
 *     &lt;enumeration value="Passport"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "")
@XmlEnum
public enum GovernmentIDTypeEnum {

    @XmlEnumValue("GovtPersonalID")
    GOVT_PERSONAL_ID("GovtPersonalID"),
    @XmlEnumValue("GovtID")
    GOVT_ID("GovtID"),
    @XmlEnumValue("Passport")
    PASSPORT("Passport");
    private final String value;

    GovernmentIDTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static GovernmentIDTypeEnum fromValue(String v) {
        for (GovernmentIDTypeEnum c: GovernmentIDTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}