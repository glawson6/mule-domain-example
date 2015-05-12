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
 * <p>Java class for SalesTerritoryRelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SalesTerritoryRelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SystemKeys" type="{http://www.manheim.com/2009/01/CustSchema}SystemKeysType"/>
 *         &lt;element name="action" type="{http://www.manheim.com/2009/01/CustSchema}actionCode" minOccurs="0"/>
 *         &lt;element name="sourceDeleteIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="salesTerritoryId" type="{http://www.manheim.com/2009/01/CustSchema}SystemKeysType"/>
 *         &lt;element name="Relationship" type="{http://www.manheim.com/2009/01/CustSchema}RelationshipType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesTerritoryRelationshipType", propOrder = {
    "systemKeys",
    "action",
    "sourceDeleteIndicator",
    "salesTerritoryId",
    "relationship"
})
public class SalesTerritoryRelationshipType {

    @XmlElement(name = "SystemKeys", required = true)
    protected SystemKeysType systemKeys;
    protected ActionCode action;
    protected boolean sourceDeleteIndicator;
    @XmlElement(required = true)
    protected SystemKeysType salesTerritoryId;
    @XmlElement(name = "Relationship", required = true)
    protected RelationshipType relationship;

    /**
     * Gets the value of the systemKeys property.
     * 
     * @return
     *     possible object is
     *     {@link SystemKeysType }
     *     
     */
    public SystemKeysType getSystemKeys() {
        return systemKeys;
    }

    /**
     * Sets the value of the systemKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemKeysType }
     *     
     */
    public void setSystemKeys(SystemKeysType value) {
        this.systemKeys = value;
    }

    /**
     * Gets the value of the action property.
     * 
     * @return
     *     possible object is
     *     {@link ActionCode }
     *     
     */
    public ActionCode getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCode }
     *     
     */
    public void setAction(ActionCode value) {
        this.action = value;
    }

    /**
     * Gets the value of the sourceDeleteIndicator property.
     * 
     */
    public boolean isSourceDeleteIndicator() {
        return sourceDeleteIndicator;
    }

    /**
     * Sets the value of the sourceDeleteIndicator property.
     * 
     */
    public void setSourceDeleteIndicator(boolean value) {
        this.sourceDeleteIndicator = value;
    }

    /**
     * Gets the value of the salesTerritoryId property.
     * 
     * @return
     *     possible object is
     *     {@link SystemKeysType }
     *     
     */
    public SystemKeysType getSalesTerritoryId() {
        return salesTerritoryId;
    }

    /**
     * Sets the value of the salesTerritoryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemKeysType }
     *     
     */
    public void setSalesTerritoryId(SystemKeysType value) {
        this.salesTerritoryId = value;
    }

    /**
     * Gets the value of the relationship property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType }
     *     
     */
    public RelationshipType getRelationship() {
        return relationship;
    }

    /**
     * Sets the value of the relationship property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType }
     *     
     */
    public void setRelationship(RelationshipType value) {
        this.relationship = value;
    }

}
