package com.Manbir;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<Integer>();
        hset.add(11);
        hset.add(23);
        hset.add(21);
        hset.add(56);
        hset.add(65);
        hset.add(634);

        System.out.println(hset);

        String[] str = new String[]{"manbir", "neah"};
        System.out.println(Arrays.toString(str));
    }
}
