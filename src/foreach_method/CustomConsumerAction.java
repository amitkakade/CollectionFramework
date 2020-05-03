/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach_method;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class CustomConsumerAction {
    
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 5, 9, 8, 6, 7, 3, 2, 4);
        System.out.println("Unsorted List elements: " + list);
        System.out.println("Sorted List Elements: " + list.stream().sorted().collect(Collectors.toList()));
        
        Consumer<Integer> square_it = new Consumer<Integer>() {
            @Override
            public void accept(Integer t) {
                System.out.println("Square of " + t + " is: " + t * t);
            }
        };
        System.out.println("\nSquaring each element of sorted list");
        list.stream().sorted().forEach(square_it);
    }
    
}
