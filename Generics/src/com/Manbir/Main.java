package com.Manbir;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {   //Generics allows us to create classes in the faces of methods that take
                                                // types as parameters called type parameters.

        ArrayList<Integer> items = new ArrayList();
        items.add(1);
        items.add(2);
        items.add(3);
       // items.add("Manbir");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> n) {
        for (Object i : n) {
            System.out.println((Integer) i * 2);
        }
    }
}
