package com.Manbir;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
        lhmap.put(22,"Abey");
        lhmap.put(33,"lolwa");
        lhmap.put(1,"Sunny");
        lhmap.put(2,"SAHIB");
        lhmap.put(56,"dad");

        Set set = lhmap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.println(mentry.getKey() + ":" + mentry.getValue());

        }
    }
}
