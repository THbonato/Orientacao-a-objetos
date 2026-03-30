
package classes;

import java.util.HashMap;
import java.util.Map;

public class ControleEstoque {
    
    private HashMap<String, Produto> estoque;
    
    public void ControleEstoque(){
        this.estoque = new HashMap<>();
    }
    
    public void adicionarProduto(Produto produto){
        estoque.put(produto.getCodigo(), produto);
    }
    
    public void removerProduto(String codigo){
        if(estoque.remove(codigo) != null){
            System.out.println("Produto Removido!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }
    
    public void atualizaQuantidade(String codigo, int novaQuantidade){
        Produto produto = estoque.get(codigo);
        if(produto != null) {
            produto.setQuant_estoque(novaQuantidade);
            System.out.println("Quantidade Atualizada!");
        }else{
            System.out.println("Produto não encontrado!");
        }
    }
    
    public void listarProdutos(){
        if(estoque.isEmpty()){
            System.out.println("O estoque está vazio");
        }else{
            for (Produto produto : estoque.values()) {
                System.out.println(produto);
            }
        }
    }
    
    public Produto buscarProduto(String codigo){
        return estoque.get(codigo);          
    }
}

