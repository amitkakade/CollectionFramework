/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.priorityqueue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 *
 * @author amit
 */
public class AccessPriorityQueueElements {

    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue();
        /**
         * Method throws an Exception for methods element() and remove() [
         * java.util.NoSuchElementException ].
         *
         * Un-comment following any one line to get exception.
         */
        //queue.element();
        //queue.remove();

        queue.offer("Sunil Tarte");
        queue.offer("Sumit Kakade");
        queue.offer("Sarang Chirmade");
        queue.offer("sambhaji kakade");

        System.out.println("To Get head Element we use peek or element method");
        System.out.println("peek()" + queue.peek());
        System.out.println("element)" + queue.element());
        
        System.out.println("To Print Stream Data");
        List list = queue.stream().collect(Collectors.toList());
        System.out.println(list);
        
    }
}
