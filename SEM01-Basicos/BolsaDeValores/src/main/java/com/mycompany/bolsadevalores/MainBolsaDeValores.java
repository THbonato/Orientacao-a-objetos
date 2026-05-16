package com.mycompany.bolsadevalores;

import classes.Ativo;

public class MainBolsaDeValores {

    public static void main(String[] args) {
        
        Ativo a1 = new Ativo();
        a1.preencher();
        
        Ativo a2 = new Ativo();
        a2.preencher();
        
        Ativo a3 = new Ativo();
        a3.preencher();
        
        a1.exibirResumo();
        a2.exibirResumo();
        a3.exibirResumo();
        
        Ativo[] carteira = {a1, a2, a3};
        double totalCarteira = 0;
        
        for (Ativo a : carteira){
            totalCarteira += a.calcularPosicaoDoAtivo();
        }
        
        System.out.println("Valor total da carteira: " + totalCarteira);
    }
}
