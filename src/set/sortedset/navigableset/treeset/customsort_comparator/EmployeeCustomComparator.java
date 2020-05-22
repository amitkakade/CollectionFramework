/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.sortedset.navigableset.treeset.customsort_comparator;

import common.classes.Employee;
import java.util.Comparator;

/**
 *
 * @author amit
 */
public class EmployeeCustomComparator implements Comparator<Employee> {

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

}
