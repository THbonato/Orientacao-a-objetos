package classes;

import java.util.Scanner;

public class Musica {
    
    private String titulo;
    private String artista;
    private double duracao;
    private double preco;
    
    public Musica(){
        this.titulo = "";
        this.artista = "";
        this.duracao = 0.0;
        this.preco = 0.0;
    }
    
    public Musica(String titulo, String artista, double duracao, double preco){
        this.titulo = titulo;
        this.artista = artista;
        this.duracao = duracao;
        this.preco = preco;
    }
    
    public void copiar(Musica outro){
        this.titulo = outro.getTitulo();
        this.artista = outro.getArtista();
        this.duracao = outro.getDuracao();
        this.preco = outro.getPreco();
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.print("Informe o titulo da musica: ");
        this.titulo = ler.next();
        System.out.print("informe o artista da musica: ");
        this.artista = ler.next();
        System.out.print("Informe a duracao da musica: ");
        this.duracao = ler.nextDouble();
        System.out.print("Informe o preco da musica: ");
        this.preco = ler.nextDouble();
    }
    
    //Getters e Setters
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public void setDuracao(double duracao){
        this.duracao = duracao;
    }
    
    public double getDuracao(){
        return this.duracao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
    
}