package com.Manbir;

import java.util.ArrayList;
import java.util.List;

public class ArrayListPrac {
    public static void main(String[] args) {
        List<String> str = new ArrayList<String>();
        str.add("Manbir");
        str.add("neha");
        str.add("sahib");
        str.add("mom");

        for(String strs: str ) {
            System.out.println(strs);
        }
        System.out.println("*************************************************");

        str.add(2,"Dad");

        for(String strs: str ) {
            System.out.println(strs);
        }
        System.out.println("*************************************************");

        str.remove("Dad"); //removing an element for the array using object.

        for(String strs: str ) {
            System.out.println(strs);
        }
        System.out.println("*************************************************");

        str.remove(2);   //removing an element for the array using index

        for(String strs: str ) {
            System.out.println(strs);
        }
        System.out.println("*************************************************");

        int pos = str.indexOf("mom");  // indexOf gives the position of the element requested. if it doesnt find the element, it returns a -1.
        System.out.println(pos);
        System.out.println("*************************************************");

        String gets = str.get(2);
        System.out.println(gets); // .get returns the object of the list based on the index number.
        System.out.println("*************************************************");

        str.set(1, "PAPA");
        for(String strs: str ) {
            System.out.println(strs);
        }

        System.out.println("*************************************************");

        System.out.println(str.size()); // returns the number of elements in the arraylist.

        System.out.println("*************************************************");

        System.out.println(str.contains("neha")); //.contains returns true or false, if the element exists or not.

        System.out.println("*************************************************");

        str.clear(); // removes all elements in the ArrayList oin one go.




    }

}
