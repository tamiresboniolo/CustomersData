# Customers Data

The purpose of Customers Data project was to work with inheritance and polymorphism in Java.
First, on the person class I write appropriate accessor and mutator functions for all the fields, non-argument constructor that sets all fields to empty strings, constructor that takes all the data about customer as parameters (4 parameters) and initializes fields, Override toString() and equals() methods for the class, Override clone() method.
For this project I considered all of the fields to be of a primitive type, although strings are not. Because stings are immutable, but the default clone() will work just fine for them. 
Second, the customer is a class which derived from the person class.

To illustrate the concept of polymorphism and late binding:
In main I declare and allocate an array of base type person for 3 elements. Populate the array with 2 objects of type customer, and 1 object of type person.
