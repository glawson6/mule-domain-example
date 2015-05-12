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
 *         &lt;element ref="{}AssociationID"/>
 *         &lt;element ref="{}AssociationName"/>
 *         &lt;element ref="{}Visibility"/>
 *         &lt;element ref="{}Active"/>
 *         &lt;element ref="{}Terminated" minOccurs="0"/>
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
    "associationID",
    "associationName",
    "visibility",
    "active",
    "terminated"
})
@XmlRootElement(name = "AssociationInformation")
public class AssociationInformation {

    @XmlElement(name = "AssociationID")
    protected int associationID;
    @XmlElement(name = "AssociationName", required = true)
    protected String associationName;
    @XmlElement(name = "Visibility", required = true)
    protected String visibility;
    @XmlElement(name = "Active", required = true)
    protected String active;
    @XmlElement(name = "Terminated")
    protected String terminated;

    /**
     * Gets the value of the associationID property.
     * 
     */
    public int getAssociationID() {
        return associationID;
    }

    /**
     * Sets the value of the associationID property.
     * 
     */
    public void setAssociationID(int value) {
        this.associationID = value;
    }

    /**
     * Gets the value of the associationName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssociationName() {
        return associationName;
    }

    /**
     * Sets the value of the associationName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssociationName(String value) {
        this.associationName = value;
    }

    /**
     * Gets the value of the visibility property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVisibility() {
        return visibility;
    }

    /**
     * Sets the value of the visibility property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVisibility(String value) {
        this.visibility = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the terminated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTerminated() {
        return terminated;
    }

    /**
     * Sets the value of the terminated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTerminated(String value) {
        this.terminated = value;
    }

}
