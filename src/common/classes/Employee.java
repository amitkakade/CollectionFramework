/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.classes;

/**
 *
 * @author amit
 */
public class Employee implements Comparable<Employee> {

    public int emp_id;
    public String emp_name;
    public double emp_exp;

    public Employee(int emp_id, String emp_name, double emp_exp) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_exp = emp_exp;
    }

    @Override
    public String toString() {
        return "[Employee ID: " + this.emp_id + ", Employee Name: " + this.emp_name + ", Employee Experience: " + this.emp_exp + "]";
    }

    @Override
    public int compareTo(Employee emp) {
        if (this.emp_id < emp.emp_id) {
            return -1;
        } else if (this.emp_id > emp.emp_id) {
            return 1;
        } else {
            return 0;
        }
    }
    
}
