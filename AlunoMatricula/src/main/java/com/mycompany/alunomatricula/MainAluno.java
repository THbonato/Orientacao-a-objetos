/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.alunomatricula;

import classes.Aluno;

/**
 *
 * @author EEOlinto Almada
 */
public class MainAluno {

    public static void main(String[] args) {
        
        Aluno a1 = new Aluno();
        a1.preencher();
        System.out.println(a1.toString());
    }
}
