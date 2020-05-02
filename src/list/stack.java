/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

import java.util.Stack;

/**
 *
 * @author admin
 */
public class stack {
    public static void main(String[] args) {
        Stack  s = new Stack();
        for (int i = 0; i < 10; i++) {
            s.addElement(i);
        }
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.search(9));
        s.pop();
        System.out.println(s);
    }
}
