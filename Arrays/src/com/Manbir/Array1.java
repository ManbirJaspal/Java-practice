package com.Manbir;

import java.util.Scanner;

public class Array1 {

    private static Scanner scanner = new Scanner(System.in); // this is important to get an input.

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for (int i = 0; i < myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }

        System.out.println("The average is " + getAvg(myIntegers));

    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values. \r");
        int[] values = new int[number];

        for (int i = 0; i < values.length ; i++) {
            System.out.println("Enter value for position " + i );
            values[i] = scanner.nextInt(); //this accepts an integer from the console and returns the integer in value[i].
        }
        return values;
    }

    public static double getAvg(int[] array) {
        int sum = 0;
        for (int i = 0; i<array.length; i++) {
            sum += array[i];
        }

        return (double) sum / (double)array.length;
    }

}
