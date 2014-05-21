/**
 * ...
 * <p>
 * -----------------------------------------------------------------------------------<br>
 * (c) 2010-2014 OpenInfobutton Project, Biomedical Informatics, University of Utah<br>
 * Contact: {@code <andrew.iskander@utah.edu>}<br>
 * Biomedical Informatics<br>
 * 421 Wakara Way, Ste 140
 * Salt Lake City, UT 84108-3514<br>
 * Day Phone: 1-801-581-4080<br>
 * -----------------------------------------------------------------------------------
 *
 * @author Andrew Iskander {@code <andrew.iskander@utah.edu>}
 * @version May 5, 2014
 */
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.18 at 11:24:08 AM MDT 
//


package org.hl7.v3;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REDS_MT010001UV.AssignedEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REDS_MT010001UV.AssignedEntity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="name" type="{}ST.Lite" minOccurs="0" form="qualified"/>
 *         &lt;element name="certificateText" type="{}ED.Lite" minOccurs="0" form="qualified"/>
 *         &lt;element name="assignedAuthorizedPerson" type="{}REDS_MT010001UV.AuthorizedPerson" minOccurs="0" form="qualified"/>
 *         &lt;element name="representedOrganization" type="{}REDS_MT010001UV.Organization" minOccurs="0" form="qualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REDS_MT010001UV.AssignedEntity", propOrder = {
    "name",
    "certificateText",
    "assignedAuthorizedPerson",
    "representedOrganization"
})
public class REDSMT010001UVAssignedEntity {

    protected STLite name;
    protected EDLite certificateText;
    @XmlElementRef(name = "assignedAuthorizedPerson", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVAuthorizedPerson> assignedAuthorizedPerson;
    @XmlElementRef(name = "representedOrganization", type = JAXBElement.class)
    protected JAXBElement<REDSMT010001UVOrganization> representedOrganization;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link STLite }
     *     
     */
    public STLite getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link STLite }
     *     
     */
    public void setName(STLite value) {
        this.name = value;
    }

    /**
     * Gets the value of the certificateText property.
     * 
     * @return
     *     possible object is
     *     {@link EDLite }
     *     
     */
    public EDLite getCertificateText() {
        return certificateText;
    }

    /**
     * Sets the value of the certificateText property.
     * 
     * @param value
     *     allowed object is
     *     {@link EDLite }
     *     
     */
    public void setCertificateText(EDLite value) {
        this.certificateText = value;
    }

    /**
     * Gets the value of the assignedAuthorizedPerson property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVAuthorizedPerson }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVAuthorizedPerson> getAssignedAuthorizedPerson() {
        return assignedAuthorizedPerson;
    }

    /**
     * Sets the value of the assignedAuthorizedPerson property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVAuthorizedPerson }{@code >}
     *     
     */
    public void setAssignedAuthorizedPerson(JAXBElement<REDSMT010001UVAuthorizedPerson> value) {
        this.assignedAuthorizedPerson = ((JAXBElement<REDSMT010001UVAuthorizedPerson> ) value);
    }

    /**
     * Gets the value of the representedOrganization property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVOrganization }{@code >}
     *     
     */
    public JAXBElement<REDSMT010001UVOrganization> getRepresentedOrganization() {
        return representedOrganization;
    }

    /**
     * Sets the value of the representedOrganization property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link REDSMT010001UVOrganization }{@code >}
     *     
     */
    public void setRepresentedOrganization(JAXBElement<REDSMT010001UVOrganization> value) {
        this.representedOrganization = ((JAXBElement<REDSMT010001UVOrganization> ) value);
    }

}
