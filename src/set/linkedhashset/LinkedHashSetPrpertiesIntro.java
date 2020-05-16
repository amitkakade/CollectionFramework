/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set.linkedhashset;

import java.util.LinkedHashSet;

/**
 *
 * @author Amit Kakade
 */
public class LinkedHashSetPrpertiesIntro {

    public static void main(String[] args) {
        LinkedHashSet lh = new LinkedHashSet();
        lh.add("Z");
        lh.add("A");
        lh.add("C");
        lh.add(null);
        lh.add(10);
        System.out.println(lh.add("Z"));
        System.out.println(lh);
    }
    
}
