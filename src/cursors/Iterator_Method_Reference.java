/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursors;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author admin
 */
@SuppressWarnings("unchecked")
public class Iterator_Method_Reference {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Iterator itr = l.iterator();
        itr.forEachRemaining(System.out::println);
    }
}
