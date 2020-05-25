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
public class HashTableAccessData {

    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
        ht.put(10,"Amit");
        ht.put(9,"Rudraksh");
        ht.put(8,"Marutya");
        ht.put(7,"Aamu");
        ht.put(6,"shubham");
        System.out.println(ht.get(9));
        System.out.println(ht.get("Q"));
        System.out.println(ht.getOrDefault("G", "Demo"));
    }
    
}
