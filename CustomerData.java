/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondata;

import java.util.Arrays;
import java.util.*;

/**
 *
 * @author Tamires D Boniolo
 */

public class CustomerData extends PersonData implements Cloneable{

    private int customerNumber; //hold a unique integer for each customer
    private boolean mailingList; // true if the customer want to be on the mailList or false if not
    private ArrayList<Long> transactions; //represents the list of all transactions done with the customer for the last 5 years

    
    /**
     * Accessor for customerNumber field
     *
     * @return the customerNumber
     */
    public int getCustomerNumber() {
        return customerNumber;
    }

    /**
     * Accessor for mailingList field
     *
     * @return the mailingList
     */
    public boolean getMailingList() {
        return mailingList;
    }

    /**
     * Accessor for transactions
     *
     * @return the transactions
     */
    public ArrayList<Long> getTransactions() {
        return new ArrayList<Long>(this.transactions);
    }

    /**
     * Mutator for customerNumber field
     *
     * @param customerNumber the doubleField to set
     */
    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    /**
     * Mutator for mailingList field
     *
     * @param mailingList the doubleField to set
     */
    public void setMailingList(boolean mailingList) {
        this.mailingList = mailingList;
    }

    /**
     * Mutator for transactions
     *
     * @param transactions the transactions to set
     */
    public void setTransactions(ArrayList<Long> transactions) {
        if(transactions == null)
        {
            throw new IllegalArgumentException();
        }
        this.transactions = new ArrayList<Long>(transactions);
    }

    /**
     * Non-argument constructor sets all fields to a empty string and
     * transactions to an empty ArrayList
     */
    public CustomerData() {
        super(); //call for parent constructor
        this.customerNumber = 0;
        this.mailingList = true;
        this.transactions = new ArrayList<Long>();
           
    }
    
    /**
     * Constructor that takes all the data about customer as parameters 
     * @param lastName customer last name
     * @param firstName customer first name
     * @param address customer address 
     * @param phone customer phone number
     * @param customerNumber customer number
     * @param mailingList customer email
     * @param transactions 
     */
    public CustomerData(String lastName, String firstName, String address, String phone, int customerNumber, boolean mailingList, ArrayList<Long> transactions) {
        super(lastName,firstName,address,phone);  //call for parent constructor
        this.customerNumber = customerNumber;
        this.mailingList = mailingList;
        this.transactions = new ArrayList<Long>(transactions);

    }

    /**
     * Method that adds a transaction to the list. 
     * @param t 
     */
    public void addTransaction(long t) {
        if (String.valueOf(t).length() > 15 && t < 0) {
            throw new IllegalArgumentException("Must be no more than 15 digists and positive");
        }
        this.transactions.add(t);      
    }

    /**
     * ToString method that creates and return a string
     *
     * @return all the transactions 
     */
    @Override
    public String toString() {
        return "Customer First Name: " + getFirstName()
                + ", Last Name: " + getLastName() + ", Address: " + getAddress() + ", Phone: " + getPhone()
                + ", Number: " + getCustomerNumber() + ", Mail List: " + getMailingList() + ", Transiction: " + getTransactions();
    }

    /**
     * Equals method
     * @param obj object comparing against
     * @return True if the objects are the same, false otherwise
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (other instanceof CustomerData
                && super.equals(other)
                && customerNumber == ((CustomerData) other).getCustomerNumber()
                && mailingList == ((CustomerData) other).getMailingList()
                && transactions.equals(((CustomerData) other).getTransactions())) {
            return true;
        } else {
            return false;
        }
    }

   /**
    * Clone method
    * @return object
    */
    @Override
    public CustomerData clone() {
        CustomerData copyObj= (CustomerData)super.clone();
        copyObj.customerNumber = this.customerNumber;
        copyObj.mailingList = this.mailingList;
        copyObj.transactions = new ArrayList<Long>(this.transactions);
       return copyObj;
    }


}
