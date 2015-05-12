//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.outbound;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RelCustGrp2CompanyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelCustGrp2CompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="custGrpId" type="{http://www.manheim.com/2009/01/CustSchema}SystemKeysType"/>
 *         &lt;element name="CompanyRelationship" type="{http://www.manheim.com/2009/01/CustSchema}CompanyRelationshipType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelCustGrp2CompanyType", propOrder = {
    "custGrpId",
    "companyRelationship"
})
public class RelCustGrp2CompanyType {

    @XmlElement(required = true)
    protected SystemKeysType custGrpId;
    @XmlElement(name = "CompanyRelationship")
    protected List<CompanyRelationshipType> companyRelationship;

    /**
     * Gets the value of the custGrpId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemKeysType }
     *     
     */
    public SystemKeysType getCustGrpId() {
        return custGrpId;
    }

    /**
     * Sets the value of the custGrpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemKeysType }
     *     
     */
    public void setCustGrpId(SystemKeysType value) {
        this.custGrpId = value;
    }

    /**
     * Gets the value of the companyRelationship property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the companyRelationship property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCompanyRelationship().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyRelationshipType }
     * 
     * 
     */
    public List<CompanyRelationshipType> getCompanyRelationship() {
        if (companyRelationship == null) {
            companyRelationship = new ArrayList<CompanyRelationshipType>();
        }
        return this.companyRelationship;
    }

}
