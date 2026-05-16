package classes;

import java.util.Scanner;

public class Aluno {
    
    private String nome;
    private int idade;
    private String matricula;
    private int anoIngresso;
    
    public void Aluno(){
        this.nome = "";
        this.idade = 0;
        this.matricula = "";
        this.anoIngresso = 0;
    }
    
    public void Aluno(String nome, int idade, String matricula, int anoIngresso){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.anoIngresso = anoIngresso;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o Nome do Aluno: ");
        this.nome = ler.next();
        System.out.println("Informe a Idade do Aluno: ");
        this.idade = ler.nextInt();
        System.out.println("Informe a Matrícula do Aluno: ");
        this.matricula = ler.next();;
        System.out.println("Informe o Ano de Ingresso do Aluno: ");
        this.anoIngresso = ler.nextInt();
    }
    
    @Override
    public String toString(){
        return "Aluno: " + this.nome
                + " | Idade: " + this.idade
                + " | Matrícula: " + this.matricula
                + " | Ano de Ingresso: " + this.anoIngresso;
    }
    
    public void copia(Aluno outro){
        this.nome = outro.getNome();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.anoIngresso = outro.getAnoIngresso();
    }
    
    //Getters e Setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    
    public String getMatricula(){
        return this.matricula;
    }
    
    public void setAnoIngresso(int anoIngresso){
        this.anoIngresso = anoIngresso;
    }
    
    public int getAnoIngresso(){
        return this.anoIngresso;
    }
}
