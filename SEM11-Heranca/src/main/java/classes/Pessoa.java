
package classes;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;

    public Pessoa(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    public Pessoa() {
        this.nome = "";
        this.idade = 0;
        this.cpf = "";
    }
    
    public void imprimir(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("CPF: " + this.cpf);
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = ler.nextLine();
        System.out.println("Idade: ");
        this.idade = ler.nextInt();
        System.out.println("CPF: ");
        this.cpf = ler.nextLine();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
