package com.Manbir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Theatre theatre = new Theatre("Olympain", 8, 12);
        List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats); //copying elements
        printList(seatCopy);
        seatCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("pay for A02");
        } else {
            System.out.println("seat taken");
        }

        Collections.reverse(seatCopy);
        System.out.println("Printing seatcopy");
        printList(seatCopy);
        System.out.println("Printing original");
        printList(theatre.seats);

        Collections.shuffle(seatCopy);
        System.out.println("Shuffling");
        printList(seatCopy);

        sortList(seatCopy);
        System.out.println("Sorted");
        printList(seatCopy);
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("==================================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j<list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    Collections.swap(list, i, j);
                }
            }
        }
    }
}
