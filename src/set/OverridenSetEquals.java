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
public class OverridenSetEquals {

    public static void main(String[] args) {
        String s1 = new String("Amit");
        String s2 = new String("Sumit");
        String s3 = new String("Sangeeta");
        String s4 = new String("Sudam");
        Set set = new HashSet();
        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);
        Set set2 = new HashSet();
        set2.add(s1);
        set2.add(s2);
        set2.add(s3);
        set2.add(s4);
        System.out.println(set.equals(set2));
    }
}
