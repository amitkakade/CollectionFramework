/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author amit
 */
public class CollectionsIntro {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();
        list.add("Z");
        list.add("A");
        list.add("K");
        list.add("N");
        System.out.println("\nAraryList : " + list);

        Collections.sort(list);
        System.out.println("\nCollections.sort(list) : " + list);

        Comparator comp = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Collections.sort(list, comp);
        System.out.println("Collections.sort(list,comp) : " + list);
        System.out.println("\nCollections.binarySearch(list,\"A\") : " + Collections.binarySearch(list, "A"));
        System.out.println("\nCollections.binarySearch(list,\"Q\") : " + Collections.binarySearch(list, "Q"));

        System.out.println("\nArrayList : " + list);
        Collections.reverse(list);
        System.out.println("Collections.reverse(list) : " + list);
        comp = Collections.reverseOrder(comp);
        Collections.sort(list, comp);
        System.out.println("\nCollections.sort(list, comp) : " + list);

    }

}
