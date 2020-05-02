/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursors;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author admin
 */
public class Iterator_Lambda_Expression {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6,7,8,9);
        Iterator itr = l.iterator();
        itr.forEachRemaining(num -> System.out.println(num));
    }
}
