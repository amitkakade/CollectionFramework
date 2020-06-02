/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.deque.arraydeque;

import java.util.ArrayDeque;

/**
 *
 * @author amit
 */
public class ArrayDequeIntro {
    
    public static void main(String[] args) {
        ArrayDeque adeck = new ArrayDeque();
        adeck.peek();
        adeck.peekFirst();
        adeck.peekLast();
        adeck.peek();
        adeck.add("Amit");
        adeck.add("Sumit");
        adeck.add("Amit");
        adeck.add(10);
        adeck.add(10);
        System.out.println(adeck);
    }
    
}
