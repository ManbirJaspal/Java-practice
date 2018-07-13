package com.Manbir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Manbir");
        list.add("Sahib");
        list.add("Neha");
        list.add("Savbari");
        list.add("Man");

        Iterator itr = list.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (String lists: list) {
            System.out.println(lists);
        }

    }
}
