//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.idf9;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{}Header"/>
 *         &lt;element ref="{}EntityInformation"/>
 *         &lt;element ref="{}IdentificationInformation" maxOccurs="unbounded"/>
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
    "header",
    "entityInformation",
    "identificationInformation"
})
@XmlRootElement(name = "Message")
public class Message {

    @XmlElement(name = "Header", required = true)
    protected Header header;
    @XmlElement(name = "EntityInformation", required = true)
    protected EntityInformation entityInformation;
    @XmlElement(name = "IdentificationInformation", required = true)
    protected List<IdentificationInformation> identificationInformation;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     * Gets the value of the entityInformation property.
     * 
     * @return
     *     possible object is
     *     {@link EntityInformation }
     *     
     */
    public EntityInformation getEntityInformation() {
        return entityInformation;
    }

    /**
     * Sets the value of the entityInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntityInformation }
     *     
     */
    public void setEntityInformation(EntityInformation value) {
        this.entityInformation = value;
    }

    /**
     * Gets the value of the identificationInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identificationInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentificationInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IdentificationInformation }
     * 
     * 
     */
    public List<IdentificationInformation> getIdentificationInformation() {
        if (identificationInformation == null) {
            identificationInformation = new ArrayList<IdentificationInformation>();
        }
        return this.identificationInformation;
    }

}
