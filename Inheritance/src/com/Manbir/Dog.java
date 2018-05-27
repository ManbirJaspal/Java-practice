package com.Manbir;
// here we are using the base class, i.e Animal and adding on to it.
public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;




    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {  //created constructor that inherited from the animal class automatically and initialized the base characteristics of an animal, but we can add on to it.
        super(name, 1, 1, size, weight);   //to call a constructor that is from the class we are inheriting from. The super class is Animal here.
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called!");
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() Called");
        chew();
        super.eat(); //calls the eat method from the main class
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);   // we can use super.move() too. be its not recommended.
    }


    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.movelegs() called.");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called.");
        moveLegs(5);
        super.move(speed);
    }
}
