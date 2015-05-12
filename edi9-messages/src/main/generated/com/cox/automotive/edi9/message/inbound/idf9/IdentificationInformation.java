//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.idf9;

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
 *         &lt;element ref="{}IDType"/>
 *         &lt;element ref="{}IDNumber"/>
 *         &lt;element ref="{}IssueDate" minOccurs="0"/>
 *         &lt;element ref="{}ExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{}State"/>
 *         &lt;element ref="{}Country"/>
 *         &lt;element ref="{}EntityRestriction" minOccurs="0"/>
 *         &lt;element ref="{}ATMaintainedLicense" minOccurs="0"/>
 *         &lt;element ref="{}FranchiseInformation" minOccurs="0"/>
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
    "idType",
    "idNumber",
    "issueDate",
    "expirationDate",
    "state",
    "country",
    "entityRestriction",
    "atMaintainedLicense",
    "franchiseInformation"
})
@XmlRootElement(name = "IdentificationInformation")
public class IdentificationInformation {

    @XmlElement(name = "IDType", required = true)
    protected String idType;
    @XmlElement(name = "IDNumber", required = true)
    protected String idNumber;
    @XmlElement(name = "IssueDate")
    protected String issueDate;
    @XmlElement(name = "ExpirationDate")
    protected String expirationDate;
    @XmlElement(name = "State", required = true)
    protected String state;
    @XmlElement(name = "Country", required = true)
    protected String country;
    @XmlElement(name = "EntityRestriction")
    protected String entityRestriction;
    @XmlElement(name = "ATMaintainedLicense")
    protected String atMaintainedLicense;
    @XmlElement(name = "FranchiseInformation")
    protected FranchiseInformation franchiseInformation;

    /**
     * Gets the value of the idType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Sets the value of the idType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Gets the value of the idNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDNumber() {
        return idNumber;
    }

    /**
     * Sets the value of the idNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDNumber(String value) {
        this.idNumber = value;
    }

    /**
     * Gets the value of the issueDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the value of the issueDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssueDate(String value) {
        this.issueDate = value;
    }

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpirationDate(String value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the state property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the entityRestriction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEntityRestriction() {
        return entityRestriction;
    }

    /**
     * Sets the value of the entityRestriction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEntityRestriction(String value) {
        this.entityRestriction = value;
    }

    /**
     * Gets the value of the atMaintainedLicense property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getATMaintainedLicense() {
        return atMaintainedLicense;
    }

    /**
     * Sets the value of the atMaintainedLicense property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setATMaintainedLicense(String value) {
        this.atMaintainedLicense = value;
    }

    /**
     * Gets the value of the franchiseInformation property.
     * 
     * @return
     *     possible object is
     *     {@link FranchiseInformation }
     *     
     */
    public FranchiseInformation getFranchiseInformation() {
        return franchiseInformation;
    }

    /**
     * Sets the value of the franchiseInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link FranchiseInformation }
     *     
     */
    public void setFranchiseInformation(FranchiseInformation value) {
        this.franchiseInformation = value;
    }

}