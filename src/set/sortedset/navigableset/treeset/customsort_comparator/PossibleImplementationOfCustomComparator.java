/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.sortedset.navigableset.treeset.customsort_comparator;

import java.util.Comparator;
import java.util.TreeSet;

/**
 *
 * @author amit
 */
public class PossibleImplementationOfCustomComparator {

    public static void main(String[] args) {

        System.out.println("\nBy using o1.compareTo(o2)");
        Comparator<Integer> c1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        TreeSet<Integer> ts1 = new TreeSet(c1);
        ts1.add(10);
        ts1.add(0);
        ts1.add(15);
        ts1.add(20);
        ts1.add(20);
        System.out.println(ts1);

        System.out.println("\nBy using o2.compareTo(o1)");
        Comparator<Integer> c2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };

        TreeSet<Integer> ts2 = new TreeSet(c2);
        ts2.add(10);
        ts2.add(0);
        ts2.add(15);
        ts2.add(20);
        ts2.add(20);
        System.out.println(ts2);

        System.out.println("\nBy using -(o2.compareTo(o1)");
        Comparator<Integer> c3 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o2.compareTo(o1));
            }
        };

        TreeSet<Integer> ts3 = new TreeSet(c3);
        ts3.add(10);
        ts3.add(0);
        ts3.add(15);
        ts3.add(20);
        ts3.add(20);
        System.out.println(ts3);

        System.out.println("\nBy using -(o1.compareTo(o2)");
        Comparator<Integer> c4 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -(o1.compareTo(o2));
            }
        };

        TreeSet<Integer> ts4 = new TreeSet(c4);
        ts4.add(10);
        ts4.add(0);
        ts4.add(15);
        ts4.add(20);
        ts4.add(20);
        System.out.println(ts4);

        System.out.println("\nBy using 1");
        Comparator<Integer> c5 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 1;
            }
        };

        TreeSet<Integer> ts5 = new TreeSet(c5);
        ts5.add(10);
        ts5.add(0);
        ts5.add(15);
        ts5.add(20);
        ts5.add(20);
        System.out.println(ts5);

        System.out.println("\nBy using -1");
        Comparator<Integer> c6 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return -1;
            }
        };

        TreeSet<Integer> ts6 = new TreeSet(c6);
        ts6.add(10);
        ts6.add(0);
        ts6.add(16);
        ts6.add(20);
        ts6.add(20);
        System.out.println(ts6);

        System.out.println("\nBy using 0");
        Comparator<Integer> c7 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        };

        TreeSet<Integer> ts7 = new TreeSet(c7);
        ts7.add(10);
        ts7.add(0);
        ts7.add(17);
        ts7.add(20);
        ts7.add(20);
        System.out.println(ts7);

    }
}
