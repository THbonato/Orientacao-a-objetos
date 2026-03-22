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
public class exercicio5 {
    public static void main(String[] args) {
        
        Map<String, Integer> jogadores = new HashMap<>();
        
        jogadores.put("Jason", 6);
        jogadores.put("Giovana", 8);
        jogadores.put("Thierry", 4);
        
        jogadores.put("Giovana", jogadores.get("Giovana") + 10);
        
        String maior_pont = "";
        int max = 0;
        
        for (Map.Entry<String, Integer> jogador : jogadores.entrySet()) {
            if(jogador.getValue() > max){
                maior_pont = jogador.getKey();
                max = jogador.getValue();
            }
        }
        
        System.out.println("Maior pontuador: " + maior_pont + " | Pontos: " + max);
    }
}
