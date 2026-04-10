/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author tbona
 */
public class Produto {
    
    private String nome;
    private String categoria;
    private double preco;

    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    
    public Produto(){
        this.nome = "";
        this.categoria = "";
        this.preco = 0.0;
    }
    
    public void copiar(Produto outro){
        this.nome = outro.getNome();
        this.categoria = outro.getCategoria();
        this.preco = outro.getPreco();
    }

    @Override
    public String toString() {
        return "Produto: " 
                + "Nome: " + nome 
                + " | Categoria: " + categoria 
                + " | Preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
