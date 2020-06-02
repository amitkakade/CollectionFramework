/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map.sortedmap.navigablemap;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 *
 * @author amit
 */
public class NavigableMapIntro {

    public static void main(String[] args) {
        
        NavigableMap<String, Integer> map = new TreeMap<>();
        map.put("a", 1);
        map.put("z", 1);
        map.put("u", 1);
        map.put("r", 1);
        map.put("q", 1);
        map.put("l", 1);
        System.out.println("\nmap : " + map);
        System.out.println("\nmap.floorKey(\"z\") : " + map.floorKey("z"));
        System.out.println("\nmap.floorEntry(\"z\") : " + map.floorEntry("z"));
        System.out.println("\nmap.lowerKey(\"z\") : " + map.lowerKey("z"));
        System.out.println("\nmap.lowerEntry(\"z\") : " + map.lowerEntry("z"));
        System.out.println("\nmap.ceilingKey(\"r\") : " + map.ceilingKey("r"));
        System.out.println("\nmap.ceilingEntry(\"r\") : " + map.ceilingEntry("r"));
        System.out.println("\nmap.higherKey(\"r\") : " + map.higherKey("r"));
        System.out.println("\nmap.higherEntry(\"r\") : " + map.higherEntry("r"));
        System.out.println("\nmap.pollFirstEntry() : " + map.pollFirstEntry());
        System.out.println("\nmap.pollLastEntry() : " + map.pollLastEntry());
        System.out.println("\nmap : " + map);
        System.out.println("\nmap.keySet() : " + map.keySet());
        System.out.println("\nmap.navigableKeySet() : " + map.navigableKeySet());
        System.out.println("\nmap.descendingKeySet() : " + map.descendingKeySet());
        System.out.println("\nmap.descendingMap() : " + map.descendingMap());
        
        System.out.println("\nIterator on navigable-map");
        Iterator itr = map.navigableKeySet().iterator();
        while (itr.hasNext()) {
            System.out.println(map.get((String) itr.next()));
        }
        
        System.out.println("\nmap.tailMap(\"q\") : " + map.tailMap("q"));
        System.out.println("\nmap.tailMap(\"q\",false) : " + map.tailMap("q", false));
        System.out.println("\nmap.tailMap(\"q\",true) : " + map.tailMap("q", true));
        System.out.println("\nmap.headMap(\"q\") : " + map.headMap("q"));
        System.out.println("\nmap.headMap(\"q\",false) : " + map.headMap("q", false));
        System.out.println("\nmap.headMap(\"q\",true) : " + map.headMap("q", true));
        System.out.println("\nmap.subMap(\"a\", \"r\") : "+map.subMap("a", "r"));
        System.out.println("\nmap.subMap(\"a\", true, \"r\", true) : "+map.subMap("a", true, "r", true));
        System.out.println("\nmap.subMap(\"a\", true, \"r\", false) : "+map.subMap("a", true, "r", false));
        System.out.println("\nmap.subMap(\"a\", false, \"r\", true) : "+map.subMap("a", false, "r", true));
        
    }
}
