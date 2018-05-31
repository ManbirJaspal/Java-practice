package com.Manbir;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("678 677 0712");

    public static void main(String[] args) {
        boolean quit = false;
        startPhone();
        printAction();
        while(!quit) {

            System.out.println("\nEnter action: (6 to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                System.out.println("\nShutting down...");
                break;

                case 1:
                    mobilePhone.printContacts();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printAction();
                    break;

            }

        }
    }

    private static void addNewContact() {
        System.out.println("Enter new contact name");
        String name = scanner.nextLine();
        System.out.println("Enter phone number");
        String phone = scanner.nextLine();

        Contact newContact = Contact.createContact(name, phone);
        if (mobilePhone.addNewContact(newContact)) {
            System.out.println("New Contact added: name = " + name + ", phone = " + phone);
        } else {
            System.out.println("Cannot add contact, " + name + " already on file");
        }
    }

    private static void updateContact() {
        System.out.println("Enter existing contact name");
        String oldName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(oldName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        System.out.println("Enter new contact name");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhone);
        if(mobilePhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Successfully updated record");
        } else {
            System.out.println("Error updating contact");
        }


    }

    private static void removeContact() {
        System.out.println("Enter existing contact name");
        String oldName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(oldName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }

        if (mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Removed Successfully");
        } else {
            System.out.println("Error deleting contact");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name");
        String oldName = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(oldName);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Name: " + existingContactRecord.getName() + ", Phone Number: "+ existingContactRecord.getPhoneNumber());
    }

    private static void startPhone() {
        System.out.println("Starting Phone.....");
    }

    private static void printAction() {
        System.out.println("\nAvailable actions: \npress");
        System.out.println("0 - To shutdown\n" +
                           "1 - To print contacts\n" +
                           "2 - To add a new contact\n" +
                "3 - To Update an existing contact\n" +
                "4 - To Remove an existing contact\n" +
                "5 - Query if an contact exists\n" +
                "6 - To print a list of available actions.");
        System.out.println("Choose your action: ");
    }
}
