/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection.list;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("A");
        list.add(10);
        list.add("A");
        list.add(null);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.add(2,"M");
        list.add("N");
        System.out.println(list);
    }
}
