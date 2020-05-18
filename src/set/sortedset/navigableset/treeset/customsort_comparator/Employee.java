/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.sortedset.navigableset.treeset.customsort_comparator;

/**
 *
 * @author amit
 */
public class Employee {

    int emp_id;
    String emp_name;
    double emp_exp;

    public Employee(int emp_id, String emp_name, double emp_exp) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_exp = emp_exp;
    }

    @Override
    public String toString() {
        return "[Employee ID: " + this.emp_id + ", Employee Name: " + this.emp_name + ", Employee Experience: " + this.emp_exp + "]";
    }
}
