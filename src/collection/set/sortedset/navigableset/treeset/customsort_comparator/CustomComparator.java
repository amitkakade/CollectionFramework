/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.set.sortedset.navigableset.treeset.customsort_comparator;

import java.util.Comparator;

/**
 *
 * @author amit
 */
public class CustomComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 < o2) {
            return +1;
        } else if (o1 > o2) {
            return -1;
        } else {
            return 0;
        }
    }

}