//
// This file was generated by the Eclipse Implementation of JAXB, v3.0.2 
// See https://eclipse-ee4j.github.io/jaxb-ri 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2024.11.08 at 03:56:16 PM EAT 
//


package com.mcnz.jee.soap;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="dracct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="cracct" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="date" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="narrative" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dracct",
    "cracct",
    "amount",
    "date",
    "narrative"
})
@XmlRootElement(name = "getTxnRequest")
public class GetTxnRequest {

    @XmlElement(required = true)
    protected String dracct;
    @XmlElement(required = true)
    protected String cracct;
    protected double amount;
    @XmlElement(required = true)
    protected String date;
    @XmlElement(required = true)
    protected String narrative;

    /**
     * Gets the value of the dracct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDracct() {
        return dracct;
    }

    /**
     * Sets the value of the dracct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDracct(String value) {
        this.dracct = value;
    }

    /**
     * Gets the value of the cracct property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCracct() {
        return cracct;
    }

    /**
     * Sets the value of the cracct property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCracct(String value) {
        this.cracct = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(double value) {
        this.amount = value;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDate(String value) {
        this.date = value;
    }

    /**
     * Gets the value of the narrative property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNarrative() {
        return narrative;
    }

    /**
     * Sets the value of the narrative property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNarrative(String value) {
        this.narrative = value;
    }

}
