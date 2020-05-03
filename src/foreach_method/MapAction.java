/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foreach_method;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 *
 * @author admin
 */
public class MapAction {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 0);
        map.put("D", 4);
        map.put("E", 5);

        System.out.println("By using map.entrySet().forEach(consumer)");
        //Consumer<Map.Entry<String, Integer>> consumer = System.out::println;
        Consumer<Map.Entry<String, Integer>> consumer = (entry) -> System.out.println(entry.getKey() + "=" + entry.getValue());
        map.entrySet().forEach(consumer);

        System.out.println("\nBy using map.forEach(bi_consumer) [BiConsumer example]");
        BiConsumer<String, Integer> bi_consumer = (key, value) -> System.out.println(key + "-" + value);
        map.forEach(bi_consumer);

        System.out.println("\nBy using map.keySet().forEach(string_consumer)");
        Consumer<String> string_consumer = System.out::println;
        map.keySet().forEach(string_consumer);

        System.out.println("\nBy using map.values().forEach(integer_consumer)");
        Consumer<Integer> integer_consumer = System.out::println;
        map.values().forEach(integer_consumer);
    }
}
