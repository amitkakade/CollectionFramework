/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.blockingqueue.linkedblockingqueue;

import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author amit
 */
public class LinkedBlockingQueueIntro {

    public static void main(String[] args) throws InterruptedException {

        LinkedBlockingQueue linked_queue = new LinkedBlockingQueue();
        //linked_queue.remove(); //Throws NoSuchElementException
        System.out.println("\nUsing poll() method when queue is empty");
        System.out.println(linked_queue.poll());

        linked_queue.add("Amit");
        linked_queue.add(1);
        linked_queue.add(new StringBuffer("Sumit"));

        System.out.println("\nHeterogenous elements are inserted in LinkedBlockingQueue");
        System.out.println(linked_queue);
        
        System.out.println("\nUsing forEach() method printing all the element of LinkedBlockingQueue");
        linked_queue.forEach(System.out::println);

        System.out.println("\nUsing poll() method printing all the elements of LinkedBlockingQueue");
        while (true) {
            Object o = linked_queue.poll();
            if (o == null) {
                System.out.println("As there is no element in the PBQ then printing this " + o + " value");
                break;
            }
            System.out.println(o);
        }
        
        
        linked_queue.add("Amit");
        linked_queue.add(1);
        linked_queue.add(new StringBuffer("Sumit"));
        System.out.println("\nAfter adding elements in queue again.");
        System.out.println(linked_queue);
        System.out.println("\nclearing all the elements of Queue using clear() method.");
        linked_queue.clear();
        System.out.println(linked_queue);
        
        
        linked_queue.add("Amit");
        linked_queue.add(1);
        linked_queue.add(new StringBuffer("Sumit"));
        System.out.println("\nConverting LBQ to array of an Object");
        Object[] obj_array = linked_queue.toArray();
        for (int i = 0; i < obj_array.length; i++) {
            System.out.println(obj_array[i]);
        }
    }

}
