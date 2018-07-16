package com.Manbir;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(1, "Manbir");
        hmap.put(2, "Sahib");
        hmap.put(3, "nehar");
        hmap.put(4, "sahibir");
        hmap.put(5, "papar");

        //Display Hashmap using iterator
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is: " + mentry.getKey() + " & value is: " + mentry.getValue());
        }

        //Get value based on key

        String var = hmap.get(2);
        System.out.println("Value of var is: " + var);

        //Remove values based on key

        hmap.remove(3);
        System.out.println("Map key and values after removal");
        Set set2 = hmap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mentry2 = (Map.Entry)iterator2.next();
            System.out.println("Key is: " + mentry2.getKey() + " & value is: " + mentry2.getValue());

        }


    }
}
