/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author tbona
 */
public class Professor extends Pessoa {
    
    private String cpf;

    public Professor(String cpf, String nome, char sexo, int idade) {
        super(nome, sexo, idade);
        this.cpf = cpf;
    }

    public Professor(){
        super();
        this.cpf = "";
    }
}
