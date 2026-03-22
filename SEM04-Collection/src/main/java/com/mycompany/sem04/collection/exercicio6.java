/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem04.collection;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author tbona
 */
public class exercicio6 {
    public static void main(String[] args) {
        
        String[] palavras = {"Maça", "Banana", "Agua", "Maça", "Banana"};
        
        Map<String, Integer> quant_palavras = new HashMap<>();
        
        for (String palavra : palavras) {
            Integer count = quant_palavras.getOrDefault(palavra, 0);
            quant_palavras.put(palavra, count + 1);
        }
        
        System.out.println(quant_palavras);
    }
}
