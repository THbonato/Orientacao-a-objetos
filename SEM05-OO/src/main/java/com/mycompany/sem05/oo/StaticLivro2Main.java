package com.mycompany.sem05.oo;

import classes.StaticLivro2;

public class StaticLivro2Main {
    public static void main(String[] args) {
        StaticLivro2 l1 = new StaticLivro2("Harry Potter e a Pedra Filosofal", "J.K. Rooling", 240);
        StaticLivro2 l2 = new StaticLivro2("Como Fazer Amigos e Influênciar Pessoas", "Dale Carnegie", 284);
        StaticLivro2 l3 = new StaticLivro2("Carta Sobre a Tolerância", "John Locke", 72);
    
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println("------------------------------");
        StaticLivro2.NomeDaBiblioteca = "IFSMG";
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        
        /*Explicação:
            Acontece por causa do STATIC.
            Um Stitic não pertence ao objeto, ele pertence a classe.
            Existe apenas um na memória que é compartilhada com todos os objetos.
        */
    }
}
