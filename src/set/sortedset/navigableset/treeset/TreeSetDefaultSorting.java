/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.sortedset.navigableset.treeset;

import java.util.TreeSet;

/**
 * Defalult Natural Sorting Order Demo.
 * @author Amit Kakade
 */
public class TreeSetDefaultSorting {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add("A");
        set.add("a");
        set.add("B");
        set.add("Z");
        set.add("L");
//        set.add(new Integer(10)); // Class Caste Exception dute to Heterogeneous Data Insertion.
//        set.add(null); // Null Pointer Exception due to null insertion [ This is from 1.6v onwards ]
        System.out.println(set);
    }
}
