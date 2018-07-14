package com.Manbir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;

public class ArrayListLooping {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        //Using for loop

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //Using for each loop

        for (Integer al: arrayList) {
            System.out.println(al);
        }

        //using While loop

        int j = 0;
        while(arrayList.size() > j) {
            System.out.println(arrayList.get(j));
            j++;
        }

        //Using iterator

        Iterator itr = arrayList.iterator();

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Enumeration

        Enumeration<Integer> enumer = Collections.enumeration(arrayList);

        while(enumer.hasMoreElements()) {
            System.out.println(enumer.nextElement());
        }
        

    }
}
