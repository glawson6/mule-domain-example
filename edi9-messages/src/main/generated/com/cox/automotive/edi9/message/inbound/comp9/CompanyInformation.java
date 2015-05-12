//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.comp9;

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
 *         &lt;element ref="{}CompanyID"/>
 *         &lt;element ref="{}DBAName"/>
 *         &lt;element ref="{}LegalName" minOccurs="0"/>
 *         &lt;element ref="{}CompanyType"/>
 *         &lt;element ref="{}GovernmentID" minOccurs="0"/>
 *         &lt;element ref="{}GovernmentIDType" minOccurs="0"/>
 *         &lt;element ref="{}GovernmentIDCountry" minOccurs="0"/>
 *         &lt;element ref="{}EntityType" minOccurs="0"/>
 *         &lt;element ref="{}PublicSaleOnly" minOccurs="0"/>
 *         &lt;element ref="{}NICBNumber" minOccurs="0"/>
 *         &lt;element ref="{}DunandBradstreetNumber" minOccurs="0"/>
 *         &lt;element ref="{}InsuranceCompany" minOccurs="0"/>
 *         &lt;element ref="{}PolicyNumber" minOccurs="0"/>
 *         &lt;element ref="{}InsuranceExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{}BondingCompany" minOccurs="0"/>
 *         &lt;element ref="{}BondNumber" minOccurs="0"/>
 *         &lt;element ref="{}BondExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{}RIN" minOccurs="0"/>
 *         &lt;element ref="{}GST" minOccurs="0"/>
 *         &lt;element ref="{}BusinessStartDate" minOccurs="0"/>
 *         &lt;element ref="{}OutOfBusiness" minOccurs="0"/>
 *         &lt;element ref="{}OutOfBusinessDate" minOccurs="0"/>
 *         &lt;element ref="{}MembershipExpirationDate" minOccurs="0"/>
 *         &lt;element ref="{}CommercialAccountType" minOccurs="0"/>
 *         &lt;element ref="{}ParentCompanyID" minOccurs="0"/>
 *         &lt;element ref="{}Courier" minOccurs="0"/>
 *         &lt;element ref="{}CourierAccount" minOccurs="0"/>
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
    "companyID",
    "dbaName",
    "legalName",
    "companyType",
    "governmentID",
    "governmentIDType",
    "governmentIDCountry",
    "entityType",
    "publicSaleOnly",
    "nicbNumber",
    "dunandBradstreetNumber",
    "insuranceCompany",
    "policyNumber",
    "insuranceExpirationDate",
    "bondingCompany",
    "bondNumber",
    "bondExpirationDate",
    "rin",
    "gst",
    "businessStartDate",
    "outOfBusiness",
    "outOfBusinessDate",
    "membershipExpirationDate",
    "commercialAccountType",
    "parentCompanyID",
    "courier",
    "courierAccount"
})
@XmlRootElement(name = "CompanyInformation")
public class CompanyInformation
    implements Serializable
{

    @XmlElement(name = "CompanyID")
    protected int companyID;
    @XmlElement(name = "DBAName", required = true)
    protected String dbaName;
    @XmlElement(name = "LegalName")
    protected String legalName;
    @XmlElement(name = "CompanyType", required = true)
    protected CompanyTypeEnum companyType;
    @XmlElement(name = "GovernmentID")
    protected String governmentID;
    @XmlElement(name = "GovernmentIDType")
    protected GovernmentIDTypeEnum governmentIDType;
    @XmlElement(name = "GovernmentIDCountry")
    protected String governmentIDCountry;
    @XmlElement(name = "EntityType")
    protected EntityTypeEnum entityType;
    @XmlElement(name = "PublicSaleOnly")
    protected PublicSaleOnlyEnum publicSaleOnly;
    @XmlElement(name = "NICBNumber")
    protected String nicbNumber;
    @XmlElement(name = "DunandBradstreetNumber")
    protected String dunandBradstreetNumber;
    @XmlElement(name = "InsuranceCompany")
    protected String insuranceCompany;
    @XmlElement(name = "PolicyNumber")
    protected String policyNumber;
    @XmlElement(name = "InsuranceExpirationDate")
    protected String insuranceExpirationDate;
    @XmlElement(name = "BondingCompany")
    protected String bondingCompany;
    @XmlElement(name = "BondNumber")
    protected String bondNumber;
    @XmlElement(name = "BondExpirationDate")
    protected String bondExpirationDate;
    @XmlElement(name = "RIN")
    protected String rin;
    @XmlElement(name = "GST")
    protected String gst;
    @XmlElement(name = "BusinessStartDate")
    protected String businessStartDate;
    @XmlElement(name = "OutOfBusiness")
    protected OutOfBusinessEnum outOfBusiness;
    @XmlElement(name = "OutOfBusinessDate")
    protected String outOfBusinessDate;
    @XmlElement(name = "MembershipExpirationDate")
    protected String membershipExpirationDate;
    @XmlElement(name = "CommercialAccountType")
    protected CommercialAccountTypeEnum commercialAccountType;
    @XmlElement(name = "ParentCompanyID")
    protected Integer parentCompanyID;
    @XmlElement(name = "Courier")
    protected String courier;
    @XmlElement(name = "CourierAccount")
    protected String courierAccount;

    /**
     * Gets the value of the companyID property.
     * 
     */
    public int getCompanyID() {
        return companyID;
    }

    /**
     * Sets the value of the companyID property.
     * 
     */
    public void setCompanyID(int value) {
        this.companyID = value;
    }

    public boolean isSetCompanyID() {
        return true;
    }

    /**
     * Gets the value of the dbaName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBAName() {
        return dbaName;
    }

    /**
     * Sets the value of the dbaName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBAName(String value) {
        this.dbaName = value;
    }

    public boolean isSetDBAName() {
        return (this.dbaName!= null);
    }

    /**
     * Gets the value of the legalName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalName() {
        return legalName;
    }

    /**
     * Sets the value of the legalName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalName(String value) {
        this.legalName = value;
    }

    public boolean isSetLegalName() {
        return (this.legalName!= null);
    }

    /**
     * Gets the value of the companyType property.
     * 
     * @return
     *     possible object is
     *     {@link CompanyTypeEnum }
     *     
     */
    public CompanyTypeEnum getCompanyType() {
        return companyType;
    }

    /**
     * Sets the value of the companyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyTypeEnum }
     *     
     */
    public void setCompanyType(CompanyTypeEnum value) {
        this.companyType = value;
    }

    public boolean isSetCompanyType() {
        return (this.companyType!= null);
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

    public boolean isSetGovernmentID() {
        return (this.governmentID!= null);
    }

    /**
     * Gets the value of the governmentIDType property.
     * 
     * @return
     *     possible object is
     *     {@link GovernmentIDTypeEnum }
     *     
     */
    public GovernmentIDTypeEnum getGovernmentIDType() {
        return governmentIDType;
    }

    /**
     * Sets the value of the governmentIDType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GovernmentIDTypeEnum }
     *     
     */
    public void setGovernmentIDType(GovernmentIDTypeEnum value) {
        this.governmentIDType = value;
    }

    public boolean isSetGovernmentIDType() {
        return (this.governmentIDType!= null);
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

    public boolean isSetGovernmentIDCountry() {
        return (this.governmentIDCountry!= null);
    }

    /**
     * Gets the value of the entityType property.
     * 
     * @return
     *     possible object is
     *     {@link EntityTypeEnum }
     *     
     */
    public EntityTypeEnum getEntityType() {
        return entityType;
    }

    /**
     * Sets the value of the entityType property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityTypeEnum }
     *     
     */
    public void setEntityType(EntityTypeEnum value) {
        this.entityType = value;
    }

    public boolean isSetEntityType() {
        return (this.entityType!= null);
    }

    /**
     * Gets the value of the publicSaleOnly property.
     * 
     * @return
     *     possible object is
     *     {@link PublicSaleOnlyEnum }
     *     
     */
    public PublicSaleOnlyEnum getPublicSaleOnly() {
        return publicSaleOnly;
    }

    /**
     * Sets the value of the publicSaleOnly property.
     * 
     * @param value
     *     allowed object is
     *     {@link PublicSaleOnlyEnum }
     *     
     */
    public void setPublicSaleOnly(PublicSaleOnlyEnum value) {
        this.publicSaleOnly = value;
    }

    public boolean isSetPublicSaleOnly() {
        return (this.publicSaleOnly!= null);
    }

    /**
     * Gets the value of the nicbNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNICBNumber() {
        return nicbNumber;
    }

    /**
     * Sets the value of the nicbNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNICBNumber(String value) {
        this.nicbNumber = value;
    }

    public boolean isSetNICBNumber() {
        return (this.nicbNumber!= null);
    }

    /**
     * Gets the value of the dunandBradstreetNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDunandBradstreetNumber() {
        return dunandBradstreetNumber;
    }

    /**
     * Sets the value of the dunandBradstreetNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDunandBradstreetNumber(String value) {
        this.dunandBradstreetNumber = value;
    }

    public boolean isSetDunandBradstreetNumber() {
        return (this.dunandBradstreetNumber!= null);
    }

    /**
     * Gets the value of the insuranceCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceCompany() {
        return insuranceCompany;
    }

    /**
     * Sets the value of the insuranceCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceCompany(String value) {
        this.insuranceCompany = value;
    }

    public boolean isSetInsuranceCompany() {
        return (this.insuranceCompany!= null);
    }

    /**
     * Gets the value of the policyNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the value of the policyNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyNumber(String value) {
        this.policyNumber = value;
    }

    public boolean isSetPolicyNumber() {
        return (this.policyNumber!= null);
    }

    /**
     * Gets the value of the insuranceExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInsuranceExpirationDate() {
        return insuranceExpirationDate;
    }

    /**
     * Sets the value of the insuranceExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInsuranceExpirationDate(String value) {
        this.insuranceExpirationDate = value;
    }

    public boolean isSetInsuranceExpirationDate() {
        return (this.insuranceExpirationDate!= null);
    }

    /**
     * Gets the value of the bondingCompany property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondingCompany() {
        return bondingCompany;
    }

    /**
     * Sets the value of the bondingCompany property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondingCompany(String value) {
        this.bondingCompany = value;
    }

    public boolean isSetBondingCompany() {
        return (this.bondingCompany!= null);
    }

    /**
     * Gets the value of the bondNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondNumber() {
        return bondNumber;
    }

    /**
     * Sets the value of the bondNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondNumber(String value) {
        this.bondNumber = value;
    }

    public boolean isSetBondNumber() {
        return (this.bondNumber!= null);
    }

    /**
     * Gets the value of the bondExpirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBondExpirationDate() {
        return bondExpirationDate;
    }

    /**
     * Sets the value of the bondExpirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBondExpirationDate(String value) {
        this.bondExpirationDate = value;
    }

    public boolean isSetBondExpirationDate() {
        return (this.bondExpirationDate!= null);
    }

    /**
     * Gets the value of the rin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRIN() {
        return rin;
    }

    /**
     * Sets the value of the rin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRIN(String value) {
        this.rin = value;
    }

    public boolean isSetRIN() {
        return (this.rin!= null);
    }

    /**
     * Gets the value of the gst property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGST() {
        return gst;
    }

    /**
     * Sets the value of the gst property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGST(String value) {
        this.gst = value;
    }

    public boolean isSetGST() {
        return (this.gst!= null);
    }

    /**
     * Gets the value of the businessStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessStartDate() {
        return businessStartDate;
    }

    /**
     * Sets the value of the businessStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessStartDate(String value) {
        this.businessStartDate = value;
    }

    public boolean isSetBusinessStartDate() {
        return (this.businessStartDate!= null);
    }

    /**
     * Gets the value of the outOfBusiness property.
     * 
     * @return
     *     possible object is
     *     {@link OutOfBusinessEnum }
     *     
     */
    public OutOfBusinessEnum getOutOfBusiness() {
        return outOfBusiness;
    }

    /**
     * Sets the value of the outOfBusiness property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutOfBusinessEnum }
     *     
     */
    public void setOutOfBusiness(OutOfBusinessEnum value) {
        this.outOfBusiness = value;
    }

    public boolean isSetOutOfBusiness() {
        return (this.outOfBusiness!= null);
    }

    /**
     * Gets the value of the outOfBusinessDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutOfBusinessDate() {
        return outOfBusinessDate;
    }

    /**
     * Sets the value of the outOfBusinessDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutOfBusinessDate(String value) {
        this.outOfBusinessDate = value;
    }

    public boolean isSetOutOfBusinessDate() {
        return (this.outOfBusinessDate!= null);
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

    public boolean isSetMembershipExpirationDate() {
        return (this.membershipExpirationDate!= null);
    }

    /**
     * Gets the value of the commercialAccountType property.
     * 
     * @return
     *     possible object is
     *     {@link CommercialAccountTypeEnum }
     *     
     */
    public CommercialAccountTypeEnum getCommercialAccountType() {
        return commercialAccountType;
    }

    /**
     * Sets the value of the commercialAccountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommercialAccountTypeEnum }
     *     
     */
    public void setCommercialAccountType(CommercialAccountTypeEnum value) {
        this.commercialAccountType = value;
    }

    public boolean isSetCommercialAccountType() {
        return (this.commercialAccountType!= null);
    }

    /**
     * Gets the value of the parentCompanyID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getParentCompanyID() {
        return parentCompanyID;
    }

    /**
     * Sets the value of the parentCompanyID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setParentCompanyID(Integer value) {
        this.parentCompanyID = value;
    }

    public boolean isSetParentCompanyID() {
        return (this.parentCompanyID!= null);
    }

    /**
     * Gets the value of the courier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourier() {
        return courier;
    }

    /**
     * Sets the value of the courier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourier(String value) {
        this.courier = value;
    }

    public boolean isSetCourier() {
        return (this.courier!= null);
    }

    /**
     * Gets the value of the courierAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCourierAccount() {
        return courierAccount;
    }

    /**
     * Sets the value of the courierAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCourierAccount(String value) {
        this.courierAccount = value;
    }

    public boolean isSetCourierAccount() {
        return (this.courierAccount!= null);
    }

}