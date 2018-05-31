package com.Manbir;


import java.util.Scanner;

public class Person {

    private static Scanner scanner = new Scanner(System.in);


    private String name;
    private String address;
    private String id;

    public Person(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getId() {
        return id;
    }

    public static void main(String[] args) {

        Person arr[] = new Person[3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name, address and ID");
            String name = scanner.nextLine();
            String address = scanner.nextLine();
            String id = scanner.nextLine();
            scanner.nextLine();

            arr[i] = new Person(name, address, id);
    }

        System.out.println("Using for loop!!");
    for (int i = 0; i < arr.length; i++) {
        System.out.println("Name: " + arr[i].getName() + ", Address: " + arr[i].getAddress() + ", ID: " + arr[i].getId());
    }

        System.out.println("Using while loop!!");
        int i = 0;
        while( i < arr.length ) {
            System.out.println("Name: " + arr[i].getName() + ", Address: " + arr[i].getAddress() + ", ID: " + arr[i].getId());
            i++;
        }
        System.out.println("Using do while loop!!");
        int j = 0;
        do {
            System.out.println("Name: " + arr[j].getName() + ", Address: " + arr[j].getAddress() + ", ID: " + arr[j].getId());
            j++;
        } while(j < arr.length);




}
}

