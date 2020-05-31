/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.set.sortedset.navigableset.treeset;

import java.util.TreeSet;

/**
 *
 * Important Point of TreeSet
 *
 * If you are using default natural sorting order on any object then that class
 * must be Comparable.
 * 
 *--------------------------------------
 * Otherwise throws following exception:
 *--------------------------------------
 * Exception in thread "main" java.lang.ClassCastException:
 * java.lang.StringBuffer cannot be cast to java.lang.Comparable
 *
 * @author Amit Kakade
 */
public class CCEOfNonComparable {

    public static void main(String[] args) {

        TreeSet set = new TreeSet();
        set.add(new StringBuffer("A"));
        System.out.println(set);
        
    }
}
