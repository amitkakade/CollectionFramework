/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.weakhashmap;

import java.util.WeakHashMap;

/**
 * Like HashMap all properties are same in WeakHashMap except following
 * properties.
 *
 * If reference of the object is removed from key of WeakHashMap then GC will destroy
 * object and hence it's key mapping value is also removed from WeakHashMap.
 *
 * @author amit
 */
public class WeakHashMapIntro {

    public static void main(String[] args) {
        
        try {
            WeakHashMap<Integer, String> whm = new WeakHashMap<>();
            Integer i1 = new Integer(10);
            whm.put(i1, "Amit");
            i1 = null;
            System.gc();
            Thread.sleep(5000);
            System.out.println(whm);
        } catch (InterruptedException e) {
            System.out.println("Thread is interupted");
        }
        
    }

}
