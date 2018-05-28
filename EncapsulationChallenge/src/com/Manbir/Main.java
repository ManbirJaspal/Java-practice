package com.Manbir;

public class Main {

    public static void main(String[] args) {
	Printer printer = new Printer(50, true);
        System.out.println("initial page count is " + printer.getNumberOfPagesPrinted());

	int pagesprinted = printer.printing(4);
        System.out.println("Pages printed was " + pagesprinted + " . New total print count for printer = " + printer.getNumberOfPagesPrinted());

        pagesprinted = printer.printing(3);
        System.out.println("Pages printed was " + pagesprinted + " . New total print count for printer = " + printer.getNumberOfPagesPrinted());

    }
}
