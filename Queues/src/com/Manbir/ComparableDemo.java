package com.Manbir;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {

        int[] arr = {22,656,44,2,6,77,33};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("peach");
        fruits.add("strawberry");
        fruits.add("blueberry");

        Collections.sort(fruits);
        for (String s: fruits) {
            System.out.println(s + ", ");

        }
    }
}
