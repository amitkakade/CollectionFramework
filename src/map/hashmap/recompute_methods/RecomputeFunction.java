/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.hashmap.recompute_methods;

import java.util.HashMap;

/**
 *
 * Java 1.8v
 * 
 * compute() - Computes a new value using the specified function. It then
 * associates the computed value to the specified key.
 *
 * computeIfAbsent() - If the specified key is not mapped to any value, the
 * method will compute a new value using the specified function. It then
 * associates the new value with the key.
 *
 * computeIfPresent() - If the specified key is already mapped to any value,
 * this method will compute a new value using the specified function. It then
 * associates the new value with the key.
 *
 * @author amit
 */
public class RecomputeFunction {

    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Aniket", 1);
        hm.put("Bhavna", 100);
        hm.put("Sarang", 99);
        hm.put("Amit", 10);
        System.out.println("Original HashMap: " + hm);

        hm.compute("Amit", (key, old_value) -> old_value + 99);
        //hm.compute("Sarang", (key, old_value) -> null); // key-value mapping is removed due to null.(1.8v)
        System.out.println("HashMap using compute(): " + hm);

        hm.computeIfAbsent("Bhupesh", key -> 1001);
        hm.computeIfAbsent("Bhupesh", key -> null); // Map remains unchanged if we adding null.(1.8v)
        System.out.println("HashMap using computeIfAbsent(): " + hm);

        hm.computeIfPresent("Bhavna", (key, old_value) -> old_value - 1000);
        //hm.computeIfPresent("Bhavna", (key, old_value) -> null); // key-value mapping is removed due to null.(1.8v)
        System.out.println("HashMap using computeIfPresent(): " + hm);

    }
}
