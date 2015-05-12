//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.con9;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}ContactType"/>
 *         &lt;element ref="{}ContactLocation"/>
 *         &lt;element ref="{}ContactValue"/>
 *         &lt;element ref="{}ContactVisibility"/>
 *         &lt;element ref="{}ContactRank" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "contactType",
    "contactLocation",
    "contactValue",
    "contactVisibility",
    "contactRank"
})
@XmlRootElement(name = "ContactInformation")
public class ContactInformation
    implements Serializable
{

    @XmlElement(name = "ContactType", required = true)
    protected ContactTypeEnum contactType;
    @XmlElement(name = "ContactLocation", required = true)
    protected ContactLocationEnum contactLocation;
    @XmlElement(name = "ContactValue", required = true)
    protected String contactValue;
    @XmlElement(name = "ContactVisibility", required = true)
    protected String contactVisibility;
    @XmlElement(name = "ContactRank")
    protected Integer contactRank;

    /**
     * Gets the value of the contactType property.
     * 
     * @return
     *     possible object is
     *     {@link ContactTypeEnum }
     *     
     */
    public ContactTypeEnum getContactType() {
        return contactType;
    }

    /**
     * Sets the value of the contactType property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactTypeEnum }
     *     
     */
    public void setContactType(ContactTypeEnum value) {
        this.contactType = value;
    }

    public boolean isSetContactType() {
        return (this.contactType!= null);
    }

    /**
     * Gets the value of the contactLocation property.
     * 
     * @return
     *     possible object is
     *     {@link ContactLocationEnum }
     *     
     */
    public ContactLocationEnum getContactLocation() {
        return contactLocation;
    }

    /**
     * Sets the value of the contactLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactLocationEnum }
     *     
     */
    public void setContactLocation(ContactLocationEnum value) {
        this.contactLocation = value;
    }

    public boolean isSetContactLocation() {
        return (this.contactLocation!= null);
    }

    /**
     * Gets the value of the contactValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactValue() {
        return contactValue;
    }

    /**
     * Sets the value of the contactValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactValue(String value) {
        this.contactValue = value;
    }

    public boolean isSetContactValue() {
        return (this.contactValue!= null);
    }

    /**
     * Gets the value of the contactVisibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactVisibility() {
        return contactVisibility;
    }

    /**
     * Sets the value of the contactVisibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactVisibility(String value) {
        this.contactVisibility = value;
    }

    public boolean isSetContactVisibility() {
        return (this.contactVisibility!= null);
    }

    /**
     * Gets the value of the contactRank property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContactRank() {
        return contactRank;
    }

    /**
     * Sets the value of the contactRank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContactRank(Integer value) {
        this.contactRank = value;
    }

    public boolean isSetContactRank() {
        return (this.contactRank!= null);
    }

}
