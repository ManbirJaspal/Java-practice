package com.Manbir;

import java.util.*;

public class HMapSorting {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(5, "A");
        hmap.put(11, "C");
        hmap.put(4,"Z");
        hmap.put(77, "Y");
        hmap.put(9, "P");
        hmap.put(66, "Q");
        hmap.put(0, "R");

        System.out.println("Before Sorting");
        Set set = hmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println("Key is: " + mentry.getKey() + " & value is: " + mentry.getValue());
        }

        Map<Integer, String> map = new TreeMap<Integer, String>(hmap);
        System.out.println("after Sorting");
        Set set2 = map.entrySet();
        Iterator iterator2 = set2.iterator();
        while (iterator2.hasNext()) {
            Map.Entry mentry1 = (Map.Entry)iterator2.next();
            System.out.println("Key is: " + mentry1.getKey() + " & value is: " + mentry1.getValue());
        }





    }


}
