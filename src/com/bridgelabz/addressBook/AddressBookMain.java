package com.bridgelabz.addressBook;

public class AddressBookMain {
    public static void main(String[] args) {
        System.out.println("Welcome to Address-book");
        AddressBook addressBook = new AddressBook();
        System.out.println(addressBook.createContact());

    }
}
