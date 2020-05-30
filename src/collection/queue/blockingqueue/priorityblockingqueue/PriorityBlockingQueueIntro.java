/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.blockingqueue.priorityblockingqueue;

import java.util.Iterator;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author amit
 */
public class PriorityBlockingQueueIntro {

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue queue = new PriorityBlockingQueue();
//        queue.remove(); // NSE exception
        System.out.println(queue.poll());
        System.out.println(queue.poll(1, TimeUnit.SECONDS));
        queue.put("one");
        queue.put("four");
        queue.offer("five");
        queue.offer("eight");
        queue.add("nine");
        queue.add("twelve");
        System.out.println(queue);
        
        System.out.println(queue.peek());
        
        System.out.println("\nUsing iterator() :");
        Iterator itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println("\nUsing toArray()");
        Object[] arr_str = queue.toArray();
        for (int i = 0; i < arr_str.length; i++) {
            System.out.println(arr_str[i]);
        }
        
        System.out.println("\nUsing poll()");
        while (true) {
            Object obj = queue.poll();
            if (obj == null) {
                break;
            }
            System.out.println(obj);
        }
        
//        System.out.println("\nUsing remove()");
//        while(true){
//            System.out.println(queue.remove());
//        }
    }
}
