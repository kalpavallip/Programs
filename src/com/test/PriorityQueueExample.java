package com.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {
        // Creating a min-heap PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Add elements
        pq.add(10);
        pq.add(5);
        pq.add(30);
        pq.add(2);

        System.out.println("PriorityQueue elements: " + pq);

        // Peek at the smallest element
        System.out.println("Peek (smallest element): " + pq.peek());

        // Remove elements in order of priority
        System.out.println("Polling elements:");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll()); // retrieves and removes the head
        }
    }
}
