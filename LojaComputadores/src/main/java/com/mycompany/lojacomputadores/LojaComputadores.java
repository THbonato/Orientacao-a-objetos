package com.mycompany.lojacomputadores;

import classes.Computador;

public class LojaComputadores {

    public static void main(String[] args) {
        
        Computador c = new Computador();
        c.preencher();
        c.imprimir();
        
        Computador a = new Computador();
        a.setProcessador("i3");
        a.copiar(c);
        c.imprimir();
    }
}
