package collection.list;


import java.util.Stack;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        System.out.println(v.capacity());
        for (int i = 0; i < 10; i++) {
            v.addElement(i+1);
        }
        System.out.println(v.capacity());
        v.addElement("Amit");
        System.out.println(v.capacity());
        System.out.println(v);
        
        Stack s = new Stack();
        System.out.println(s.capacity());
        for (int i = 0; i < 10; i++) {
            s.addElement(i+1);
        }
        s.addElement("A");
        System.out.println(s.capacity());
    }
}
