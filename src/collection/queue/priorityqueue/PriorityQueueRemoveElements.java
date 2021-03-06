/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.priorityqueue;

import java.util.PriorityQueue;

/**
 *
 * @author amit
 */
public class PriorityQueueRemoveElements {

    public static void main(String[] args) {
        PriorityQueue<Integer> intQ = new PriorityQueue<>();
        // offer() and add() are used to add elements

        intQ.add(51);
        intQ.offer(6);
        intQ.add(72);
        intQ.add(1);
        intQ.add(2);
        intQ.offer(3);
        intQ.offer(4);
        intQ.add(11);
        intQ.add(19);

        // printing size of the queue
        System.out.println("Size of this queue is: " + intQ.size());

        // removing values based on priority and printing them
        System.out.println("Priority Queue:");
        while (!intQ.isEmpty()) {
            System.out.println(intQ.remove());
        }
    }
}
