package com.Manbir;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  //clears input buffer

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
            }

        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - print list of grocery items");
        System.out.println("\t 2 - To add item to list of grocery items");
        System.out.println("\t 3 - To modify an item in list of grocery items");
        System.out.println("\t 4 - To remove an item in list of grocery items");
        System.out.println("\t 5 - To search an item in list of grocery items");
        System.out.println("\t 6 - To quit the application");

    }

    public static void addItem() {
        System.out.println("Please enter the grocery item");
        groceryList.addGroceryItem(scanner.nextLine());
    }



    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Enter new item: ");
        String newitem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newitem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our groceryList");
        } else {
            System.out.println(searchItem + " not found!");
        }
    }

    public static void processArrayList() {                         //copying arrayList into another.
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList()); //same as above, but here its happening at the time
                                                                                            //when we are declaring and initializing the new object for tje newArray list object.
        // to convert from ArrayList to Array

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray); // this where the converting happens.

    }
}
