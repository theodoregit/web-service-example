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
@XmlType(name = "score", propOrder = {
    "name",
    "department",
    "wins",
    "losses",
    "ties",
    "draws"
})
public class Score {

    @XmlElement(required = true)
    protected String name;
    protected String department;
    protected int wins;
    protected int losses;
    protected int ties;
    protected int draws;

  
    public String getName() {
        return name;
    }

  
    public void setName(String value) {
        this.name = value;
    }
    
    public String getDepartment() {
        return department;
    }

  
    public void setDepartment(String value) {
        this.department = value;
    }

  
    public int getWins() {
        return wins;
    }

  
    public void setWins(int value) {
        this.wins = value;
    }

 
    public int getLosses() {
        return losses;
    }


    public void setLosses(int value) {
        this.losses = value;
    }


    public int getTies() {
        return ties;
    }

    public void setTies(int value) {
        this.ties = value;
    }
    
    
    public int getDraws() {
    	return draws;
    }
    
    public void setDraws(int value) {
    	this.draws = value;
    }
      
    

}
