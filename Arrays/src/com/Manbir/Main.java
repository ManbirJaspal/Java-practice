package com.Manbir;

public class Main {

    public static void main(String[] args) {
	int[] myIntArray = new int[25]; // 10 values can be assigned to this array
//        // another way of initializing and assigning an array
//        int[] intArray = {1,2,3,4,5,6,7,8,9,10}; //here we are assigning the values to the array and also telling the array the number of elements it has.
//    myIntArray[5] = 10;
//
//    double[] myDoubleArray = new double[10];
//        System.out.println(myIntArray[5]);

        for (int i = 0; i<myIntArray.length ; i++) {
            myIntArray[i] += i * 10;
        }

        printArray(myIntArray);


    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}


