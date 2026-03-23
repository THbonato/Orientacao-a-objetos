/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.livraria;

import classes.Livro;

/**
 *
 * @author tbona
 */
public class LivroMain {

    public static void main(String[] args) {
        
        Livro l1 = new Livro();
        l1.preencher();
        System.out.println(l1.toString());
    }
}
