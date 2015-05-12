//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.outbound;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for RelationshipType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RelationshipType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="relationshipCode">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="hierarchyCode">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="relationshipStartDate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="relationshipEndDate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                 &lt;attribute name="setNULL" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelationshipType", propOrder = {
    "relationshipCode",
    "hierarchyCode",
    "relationshipStartDate",
    "relationshipEndDate"
})
public class RelationshipType {

    @XmlElement(required = true)
    protected RelationshipType.RelationshipCode relationshipCode;
    @XmlElement(required = true)
    protected RelationshipType.HierarchyCode hierarchyCode;
    protected RelationshipType.RelationshipStartDate relationshipStartDate;
    protected RelationshipType.RelationshipEndDate relationshipEndDate;

    /**
     * Gets the value of the relationshipCode property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType.RelationshipCode }
     *     
     */
    public RelationshipType.RelationshipCode getRelationshipCode() {
        return relationshipCode;
    }

    /**
     * Sets the value of the relationshipCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType.RelationshipCode }
     *     
     */
    public void setRelationshipCode(RelationshipType.RelationshipCode value) {
        this.relationshipCode = value;
    }

    /**
     * Gets the value of the hierarchyCode property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType.HierarchyCode }
     *     
     */
    public RelationshipType.HierarchyCode getHierarchyCode() {
        return hierarchyCode;
    }

    /**
     * Sets the value of the hierarchyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType.HierarchyCode }
     *     
     */
    public void setHierarchyCode(RelationshipType.HierarchyCode value) {
        this.hierarchyCode = value;
    }

    /**
     * Gets the value of the relationshipStartDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType.RelationshipStartDate }
     *     
     */
    public RelationshipType.RelationshipStartDate getRelationshipStartDate() {
        return relationshipStartDate;
    }

    /**
     * Sets the value of the relationshipStartDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType.RelationshipStartDate }
     *     
     */
    public void setRelationshipStartDate(RelationshipType.RelationshipStartDate value) {
        this.relationshipStartDate = value;
    }

    /**
     * Gets the value of the relationshipEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelationshipType.RelationshipEndDate }
     *     
     */
    public RelationshipType.RelationshipEndDate getRelationshipEndDate() {
        return relationshipEndDate;
    }

    /**
     * Sets the value of the relationshipEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelationshipType.RelationshipEndDate }
     *     
     */
    public void setRelationshipEndDate(RelationshipType.RelationshipEndDate value) {
        this.relationshipEndDate = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class HierarchyCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed", required = true)
        protected boolean changed;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         */
        public boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         */
        public void setChanged(boolean value) {
            this.changed = value;
        }

        /**
         * Gets the value of the previousValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * Sets the value of the previousValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RelationshipCode {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "changed", required = true)
        protected boolean changed;
        @XmlAttribute(name = "previousValue")
        protected String previousValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         */
        public boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         */
        public void setChanged(boolean value) {
            this.changed = value;
        }

        /**
         * Gets the value of the previousValue property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreviousValue() {
            return previousValue;
        }

        /**
         * Sets the value of the previousValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreviousValue(String value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;attribute name="setNULL" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RelationshipEndDate {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "setNULL")
        protected Boolean setNULL;
        @XmlAttribute(name = "changed", required = true)
        protected boolean changed;
        @XmlAttribute(name = "previousValue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar previousValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the setNULL property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSetNULL() {
            return setNULL;
        }

        /**
         * Sets the value of the setNULL property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSetNULL(Boolean value) {
            this.setNULL = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         */
        public boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         */
        public void setChanged(boolean value) {
            this.changed = value;
        }

        /**
         * Gets the value of the previousValue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPreviousValue() {
            return previousValue;
        }

        /**
         * Sets the value of the previousValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPreviousValue(XMLGregorianCalendar value) {
            this.previousValue = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *       &lt;attribute name="changed" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="previousValue" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class RelationshipStartDate {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "changed", required = true)
        protected boolean changed;
        @XmlAttribute(name = "previousValue")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar previousValue;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the changed property.
         * 
         */
        public boolean isChanged() {
            return changed;
        }

        /**
         * Sets the value of the changed property.
         * 
         */
        public void setChanged(boolean value) {
            this.changed = value;
        }

        /**
         * Gets the value of the previousValue property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPreviousValue() {
            return previousValue;
        }

        /**
         * Sets the value of the previousValue property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPreviousValue(XMLGregorianCalendar value) {
            this.previousValue = value;
        }

    }

}
