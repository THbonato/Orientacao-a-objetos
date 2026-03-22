
package com.mycompany.sem04.collection;

import java.util.HashMap;
import java.util.Map;

public class exercicio7 {
    public static void main(String[] args) {
        
        String texto = "hello world";
        
        Map<Character,Integer> quant_char = new HashMap<>();
        
        for (char letra : texto.toCharArray()) {
            quant_char.put(letra, quant_char.getOrDefault(letra, 0) + 1);
        }
        
        System.out.println(quant_char);
    }
}
