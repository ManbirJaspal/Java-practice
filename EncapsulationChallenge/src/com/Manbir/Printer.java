package com.Manbir;

public class Printer {
    private int tonerlevel = 100;
    private int numberOfPagesPrinted;
    private boolean duplex;

    public Printer(int tonerlevel, boolean duplex) {
        if (this.tonerlevel > -1 && this.tonerlevel <=100) {
            this.tonerlevel = tonerlevel;
        } else {
            this.tonerlevel = -1;
        }
        this.duplex = duplex;
        this.numberOfPagesPrinted = 0;
    }

    public void fillToner(int toner) {
        int remainingToner = 100 - tonerlevel;
        int addToner = this.tonerlevel + toner;
        if (addToner > 100) {
            System.out.println("Toner will overflow. Maximum toner to be added = " + remainingToner);
        } else {
            this.tonerlevel += toner;
            System.out.println("Current toner level = " + this.tonerlevel);
        }

    }

    public int printing(int pages) {
        int pagesToPrint = pages;
        if (this.duplex) {
            pagesToPrint = (pages / 2) + (pages %  2);
            System.out.println("Printing in duplex mode");
        }
        this.numberOfPagesPrinted += pagesToPrint;
        System.out.println("Printing......");
        return pagesToPrint;
    }

    public int getNumberOfPagesPrinted() {
        return numberOfPagesPrinted;
    }
}
