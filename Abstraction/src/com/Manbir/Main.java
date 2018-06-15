package com.Manbir;

public class Main {

    public static void main(String[] args) {
	Dog dog = new Dog("Yorkie");
	dog.breath();
	dog.eat();

	Parrot parrot = new Parrot("American parrot");
	parrot.breath();
	parrot.eat();
	parrot.fly();

	Penguin penguin = new Penguin("Emperor");
	penguin.fly();
    }
}
