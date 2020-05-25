/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.hashtable;

import java.util.Hashtable;

/**
 *
 * @author amit
 */
public class HashTableWorking {

    class Temp {

        int i;

        Temp(int i) {
            this.i = i;
        }

        @Override
        public int hashCode() {
            return i;
        }

        @Override
        public String toString() {
            return String.valueOf(i);
        }

    }
    
    public Hashtable<Temp,String> getHashTableObject(){
        Hashtable ht = new Hashtable();
        ht.put(new Temp(10), "Amit"); //Placed at the index 10 which is hash code
        ht.put(new Temp(9), "Rudraksh"); //Placed at the index 9 which is hash code
        ht.put(new Temp(8), "Marutya"); //Placed at the index 8 which is hash code
        ht.put(new Temp(7), "Aamu"); //Placed at the index 7 which is hash code
        ht.put(new Temp(6), "shubham"); ////Placed at the index 6 which is hash code
        return ht;
    }
    
    public static void main(String[] args) {
        HashTableWorking obj = new HashTableWorking();
        Hashtable ht = obj.getHashTableObject() ;
        
        /**
         * Data will be printed from top to bottom and from left to right.
         */
        System.out.println(ht);
    }

}
