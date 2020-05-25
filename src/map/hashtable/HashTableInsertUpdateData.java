/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.hashtable;

import java.util.Hashtable;

/**
 *
 * @author amit
 */
public class HashTableInsertUpdateData {

    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(10, "Amit");
        ht.put(9, "Rudraksh");
        ht.put(8, "Marutya");
        ht.put(7, "Aamu");
        ht.put(6, "shubham");
        //ht.put(null, "God"); // Gives Null Pointer Exception if we are adding null key.
        //ht.put(12, null); // Gives Null Pointer Exception if we are adding null value.
        
        System.out.println("\nComputeIfAbsent: If key is absent then added with value calculated by mapping function.");
        ht.computeIfAbsent(21, (key)->"Jayshree");
        System.out.println(ht);

        System.out.println("\nComputeIfPresent: If key is Present then modified with value calculated by mapping function. If not then not added to the treemap");
        ht.computeIfPresent(99, (key, old_value) -> {
            System.out.println("Old Value: " + old_value);
            return "Ram";
        });
        System.out.println(ht);

        System.out.println("\ncompute(): If key is absent then added with value calculated by mapping function.");
        ht.compute(11, (key, old_value) -> {
            System.out.println("Old Value: " + old_value);
            return "Mahesh";
        });
        System.out.println(ht);


        System.out.println("\nmerge(): method used to merge value to the Hashtable based on mapping function if key is already present And if key is not present then it will be added to the Hashtable.");
        ht.merge(121, "Radhika", (key, old_value) -> {
            return "Krishna";
        });
        System.out.println(ht);

    }
}
