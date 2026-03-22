/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sem04.collection;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author tbona
 */
public class exercicio1 {

    public static void main(String[] args) {
        
        Queue<String> fila = new LinkedList<>();
        
        fila.add("Thierry");
        fila.add("Giovana");
        fila.add("Cristian");
        fila.add("Tiago");
        fila.add("Sabrina");
        
        while(!fila.isEmpty()){
            String cliente = fila.poll();
            System.out.println("Atendendo: " + cliente);
            System.out.println("Quantidade de Clientes restantes: " + fila.size());
        }
    }
}
