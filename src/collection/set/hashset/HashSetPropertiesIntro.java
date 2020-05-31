/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.set.hashset;

import java.util.HashSet;

/**
 *
 * @author Amit Kakade
 */
public class HashSetPropertiesIntro {

    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add("Z");
        h.add("A");
        h.add("C");
        h.add(null);
        h.add(10);
        System.out.println(h.add("Z"));
        System.out.println(h);
    }
    
}
