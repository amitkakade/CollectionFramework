/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

/**
 * Like HashMap all properties are same in IdentityHashMap except following
 * properties.
 *
 * In HashMap keys are compared by .equals mthod i.e, content comparasn.
 *
 * In WeakHashMap keys are compared by == operator i.e, reference comparasn.
 *
 * @author amit
 */
public class IdentityHashMapIntro {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(new Integer(10), "Amit");
        hm.put(new Integer(10), "Sumit");
        System.out.println("HashMap: " + hm);

        IdentityHashMap<Integer, String> ihm = new IdentityHashMap<>();
        ihm.put(new Integer(10), "Amit");
        ihm.put(new Integer(10), "Sumit");
        System.out.println("IdentityHashMap: " + ihm);

    }

}
