package com.Manbir;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {

        LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();

        lhs.add(1);
        lhs.add(5);
        lhs.add(7);
        lhs.add(3);
        lhs.add(9);
        lhs.add(2);

        for (Integer values: lhs) {
            System.out.println(values);
        }
    }
}
