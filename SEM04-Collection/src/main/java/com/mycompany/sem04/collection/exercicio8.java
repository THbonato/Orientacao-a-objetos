
package com.mycompany.sem04.collection;

import java.util.HashMap;
import java.util.Map;

public class exercicio8 {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new HashMap<>();
        
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        
        Map<String, Integer> invert_map = new HashMap<>();
        
        for (Map.Entry<Integer, String> invert : map.entrySet()) {
            invert_map.put(invert.getValue(), invert.getKey());
        }
        
        System.out.println(invert_map);
    }
}
