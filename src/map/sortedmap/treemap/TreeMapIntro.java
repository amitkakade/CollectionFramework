/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.sortedmap.treemap;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author amit
 */
public class TreeMapIntro {

    public static void main(String[] args) {

        TreeMap m = new TreeMap();
        m.put("M", 11111);
        m.put("N", 11);
        m.put("L", 111);
        m.put("Z", 1);
        m.put("Q", 1111);
        //m.put(5, 1111); // Gives Class Cast Exception due to Natural Order sorting. As it require homogenious keys
        System.out.println("Insertion Order Not Preserved Data printed Using Default Natural Sorting Order");
        System.out.println(m);

        TreeMap<String, Integer> m2 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                String s1 = (String) o1;
                String s2 = (String) o2;
                return -s1.compareTo(s2);
            }
        });
        m2.put("M", 11111);
        m2.put("N", 11);
        m2.put("L", 111);
        m2.put("Z", 1);
        m2.put("Q", 1111);
        //m2.put("M", null);  // Null Values are allowed in TreeMap.
        //m2.put(null, 1111); // Null keys not allowed in TreeMap

        System.out.println("\nInsertion Order Not Preserved Data printed Using Custom Sort");
        System.out.println(m2);

        System.out.println("\nComputeIfAbsent: If key is absent then added with value calculated by mapping function.");
        m2.computeIfAbsent("P", (key) -> 123);
        System.out.println(m2);

        System.out.println("\nComputeIfPresent: If key is Present then modified with value calculated by mapping function. If not then not added to the treemap");
        m2.computeIfPresent("I", (key, old_value) -> {
            System.out.println("Old Value: " + old_value);
            return old_value + 100;
        });
        System.out.println(m2);

        System.out.println("\ncompute(): If key is absent then added with value calculated by mapping function.");
        m2.compute("Z", (key, old_value) -> {
            System.out.println("Old Value: " + old_value);
            return old_value + 100;
        });
        System.out.println(m2);

//        System.out.println("\ncompute(): Null Pointer Exception for compute function because of performing operation on null value.");
//        System.out.println("If key is not present in TreeMap then it will add key to TreeMap but operation should not be performed on old value as it's value is null");
//        m2.compute("H", (key, old_value) -> {
//            System.out.println("Old Value: " + old_value);
//            return old_value + 100;
//        });

        System.out.println("\nmerge(): method used to merge value to the TreeMap based on mapping function if key is already present And if key is not present then it will be added to the TreeMap.");
        m2.merge("K", 007, (key, old_value) -> {
            return old_value + 007;
        });
        System.out.println(m2);
        
        System.out.println("\nkeySet() method and then converted to List using stream api");
        Set<String> key_set = m.keySet();
        List<String> key_list = key_set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(key_list);
        
        System.out.println("\nPrinting Value from entrySet() using forEach()");
        Set<Map.Entry<String,Integer>> entry_set = m.entrySet();
        entry_set.forEach(System.out::println);
        
        System.out.println("\ngetOrDefault method with TreeMap");
        System.out.println(m.getOrDefault("B", 456));
        

    }
}
