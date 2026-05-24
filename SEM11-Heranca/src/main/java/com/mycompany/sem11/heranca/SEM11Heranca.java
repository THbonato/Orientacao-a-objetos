package com.mycompany.sem11.heranca;

import classes.Engenheiro;
import classes.Funcionario;

public class SEM11Heranca {

    public static void main(String[] args) {
        
        Funcionario f = new Funcionario("jose", 30, "072", 1000);
        
        Engenheiro e = new Engenheiro("joao", 30, "010", 1200);
        double bon = e.getBonificacao();
        System.out.println("Bonificação: " + bon);
        
        e.imprimir();
    }
}
