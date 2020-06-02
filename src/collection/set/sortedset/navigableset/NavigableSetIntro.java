/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.set.sortedset.navigableset;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author amit
 */
public class NavigableSetIntro {

    public static void main(String[] args) {
        
        NavigableSet set = new TreeSet();
        set.add("a");
        set.add("b");
        set.add("z");
        set.add("c");
        set.add("k");
        set.add("o");
        set.add("p");
        System.out.println(set);
        System.out.println("\nset.floor(\"b\") : " + set.floor("b"));
        System.out.println("\nset.lower(\"b\") : " + set.lower("b"));
        System.out.println("\nset.ceiling(\"j\") : " + set.ceiling("j"));
        System.out.println("\nset.higher(\"k\") : " + set.higher("k"));
        System.out.println("\nset.descendingSet() : " + set.descendingSet());
        
        System.out.println("\nUsing descendingIterator");
        Iterator itr = set.descendingIterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        
        System.out.println("\nset.tailSet(\"z\") : " + set.tailSet("o"));
        System.out.println("\nset.tailSet(\"z\",false) : " + set.tailSet("z", false));
        System.out.println("\nset.headSet(\"c\") : " + set.headSet("c"));
        System.out.println("\nset.headSet(\"c\", false) : " + set.headSet("c", true));
        System.out.println("\nset.subSet(\"a\", \"c\") : " + set.subSet("a", "c"));
        System.out.println("\nset.subSet(\"a\", true, \"c\", true) : " + set.subSet("a", true, "c", true));
        
    }
}
