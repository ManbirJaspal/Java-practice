package com.Manbir;
import java.util.Set;
import java.util.HashSet;
public class HashSetExample {

    public static void main(String[] args) {
        Set<Integer> mySet = new HashSet<Integer>();

        mySet.add(11);
        mySet.add(24);
        mySet.add(13);
        mySet.add(44);
        mySet.add(52);
        mySet.add(67);
        mySet.add(72);
        mySet.add(89);
        mySet.add(91);
        mySet.add(24);


        for (Integer values : mySet) {
            System.out.println(values);
        }

        Set<String> myString = new HashSet<String>();

        myString.add("one");
        myString.add("two");
        myString.add("three");
        myString.add("three");

        for (String valueString : myString) {
            System.out.println(valueString);
        }






    }
}
