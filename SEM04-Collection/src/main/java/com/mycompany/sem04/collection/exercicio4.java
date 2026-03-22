
package com.mycompany.sem04.collection;

import java.util.HashSet;
import java.util.Set;

public class exercicio4 {
    public static void main(String[] args) {
        
        Set<String> nomes = new HashSet<>();
        
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Ana");
        nomes.add("Carlos");
        nomes.add("Bruno");
        nomes.add("Diana");
        
        System.out.println("Total de alunos: " + nomes.size());
        System.out.println("Carlos está presente? " + nomes.contains("Carlos"));
    }
}
