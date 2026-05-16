package classes;

import java.util.Scanner;

public class Celular {
    
    private String marca;
    private String modelo;
    private int memoria;
    private double preco;
    
    public void Celular(){
        this.marca = "";
        this.modelo = "";
        this.memoria = 0;
        this.preco = 0.0;
    }
    
    public void Celular(String marca, String modelo, int memoria, double preco){
        this.marca = marca;
        this.modelo = modelo;
        this.memoria = memoria;
        this.preco = preco;
    }
    
    public void preencher(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a Marca do celular: ");
        this.marca = ler.next();
        System.out.println("Informe o Modelo do celular: ");
        this.modelo = ler.next();
        System.out.println("Informe a quantidade de Memoria: ");
        this.memoria = ler.nextInt();
        System.out.println("Informe o Preco do celular: ");
        this.preco = ler.nextDouble();
    }
    
    @Override
    public String toString(){
        return "Celular: Marca: " + this.marca
                + " | Modelo: " + this.modelo
                + " | Memória: " + this.memoria
                + " | Preço: " + this.preco;
    }
    
    public void copia(Celular outro){
        this.marca = outro.getMarca();
        this.modelo = outro.getModelo();
        this.memoria = outro.getMemoria();
        this.preco = outro.getPreco();
    }
    
    
    //Getters e Setters
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setMemoria(int memoria){
        this.memoria = memoria;
    }
    
    public int getMemoria(){
        return this.memoria;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public double getPreco(){
        return this.preco;
    }
}
