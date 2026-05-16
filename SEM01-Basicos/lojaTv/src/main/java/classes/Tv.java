package classes;

import java.util.Scanner;

public class Tv {
    
    private String marca;
    private double tamanho;
    private String resolucao;
    private double preco;
    
    public void Tv(){
        this.marca = "";
        this.tamanho = 0.0;
        this.resolucao = "";
        this.preco = 0.0;
    }
    
    public void Tv(String marca, double tamanho, String resolucao, double preco){
        this.marca = marca;
        this.tamanho = tamanho;
        this.resolucao = resolucao;
        this.preco = preco;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a Marca da TV: ");
        this.marca = ler.next();
        System.out.println("Informe o Tamanho da TV: ");
        this.tamanho = ler.nextDouble();
        System.out.println("Informe a Resolução da TV: ");
        this.resolucao = ler.next();
        System.out.println("Informe o Preço da TV: ");
        this.preco = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        return "TV: Marca: " + this.marca
                + " | Tamanho: " + this.tamanho
                + " | Resolução: " + this.resolucao
                + " | Preço: " + this.preco;
    }
    
    public void copia(Tv outro){
        this.marca = outro.getMarca();
        this.tamanho = outro.getTamanho();
        this.resolucao = outro.getResolucao();
        this.preco = outro.getPreco();
    }
    
    //Getters e Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setTamanho(double tamanho){
        this.tamanho = tamanho;
    }
    
    public double getTamanho(){
        return this.tamanho;
    }
    
    public void setResolucao(String resolucao){
        this.resolucao = resolucao;
    }
    
    public String getResolucao(){
        return this.resolucao;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
}
