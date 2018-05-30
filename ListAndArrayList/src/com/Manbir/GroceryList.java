package com.Manbir;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item); //adding item into array list. it does it automatically.

    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));  //arraylistname.get(index number) retrieves the element at that index.
        }
    }
    public void modifygroceryItem(String newItem) {
        
    }

    public void modifyGroceryItem(int position, String newitem) {
        groceryList.set(position, newitem); // the .set() modifies the List at given position with the new value
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);  //  .contains() returns true or false
        int position = groceryList.indexOf(searchItem); // indexof() returns the position of the requested item if it exists or returns -1 if it doesnt exist
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }

}
