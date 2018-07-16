package com.Manbir;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        q.add("Rick");
        q.add("Maggie");
        q.add("neha");
        q.add("sahib");
        q.add("divya");
        q.add("manbir");

        System.out.println(q);

        //to remove the first element from the queue

        System.out.println(q.remove());
        System.out.println(q);

        //to return the first element

        System.out.println("Head: " + q.element());

        //to remove and return the head of the queue

        System.out.println(q.poll());


    }
}
