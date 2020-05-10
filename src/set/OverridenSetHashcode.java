/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author admin
 */
public class OverridenSetHashcode {
    public static void main(String[] args) {
        String s1 = new String("Amit");
        String s2 = new String("Sumit");
        String s3 = new String("Sangeeta");
        String s4 = new String("Sudam");
        int a = s1.hashCode() + s2.hashCode() + s3.hashCode() + s4.hashCode();
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());
        System.out.println(s4.hashCode());
        System.out.println(a);
        Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        System.out.println(set.hashCode());
        
    }
}
