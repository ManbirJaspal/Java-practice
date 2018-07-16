package com.Manbir;

import java.util.HashMap;

public class CheckKeyExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
        hmap.put(11, "Manbiir");
        hmap.put(22, "Shaib");
        hmap.put(33, "Neha");
        hmap.put(44, "Papa");
        hmap.put(55, "sabari");
        hmap.put(66, "divya");

        //Checking if key exists or not

        boolean flag = hmap.containsKey(22);
        System.out.println("key 22 exists ?" + flag);

        boolean flag2 = hmap.containsKey(100);
        System.out.println("key 100 exists ?" + flag2);


    }
}
