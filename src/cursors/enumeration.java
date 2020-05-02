/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cursors;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class enumeration {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings({"unchecked", "UseOfSystemOutOrSystemErr"})
    public static void main(String[] args) {
        // TODO code application logic here

        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < 10; i++) {
            v.addElement(i);
        }

        Enumeration<Integer> e = v.elements();
        while (e.hasMoreElements()) {
            Integer nextElement = e.nextElement();
            if (nextElement % 2 == 0) {
                System.out.println(nextElement);
            }
        }
    }

}
