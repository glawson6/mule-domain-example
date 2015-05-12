//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.cac9;

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
 *         &lt;element ref="{}SourceGroup"/>
 *         &lt;element ref="{}SourceCustomerID"/>
 *         &lt;element ref="{}DestCustomerID"/>
 *         &lt;element ref="{}SerialNumber"/>
 *         &lt;element ref="{}MessageType"/>
 *         &lt;element ref="{}EntityID"/>
 *         &lt;element ref="{}DistributionCustomerList" minOccurs="0"/>
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
    "sourceGroup",
    "sourceCustomerID",
    "destCustomerID",
    "serialNumber",
    "messageType",
    "entityID",
    "distributionCustomerList"
})
@XmlRootElement(name = "Header")
public class Header {

    @XmlElement(name = "SourceGroup", required = true)
    protected String sourceGroup;
    @XmlElement(name = "SourceCustomerID")
    protected int sourceCustomerID;
    @XmlElement(name = "DestCustomerID")
    protected int destCustomerID;
    @XmlElement(name = "SerialNumber")
    protected long serialNumber;
    @XmlElement(name = "MessageType", required = true)
    protected String messageType;
    @XmlElement(name = "EntityID", required = true)
    protected String entityID;
    @XmlElement(name = "DistributionCustomerList")
    protected DistributionCustomerList distributionCustomerList;

    /**
     * Gets the value of the sourceGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceGroup() {
        return sourceGroup;
    }

    /**
     * Sets the value of the sourceGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceGroup(String value) {
        this.sourceGroup = value;
    }

    /**
     * Gets the value of the sourceCustomerID property.
     * 
     */
    public int getSourceCustomerID() {
        return sourceCustomerID;
    }

    /**
     * Sets the value of the sourceCustomerID property.
     * 
     */
    public void setSourceCustomerID(int value) {
        this.sourceCustomerID = value;
    }

    /**
     * Gets the value of the destCustomerID property.
     * 
     */
    public int getDestCustomerID() {
        return destCustomerID;
    }

    /**
     * Sets the value of the destCustomerID property.
     * 
     */
    public void setDestCustomerID(int value) {
        this.destCustomerID = value;
    }

    /**
     * Gets the value of the serialNumber property.
     * 
     */
    public long getSerialNumber() {
        return serialNumber;
    }

    /**
     * Sets the value of the serialNumber property.
     * 
     */
    public void setSerialNumber(long value) {
        this.serialNumber = value;
    }

    /**
     * Gets the value of the messageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * Sets the value of the messageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityID() {
        return entityID;
    }

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityID(String value) {
        this.entityID = value;
    }

    /**
     * Gets the value of the distributionCustomerList property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionCustomerList }
     *     
     */
    public DistributionCustomerList getDistributionCustomerList() {
        return distributionCustomerList;
    }

    /**
     * Sets the value of the distributionCustomerList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionCustomerList }
     *     
     */
    public void setDistributionCustomerList(DistributionCustomerList value) {
        this.distributionCustomerList = value;
    }

}