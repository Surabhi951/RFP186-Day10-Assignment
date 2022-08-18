package com.bridgelabz.addressBook;

import java.util.Scanner;

public class AddressBook {
   static Scanner sc=new Scanner(System.in);
   ContactPerson createContact(){
        System.out.println("Enter first name: ");
        String firstName=sc.next();
        System.out.println("Enter last name: ");
        String lastName=sc.next();
        System.out.println("Enter address: ");
        String address=sc.next();
        System.out.println("Enter city: ");
        String city=sc.next();
        System.out.println("Enter state: ");
        String state=sc.next();
        System.out.println("Enter ZipCode: ");
        int zipCode=sc.nextInt();
        System.out.println("Enter phoneNumber: ");
        long phoneNumber=sc.nextLong();
        System.out.println("Enter Email: ");
        String email=sc.next();

        ContactPerson person=new ContactPerson(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        System.out.println("created new contact");
        return person;
    }

}
