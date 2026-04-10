/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tbona
 */
public class Pedido {
    private String numero;
    private String data;
    private double quantidade;
    private List<Produto> produtos;

    public Pedido(String numero, String data, double quantidade) {
        this.numero = numero;
        this.data = data;
        this.quantidade = quantidade;
        this.produtos = new ArrayList<>();
    }
    
    public Pedido(){
        this.numero = "";
        this.data = "";
        this.quantidade = 0.0;
        this.produtos = new ArrayList<>(); //lista começa vazia
    }
    
    public void addProduto(Produto produto){
        this.produtos.add(produto);
    }
    
    public int quantidadeProdutos(){
        return this.produtos.size();
    }
    
    public void copiar(Pedido outro){
        this.numero = outro.getNumero();
        this.data = outro.getData();
        this.quantidade = outro.getQuantidade();
        
        this.produtos = new ArrayList<>();
        for(Produto produto_i : outro.getProdutos()){
            Produto novo = new Produto();
            novo.copiar(produto_i);
            
            this.produtos.add(novo);
        }
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("_____Pedido_____");
        sb.append("Número: ").append(this.numero);
        sb.append("Data: ").append(this.data);
        sb.append("Quantidade: ").append(this.quantidade);
        sb.append("Produto: ").append(this.produtos);
        
        return sb.toString();
    }
    
    public double calculaTotal(){
        return 0;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    
    
}
