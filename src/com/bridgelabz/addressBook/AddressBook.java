package com.bridgelabz.addressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AddressBook {

    static HashMap<String,ArrayList> AddressBookList = new HashMap<>();
    static ArrayList <ContactPerson> currentAddressBook;
    static String currentAddressBookName;
    static Scanner sc = new Scanner(System.in);

    ContactPerson createContact(){
        System.out.println("Enter first name: ");
        String firstName = sc.next();
        System.out.println("Enter last name: ");
        String lastName = sc.next();
        System.out.println("Enter address: ");
        String address = sc.next();
        System.out.println("Enter city: ");
        String city = sc.next();
        System.out.println("Enter state: ");
        String state = sc.next();
        System.out.println("Enter ZipCode: ");
        int zipCode = sc.nextInt();
        System.out.println("Enter phoneNumber: ");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter Email: ");
        String email = sc.next();

        ContactPerson person = new ContactPerson(firstName,lastName,address,city,state,zipCode,phoneNumber,email);
        System.out.println("created new contact");
        return person;
    }

    void addContact(ContactPerson person){
        currentAddressBook.add(person);
        System.out.println("contact added to AddressBook "+currentAddressBookName);
        System.out.println(person);
    }

    void editContact(){
        System.out.println("Enter name to edit contact");
        String name = sc.next();
        for (ContactPerson person : currentAddressBook){
            if (person.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("Enter first name: ");
                person.setFirstName(sc.next());
                System.out.println("Enter last name: ");
                person.setLastName(sc.next());
                System.out.println("Enter address: ");
                person.setAddress(sc.next());
                System.out.println("Enter city: ");
                person.setCity(sc.next());
                System.out.println("Enter state: ");
                person.setState(sc.next());
                System.out.println("Enter ZipCode:");
                person.setZipCode(sc.nextInt());
                System.out.println("Enter phoneNumber: ");
                person.setPhoneNumber(sc.nextLong());
                System.out.println("Enter Email: ");
                person.setEmail(sc.next());
                System.out.println("contact updated successfully.");
                System.out.println(person);
                break;
            }
        }
    }
            
     void deleteContact(){
        boolean isContactFound = false;
        System.out.println("Enter name to delete contact: ");
        String name = sc.next();
        for (ContactPerson contact : currentAddressBook){
            if (contact.getFirstName().equalsIgnoreCase(name)) {
                System.out.println("contact found:");
                isContactFound = true;
                System.out.println(contact);
                System.out.println("confirm to delete (y/n)");
                if (sc.next().equalsIgnoreCase("y")) {
                    currentAddressBook.remove(contact);
                    System.out.println("contact deleted");
                }
                break;
            }
        }
        if (!isContactFound) {
            System.out.println("Opps... contact not found");
        }
    }
    
    void addNewAddressBook(){
        System.out.println("Enter name for AddressBook: ");
        String AddressBookName = sc.next();
        ArrayList <ContactPerson> AddressBook = new ArrayList();
        AddressBookList.put(AddressBookName,AddressBook);
        System.out.println("new AddressBook created");
        currentAddressBook = AddressBookList.get(AddressBookName);
        currentAddressBookName = AddressBookName;
    }

    void selectAddressBook(){
        System.out.println(AddressBookList.keySet());
        System.out.println("Enter name of address book:");
        String addressBookName = sc.next();

        for (String key :AddressBookList.keySet()) {
            if (key.equalsIgnoreCase(addressBookName)){
                currentAddressBook = AddressBookList.get(key);
                currentAddressBookName = key;
            }
        }
        System.out.println("current AddressBook is: "+currentAddressBookName);
   }

    void showContacts(ArrayList addressBook){
        System.out.println("Contacts: ");
        for (Object p : addressBook) {
            ContactPerson person = (ContactPerson) p;
            System.out.println(person);
        }
    }
}


