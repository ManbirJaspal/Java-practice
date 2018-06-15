package com.Manbir;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();    // The methods that implement this class need to use the abstract methods.(Like we do in an interface)
    public abstract void breath();

    public String getName() {
        return name;
    }
}
