/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.hashtable;

import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * @author amit
 */
public class IterateOnHashTable {
    
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
        ht.put(10, "Amit");
        ht.put(9, "Rudraksh");
        ht.put(8, "Marutya");
        ht.put(7, "Aamu");
        ht.put(6, "shubham");
        
        System.out.println("\nkeySet() method and then converted to List using stream api");
        Set<Integer> key_set = ht.keySet();
        List<Integer> key_list = key_set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(key_list);
        
        System.out.println("\nPrinting Value from entrySet() using forEach()");
        Set<Map.Entry<Integer, String>> entry_set = ht.entrySet();
        entry_set.forEach(System.out::println);
        
        System.out.println("\nIterating over keys of Hashtable.");
        Enumeration<Integer> keys = ht.keys();
        while (keys.hasMoreElements()) {
            int key = keys.nextElement();
            System.out.println(key + "---" + ht.get(key));
        }

        System.out.println("\nIterating over values of Hashtable.");
        Enumeration<String> values = ht.elements();
        while (values.hasMoreElements()) {
            System.out.println(values.nextElement());
        }
        
        System.out.println("\nvalues() method of Hashtable");
        Collection<String> collect = ht.values();
        System.out.println(collect);
    }
}
