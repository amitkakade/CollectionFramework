/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.blockingqueue.priorityblockingqueue;

import common.classes.Employee;
import java.util.Comparator;
import java.util.concurrent.PriorityBlockingQueue;

/**
 *
 * @author amit
 */
public class PriorityBlockingQueueCustomSort {

    public static void main(String[] args) {

        PriorityBlockingQueue<Employee> pbq = new PriorityBlockingQueue<>(11,new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.emp_id > o1.emp_id) {
                    return -1;
                } else if (o1.emp_id < o1.emp_id) {
                    return +1;
                } else {
                    return 0;
                }
            }
        });
        pbq.put(new Employee(51, "Majibur Rehman", 2.5));
        pbq.put(new Employee(6, "Raj thakre", 2.5));
        pbq.put(new Employee(1, "Amit Kakade", 2.5));
        pbq.put(new Employee(2, "Balasaheb Thakre", 2.5));
        pbq.put(new Employee(3, "Rohit Sardana", 2.5));
        pbq.put(new Employee(4, "Yogi Adityanath", 2.5));
        pbq.put(new Employee(11, "Narendra Modi", 2.5));
        pbq.put(new Employee(19, "Amit Kakade", 2.5));
        System.out.println(pbq);

        System.out.println("\nUsing Poll method removing elements from PriorityBlockingQueue");
        while (true) {
            Object obj = pbq.poll();
            if (obj == null) {
                break;
            }
            System.out.println(obj);
        }

    }

}
