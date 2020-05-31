/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.deque.linkedlist;

import java.util.Deque;
import java.util.LinkedList;

/**
 *
 * @author amit
 */
public class LinkedListIntro {

    public static void main(String[] args) {
        Deque deq = new LinkedList();
        deq.offer("Amit");
        deq.offer(15);
        deq.offerLast("Samar");
        deq.offerFirst(21);
        deq.offer("Arshad");
        deq.addFirst("Subham");
        deq.offer(151);
        System.out.println("Elements after adding element to the LinkedList: " + deq);

        System.out.println("\nFirst element by using getFirst()");
        System.out.println(deq.getFirst());
        System.out.println("\nLast element by using getLast()");
        System.out.println(deq.getLast());
        System.out.println("\nFirst element by using peekFirst()");
        System.out.println(deq.peekFirst());
        System.out.println("\nLast element by using peekLast()");
        System.out.println(deq.peekLast());
        System.out.println("\nRemove first element by using removeFirst()");
        System.out.println(deq.removeFirst());
        System.out.println("\nRemove last element by using removeLast()");
        System.out.println(deq.removeLast());
        System.out.println("Elementes in the LinkedList after removing elements: " + deq);
        System.out.println("\nRemove first element by using pollFirst()");
        System.out.println(deq.pollFirst());
        System.out.println("\nRemove last element by using pollLast()");
        System.out.println(deq.pollLast());
        System.out.println("\nElementes in the LinkedList after removing elements: " + deq);
        deq.push(new StringBuilder("Soham"));
        System.out.println("\nAfter adding element by stack push() method : " + deq);
        System.out.println("\nRemove first element by using pop()");
        System.out.println(deq.pop());
        System.out.println("\nElementes in the LinkedList after removing element: " + deq);
    }

}
