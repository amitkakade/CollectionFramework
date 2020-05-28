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
public class PriorityQueueInsertElement {

    public static void main(String args[]) {

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

        System.out.println("Elements in this queue are: [ Note: Elements are displayed in the way they are sorted.(By using binary heap) ]");
        System.out.println(intQ);

    }
}
