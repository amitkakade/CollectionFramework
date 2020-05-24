/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.hashmap.linkedhashmap;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Like HashMap all properties are same in LinkedHashMap except following
 * properties.
 *
 * In LinkedHashMap Insersition Order is preserved.
 *
 * Underline datastructure is HashTable and LinkedList.
 *
 * @author amit
 */
public class LinkedHashMapIntro {
    public static void main(String[] args) {{

        Map<String, Integer> m = new LinkedHashMap<>();
        m.put("A", 1000);
        m.put("B", 100);
        m.put("N", 5000);
        m.put("D", 600);
        m.put("M", 700);

        System.out.println("Displaying Data using forEach() method.");
        m.forEach((key, value) -> System.out.println(key + "----" + value));

        System.out.println(m.put("A", 1051));

        Set<String> ks = m.keySet();
        System.out.println(ks);

        Collection<Integer> kv = m.values();
        System.out.println(kv);

        Set s = m.entrySet();
        System.out.println(s);

        Iterator itr = m.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry e = (Map.Entry) itr.next();
            System.out.println(e.getKey() + "----" + e.getValue());
            if (e.getKey().equals("A")) {
                System.out.println(e.setValue(900));
            }
        }
        System.out.println(m);

        System.out.println("\nUsing Stream API with LinkedHashMap");
        System.out.println("By using map.entrySet().forEach(consumer)");
        Consumer<Map.Entry<String, Integer>> consumer = (entry) -> System.out.println(entry.getKey() + "----" + entry.getValue());
        m.entrySet().forEach(consumer);

        System.out.println("\nBy using map.forEach(bi_consumer) [BiConsumer example]");
        BiConsumer<String, Integer> bi_consumer = (key, value) -> System.out.println(key + "----" + value);
        m.forEach(bi_consumer);

        System.out.println("\nBy using map.keySet().forEach(string_consumer)");
        Consumer<String> string_consumer = (keys) -> System.out.println(keys);
        m.keySet().forEach(string_consumer);
        
        System.out.println("\nBy using map.values().forEach(integer_consumer)");
        Consumer<Integer> integer_consumer = (i) -> System.out.println(i);
        m.values().forEach(integer_consumer);
        
    }}
}
