/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.animalestimacao;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author EEOlinto Almada
 */
public class MainAnimal {

    public static void main(String[] args) {
        
        Set<String> animais = new HashSet<>();
        
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Cavalo");
        animais.add("Urso");
        animais.add("Cachorro");
        
        for (String animal : animais) {
            System.out.println(animal);
        }
    }
}
