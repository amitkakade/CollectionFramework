/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.sortedset.navigableset.treeset.defaultsort_userdefinedclass;

import common.classes.Employee;
import java.util.TreeSet;

/**
 *
 * @author amit
 */
public class EmployeeSorting {
    public static void main(String[] args) {
        TreeSet<Employee> employee_tree = new TreeSet<>();
        employee_tree.add(new Employee(3, "Amit Kakade", 2.5d));
        employee_tree.add(new Employee(2, "Pawan Suradkar", 2.5d));
        employee_tree.add(new Employee(1, "Shubham Kare", 1.0d));
        
        System.out.println("\nDisplaying data by using forEach method");
        employee_tree.forEach(System.out::println);
        
        System.out.println("\nDisplaying data by using Spliterator");
        employee_tree.spliterator().forEachRemaining(System.out::println);
        
        System.out.println("\nDisplaying data by using Stream");
        employee_tree.stream().forEach(System.out::println);
    }
}
