
package classes;

import java.util.Scanner;

public class Pessoa {
    private String nome;
    private char sexo;
    private int idade;

    public Pessoa(String nome, char sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    public Pessoa() {
        this.nome = "";
        this.sexo = ' '; // mudei pq não sei como instancia em char
        this.idade = 0;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = ler.nextLine();
        System.out.println("Sexo: ");
        this.sexo = ler.next().charAt(0);
        System.out.println("Idade: ");
        this.idade = ler.nextInt();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
