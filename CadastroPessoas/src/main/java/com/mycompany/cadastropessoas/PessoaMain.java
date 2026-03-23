/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cadastropessoas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author tbona
 */
public class PessoaMain {
    
    public static int imprimirMenu(){
        Scanner ler = new Scanner(System.in);
        System.out.println("_____Escolha sua opção_____");
        System.out.println("Press 1: Ver Lista de Produtos.");
        System.out.println("Press 2: Atualizar o Preço do Produto.");
        System.out.println("Press 3: Remover Produto");
        System.out.println("Press 0: Sair");
        System.out.println("___________________________");
        
        return ler.nextInt();
    }

    public static void main(String[] args) {
        
        
        //HASHMAP
       /* 
        Map<String, Integer> pessoas = new HashMap<>();
        
        //Inserção
        pessoas.put("Alice", 30);
        pessoas.put("Marcio", 43); 
        pessoas.put("Carlos", 21); 
        
        //Remove
        pessoas.remove("Alice");
        
        //Pegar na lista um elemento
        Integer age = pessoas.get("Alice");
        
        //Percorrendo o Map
        for (Map.Entry<String, Integer> dados : pessoas.entrySet()) {
            System.out.println("Nome: " + dados.getKey()
                     + " | Idade: " + dados.getValue());  
        }
        
        //Busca só as Keys
        for (String nome : pessoas.keySet()) {
            System.out.println("Nome: " + nome);
        }
        
        //Busca só os Values
        for (Integer idade : pessoas.values()) {
            System.out.println("Idade: " + idade);
        }
        
        //Verifica se Existe a Chave
        if(pessoas.containsKey("Carlos")){
            System.out.println(pessoas.get("Carlos")
            + "A idade de Carlos é ");
        }else{
            System.out.println("Chave não encontrada.");
        }
        
        //Trabalhando com os Valores Nulos e Default
        
        //Recupera um valor com um valor padrão
        int idadeGiovana = pessoas.getOrDefault("Giovana", 0);
        System.out.println("A idade da Giovana é: " + idadeGiovana);
    
    */
    //STACK OU PILHA
    
    Stack<String> pilha = new Stack<>();
    
    //Empilha
    pilha.push("A");
    pilha.push("B");
    pilha.push("C");
    
        // POP() -> retorna e remove o item do topo
        System.out.println(pilha.pop());
        
        //PEEK() -> retorna o item do topo sem remover
        System.out.println(pilha.peek());
    }   
}
