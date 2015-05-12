//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.outbound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Type for conveying System Keys between CDH and spoke systems.
 * 
 * <p>Java class for SystemKeysType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SystemKeysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AA" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *         &lt;element name="CDH" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *         &lt;element name="EBS" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *         &lt;element name="MSC" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *         &lt;element name="Vicki" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *         &lt;element name="OVC" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *         &lt;element name="SalesForce" type="{http://www.manheim.com/2009/01/CustSchema}KeyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SystemKeysType", propOrder = {
    "aa",
    "cdh",
    "ebs",
    "msc",
    "vicki",
    "ovc",
    "salesForce"
})
public class SystemKeysType {

    @XmlElement(name = "AA")
    protected KeyType aa;
    @XmlElement(name = "CDH")
    protected KeyType cdh;
    @XmlElement(name = "EBS")
    protected KeyType ebs;
    @XmlElement(name = "MSC")
    protected KeyType msc;
    @XmlElement(name = "Vicki")
    protected KeyType vicki;
    @XmlElement(name = "OVC")
    protected KeyType ovc;
    @XmlElement(name = "SalesForce")
    protected KeyType salesForce;

    /**
     * Gets the value of the aa property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getAA() {
        return aa;
    }

    /**
     * Sets the value of the aa property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setAA(KeyType value) {
        this.aa = value;
    }

    /**
     * Gets the value of the cdh property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getCDH() {
        return cdh;
    }

    /**
     * Sets the value of the cdh property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setCDH(KeyType value) {
        this.cdh = value;
    }

    /**
     * Gets the value of the ebs property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getEBS() {
        return ebs;
    }

    /**
     * Sets the value of the ebs property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setEBS(KeyType value) {
        this.ebs = value;
    }

    /**
     * Gets the value of the msc property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getMSC() {
        return msc;
    }

    /**
     * Sets the value of the msc property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setMSC(KeyType value) {
        this.msc = value;
    }

    /**
     * Gets the value of the vicki property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getVicki() {
        return vicki;
    }

    /**
     * Sets the value of the vicki property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setVicki(KeyType value) {
        this.vicki = value;
    }

    /**
     * Gets the value of the ovc property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getOVC() {
        return ovc;
    }

    /**
     * Sets the value of the ovc property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setOVC(KeyType value) {
        this.ovc = value;
    }

    /**
     * Gets the value of the salesForce property.
     * 
     * @return
     *     possible object is
     *     {@link KeyType }
     *     
     */
    public KeyType getSalesForce() {
        return salesForce;
    }

    /**
     * Sets the value of the salesForce property.
     * 
     * @param value
     *     allowed object is
     *     {@link KeyType }
     *     
     */
    public void setSalesForce(KeyType value) {
        this.salesForce = value;
    }

}
