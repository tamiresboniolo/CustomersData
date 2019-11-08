/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondata;

/**
 *
 * @author Tamires D Boniolo
 */
public class PersonData implements Cloneable {

    String lastName;
    String firstName;
    String address;
    String phone;

    /**
     * Accessor for lastName field
     *
     * @return last Name field value
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Accessor for firstName field
     *
     * @return First Name field value
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Accessor for address field
     *
     * @return address field value
     */
    public String getAddress() {
        return this.address;
    }

    /**
     * Accessor for phone field
     *
     * @return phone field value
     */
    public String getPhone() {
        return this.phone;
    }

    /**
     * Sets the lastName field
     *
     * @param lastName value to set the field
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the firstName field
     *
     * @param firstName value to set the field
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the address field
     *
     * @param address value to set the field
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the phone field
     *
     * @param phone value to set the field
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * Non-argument constructor sets all fields to a empty string
     */
    public PersonData() {
        this.lastName = "";
        this.firstName = "";
        this.address = "";
        this.phone = "";
    }

    /**
     * Constructor that takes all the data about customer as parameters
     *
     * @param lastName customer last name
     * @param firstName customer first name
     * @param address customer address name
     * @param phone customer phone name
     */
    public PersonData(String lastName, String firstName, String address, String phone) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.address = address;
        this.phone = phone;
    }

    /**
     * ToString method that creates and return a string
     *
     * @return a string of the 4 fields
     */
    @Override
    public String toString() {
        return "Person First Name: " + getFirstName()
                + ", Last Name: " + getLastName() + ", Address: " + getAddress() + ", Phone: " + getPhone();
    }

    /**
     * Equals method
     *
     * @param obj object comparing against
     * @return True if the objects are the same, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof PersonData
                && firstName.equals(((PersonData) obj).getFirstName())
                && lastName.equals(((PersonData) obj).getLastName())
                && address.equals(((PersonData) obj).getAddress())
                && phone.equals(((PersonData) obj).getPhone())) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * clone() method
     * @return null
     */
    @Override
    public PersonData clone() {
        try {
            return (PersonData) super.clone();
            
        } catch (CloneNotSupportedException e) {

            return null;
        }

    }

}
