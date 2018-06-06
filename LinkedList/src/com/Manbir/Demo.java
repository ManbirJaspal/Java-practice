package com.Manbir;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Sydney");
        addInOrder(placesToVisit, "Melbourne");
        addInOrder(placesToVisit, "Brisbane");
        addInOrder(placesToVisit, "Perth");
        addInOrder(placesToVisit, "Canberra");
        addInOrder(placesToVisit, "Adelaide");
        addInOrder(placesToVisit, "Darwin");
        addInOrder(placesToVisit, "Darwin");
        printList(placesToVisit);

    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();

        while(i.hasNext()) {
            System.out.println("Now visiting: " + i.next());
        }
        System.out.println("*******************************************");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity); //this gives us a number. If the number
            //returned is 0, it means that the string it is comparing to is the same.

            if (comparison == 0) {  
                //equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            }else if(comparison > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
                }
        }
        stringListIterator.add(newCity);
        return true;
    }
}
