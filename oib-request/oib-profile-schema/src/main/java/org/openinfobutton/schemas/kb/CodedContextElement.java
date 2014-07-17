//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.07.16 at 08:16:29 PM MDT 
//


package org.openinfobutton.schemas.kb;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CodedContextElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CodedContextElement">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="matchingDomain" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="enumeration">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{}CDset">
 *                           &lt;attribute name="includeDescendants" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="externalValueSet" type="{}Id" maxOccurs="unbounded"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="searchParameter" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{}syntaxOnResource"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="source" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="code"/>
 *                       &lt;enumeration value="displayName"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outputCodeTransformation" type="{}Id" minOccurs="0"/>
 *         &lt;element name="outputDisplayNameTransformation" type="{}Id" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="match" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="search" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CodedContextElement", propOrder = {
    "matchingDomain",
    "searchParameter",
    "outputCodeTransformation",
    "outputDisplayNameTransformation"
})
public class CodedContextElement {

    protected CodedContextElement.MatchingDomain matchingDomain;
    protected CodedContextElement.SearchParameter searchParameter;
    protected Id outputCodeTransformation;
    protected Id outputDisplayNameTransformation;
    @XmlAttribute(required = true)
    protected boolean match;
    @XmlAttribute(required = true)
    protected boolean search;

    /**
     * Gets the value of the matchingDomain property.
     * 
     * @return
     *     possible object is
     *     {@link CodedContextElement.MatchingDomain }
     *     
     */
    public CodedContextElement.MatchingDomain getMatchingDomain() {
        return matchingDomain;
    }

    /**
     * Sets the value of the matchingDomain property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedContextElement.MatchingDomain }
     *     
     */
    public void setMatchingDomain(CodedContextElement.MatchingDomain value) {
        this.matchingDomain = value;
    }

    /**
     * Gets the value of the searchParameter property.
     * 
     * @return
     *     possible object is
     *     {@link CodedContextElement.SearchParameter }
     *     
     */
    public CodedContextElement.SearchParameter getSearchParameter() {
        return searchParameter;
    }

    /**
     * Sets the value of the searchParameter property.
     * 
     * @param value
     *     allowed object is
     *     {@link CodedContextElement.SearchParameter }
     *     
     */
    public void setSearchParameter(CodedContextElement.SearchParameter value) {
        this.searchParameter = value;
    }

    /**
     * Gets the value of the outputCodeTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getOutputCodeTransformation() {
        return outputCodeTransformation;
    }

    /**
     * Sets the value of the outputCodeTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setOutputCodeTransformation(Id value) {
        this.outputCodeTransformation = value;
    }

    /**
     * Gets the value of the outputDisplayNameTransformation property.
     * 
     * @return
     *     possible object is
     *     {@link Id }
     *     
     */
    public Id getOutputDisplayNameTransformation() {
        return outputDisplayNameTransformation;
    }

    /**
     * Sets the value of the outputDisplayNameTransformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Id }
     *     
     */
    public void setOutputDisplayNameTransformation(Id value) {
        this.outputDisplayNameTransformation = value;
    }

    /**
     * Gets the value of the match property.
     * 
     */
    public boolean isMatch() {
        return match;
    }

    /**
     * Sets the value of the match property.
     * 
     */
    public void setMatch(boolean value) {
        this.match = value;
    }

    /**
     * Gets the value of the search property.
     * 
     */
    public boolean isSearch() {
        return search;
    }

    /**
     * Sets the value of the search property.
     * 
     */
    public void setSearch(boolean value) {
        this.search = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="enumeration">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{}CDset">
     *                 &lt;attribute name="includeDescendants" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="externalValueSet" type="{}Id" maxOccurs="unbounded"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "enumeration",
        "externalValueSet"
    })
    public static class MatchingDomain {

        protected CodedContextElement.MatchingDomain.Enumeration enumeration;
        protected List<Id> externalValueSet;

        /**
         * Gets the value of the enumeration property.
         * 
         * @return
         *     possible object is
         *     {@link CodedContextElement.MatchingDomain.Enumeration }
         *     
         */
        public CodedContextElement.MatchingDomain.Enumeration getEnumeration() {
            return enumeration;
        }

        /**
         * Sets the value of the enumeration property.
         * 
         * @param value
         *     allowed object is
         *     {@link CodedContextElement.MatchingDomain.Enumeration }
         *     
         */
        public void setEnumeration(CodedContextElement.MatchingDomain.Enumeration value) {
            this.enumeration = value;
        }

        /**
         * Gets the value of the externalValueSet property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the externalValueSet property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getExternalValueSet().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Id }
         * 
         * 
         */
        public List<Id> getExternalValueSet() {
            if (externalValueSet == null) {
                externalValueSet = new ArrayList<Id>();
            }
            return this.externalValueSet;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{}CDset">
         *       &lt;attribute name="includeDescendants" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Enumeration
            extends CDset
        {

            @XmlAttribute(required = true)
            protected boolean includeDescendants;

            /**
             * Gets the value of the includeDescendants property.
             * 
             */
            public boolean isIncludeDescendants() {
                return includeDescendants;
            }

            /**
             * Sets the value of the includeDescendants property.
             * 
             */
            public void setIncludeDescendants(boolean value) {
                this.includeDescendants = value;
            }

        }

    }


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
     *         &lt;element ref="{}syntaxOnResource"/>
     *       &lt;/sequence>
     *       &lt;attribute name="source" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="code"/>
     *             &lt;enumeration value="displayName"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "syntaxOnResource"
    })
    public static class SearchParameter {

        @XmlElement(required = true)
        protected SyntaxOnResource syntaxOnResource;
        @XmlAttribute(required = true)
        protected String source;

        /**
         * Defines the parameter name to be used in case
         * 									the resource is not HL7 compliant for a given context.
         * 								
         * 
         * @return
         *     possible object is
         *     {@link SyntaxOnResource }
         *     
         */
        public SyntaxOnResource getSyntaxOnResource() {
            return syntaxOnResource;
        }

        /**
         * Sets the value of the syntaxOnResource property.
         * 
         * @param value
         *     allowed object is
         *     {@link SyntaxOnResource }
         *     
         */
        public void setSyntaxOnResource(SyntaxOnResource value) {
            this.syntaxOnResource = value;
        }

        /**
         * Gets the value of the source property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Sets the value of the source property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }

}
