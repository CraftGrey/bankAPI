/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bank;

import java.util.Date;
import javax.xml.bind.annotation.XmlRootElement;


/**
 *
 * @author mac
 */
@XmlRootElement
public class Transaction {
    private double postBalance;
    private double amount;
    private Date date;
    private String description;
    
    
    public Transaction(double postBalance, double amount, Date date, String description) {
        this.postBalance = postBalance;
        this.amount = amount;
        this.date = date;
        this.description = description;
    } 
    
     public Transaction() {
    }
        

    public double getPostBalance() {
        return postBalance;
    }

    public void setPostBalance(double postBalance) {
        this.postBalance = postBalance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}