package com.Manbir;

import java.util.ArrayList;
import java.util.List;

public class ComparingTwoListsUsingContains {

    public static void main(String[] args) {
        List<String> al1 = new ArrayList<String>();
        al1.add("hi");
        al1.add("How are you?");
        al1.add("Good morning");
        al1.add("bye");
        al1.add("good night");

        List<String> al2 = new ArrayList<String>();
        al2.add("howdy");
        al2.add("Good mornin2g");
        al2.add("bye");
        al2.add("good night");

        List<String> al3 = new ArrayList<String>();
        for (String temp: al1) {
            al3.add(al2.contains(temp) ? "Yes" : "No");
        }
            System.out.println("al3\n " + al3 );

        List<Integer> al4 = new ArrayList<Integer>();
        for (String temp2: al1) {
            al4.add(al2.contains(temp2) ? 1 : 0);
        }
        System.out.println("al4\n " + al4 );


    }
}
