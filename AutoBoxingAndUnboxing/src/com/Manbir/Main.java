package com.Manbir;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i)); // Integer.valueOf() takes the value and converts it into the Integer Class.
                                                    // Here we are converting a base primitive type int to an Integer. This is called AutoBoxing
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " ---> " + intArrayList.get(i).intValue());  //This in Unboxing. i.e Converting it from the class tot he primitive type.
        }

        //SHORTER WAY
        Integer myIntValue = 56; //Integer.valueOf(56);
        int myInt = myIntValue.intValue(); // converting Integer to int.
    }
}
