/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.sortedset.navigableset.treeset.customsort_comparator;

import java.util.TreeSet;

/**
 * Adding Heterogenious Data in TreeSet.
 *
 * @author amit
 */
public class HeterogeniousDataSortInTreeSet {

    public static void main(String[] args) {

        TreeSet t = new TreeSet((Object o1, Object o2) -> {
            String s1 = String.valueOf(o1);
            String s2 = String.valueOf(o2);
            return s1.compareTo(s2);
        });
        t.add("A");
        t.add("Z");
        t.add("N");
        t.add(new StringBuffer("L"));
        t.add(new StringBuffer("O"));
        t.add(new StringBuffer("P"));
        
        System.out.println(t);

    }

}
