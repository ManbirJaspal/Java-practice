package com.Manbir;

public class Main {

    public static void main(String[] args) {
	    int[] arr1 = new int[10];
	   // int [] arr2 = {1,2,3};
        // int [] arr3 = new int[]{4,5};

        for (int i = 0; i < arr1.length; i++){
            arr1[i] = i;
        }

	    for ( int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        for (int value: arr1) {
            System.out.println(value);

        }

        int j = 0;
	    while (j < arr1.length) {
            System.out.println(arr1[j]);
            j++;
        }

        int z = 0;
	    do {
            System.out.println(arr1[z]);
            z++;
        } while(z < arr1.length);

        char[] ch = new char[]{'a','b','c','d','e'};

        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

        for (char values: ch) {
            System.out.println(values);
        }

        int z1 = 0;
        while(z1 < ch.length) {
            System.out.println(ch[z1]);
            z1++;
        }

        int z2 = 0;
        do {
            System.out.println(ch[z2]);
            z2++;
        } while(z2 < ch.length);

    }
    

}
