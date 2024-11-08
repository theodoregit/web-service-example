package com.teddy.jee.spring;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for score complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="score"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="wins" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="losses" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="ties" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "txn", propOrder = {
    "dracct",
    "cracct",
    "amount",
    "date",
    "narrative",
    "txnref"
})
public class Txn {

    @XmlElement(required = true)
    protected String dracct;
    protected String cracct;
    protected Double amount;
    protected String date;
    protected String narrative;
    protected String txnref;

  
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
    
    public Double GetAmount() {
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
    
    public String getNarrative() {
        return narrative;
    }

  
    public void setNarrative(String value) {
        this.narrative = value;
    }
    
    public String getTxnRef() {
        return txnref;
    }

  
    public void setTxnRef(String value) {
        this.txnref = value;
    }
    
    

}
