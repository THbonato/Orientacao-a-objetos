
package com.mycompany.sem04.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        
        Map<String, Double> produtos = new HashMap<>();
        
        produtos.put("Camisa", 19.99);
        produtos.put("Short", 14.99);
        produtos.put("Cueca", 8.99);
        produtos.put("Meia", 4.99);
        
        for (Map.Entry<String, Double> dados : produtos.entrySet()) {
             System.out.println("Produto: " + dados.getKey()
                                + " | Preço: " + dados.getValue());
        }
        
        produtos.put("Cueca", 9.99);
        
        
        Scanner ler = new Scanner(System.in);
        System.out.print("Qual Produto você deseja remover: ");
        String prod_remove = ler.next();
        
        if(produtos.containsKey(prod_remove)){
            produtos.remove(prod_remove);
        }else{
            System.out.println("Produto não encontrado.");
        }
            
    }
}

