/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.hashmap.merge_method;

import java.util.HashMap;

/**
 * The merge() method associates the specified value to the specified key if the
 * specified key is not already associated.
 *
 * However, if the specified key is already associated with a value, it will
 * merge the new specified value with the existing old value.
 *
 * @author amit
 */
public class HashMapMerge {

    public static void main(String[] args) {
        HashMap<String, Integer> numbers = new HashMap<>();
//        numbers.put("First", 1);
        numbers.put("Second", 2);
        System.out.println("Original HashMap: " + numbers);

        numbers.merge("First", 4, (old_value, new_value) -> {
            return 100;
        });
        System.out.println("New HashMap: " + numbers);
    }
}
