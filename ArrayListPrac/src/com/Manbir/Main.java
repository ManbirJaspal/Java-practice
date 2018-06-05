package com.Manbir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    ArrayList<Cars> cars = new ArrayList<Cars>();
        ArrayList<String> str = new ArrayList<String>();
        Iterator itr = str.iterator();

        str.add("abc");
        str.add("234");
        str.add("456");

        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter cars color, make and engine!!");
            String color = scanner.nextLine();
            String make = scanner.nextLine();
            String engine = scanner.nextLine();

            cars.add(new Cars(color, make, engine));  //adding into an arraylist of class

        }

        for (Cars values: cars) {                       // looping through a arraylist of class
            System.out.println(values.getColor());
            System.out.println(values.getMake());
            System.out.println(values.getEngine());


        }

        }
}


