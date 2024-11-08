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
@XmlType(name = "t", propOrder = {
    "fullname",
    "unit",
    "salary",
    "supervisor",
    "position"
})
public class MakeTxn {

    @XmlElement(required = true)
    protected String fullname;
    protected String unit;
    protected Double salary;
    protected String supervisor;
    protected String position;

  
    public String getFullname() {
        return fullname;
    }

  
    public void setFullname(String value) {
        this.fullname = value;
    }
    
    public String getUnit() {
        return unit;
    }

  
    public void setUnit(String value) {
        this.unit = value;
    }
    
    public Double getSalary() {
        return salary;
    }

  
    public void setSalary(Double value) {
        this.salary = value;
    }
    
    public String getSupervisor() {
        return supervisor;
    }

  
    public void setSupervisor(String value) {
        this.supervisor = value;
    }
    
    public String getPosition() {
        return position;
    }

  
    public void setPosition(String value) {
        this.position = value;
    }
    
    

}
