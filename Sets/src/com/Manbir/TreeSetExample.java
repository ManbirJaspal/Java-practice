package com.Manbir;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        TreeSet<Integer> treeInt = new TreeSet<Integer>();

        treeInt.add(2);
        treeInt.add(22);
        treeInt.add(12);
        treeInt.add(32);
        treeInt.add(28);
        treeInt.add(52);
        treeInt.add(52);

        for (Integer value: treeInt)
        {
            System.out.println(treeInt);
        }
    }
}
