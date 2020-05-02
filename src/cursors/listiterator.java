/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursors;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author admin
 */
public class listiterator {

    public static void main(String[] args) {
        List<String> list = new LinkedList(Arrays.asList("Amit", "Sumit", "Umesh", "Ajinkya"));
        System.out.println(list);
        ListIterator<String> itr = list.listIterator();
        while (itr.hasNext()) {
            String s = itr.next();
            if (s.equals("Amit")) {
                itr.remove();
            } else if (s.equals("Ajinkya")) {
                itr.add("Mohini");
            } else if (s.equals("Umesh")) {
                itr.set("Omprakash");
            }
        }
        System.out.println(list);
    }
}
