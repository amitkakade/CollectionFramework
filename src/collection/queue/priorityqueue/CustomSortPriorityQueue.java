/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.queue.priorityqueue;

import common.classes.Employee;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 *
 * @author amit
 */
public class CustomSortPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Employee> queue = new PriorityQueue(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1.emp_id < o2.emp_id) {
                    return +1;
                } else if (o1.emp_id > o2.emp_id) {
                    return -1;
                } else {
                    return 0;
                }
            }

        });
        
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
