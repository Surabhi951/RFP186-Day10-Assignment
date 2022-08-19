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

    void editContact() {
        boolean isContactFound = false;
        System.out.println(AddressBook);
        System.out.println("Enter Name to edit Contact");
        String name = sc.next();
        for (ContactPerson contactPerson : AddressBook) {
            if (name.equalsIgnoreCase(contactPerson.getFirstName())) {
                isContactFound = true;
                System.out.print("Enter First Name :");
                contactPerson.setFirstName(sc.next());
                System.out.print("Enter Last Name :");
                contactPerson.setLastName(sc.next());
                System.out.print("Enter Address :");
                contactPerson.setAddress(sc.next());
                System.out.print("Enter City :");
                contactPerson.setCity(sc.next());
                System.out.print("Enter State :");
                contactPerson.setState(sc.next());
                System.out.print("Enter ZipCode :");
                contactPerson.setZipCode(sc.nextInt());
                System.out.print("Enter Phone Number :");
                contactPerson.setPhoneNumber(sc.nextLong());
                System.out.print("Enter email :");
                contactPerson.setEmail(sc.next());
                System.out.println(contactPerson);
                break;
            }
        }
        if (isContactFound) {
            System.out.println("Contact Updated Successfully..");
        } else {
            System.out.println("Oops...Contact not found");
        }
    }

    void deleteContact(){
        boolean isContactFound=false;
        System.out.println("enter name to delete contact");
        String name =sc.next();
        for (ContactPerson contactPerson : AddressBook){
            if (contactPerson.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("contact found:");
                isContactFound=true;
                System.out.println(contactPerson);
                System.out.println("confirm to delete (y/n)");
                if (sc.next().equalsIgnoreCase("y")) {
                    AddressBook.remove(contactPerson);
                    System.out.println("contact deleted");
                }
                break;
            }
        }
        if (!isContactFound) {
            System.out.println("Opps... contact not found");
        }
    }
    void showContacts() {
        if (AddressBook.isEmpty()) {
            System.out.println("No contacts to display");
        } else {
            for (ContactPerson contactPerson : AddressBook) {
                System.out.println(contactPerson);
            }
        }
    }
}


