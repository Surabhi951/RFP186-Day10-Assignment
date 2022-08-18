package com.bridgelabz.addressBook;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address-book");
        AddressBook addressBook = new AddressBook();
        System.out.println(addressBook.createContact());
        Scanner sc = new Scanner(System.in);

        boolean flag1=true;
        while (flag1){
            System.out.println("Select option: \n" +
                    "1.Add Contact \n" +
                    "2.Exit");
            int option=sc.nextInt();
            switch (option){
                case 1:
                    ContactPerson contact=addressBook.createContact();
                    addressBook.addContact(contact);
                    break;
                case 2:
                    flag1=false;
                    break;
                default:
                    System.out.println(option+" is not valid option");
                    break;
            }
        }

    }
}
