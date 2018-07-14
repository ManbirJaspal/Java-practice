package com.Manbir;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListInit {
    public static void main(String[] args) {

        //using Inner Class method

        ArrayList<String> cities = new ArrayList<String>() {{
           add("Delhi");
           add("Noida");
           add("Gurgaon");
        }};

        System.out.println(cities);

        //USING Arrays.asList method

        ArrayList<String> obj = new ArrayList<String>(
                Arrays.asList("Manbir", "Sahib", "Neha"));
        System.out.println(obj);

        // Normal way

        ArrayList<String> str = new ArrayList<String>();
        str.add("Sahib");
        str.add("NEha");
        str.add("Sunny");

        System.out.println(str);



    }
}
