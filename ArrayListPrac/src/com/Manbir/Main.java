package com.Manbir;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    ArrayList<Cars> cars = new ArrayList<Cars>();
        ArrayList<String> str = new ArrayList<String>();

        str.add("abc");
        str.add("234");
        str.add("456");

        System.out.println(str);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter cars color, make and engine!!");
            String color = scanner.nextLine();
            String make = scanner.nextLine();
            String engine = scanner.nextLine();

            cars.add(new Cars(color, make, engine));

        }

        for (Cars values: cars) {
            System.out.println(values.getColor());
            System.out.println(values.getEngine());
            System.out.println(values.getMake());

        }

        }
    }

