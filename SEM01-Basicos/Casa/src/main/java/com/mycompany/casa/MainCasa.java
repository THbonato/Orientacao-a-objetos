package com.mycompany.casa;

import classes.Casa;

public class MainCasa {
    
    

    public static void main(String[] args) {
        Casa c1 = new Casa();
        c1 .preencher();
        double p1 = c1.calcularPrecoPorM2();
        
        Casa c2 = new Casa();
        c2.preencher();
        double p2 = c2.calcularPrecoPorM2();
        
        Casa c3 = new Casa();
        c3.preencher();
        double p3 = c3.calcularPrecoPorM2();
        
        c1.exibirResumo();
        c2.exibirResumo();
        c3.exibirResumo();
        
        Casa melhorCasa = c1;
        double menorPreco = p1;
        
        if(p2 < menorPreco){
            menorPreco = p2;
            melhorCasa = c2;
        }else if(p3 < menorPreco){
            menorPreco = p3;
            melhorCasa = c3;
        }
        
        System.out.println("Melhor custo por m²: ");
        melhorCasa.exibirResumo();
          
    }
}
