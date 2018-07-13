package com.Manbir;

import java.util.ArrayList;
import java.util.Iterator;

public class TestCollection3 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Sunny");
        al.add("Sunny1");
        al.add("Sunny2");

        ArrayList<String> al2 = new ArrayList<String>();

        al2.add("Sunny");
        al2.add("Sunny5");
        al.removeAll(al2);

        System.out.println("++++++++++++++++++++++++++++++");

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
