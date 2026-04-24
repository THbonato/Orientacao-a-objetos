
package classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome_banco;
    private List<Conta> listaContas;
    private List<Transacao> listaTransacao;

    public Banco(String nome_banco) {
        this.nome_banco = nome_banco;
        this.listaContas = new ArrayList<>();
        this.listaTransacao = new ArrayList<>();
    }
    
    public Banco() {
        this.nome_banco = "";
        this.listaContas = new ArrayList<>();
        this.listaTransacao = new ArrayList<>();
    }
    
    public void adicionarConta(){
        
    }
    
    public void removerConta(){
    
    }
    
    public void adicionarTransacao(){
        
    }
    
    public void removerTransacao(){
        
    }
    
    
}
