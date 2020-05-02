/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursors;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author admin
 */
public class iterator {
    
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        for (int i = 0; i <= 10; i++) {
            al.add(i);
        }
        System.out.println(al);
        Iterator<Integer> itr = al.iterator();
        while (itr.hasNext()) {
            Integer nextElement = itr.next();
            if (nextElement%2 == 0) {
                System.out.println(nextElement);
            } else {
                itr.remove();
            }
        }
        System.out.println(al);
    }
    
}
