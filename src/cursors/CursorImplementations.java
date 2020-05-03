/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursors;

import java.util.*;

/**
 *
 * @author admin
 */
public class CursorImplementations {
    public static void main(String[] args) {
        Vector v = new Vector();
        Enumeration e = v.elements();
        Iterator i = v.iterator();
        ListIterator li = v.listIterator();
        System.out.println(e.getClass().getName());
        System.out.println(i.getClass().getName());
        System.out.println(li.getClass().getName());
    }
}
