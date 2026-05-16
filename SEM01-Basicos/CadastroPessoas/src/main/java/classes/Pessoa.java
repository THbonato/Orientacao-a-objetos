
package classes;

import java.util.Scanner;

public class Pessoa {
    
    private String nome;
    private String cpf;
    private int idade;

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public Pessoa(){
        this.nome = "";
        this.cpf = "";
        this.idade = 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "Nome: " + nome
                + " | CPF: " + cpf
                + " | Idade: " + idade
                + '}';
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o Nome da Pessoa: ");
        this.nome = ler.nextLine();
        System.out.println("Informe o CPF (xxx.xxx.xxx-xx): ");
        this.cpf = ler.nextLine();
        System.out.println("Informe a Idade: ");
        this.idade = ler.nextInt();
    }
    
    //Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
}
