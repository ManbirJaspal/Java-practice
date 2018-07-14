package com.Manbir;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();
        al.add("Sunny");
        al.add("Sunny1");
        al.add("Sunny2");
        al.add("Sunny3");


        for (String s: al) {
            System.out.println(s);
        }
        List<String> al2 = new ArrayList<String>();
        al2.add("Sunny7");
        al2.add("Sunny8");
        al2.add("Sunny9");
        al2.add("Sunny10");

        al.addAll(1, al2);
        System.out.println("++++++++++++++++++++++++++++");
        for (String s: al) {
            System.out.println(s);
        }

        System.out.println("++++++++++++++");
        System.out.println(al.get(3));

    }


}
