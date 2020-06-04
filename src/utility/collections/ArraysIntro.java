/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utility.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author amit
 */
public class ArraysIntro {

    public static void main(String[] args) {
        
        System.out.println("Primitive Array Sorting.");
        int[] a_i = {1, 5, 6, 8, 3, 4};
        System.out.println("Before Sorting elements of int array: ");
        for (int i : a_i) {
            System.out.println(i);
        }
        Arrays.sort(a_i);
        System.out.println("After Sorting elements of int array: ");
        for (int i : a_i) {
            System.out.println(i);
        }

        System.out.println("\nObject Array Sorting");
        String[] a_s = {"A", "Z", "K"};
        System.out.println("Before Sorting elements of String array: ");
        for (String s : a_s) {
            System.out.println(s);
        }
        Arrays.sort(a_s);
        System.out.println("After Sorting elements of String array: ");
        for (String s : a_s) {
            System.out.println(s);
        }
        
        System.out.println("\nSearching element : ");
        System.out.println("Arrays.binarySearch(a_s, \"Z\") : "+Arrays.binarySearch(a_s, "Z"));
        System.out.println("Arrays.binarySearch(a_s, \"L\") : "+Arrays.binarySearch(a_s, "L"));
        
        /**
         * Comparator Using Lambda Expression.
         */
        Comparator<String> comp = (String o1, String o2) -> {
            return o2.compareTo(o1);
        };
        
        Arrays.sort(a_s, comp);
        System.out.println("\nAfter Sorting elements of String array with Comparator: ");
        for (String s : a_s) {
            System.out.println(s);
        }
        
        System.out.println("\nSearching element with comparator: ");
        System.out.println("Arrays.binarySearch(a_s, \"Z\", comp) : " + Arrays.binarySearch(a_s, "Z", comp));
        System.out.println("Arrays.binarySearch(a_s, \"L\", comp) : " + Arrays.binarySearch(a_s, "L", comp));
        
        System.out.println("\nConverting primitive array elements to list Object : ");
        List int_list = Arrays.asList(IntStream.of(a_i).boxed().toArray());
        System.out.println(int_list);
        System.out.println("\nConverting primitive array elements to list Object : ");
        List<String> string_list = Arrays.asList(a_s);
        System.out.println(string_list);
        
    }
}
