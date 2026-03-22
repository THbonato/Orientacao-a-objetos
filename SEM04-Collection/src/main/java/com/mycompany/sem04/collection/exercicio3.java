/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sem04.collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author tbona
 */
public class exercicio3 {
    public static void main(String[] args) {
        
        Stack<String> pilha = new Stack<>();
        
        pilha.push("Pagina 1");
        pilha.push("Pagina 2");
        pilha.push("Pagina 3");
        pilha.push("Pagina 4");
        
        Set<String> dom_unic = new HashSet<>();
    
        System.out.println("Voltando as paginas...");
        while (!pilha.isEmpty()){
            String pag = pilha.pop();
            dom_unic.add(pag);
        }
        
        System.out.println("Domínios únicos visitados: " + dom_unic);
    }
}
