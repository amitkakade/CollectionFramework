/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.set.sortedset.navigableset.treeset.customsort_comparator;

import java.util.TreeSet;

/**
 *
 * @author amit
 */
public class DescendingOrderIntegers {

    public static void main(String[] args) {

        System.out.println("By implementing Comparator interface.");
        TreeSet<Integer> ts1 = new TreeSet<>(new CustomComparator());
        ts1.add(10);
        ts1.add(0);
        ts1.add(15);
        ts1.add(20);
        ts1.add(20);
        System.out.println(ts1);

        System.out.println("\nBy using lambda expression.");
        TreeSet<Integer> ts2 = new TreeSet<>((o1, o2) -> (o1 < o2) ? +1 : (o1 > o2) ? -1 : 0);
        ts2.add(10);
        ts2.add(0);
        ts2.add(15);
        ts2.add(20);
        ts2.add(20);
        System.out.println(ts2);

    }

}
