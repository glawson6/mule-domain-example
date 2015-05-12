//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.05.12 at 09:34:31 AM EDT 
//


package com.cox.automotive.edi9.message.inbound.per9;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.cox.automotive.edi9.message.inbound.per9 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CardSentToLocation_QNAME = new QName("", "CardSentToLocation");
    private final static QName _DOB_QNAME = new QName("", "DOB");
    private final static QName _NickName_QNAME = new QName("", "NickName");
    private final static QName _PublicSaleOnly_QNAME = new QName("", "PublicSaleOnly");
    private final static QName _LastName_QNAME = new QName("", "LastName");
    private final static QName _MembershipExpirationDate_QNAME = new QName("", "MembershipExpirationDate");
    private final static QName _SerialNumber_QNAME = new QName("", "SerialNumber");
    private final static QName _SourceCustomerID_QNAME = new QName("", "SourceCustomerID");
    private final static QName _Deceased_QNAME = new QName("", "Deceased");
    private final static QName _PersonID_QNAME = new QName("", "PersonID");
    private final static QName _SourceGroup_QNAME = new QName("", "SourceGroup");
    private final static QName _FirstName_QNAME = new QName("", "FirstName");
    private final static QName _DateMostRecentCard_QNAME = new QName("", "DateMostRecentCard");
    private final static QName _EntityID_QNAME = new QName("", "EntityID");
    private final static QName _IDVerificationScore_QNAME = new QName("", "IDVerificationScore");
    private final static QName _CardSequence_QNAME = new QName("", "CardSequence");
    private final static QName _Suffix_QNAME = new QName("", "Suffix");
    private final static QName _DistributionCustomerID_QNAME = new QName("", "DistributionCustomerID");
    private final static QName _LanguagePreference_QNAME = new QName("", "LanguagePreference");
    private final static QName _Prefix_QNAME = new QName("", "Prefix");
    private final static QName _GovernmentID_QNAME = new QName("", "GovernmentID");
    private final static QName _GovernmentIDType_QNAME = new QName("", "GovernmentIDType");
    private final static QName _DestCustomerID_QNAME = new QName("", "DestCustomerID");
    private final static QName _GovernmentIDCountry_QNAME = new QName("", "GovernmentIDCountry");
    private final static QName _MiddleName_QNAME = new QName("", "MiddleName");
    private final static QName _MessageType_QNAME = new QName("", "MessageType");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.cox.automotive.edi9.message.inbound.per9
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Header }
     * 
     */
    public Header createHeader() {
        return new Header();
    }

    /**
     * Create an instance of {@link DistributionCustomerList }
     * 
     */
    public DistributionCustomerList createDistributionCustomerList() {
        return new DistributionCustomerList();
    }

    /**
     * Create an instance of {@link DistributionCustomer }
     * 
     */
    public DistributionCustomer createDistributionCustomer() {
        return new DistributionCustomer();
    }

    /**
     * Create an instance of {@link Message }
     * 
     */
    public Message createMessage() {
        return new Message();
    }

    /**
     * Create an instance of {@link PersonInformation }
     * 
     */
    public PersonInformation createPersonInformation() {
        return new PersonInformation();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CardSentToLocation")
    public JAXBElement<String> createCardSentToLocation(String value) {
        return new JAXBElement<String>(_CardSentToLocation_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DOB")
    public JAXBElement<String> createDOB(String value) {
        return new JAXBElement<String>(_DOB_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "NickName")
    public JAXBElement<String> createNickName(String value) {
        return new JAXBElement<String>(_NickName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PublicSaleOnly")
    public JAXBElement<String> createPublicSaleOnly(String value) {
        return new JAXBElement<String>(_PublicSaleOnly_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LastName")
    public JAXBElement<String> createLastName(String value) {
        return new JAXBElement<String>(_LastName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MembershipExpirationDate")
    public JAXBElement<String> createMembershipExpirationDate(String value) {
        return new JAXBElement<String>(_MembershipExpirationDate_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SerialNumber")
    public JAXBElement<Long> createSerialNumber(Long value) {
        return new JAXBElement<Long>(_SerialNumber_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceCustomerID")
    public JAXBElement<Integer> createSourceCustomerID(Integer value) {
        return new JAXBElement<Integer>(_SourceCustomerID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Deceased")
    public JAXBElement<String> createDeceased(String value) {
        return new JAXBElement<String>(_Deceased_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "PersonID")
    public JAXBElement<Integer> createPersonID(Integer value) {
        return new JAXBElement<Integer>(_PersonID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SourceGroup")
    public JAXBElement<String> createSourceGroup(String value) {
        return new JAXBElement<String>(_SourceGroup_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FirstName")
    public JAXBElement<String> createFirstName(String value) {
        return new JAXBElement<String>(_FirstName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DateMostRecentCard")
    public JAXBElement<String> createDateMostRecentCard(String value) {
        return new JAXBElement<String>(_DateMostRecentCard_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "EntityID")
    public JAXBElement<String> createEntityID(String value) {
        return new JAXBElement<String>(_EntityID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "IDVerificationScore")
    public JAXBElement<Integer> createIDVerificationScore(Integer value) {
        return new JAXBElement<Integer>(_IDVerificationScore_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "CardSequence")
    public JAXBElement<String> createCardSequence(String value) {
        return new JAXBElement<String>(_CardSequence_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Suffix")
    public JAXBElement<String> createSuffix(String value) {
        return new JAXBElement<String>(_Suffix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DistributionCustomerID")
    public JAXBElement<Integer> createDistributionCustomerID(Integer value) {
        return new JAXBElement<Integer>(_DistributionCustomerID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "LanguagePreference")
    public JAXBElement<String> createLanguagePreference(String value) {
        return new JAXBElement<String>(_LanguagePreference_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Prefix")
    public JAXBElement<String> createPrefix(String value) {
        return new JAXBElement<String>(_Prefix_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GovernmentID")
    public JAXBElement<String> createGovernmentID(String value) {
        return new JAXBElement<String>(_GovernmentID_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GovernmentIDType")
    public JAXBElement<String> createGovernmentIDType(String value) {
        return new JAXBElement<String>(_GovernmentIDType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "DestCustomerID")
    public JAXBElement<Integer> createDestCustomerID(Integer value) {
        return new JAXBElement<Integer>(_DestCustomerID_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "GovernmentIDCountry")
    public JAXBElement<String> createGovernmentIDCountry(String value) {
        return new JAXBElement<String>(_GovernmentIDCountry_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MiddleName")
    public JAXBElement<String> createMiddleName(String value) {
        return new JAXBElement<String>(_MiddleName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "MessageType")
    public JAXBElement<String> createMessageType(String value) {
        return new JAXBElement<String>(_MessageType_QNAME, String.class, null, value);
    }

}
