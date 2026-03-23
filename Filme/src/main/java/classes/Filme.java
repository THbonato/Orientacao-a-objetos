package classes;

import java.util.Scanner;

public class Filme {
    private String titulo;
    private String diretor;
    private int duracao;
    private double preco;
    
    public Filme(){
        this.titulo = "";
        this.diretor = "";
        this.duracao = 0;
        this.preco = 0.0;
    }
    
    public Filme(String titulo, String diretor, int duracao, double preco){
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public void copiar(Filme outro){
        this.titulo = outro.getTitulo();
        this.diretor = outro.getDiretor();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o Titulo do Filme: ");
        this.titulo = ler.next();
        System.out.print("informe o Diretor do Filme: ");
        this.diretor = ler.next();
        System.out.print("Informe a Duracao do Filme: ");
        this.duracao = ler.nextInt();
        System.out.print("Informe o Preco do Filme: ");
        this.preco = ler.nextDouble();
    }
    
    public void imprimir(){
        System.out.println("__________ Dados do Filme ______________");
        System.out.println("Título: " + this.titulo);
        System.out.println("Diretor: " + this.diretor);
        System.out.println("Duração: " + this.duracao);
        System.out.println("Preço: " + this.preco);
        System.out.println("_________________________________________");
    }
    
    
    //Getters e Setters
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    
    public String getDiretor(){
        return this.diretor;
    }
    
    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    
    public int getDuracao(){
        return this.duracao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
}
