package com.bridgelabz.addressBook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {
        System.out.println("Welcome to Address-book");
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        addressBook.addNewAddressBook();

        boolean flag1 = true;
        while (flag1){
            System.out.println("*************\n"+AddressBook.AddressBookList.keySet());
            System.out.println("current AddressBook Name: "+addressBook.currentAddressBookName);
            System.out.println("Select option\n1.Add Contact\n2.Edit Contact\n3.Show Contacts\n4.Delete Contact\n5.Add New AddressBook\n6.Select AddressBook\n7.Exit");
            int option=scanner.nextInt();
            switch (option){
                case 1:
                    ContactPerson contact=addressBook.createContact();
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.editContact();
                    break;
                case 3:
                    addressBook.showContacts(AddressBook.currentAddressBook);
                    break;
                case 4:
                    addressBook.deleteContact();
                    break;
                case 5:
                    addressBook.addNewAddressBook();
                    break;
                case 6:
                    addressBook.selectAddressBook();
                    break;
                case 7:
                    flag1=false;
                    break;
                default:
                    System.out.println(option+" is not valid option");
                    break;
            }
        }
    }
}
