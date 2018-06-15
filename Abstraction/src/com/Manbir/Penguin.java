package com.Manbir;

public class Penguin extends Bird  {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I cant fly");
    }
}
