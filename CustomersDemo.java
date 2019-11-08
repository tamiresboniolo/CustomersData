/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondata;

import java.util.*;

/**
 *
 * @author Tamires D Boniolo
 */
public class CustomersDemo {

    public static void main(String[] args) {
        PersonData[] personArray = new PersonData[3];

        personArray[0] = new CustomerData("Boniolo", "Tamires", "Rua da esquina", "99999", 1, true, new ArrayList<Long>());
        personArray[1] = new CustomerData("Nunes", "Gustavo", "Rua da padaria", "32974", 2, true, new ArrayList<Long>());
        personArray[2] = new PersonData("Barejan", "Juliana", "Rua do acougue", "981273874");

        //Polymorphism in action
        for (int i = 0; i < personArray.length; i++) {
            System.out.println(personArray[i].toString());
        }

        //Testing Person data 
        PersonData PersonData1 = new PersonData();

        PersonData1.setLastName("Boniolo");
        PersonData1.setFirstName("Rosana");
        PersonData1.setAddress("14258 113th Ave");
        PersonData1.setPhone("425886975");

        System.out.println("The person information is: " + PersonData1);
        System.out.println(PersonData1.toString());

        //Testing Customer data 
        CustomerData CustomerData1 = new CustomerData();
        CustomerData1.setLastName("Garbi");
        CustomerData1.setFirstName("Jair");
        CustomerData1.setAddress("157 10th Ave");
        CustomerData1.setPhone("425888925");
        CustomerData1.setCustomerNumber(3);
        CustomerData1.setMailingList(false);
        CustomerData1.setTransactions(new ArrayList<Long>());
        CustomerData1.addTransaction(100);
        CustomerData1.addTransaction(-200);
        CustomerData1.addTransaction(100000);
        CustomerData1.getTransactions();

        //Testing  Equals method
        System.out.println("Testing equals method: " + CustomerData1.equals(PersonData1));
        System.out.println("Testing equals method: " + PersonData1.equals(CustomerData1));
        System.out.println("Testing equals method: " + CustomerData1.equals(CustomerData1));
        System.out.println("Testing equals method: " + PersonData1.equals(PersonData1));

        System.out.println("The customer information is: " + CustomerData1);
        System.out.println(CustomerData1.toString());

    }
}
