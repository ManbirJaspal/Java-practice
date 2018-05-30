package com.Manbir;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item); //adding item into array list. it does it automatically.

    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));  //arraylistname.get(index number) retrieves the element at that index.
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newitem) {
        groceryList.set(position, newitem); // the .set() modifies the List at given position with the new value
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }

    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);

        if (position >= 0) {
            return true;
        }
        return false;
    }

    private int findItem(String searchItem) {
//        //boolean exists = groceryList.contains(searchItem);  //  .contains() returns true or false
//        int position = groceryList.indexOf(searchItem); // indexof() returns the position of the requested item if it exists or returns -1 if it doesnt exist
//        if(position >= 0) {
//            return groceryList.get(position);
//        }
//        return null;

        return groceryList.indexOf(searchItem);

    }
}
