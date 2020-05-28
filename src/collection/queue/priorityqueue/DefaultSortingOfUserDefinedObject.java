/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.priorityqueue;

import common.classes.Employee;
import java.util.PriorityQueue;

/**
 *
 * @author amit
 */
public class DefaultSortingOfUserDefinedObject {

    public static void main(String[] args) {
        
        PriorityQueue<Employee> queue = new PriorityQueue();
        queue.offer(new Employee(26, "Meghvi", 2.5));
        queue.offer(new Employee(1, "Vinita", 2.5));
        queue.offer(new Employee(11, "Kshitij", 2.5));
        queue.offer(new Employee(2, "Ajinkya", 2.5));
        queue.offer(new Employee(72, "Mahesh", 3));
        queue.offer(new Employee(7, "Shubham", 5));
        queue.offer(new Employee(3, "kalyani", 6));
        System.out.println(queue);
        
    }

}
