//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.per9;

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
 *         &lt;element ref="{}PersonID"/>
 *         &lt;element ref="{}FirstName"/>
 *         &lt;element ref="{}MiddleName" minOccurs="0"/>
 *         &lt;element ref="{}LastName"/>
 *         &lt;element ref="{}Prefix" minOccurs="0"/>
 *         &lt;element ref="{}Suffix" minOccurs="0"/>
 *         &lt;element ref="{}GovernmentID"/>
 *         &lt;element ref="{}GovernmentIDCountry"/>
 *         &lt;element ref="{}GovernmentIDType"/>
 *         &lt;element ref="{}DOB" minOccurs="0"/>
 *         &lt;element ref="{}DateMostRecentCard" minOccurs="0"/>
 *         &lt;element ref="{}CardSentToLocation" minOccurs="0"/>
 *         &lt;element ref="{}NickName" minOccurs="0"/>
 *         &lt;element ref="{}MembershipExpirationDate"/>
 *         &lt;element ref="{}Deceased"/>
 *         &lt;element ref="{}LanguagePreference"/>
 *         &lt;element ref="{}PublicSaleOnly" minOccurs="0"/>
 *         &lt;element ref="{}IDVerificationScore" minOccurs="0"/>
 *         &lt;element ref="{}CardSequence"/>
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
    "personID",
    "firstName",
    "middleName",
    "lastName",
    "prefix",
    "suffix",
    "governmentID",
    "governmentIDCountry",
    "governmentIDType",
    "dob",
    "dateMostRecentCard",
    "cardSentToLocation",
    "nickName",
    "membershipExpirationDate",
    "deceased",
    "languagePreference",
    "publicSaleOnly",
    "idVerificationScore",
    "cardSequence"
})
@XmlRootElement(name = "PersonInformation")
public class PersonInformation {

    @XmlElement(name = "PersonID")
    protected int personID;
    @XmlElement(name = "FirstName", required = true)
    protected String firstName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "LastName", required = true)
    protected String lastName;
    @XmlElement(name = "Prefix")
    protected String prefix;
    @XmlElement(name = "Suffix")
    protected String suffix;
    @XmlElement(name = "GovernmentID", required = true)
    protected String governmentID;
    @XmlElement(name = "GovernmentIDCountry", required = true)
    protected String governmentIDCountry;
    @XmlElement(name = "GovernmentIDType", required = true)
    protected String governmentIDType;
    @XmlElement(name = "DOB")
    protected String dob;
    @XmlElement(name = "DateMostRecentCard")
    protected String dateMostRecentCard;
    @XmlElement(name = "CardSentToLocation")
    protected String cardSentToLocation;
    @XmlElement(name = "NickName")
    protected String nickName;
    @XmlElement(name = "MembershipExpirationDate", required = true)
    protected String membershipExpirationDate;
    @XmlElement(name = "Deceased", required = true)
    protected String deceased;
    @XmlElement(name = "LanguagePreference", required = true)
    protected String languagePreference;
    @XmlElement(name = "PublicSaleOnly")
    protected String publicSaleOnly;
    @XmlElement(name = "IDVerificationScore")
    protected Integer idVerificationScore;
    @XmlElement(name = "CardSequence", required = true)
    protected String cardSequence;

    /**
     * Gets the value of the personID property.
     * 
     */
    public int getPersonID() {
        return personID;
    }

    /**
     * Sets the value of the personID property.
     * 
     */
    public void setPersonID(int value) {
        this.personID = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the prefix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * Sets the value of the prefix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefix(String value) {
        this.prefix = value;
    }

    /**
     * Gets the value of the suffix property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * Sets the value of the suffix property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuffix(String value) {
        this.suffix = value;
    }

    /**
     * Gets the value of the governmentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentID() {
        return governmentID;
    }

    /**
     * Sets the value of the governmentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentID(String value) {
        this.governmentID = value;
    }

    /**
     * Gets the value of the governmentIDCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentIDCountry() {
        return governmentIDCountry;
    }

    /**
     * Sets the value of the governmentIDCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentIDCountry(String value) {
        this.governmentIDCountry = value;
    }

    /**
     * Gets the value of the governmentIDType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGovernmentIDType() {
        return governmentIDType;
    }

    /**
     * Sets the value of the governmentIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGovernmentIDType(String value) {
        this.governmentIDType = value;
    }

    /**
     * Gets the value of the dob property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDOB() {
        return dob;
    }

    /**
     * Sets the value of the dob property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDOB(String value) {
        this.dob = value;
    }

    /**
     * Gets the value of the dateMostRecentCard property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateMostRecentCard() {
        return dateMostRecentCard;
    }

    /**
     * Sets the value of the dateMostRecentCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateMostRecentCard(String value) {
        this.dateMostRecentCard = value;
    }

    /**
     * Gets the value of the cardSentToLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSentToLocation() {
        return cardSentToLocation;
    }

    /**
     * Sets the value of the cardSentToLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSentToLocation(String value) {
        this.cardSentToLocation = value;
    }

    /**
     * Gets the value of the nickName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * Sets the value of the nickName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNickName(String value) {
        this.nickName = value;
    }

    /**
     * Gets the value of the membershipExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMembershipExpirationDate() {
        return membershipExpirationDate;
    }

    /**
     * Sets the value of the membershipExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMembershipExpirationDate(String value) {
        this.membershipExpirationDate = value;
    }

    /**
     * Gets the value of the deceased property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeceased() {
        return deceased;
    }

    /**
     * Sets the value of the deceased property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeceased(String value) {
        this.deceased = value;
    }

    /**
     * Gets the value of the languagePreference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguagePreference() {
        return languagePreference;
    }

    /**
     * Sets the value of the languagePreference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguagePreference(String value) {
        this.languagePreference = value;
    }

    /**
     * Gets the value of the publicSaleOnly property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPublicSaleOnly() {
        return publicSaleOnly;
    }

    /**
     * Sets the value of the publicSaleOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPublicSaleOnly(String value) {
        this.publicSaleOnly = value;
    }

    /**
     * Gets the value of the idVerificationScore property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIDVerificationScore() {
        return idVerificationScore;
    }

    /**
     * Sets the value of the idVerificationScore property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIDVerificationScore(Integer value) {
        this.idVerificationScore = value;
    }

    /**
     * Gets the value of the cardSequence property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSequence() {
        return cardSequence;
    }

    /**
     * Sets the value of the cardSequence property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSequence(String value) {
        this.cardSequence = value;
    }

}
