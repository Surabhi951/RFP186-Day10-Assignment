package com.bridgelabz.addressBook;

import java.util.ArrayList;
import java.util.Scanner;
public class AddressBook {
    ArrayList<ContactPerson> AddressBook= new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    
    ContactPerson createContact(){
        ContactPerson person=new ContactPerson();
        System.out.print("Enter First Name :");
        person.setFirstName(sc.next());
        System.out.print("Enter Last Name :");
        person.setLastName(sc.next());
        System.out.print("Enter Address :");
        person.setAddress(sc.next());
        System.out.print("Enter City :");
        person.setCity(sc.next());
        System.out.print("Enter State :");
        person.setState(sc.next());
        System.out.print("Enter ZipCode :");
        person.setZipCode(sc.nextInt());
        System.out.print("Enter Phone Number :");
        person.setPhoneNumber(sc.nextLong());
        System.out.print("Enter email :");
        person.setEmail(sc.next());
        System.out.println("created new contact");
        return person;
    }

    void addContact(){
        ContactPerson contactPerson =createContact();
        AddressBook.add(contactPerson);
        System.out.println(contactPerson);
        System.out.println("Contact Added Successfully...");
    }

}
