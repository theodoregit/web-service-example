package com.teddy.jee.spring;

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
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    protected String cracct;
    protected Double amount;
    protected String date;
    protected String narrative;

    public String getDrAcct() {
        return dracct;
    }
   
    public void setDrAcct(String value) {
        this.dracct = value;
    }
    
    public String getCrAcct() {
        return cracct;
    }
    
    public void setCrAcct(String value) {
        this.cracct = value;
    }
    
    public Double getAmount() {
        return amount;
    }
   
    public void setAmount(Double value) {
        this.amount = value;
    }
    
    public String getDate() {
        return date;
    }
    
    public void setDate(String value) {
        this.date = value;
    }
    
    public String getNarratice() {
        return narrative;
    }
   
    public void setNarrative(String value) {
        this.narrative = value;
    }    

}
